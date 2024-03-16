package com.br.contactList.models;

import com.br.contactList.DTO.ContactDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name="Contact" )
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @Id
    @GeneratedValue
    private UUID uuid;
    private String name;
    private String phone;
    private String email;
    private String office;
    private String address;

    public ContactDTO toDTO(){
        ContactDTO contactDTO = new ContactDTO();
        contactDTO.setUuid(this.uuid);
        contactDTO.setName(this.name);
        contactDTO.setPhone(this.phone);
        contactDTO.setEmail(this.email);
        contactDTO.setOffice(this.office);
        contactDTO.setAddress(this.address);

        return contactDTO;
    }
}
