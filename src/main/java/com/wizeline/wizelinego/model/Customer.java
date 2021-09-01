package com.wizeline.wizelinego.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @Author: Frank
 * Last Modification: 31/08/2021
 * Customer Entity
 */


@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    @NotBlank
    private String name;
    @NotBlank
    private String lastName;
    @NotBlank
    @Email(message = "Invalid Email Format")
    private String email;
    private String phone;
    private String secundaryPhone;
    @NotBlank
    private String password;
    private Long userLastModification;
    private Date lastModificationDate;
    @NotNull
    private boolean status;

    public Customer() {

    }

    public Customer(Long customerId, String name, String lastName, String email, String phone, String secundaryPhone,
                    String password, Long userLastModification, Date lastModificationDate, boolean status) {
        super();
        this.customerId = customerId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.secundaryPhone = secundaryPhone;
        this.password = password;
        this.userLastModification = userLastModification;
        this.lastModificationDate = lastModificationDate;
        this.status = status;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSecundaryPhone() {
        return secundaryPhone;
    }

    public void setSecundaryPhone(String secundaryPhone) {
        this.secundaryPhone = secundaryPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getUserLastModification() {
        return userLastModification;
    }

    public void setUserLastModification(Long userLastModification) {
        this.userLastModification = userLastModification;
    }

    public Date getLastModificationDate() {
        return lastModificationDate;
    }

    public void setLastModificationDate(Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}