package com.manage;

import java.sql.*;

import javax.swing.JOptionPane;

public class Add {
    public static void addEmployee (String fname,String lname,String role,String gender ,String dob,String dj,String mail,String phno,String city,String zip,String Sal,String qualify,String depart,String Depid,String Train ) {
        String empid = "";
        String s = "Select max(empid) from employee";
        Connection conn = getcon();
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(s);
            if (rs.next()) {
                empid = rs.getString("max");
                System.out.println(empid);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Employee id not defined\r\n"+e.getMessage(), "Emp Id error", JOptionPane.WARNING_MESSAGE);
        }
        int nempid = Integer.parseInt(empid.substring(1))+1;

        if (!Validator.name(fname+lname)) {
            JOptionPane.showMessageDialog(null, "Name should be more than 3 char", "Name validator", JOptionPane.WARNING_MESSAGE);
        }
        else if (!Validator.dropdown(depart)) {
            JOptionPane.showMessageDialog(null, "than 3 char", "Name validator", JOptionPane.WARNING_MESSAGE);
          
        }
        else if (!Validator.name(qualify)) {
            JOptionPane.showMessageDialog(null, "Name should be ", "Name validator", JOptionPane.WARNING_MESSAGE);
        }
        else if (!Validator.dropdown(Depid)) {
            JOptionPane.showMessageDialog(null, "Name  3 char", "Name validator", JOptionPane.WARNING_MESSAGE);
            
        }
        else if (!Validator.name(Train)) {
            JOptionPane.showMessageDialog(null, "char", "Name validator", JOptionPane.WARNING_MESSAGE);
        }
        else if (!Validator.date(dob)) {
            JOptionPane.showMessageDialog(null, "Date is not valid", "Date validator", JOptionPane.WARNING_MESSAGE);
            System.out.println(dob.toString());
        }
        else if (!Validator.date(dj)) {
            JOptionPane.showMessageDialog(null, "Date is not valid", "Date validator", JOptionPane.WARNING_MESSAGE);
            System.out.println(dob.toString());
        }
        else if (!Validator.mail(mail)) {
            JOptionPane.showMessageDialog(null, "Mail is not valid", "Mail validator", JOptionPane.WARNING_MESSAGE);
            
        }
        else if (!Validator.mpbno(phno)) {
            JOptionPane.showMessageDialog(null, "Mobile no is not valid(10 digits)", "Mobile number validator", JOptionPane.WARNING_MESSAGE);
            
        }
        else if (!Validator.salary(Sal)) {
            JOptionPane.showMessageDialog(null, "Salary should be numeric", "Salary validator", JOptionPane.WARNING_MESSAGE);
            
        }
        else if (!Validator.salary(zip)) {;
            JOptionPane.showMessageDialog(null, "Pincode should be numeric(6 digits)", "Pincode validator", JOptionPane.WARNING_MESSAGE);
            
        }
        else if(Validator.getDiffYears(Validator.getDate(dob), Validator.getDate(dj))<15){
            JOptionPane.showMessageDialog(null, "Join date and dob are too close", "Pincode validator", JOptionPane.WARNING_MESSAGE);

        }
        else{
            String ins = String.format("Insert into employee values ('%s','%s','%s','%s','%s','%s','%s','%s',%d,'%s',%d,'%s','%s','%s','%s','%s')","E0"+Integer.toString(nempid),fname.toLowerCase().trim(),lname.toLowerCase().trim(),gender,dob,mail.toLowerCase().trim(),phno,city.trim(),Integer.parseInt(zip),dj,Integer.parseInt(Sal),role.trim(),qualify.trim(),depart,Depid,Train.trim());  
            Statement stt;
            try {
                stt = conn.createStatement();
                stt.executeUpdate(ins);
                JOptionPane.showMessageDialog(null, "Inserted data successfylly\r\n"+ins, "Database", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Not inserted properly\r\n"+e.getMessage(), "Insertion error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    public static Connection getcon() {
        String url = "jdbc:postgresql://localhost/hr";
        String user = "postgres";
        String password = "007sA!007";
        Connection conn;
        conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception a) {
            JOptionPane.showMessageDialog(null, a.getMessage(), "Failed", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
    public static void removeid(String tbname,String id) {
        Connection con = Add.getcon();
        
        try {
        	Statement st = con.createStatement();
            String s = String.format("delete from %s where empid = '%s'", tbname,id);
            int j = JOptionPane.showConfirmDialog(null, "Click ok to confirm", "Remove", JOptionPane.INFORMATION_MESSAGE);
            if (j==0) {
                st.executeUpdate(s);
                JOptionPane.showMessageDialog(null, "Removed \r\n", "Remove", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {

    }
	public static void ans(String id,String a1,String a2,String a3,String a4,String a5) {
		Connection con = Add.getcon();
	if(!(Validator.name(a1) && Validator.name(a2) && Validator.name(a3) && Validator.name(a4) && Validator.name(a5))) {
		JOptionPane.showMessageDialog(null, "Ans should bee more than 3 char \r\n", "Answer", JOptionPane.WARNING_MESSAGE);
	        }
	else {
		
		try {
			Statement sa = con.createStatement();
			String sq = String.format("update test  set ans1='%s',ans2='%s',ans3 = '%s',ans4='%s',ans5='%s' where id = '%s'", a1,a2,a3,a4,a5,id);
			sa.executeUpdate(sq);
			System.out.println("done ans");
			JOptionPane.showMessageDialog(null, "Submited your answers successfylly\r\n", "Database",
                    JOptionPane.INFORMATION_MESSAGE);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
		
	}
    
}