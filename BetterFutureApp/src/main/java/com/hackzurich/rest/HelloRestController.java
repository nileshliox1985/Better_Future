/**
 * 
 */
package com.hackzurich.rest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ved
 *
 */
@RestController
@RequestMapping("/")
public class HelloRestController {
	
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    String newContact(Model model) throws Exception{
		return "Hello There Welcome to HackZurich 2021 Hackethon";
    }

}
