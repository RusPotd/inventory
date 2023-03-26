package com.example.demo.Service;

import java.util.List;

import com.example.demo.DTO.CustomerUpdateDTO;
import com.example.demo.DTO.ItemDTO;
import com.example.demo.DTO.ItemSaveDTO;
import com.example.demo.DTO.ItemUpdateDTO;

public interface ItemService {

	String addItem(ItemSaveDTO itemSaveDTO);

	List<ItemDTO> getAllItems();
	
    String updateItems(ItemUpdateDTO itemUpdateDTO);

    boolean deleteItem(int id);


}
