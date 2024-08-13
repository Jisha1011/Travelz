package com.example.travelz.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.travelz.Service.General;

@RestController
public class GeneralController {
	@Autowired
	General gen;
	
	@GetMapping("/getString")
	public @ResponseBody  String getString()
	{
		return gen.get();
	}

}
