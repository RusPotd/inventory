package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="item")

public class Item {

	@Id
	@Column(name = "item_id", length=50)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int itemid;
	
	@Column(name = "item_name", length=50)
	private String itemname;
	
	@Column(name = "price", length=12)
	private int price;
	
	public Item(int itemid, String itemname, int price)
	{
		this.itemid = itemid;
		this.itemname = itemname;
		this.price = price;
	}
	
	public Item() {}
	
	public Item(String itemname, int price) {
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
        return "ItemDTO{" +
        		"itemid=" + itemid +
                ", itemname='" + itemname + '\'' +
                ", price=" + price +
                '}';
    }
}
