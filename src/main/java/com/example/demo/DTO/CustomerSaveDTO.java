package com.example.demo.DTO;

public class CustomerSaveDTO {
	private String customername;
	
	private int mobile;
	
	public CustomerSaveDTO(String customername, int mobile)
	{
//		this.customerid = customerid;
		this.customername = customername;
		this.mobile = mobile;
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
                "customername='" + customername + '\'' +
                ", mobile=" + mobile +
                '}';
    }

}
