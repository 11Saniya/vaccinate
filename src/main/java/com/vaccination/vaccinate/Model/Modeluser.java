package com.vaccination.vaccinate.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vtable")
public class Modeluser {

    // Names, Contact Numbers, and Vaccine Names

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int id_details;
    private String names;
    private long contact_numbers;
    private String vaccine_names;

    public Modeluser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public long getContact_numbers() {
        return contact_numbers;
    }

    public void setContact_numbers(long contact_numbers) {
        this.contact_numbers = contact_numbers;
    }

    public String getVaccine_names() {
        return vaccine_names;
    }

    public void setVaccine_names(String vaccine_names) {
        this.vaccine_names = vaccine_names;
    }

    public int getId_details() {
        return id_details;
    }

    public void setId_details(int id_details) {
        this.id_details = id_details;
    }

    @Override
    public String toString() {
        return "Modeluser [id=" + id + ", id_details=" + id_details + ", names=" + names + ", contact_numbers="
                + contact_numbers + ", vaccine_names=" + vaccine_names + "]";
    }

}
