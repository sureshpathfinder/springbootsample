package com.account;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Persons {
    //Defining book id as primary key
    @Id
    @Column
    private int personID;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String address;
    public int getPersonID()
    {
        return personID;
    }
    public void setPersonID(int personID)
    {
        this.personID = personID;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
}
