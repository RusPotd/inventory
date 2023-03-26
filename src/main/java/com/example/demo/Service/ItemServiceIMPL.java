package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.CustomerRepo.CustomerRepo;
import com.example.demo.CustomerRepo.ItemRepo;
import com.example.demo.DTO.CustomerDTO;
import com.example.demo.DTO.CustomerUpdateDTO;
import com.example.demo.DTO.ItemDTO;
import com.example.demo.DTO.ItemSaveDTO;
import com.example.demo.DTO.ItemUpdateDTO;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Item;

@Service
public class ItemServiceIMPL  implements ItemService{
	
	@Autowired
	private ItemRepo itemRepo;
	
	@Override
    public String addItem(ItemSaveDTO itemSaveDTO)
    {
        Item item = new Item(
        		itemSaveDTO.getItemname(),
        		itemSaveDTO.getPrice()
        );
        itemRepo.save(item);
        
       	return item.getItemname();
    }

	@Override
	public List<ItemDTO> getAllItems() {
			List<Item> getItems = itemRepo.findAll();
		
	       List<ItemDTO> itemDTOList = new ArrayList<>();
	       for(Item a:getItems)
	       {
	           ItemDTO itemDTO = new ItemDTO(
	 
	                   a.getItemid(),
	                   a.getItemname(),
	                   a.getPrice()
	           );
	           itemDTOList.add(itemDTO);
	       }
	 
	       return  itemDTOList;
	}
	

	@Override
    public String updateItems(ItemUpdateDTO itemUpdateDTO)
    {
        if (itemRepo.existsById(itemUpdateDTO.getItemid())) {
            Item item = itemRepo.getById(itemUpdateDTO.getItemid());
 
 
            item.setItemname(itemUpdateDTO.getItemname());
            item.setPrice(itemUpdateDTO.getPrice());
            itemRepo.save(item);
        }
            else
            {
                System.out.println("Customer ID do not Exist");
            }
 
                return null;
        }
	
	@Override
    public boolean deleteItem(int id) {
 
        if(itemRepo.existsById(id))
        {
        	itemRepo.deleteById(id);
        }
        else
        {
            System.out.println("item id not found");
        }
 
        return true;
    }
}
