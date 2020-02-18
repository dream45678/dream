package com.dream.entity;

import java.util.Date;

public class Draw {

    private Integer id;
    private String drawname;
    private String drawdescribe;
    private Date drawtime;
    private Integer goodsid;
    private Integer verify;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrawname() {
        return drawname;
    }

    public void setDrawname(String drawname) {
        this.drawname = drawname;
    }

    public String getDrawdescribe() {
        return drawdescribe;
    }

    public void setDrawdescribe(String drawdescribe) {
        this.drawdescribe = drawdescribe;
    }

    public Date getDrawtime() {
        return drawtime;
    }

    public void setDrawtime(Date drawtime) {
        this.drawtime = drawtime;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getVerify() {
        return verify;
    }

    public void setVerify(Integer verify) {
        this.verify = verify;
    }

    @Override
    public String toString() {
        return "Draw{" +
                "id=" + id +
                ", drawname='" + drawname + '\'' +
                ", drawdescribe='" + drawdescribe + '\'' +
                ", drawtime=" + drawtime +
                ", goodsid=" + goodsid +
                '}';
    }
}
