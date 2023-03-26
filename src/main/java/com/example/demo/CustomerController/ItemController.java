package com.example.demo.CustomerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.CustomerDTO;
import com.example.demo.DTO.CustomerUpdateDTO;
import com.example.demo.DTO.ItemDTO;
import com.example.demo.DTO.ItemSaveDTO;
import com.example.demo.DTO.ItemUpdateDTO;
import com.example.demo.Service.ItemService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@PostMapping(path="/saveItem")
	public String saveItem(@RequestBody ItemSaveDTO itemSaveDTO)
	{
		  String id = itemService.addItem(itemSaveDTO);
	      return id;
	}
	
	@GetMapping(path="/getAllItems")
	public List<ItemDTO> getAllItems()
	{
		List<ItemDTO> allItems = itemService.getAllItems();
	    return allItems;
	}
	

	@PutMapping(path = "/updateItem")

    public String updateItem(@RequestBody ItemUpdateDTO itemUpdateDTO)
    {
        String id = itemService.updateItems(itemUpdateDTO);
        return id;
    }

    @DeleteMapping(path = "/deleteitem/{id}")
    public String deleteItem(@PathVariable(value = "id") int id)
    {
        boolean deleteitem = itemService.deleteItem(id);
        return "deleted";
    }
    
}
