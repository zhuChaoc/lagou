package com.newer.domain;

import java.io.Serializable;

/**
 * 公司产品类
 */
public class CpProduct implements Serializable {

    private Integer id; //产品id
    private String productName;//产品名
    private String productUrl;//产品链接地址
    private String productInfo;//产品简介
    private String productPhoto;//产品图片

    public CpProduct() {
    }

    public CpProduct(Integer id, String productName, String productUrl, String productInfo, String productPhoto) {
        this.id = id;
        this.productName = productName;
        this.productUrl = productUrl;
        this.productInfo = productInfo;
        this.productPhoto = productPhoto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getProductPhoto() {
        return productPhoto;
    }

    public void setProductPhoto(String productPhoto) {
        this.productPhoto = productPhoto;
    }
}
