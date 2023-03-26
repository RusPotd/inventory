package com.example.demo.CustomerController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;

import com.example.demo.CustomerRepo.CustomerRepo;
import com.example.demo.DTO.CustomerDTO;
import com.example.demo.DTO.CustomerSaveDTO;
import com.example.demo.DTO.CustomerUpdateDTO;
import com.example.demo.Service.CustomerService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping(path="/save")
	public String saveCustomer(@RequestBody CustomerSaveDTO customerSaveDTO)
	{
		  String id = customerService.addCustomer(customerSaveDTO);
	      return id;
	}
	
	@GetMapping(path="/getAllCustomers")
	public List<CustomerDTO> getAllCustomer()
	{
		List<CustomerDTO> allCustomers = customerService.getAllCustomer();
	    return allCustomers;
	}
	
	@PutMapping(path = "/update")

    public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO)
    {
        String id = customerService.updateCustomers(customerUpdateDTO);
        return id;
    }

    @DeleteMapping(path = "/deletecustomer/{id}")
    public String deleteCustomer(@PathVariable(value = "id") int id)
    {
        boolean deletecustomer = customerService.deleteCustomer(id);
        return "deleted";
    }
    
    
}
