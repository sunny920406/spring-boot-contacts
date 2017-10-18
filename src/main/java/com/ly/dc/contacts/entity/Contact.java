package com.ly.dc.contacts.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Administrator on 2017/10/14 0014.
 */
@Getter
@Setter
public class Contact {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    public Contact(Long id, String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
}
