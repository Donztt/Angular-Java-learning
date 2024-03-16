package com.br.contactList.services;

import com.br.contactList.DTO.ContactDTO;
import com.br.contactList.models.Contact;
import com.br.contactList.repository.IContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ContactService {

    @Autowired
    private IContactRepository _contactRepository;

    public List<ContactDTO> getAllContacts() {
        List<ContactDTO> contactsDTO = new ArrayList<>();

        var contactList = _contactRepository.findAll();

        for (Contact contact : contactList) {
            contactsDTO.add(contact.toDTO());
        }

        return contactsDTO;
    }

    public ContactDTO addContact(ContactDTO contactDTO) {
       return _contactRepository.save(contactDTO.toModel()).toDTO();
    }

    public ContactDTO getContact(UUID idContact) {
        return _contactRepository.getById(idContact).toDTO();
    }

    public ContactDTO updateContact(ContactDTO contactDTO) {
        return _contactRepository.saveAndFlush(contactDTO.toModel()).toDTO();
    }

    public HttpStatus deleteContact(UUID id) {
        var contact = _contactRepository.getById(id);
        _contactRepository.delete(contact);

        return HttpStatus.OK;
    }

}
