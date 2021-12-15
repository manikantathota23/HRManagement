package com.manage;

import java.sql.*;

import javax.swing.*;

public class Update {

    static Connection conn = null;

    public static void updateArtist(String artid, String fname, String lname, String role, String gender, String dob,
            String dj,
            String mail, String phno, String city, String zip, String qualifi, String train, String depid, String Dep) {
        String s = "Select max(empid) from employee";
        System.out.println(dob+" "+dj);
        conn = Add.getcon();
        if (!Validator.name((fname + lname).trim())) {
            JOptionPane.showMessageDialog(null, "Name should be more than 3 char", "Name validator",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (!Validator.name(qualifi.trim())) {
            JOptionPane.showMessageDialog(null, "Qualification should be more than 3 char", "Qualification validator",
                    JOptionPane.WARNING_MESSAGE);
        }
        else if (!Validator.name(train.trim())) {
            JOptionPane.showMessageDialog(null, "Traning should be more than 3 char", "training validator",
                    JOptionPane.WARNING_MESSAGE);
        }
         else if (!Validator.date(dob)) {
            JOptionPane.showMessageDialog(null, "Date is not valid", "Date validator", JOptionPane.WARNING_MESSAGE);
            System.out.println(dob.toString());
        } else if (!Validator.date(dj)) {
            JOptionPane.showMessageDialog(null, "Date is not valid", "Date validator", JOptionPane.WARNING_MESSAGE);
            System.out.println(dob.toString());
        } else if (!Validator.mail(mail)) {
            JOptionPane.showMessageDialog(null, "Mail is not valid", "Mail validator", JOptionPane.WARNING_MESSAGE);

        } else if (!Validator.mpbno(phno)) {
            JOptionPane.showMessageDialog(null, "Mobile no is not valid(10 digits)", "Mobile number validator",
                    JOptionPane.WARNING_MESSAGE);

        } else if (!Validator.dropdown(role)) {
            JOptionPane.showMessageDialog(null, "Role is not valid", "Role validator", JOptionPane.WARNING_MESSAGE);

        } else if (!Validator.dropdown(depid)) {
            JOptionPane.showMessageDialog(null, "Dept Id is not valid", "Department validator", JOptionPane.WARNING_MESSAGE);

        }else if (!Validator.dropdown(Dep)) {
            JOptionPane.showMessageDialog(null, "Dept name is not valid", "Department validator", JOptionPane.WARNING_MESSAGE);

        }
         else if (!Validator.salary(zip)) {
            ;
            JOptionPane.showMessageDialog(null, "Pincode should be numeric(6 digits)", "Pincode validator",
                    JOptionPane.WARNING_MESSAGE);

        } else if (Validator.getDiffYears(Validator.getDate(dob), Validator.getDate(dj)) < 15) {
            JOptionPane.showMessageDialog(null, "Join date and dob are too close", "Pincode validator",
                    JOptionPane.WARNING_MESSAGE);

        } else {
            try {
                String ins = String.format(
                        "Update employee set fname = '%s',lname = '%s',gender = '%s',dob = '%s',datejoined='%s',emailid='%s',phno='%s',city='%s',zipcode = %d,role='%s' ,qualification='%s' ,dept='%s' ,dept_id='%s' ,training='%s'  where empid = '%s'",
                        Validator.toUpper(fname), Validator.toUpper(lname), gender,
                        dob,
                        dj, mail.toLowerCase().trim(), phno, Validator.toUpper(city), Integer.parseInt(zip),
                        role.trim(),qualifi,depid,Dep,train, artid);
                Statement stt;
                stt = conn.createStatement();
                stt.executeUpdate(ins);
                JOptionPane.showMessageDialog(null, "Updated data successfylly\r\n" + ins, "Database",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Not inserted properly\r\n" + e.getMessage(), "Insertion error",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}