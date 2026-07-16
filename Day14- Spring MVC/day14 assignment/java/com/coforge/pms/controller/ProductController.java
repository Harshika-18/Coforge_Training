package com.coforge.pms.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	
	@RequestMapping("home")
	public ModelAndView loadHome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		return mv;
	}
	@RequestMapping(method = RequestMethod.POST, value="product", params = "Insert")
	public ModelAndView createProduct(@ModelAttribute Product product) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		String result="";
		boolean status = service.createProduct(product);
		
		if(status) {
			result = "SUCCESS : Product Object Saved.";
		} else {
			result = "FAILED : Product Object Not Saved.";
		}
		mv.addObject("result", result);
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, value="product", params = "Update")
	public ModelAndView updateProduct(@ModelAttribute Product product) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		String result="";
		boolean status = service.updateProduct(product);
		
		if(status) {
			result = "SUCCESS : Product Object Updated.";
		} else {
			result = "FAILED : Product Object Not Update.";
		}
		mv.addObject("result", result);
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, value="product", params = "Delete")
	public ModelAndView deleteProduct(@RequestParam int pid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		String result="";
		boolean status = service.deleteProduct(pid);
		
		if(status) {
			result = "SUCCESS : Product Object Deleted.";
		} else {
			result = "FAILED : Product Object Not Deleted.";
		}
		mv.addObject("result", result);
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, value="product", params = "Find")
	public ModelAndView findProduct(@RequestParam int pid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		String result="";
		Product product = service.findProduct(pid);
		
		if(product != null) {
			result = product.toString();
		} else {
			result = "FAILED : Product Object Not Found.";
		}
		mv.addObject("result", result);
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, value="product", params = "FindAll")
	public ModelAndView findAllEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		HashMap<Integer,Product> map = service.findAllProduct();
		mv.addObject("result", map);
		return mv;
	}
}
