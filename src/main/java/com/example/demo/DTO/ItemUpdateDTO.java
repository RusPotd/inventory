package com.example.demo.DTO;

public class ItemUpdateDTO {
	
	private int itemid;
	private String itemname;
	private int price;
	
	public ItemUpdateDTO(int itemid, String itemname, int price)
	{
		this.itemid = itemid;
		this.itemname = itemname;
		this.price = price;
	}
	
	public int getItemid() {
		return itemid;
	}
	
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	
	public String getItemname() {
		return itemname;
	}
	
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
    public String toString() {
        return "ItemUpdateDTO{" +
        		"itemid=" + itemid +
                "itemname='" + itemname + '\'' +
                ", price=" + price +
                '}';
    }

}
