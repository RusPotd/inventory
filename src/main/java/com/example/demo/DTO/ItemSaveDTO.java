package com.example.demo.DTO;

public class ItemSaveDTO {
	
	private String itemname;
	
	private int price;
	
	public ItemSaveDTO(String itemname, int price)
	{
		this.itemname = itemname;
		this.price = price;
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
        return "ItemDTO{" +
                "itemname='" + itemname + '\'' +
                ", price=" + price +
                '}';
    }

}
