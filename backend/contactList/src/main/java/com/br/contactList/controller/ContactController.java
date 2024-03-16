package com.br.contactList.controller;


import com.br.contactList.DTO.ContactDTO;
import com.br.contactList.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/contact")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ContactController {
	@Autowired
	private ContactService _contactService;

	@GetMapping("/listContacts")
	public List<ContactDTO> listContacts() {
		return _contactService.getAllContacts();
	}
	@PostMapping("/addContact")
	public ContactDTO addContact(@RequestBody ContactDTO contactDTO) {
		return _contactService.addContact(contactDTO);
	}

	@PutMapping("/updateContact")
	public ContactDTO updateContact(@RequestBody ContactDTO contactDTO) {
		return _contactService.updateContact(contactDTO);
	}
	@PutMapping("/deleteContact/{id}")
	public HttpStatus deleteContact(@Param("id") UUID id) {
		return _contactService.deleteContact(id);
	}
}
