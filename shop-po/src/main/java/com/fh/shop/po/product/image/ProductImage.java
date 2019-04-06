package com.fh.shop.po.product.image;

import com.fh.shop.backend.po.product.ProductInfo;

import java.io.Serializable;

public class ProductImage implements Serializable {

    private static final long serialVersionUID = 3653179605671719056L;

    private  Integer id;

    private String imgPath;

    private ProductInfo product;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public ProductInfo getProduct() {
        return product;
    }

    public void setProduct(ProductInfo product) {
        this.product = product;
    }
}
