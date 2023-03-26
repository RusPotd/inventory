package com.example.demo.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class CustomerDTO {
	private String customername;
	private int customerid;
	private int mobile;
	
	public CustomerDTO(int customerid, String customername, int mobile)
	{
		this.customerid = customerid;
		this.customername = customername;
		this.mobile = mobile;
	}
	
	public int getCustomerid() {
		return customerid;
	}
	
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	
	public String getCustomername() {
		return customername;
	}
	
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	
	public int getMobile() {
		return mobile;
	}
	
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	@Override
    public String toString() {
        return "CustomerDTO{" +
        		"customerid="+ customerid +
                ",customername='" + customername + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
