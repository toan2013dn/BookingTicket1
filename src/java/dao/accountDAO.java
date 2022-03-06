/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.account;
import entity.concert;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hi
 */
public class accountDAO {
    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    public account Login(String user, String pass) {
            String query="select * from Account \n" +
            "where [email] = ?\n" +
            "and [password]=?";
            try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            ps.setString(2,pass);
            rs = ps.executeQuery();
            while(rs.next()){
                return new account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getBoolean(7),
                        rs.getString(8));
                        
            }
        } catch (Exception e) {
        }
            return null;
        }
    
    public List<account> getAllAccount() {
        List<account> list=new ArrayList<>();
        String query="Select * from Account";
        try{
            conn = new DBContext().getConnection();
            ps=conn.prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()) {
                list.add (new account(rs.getInt(1),
                                      rs.getString(2),
                                      rs.getString(3),
                                      rs.getString(4),
                                      rs.getString(5),
                                      rs.getString(6),
                                      rs.getBoolean(7),
                                      rs.getString(8)));
            }
        } 
        catch (Exception e) {}
        
        return list;
    }
    
    
    public account checkAccountExist(String user) {
            String query="select * from Account \n" +
                         "where [email] = ?\n";
            try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            rs = ps.executeQuery();
            while(rs.next()){
                return new account(rs.getInt(1),
                                      rs.getString(2),
                                      rs.getString(3),
                                      rs.getString(4),
                                      rs.getString(5),
                                      rs.getString(6),
                                      rs.getBoolean(7),
                                      rs.getString(8));
                        
            }
        } catch (Exception e) {
        }
            return null;
        }
    
    public void Register(String email, String firstname, String lastname,String pass,String phoneno) {
            String query = "insert into Account\n" +
                           "values (?,?,?,?,?,0,0)";
            
                        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,email);
            ps.setString(2,firstname);
            ps.setString(3,lastname);
            ps.setString(4,pass);
            ps.setString(5,phoneno);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
        }
    
    public void editProfile(String firstname, String lastname, String phonenumber,String password, String uid) {
        String query = "UPDATE Account SET firstname=?, lastname=?, phoneNumber=?, password=? where uID=?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ps.setString(3, phonenumber);
            ps.setString(4, password);
            ps.setString(5, uid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    public void updateTicket(String nOt, String uid) {
        String query = "update Account set num_of_ticket=? where uID=?" ;
       try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, nOt);
            ps.setString(2, uid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
    public account getUserByID(String uid) {
        
        String query = "select * from [dbo].[Account] where uID=? ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1,uid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return (new account(rs.getInt(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getString(4),
                                    rs.getString(5),
                                    rs.getString(6),
                                    rs.getBoolean(7),
                                    rs.getString(8)));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public static void main(String[] args) {
        accountDAO cdao =new accountDAO();
        cdao.updateTicket("0","2011");
    }
}

