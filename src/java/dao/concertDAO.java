/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
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
public class concertDAO {
    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public List<concert> getAllConcert() {
        List<concert> list=new ArrayList<>();
        String query="Select * from Concert";
        try{
            conn = new DBContext().getConnection();
            ps=conn.prepareStatement(query);
            rs=ps.executeQuery();
            while (rs.next()) {
                list.add (new concert(rs.getInt(1),
                                      rs.getString(2),
                                      rs.getDate(3),
                                      rs.getString(4),
                                      rs.getInt(5),
                                      rs.getInt(6),
                                      rs.getString(7)));
            }
        } 
        catch (Exception e) {}
        
        return list;
    }
    
    
    public concert getConcertByID(String cid) {
        
        String query = "select * from [dbo].[Concert] where concert_id=? ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1,cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return (new concert(rs.getInt(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7)));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
   
    
    
    public int getTicketNumber(int cid) {
        String query="select * from Ticket where concert_id=? ";
          int d = 0;
        try{
            conn = new DBContext().getConnection();
            ps=conn.prepareStatement(query);
            ps.setInt(1,cid);
            rs=ps.executeQuery();
          
            while (rs.next()) {
                d=d+1;
            }
            
           
        } catch (Exception e) {}
         return d;
    }
    
    public void updateConcertTicket(String number_of_ticket,String cid) {
       String query = "update Concert set number_of_ticket=? where concert_id=?" ;
       try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            int nOt = Integer.parseInt(number_of_ticket);
            ps.setInt(1, nOt);
            ps.setString(2, cid);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        concertDAO cdao =new concertDAO();
        
    }
}
