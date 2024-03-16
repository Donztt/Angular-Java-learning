package com.br.contactList.DTO;

import com.br.contactList.models.Contact;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ContactDTO {
    private UUID uuid;
    private String name;
    private String phone;
    private String email;
    private String office;
    private String address;

    public Contact toModel(){
        Contact contact = new Contact();
        contact.setUuid(this.uuid);
        contact.setName(this.name);
        contact.setPhone(this.phone);
        contact.setEmail(this.email);
        contact.setOffice(this.office);
        contact.setAddress(this.address);

        return contact;
    }
}
