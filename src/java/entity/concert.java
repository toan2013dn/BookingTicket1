/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author Hi
 */
public class concert {
    private int cid;
    private String cname;
    private Date cdate;
    private String img;
    private int nOt;
    private int cprice;
    private String clocation;

    public concert(int cid, String cname, Date cdate, String img, int nOt, int cprice, String clocation) {
        this.cid = cid;
        this.cname = cname;
        this.cdate = cdate;
        this.img = img;
        this.nOt = nOt;
        this.cprice = cprice;
        this.clocation = clocation;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getnOt() {
        return nOt;
    }

    public void setnOt(int nOt) {
        this.nOt = nOt;
    }

    public int getCprice() {
        return cprice;
    }

    public void setCprice(int cprice) {
        this.cprice = cprice;
    }

    public String getClocation() {
        return clocation;
    }

    public void setClocation(String clocation) {
        this.clocation = clocation;
    }

    @Override
    public String toString() {
        return "concert{" + "cid=" + cid + ", cname=" + cname + ", cdate=" + cdate + ", img=" + img + ", nOt=" + nOt + ", cprice=" + cprice + ", clocation=" + clocation + '}';
    }
    
    
    
    
    
}
