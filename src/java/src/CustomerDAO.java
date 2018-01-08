/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author I342042
 */

public class CustomerDAO{
    
    private static final String dbURL = "jdbc:mysql://mysql1.it.nuigalway.ie:3306/mydb3380";
    private static final String username = "mydb3380bc";
    private static final String password = "qi3rew";


    public Customer getCustomer(int id)
{
    Customer cust = null;
    Connection con = null;
    Statement stmt = null;
    try{
        con = DriverManager.getConnection(dbURL, username, password);
        stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM customers");
    if (rs.next())
    {
                cust = new Customer();
                cust.setCustomerNumber(rs.getInt(1));
                cust.setCustomerName(rs.getString(2));
                cust.setlName(rs.getString(3));
                cust.setfName(rs.getString(4));
                cust.setPhone(rs.getInt(5));
                cust.setAddressLine1(rs.getString(6));
                cust.setAddressLine2(rs.getString(7));
                cust.setCity(rs.getString(8));
                cust.setState(rs.getString(9));
                cust.setPostalCode(rs.getInt(10));
                cust.setCountry(rs.getString(11));
                cust.setEmpNo(rs.getString(12));
                cust.setCred(rs.getInt(13));
    }
    }
    catch(SQLException ex){  
    }
    return cust;
}
    
    public List<Customer> getCustomers(){
        List<Customer> c = new ArrayList<Customer>();
        Connection con = null;
        Statement stat = null;
        
        try{
            con = DriverManager.getConnection(dbURL, username, password);
            stat = con.createStatement();
             ResultSet rs = stat.executeQuery("SELECT * FROM customers");
            while (rs.next()) {
                Customer cust = new Customer();
                cust.setCustomerNumber(rs.getInt(1));
                cust.setCustomerName(rs.getString(2));
                cust.setlName(rs.getString(3));
                cust.setfName(rs.getString(4));
                cust.setPhone(rs.getInt(5));
                cust.setAddressLine1(rs.getString(6));
                cust.setAddressLine2(rs.getString(7));
                cust.setCity(rs.getString(8));
                cust.setState(rs.getString(9));
                cust.setPostalCode(rs.getInt(10));
                cust.setCountry(rs.getString(11));
                cust.setEmpNo(rs.getString(12));
                cust.setCred(rs.getInt(13));
                c.add(cust);
               
            }
        }
        catch(SQLException ex){
            
        }
        finally{
            try{
                if(stat != null){
                    stat.close();
                }
                if(con != null){
                    con.close();
                }
            }
            catch(SQLException ex){
                
            }
                    }
        return c;
    }  
    
    public boolean checkCust(String uname){
        if(getCustomers().contains(uname)){
            return true;
        }
        else
        return false;
    }
    
}