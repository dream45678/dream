package com.dream.entity;

import java.util.Date;

public class Goods {

    private Integer id;
    private String goodsname;
    private String goodsimg;
    private Date goodstime;
    private Integer upuserid;
    private Integer downuserid;
    private Integer drawid;
    private String goodsdescribeid;
    private Integer verify;
    private Integer type;

    public Integer getVerify() {
        return verify;
    }

    public void setVerify(Integer verify) {
        this.verify = verify;
    }

    public String getGoodsdescribeid() {
        return goodsdescribeid;
    }

    public void setGoodsdescribeid(String goodsdescribeid) {
        this.goodsdescribeid = goodsdescribeid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodsimg() {
        return goodsimg;
    }

    public void setGoodsimg(String goodsimg) {
        this.goodsimg = goodsimg;
    }

    public Date getGoodstime() {
        return goodstime;
    }

    public void setGoodstime(Date goodstime) {
        this.goodstime = goodstime;
    }

    public Integer getUpuserid() {
        return upuserid;
    }

    public void setUpuserid(Integer upuserid) {
        this.upuserid = upuserid;
    }

    public Integer getDownuserid() {
        return downuserid;
    }

    public void setDownuserid(Integer downuserid) {
        this.downuserid = downuserid;
    }

    public Integer getDrawid() {
        return drawid;
    }

    public void setDrawid(Integer drawid) {
        this.drawid = drawid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsname='" + goodsname + '\'' +
                ", goodsimg='" + goodsimg + '\'' +
                ", goodstime=" + goodstime +
                ", upuserid=" + upuserid +
                ", downuserid=" + downuserid +
                ", drawid=" + drawid +
                ", goodsdescribeid='" + goodsdescribeid + '\'' +
                ", verify=" + verify +
                ", type=" + type +
                '}';
    }
}
