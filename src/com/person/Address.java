/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.person;

/**
 *
 * @author DELL
 */
public class Address {
    private String houseNo;
    private String area;
    private String district;
    private String postCode;

    public Address() {
    }

    public Address(String houseNo, String area, String district, String postCode) {
        this.houseNo = houseNo;
        this.area = area;
        this.district = district;
        this.postCode = postCode;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    
    
    
}
