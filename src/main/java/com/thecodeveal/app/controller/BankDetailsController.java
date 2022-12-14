package com.thecodeveal.app.controller;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.thecodeveal.app.model.BankDetails;
import com.thecodeveal.app.model.User;
import com.thecodeveal.app.service.BankDetailsService;

@RestController
@RequestMapping("/")
@CrossOrigin
public class BankDetailsController {

	@Autowired
	private BankDetailsService bankDetailsService;
	
	 @PostMapping("/bankDetails")
    public BankDetails saveBankDetails(@RequestBody BankDetails res){
        System.out.println("RES"+res);
        return bankDetailsService.saveBankDetails(res);
    }
	@GetMapping("/bankDetail")
	public List<BankDetails> getBankDetail() {
		return bankDetailsService.getBankDetails();
	}
    @GetMapping("/bankDetails/{username}")
    @ResponseBody
    public String getBankDetails(@PathVariable("username") String username) throws JsonProcessingException{
    	
    	ObjectMapper mapper = new ObjectMapper();
  	  BankDetails u =  bankDetailsService.getBankDetails(username);
  	  return mapper.writeValueAsString(u);
    	
       
    }
    
    @DeleteMapping("/bankDetails/{username}")
    public List<BankDetails> delResById(@PathVariable("username") String username){
        return bankDetailsService.deleteBankDetails(username);
    }
   @PutMapping("/bankDetails/{username}")
    public String updateRes(@PathVariable("username") String username,@RequestBody BankDetails resupdate){
        return bankDetailsService.updateBankDetails(username,resupdate);
    }
}