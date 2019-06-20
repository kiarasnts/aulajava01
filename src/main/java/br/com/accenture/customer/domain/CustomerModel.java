package br.com.accenture.customer.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

public class CustomerModel {

    @NotBlank (message= "Nome não pode ser validado")
    @Size(min=3, max=50, message= "Nome deve conter entre 4 e 50 caracteres")
    private String name;

    @NotBlank (message="Email não pode ser vazio")
    @Email
    private String email;
    private String state;
    private String city;
    private Date createdAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString(){
        return String.format("Name:%s, E-mail: %s, City: %s, name, email, city");
    }
}
