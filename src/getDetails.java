package com.manage;

import java.sql.*;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



public class getDetails {
    private final static String url = "jdbc:postgresql://localhost/hr";
    private final static String user = "postgres";
    private final static String password = "007sA!007";
    static Connection conn = null;
    ResultSet rs;
    private static String name;
	private String dob;
	private String emial;
	private String role;
	private String phno;
	private String gender;
	private String address;
	private static String depart;
	private static String departid;
	private static String qualification;
	private static String datejoin;
	private static String salary;
	private static String train;
	private static String train2;
	private static String score1;
	private static String score2;

    getDetails(String eid){
        try {
            conn = DriverManager.getConnection(url, user, password);
            String s = String.format("Select * from employee where empid='%s'",eid);
            Statement st = conn.createStatement();
            rs = st.executeQuery(s);
            rs.next();
            name = rs.getString("fname")+"  "+rs.getString("lname");
            dob = rs.getString("dob");
            emial = rs.getString("emailid");
            phno = rs.getString("phno");
            gender = rs.getString("gender");
            role = rs.getString("role");
            address = rs.getString("city");
            depart = rs.getString("dept");
            departid = rs.getString("dept_id");
            qualification = rs.getString("qualification");
            datejoin = rs.getString("datejoined");
            salary = rs.getString("salary");
            score1=rs.getString("score1");
            score2=rs.getString("score2");
            train=rs.getString("training");
            train2=rs.getString("training2");
            System.out.println("Connected to the PostgreSQL server successfully.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public String getName(){
        return name;
        
    }
    public String getGender(){
        return gender;
    }
    public String getDob(){
        return dob;
    }
    public String getEmail(){
        return emial;
    }
    public String getphno(){
        return phno;
    }
    public String getrole(){
        return role;
    }
    public String getaddress(){
        return address;
    }
    public String getdepart(){
        return depart;
    }
    public String getdepartid(){
        return departid;
    }
    public String getqualify(){
        return qualification;
    }
    public String getdatej(){
        return datejoin;
    }
    public String getsalary(){
        return salary;
    }
    public String gets1(){
        return score1;
    }
    public String gets2(){
        return score2;
    }
    public String gett(){
        return train;
    }
    public String gett2(){
        return train2;
    }
    public static void main(String[] args) {
        new getDetails("E078");
        System.out.println(depart);
        
    }
    public static DefaultTableModel searchData(String tableName) {
        ResultSet rs = null;
        Connection con=null;
        try {
        	con = DriverManager.getConnection(url, user, password);
            String s = String.format("Select * from %s", tableName);
            Statement st = con.createStatement();
            rs = st.executeQuery(s);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not able to connect database try again configuring ",
                    "Data retrive error", JOptionPane.ERROR_MESSAGE);
        }
        if (rs == null) {
            return null;
        }
        try {
            return tabledata(rs);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
        return null;
    }
    

    public static DefaultTableModel tabledata(ResultSet rs) throws Exception {

        ResultSetMetaData metaData = rs.getMetaData();
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
        return new DefaultTableModel(data, columnNames);
    }
    public static ResultSet getArtist(String a) {
    	ResultSet rs = null;
        Connection con=null;
        try {
        	con = DriverManager.getConnection(url, user, password);
            String getArtist = String.format("select * from employee where empid = '%s'", a);
            Statement st1 = con.createStatement();
            rs = st1.executeQuery(getArtist);
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not able to connect database try again configuring ", "Data retrive error", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
    public static DefaultTableModel removeData(String tableName, String id) {
        ResultSet rss = null;
        Connection connn = null;
        try {
        	connn = DriverManager.getConnection(url, user, password);
            String s = String.format("Select * from %s where empid='%s'", tableName, id);
            Statement stt1 = connn.createStatement();
            rss = stt1.executeQuery(s);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not able to connect database try again configuring ",
                    "Data retrive error", JOptionPane.ERROR_MESSAGE);
        }
        if (rss == null) {
            return null;
        }
        try {
            return tabledata(rss);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    public static TableModel removeYearData( String year) {
		ResultSet rs = null;
        Connection con = Add.getcon();
        try {
            String s = String.format("select * from employee where extract(year from datejoined)=%s;", year);
            Statement st = con.createStatement();
            rs = st.executeQuery(s);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not able to connect database try again configuring ",
                    "Data retrive error", JOptionPane.ERROR_MESSAGE);
        }
        if (rs == null) {
            return null;
        }
        try {
            return tabledata(rs);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
	}
    public static ResultSet whereOneCond(String cond,String eq) {
    	ResultSet rs = null;
        Connection con=null;
        try {
        	con = DriverManager.getConnection(url, user, password);
            String getArtist = String.format("select count(empid) from employee where %s = %s", cond,eq);
            Statement st1 = con.createStatement();
            rs = st1.executeQuery(getArtist);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not able to connect database try again configuring ",
                    "Data retrive error", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }
}