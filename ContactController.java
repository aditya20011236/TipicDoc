package com.mydata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mydata.Service.ContactService;
import com.mydata.model.Contact;

@RestController
public class ContactController {
	@Autowired
	ContactService contactService;

	@PostMapping("/savecontact")
	private Contact saveContact(@RequestBody Contact contact) {
		return contactService.savecontact(contact);

	}

}
