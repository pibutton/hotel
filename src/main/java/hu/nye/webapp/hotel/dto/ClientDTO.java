package hu.nye.webapp.hotel.dto;


import java.util.Date;
import java.util.Set;

public class ClientDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String clientStatus;
    private String adress;
    private Set<Date> inOutDate;

    public ClientDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(String clientStatus) {
        this.clientStatus = clientStatus;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Set<Date> getInOutDate() {
        return inOutDate;
    }

    public void setInOutDate(Set<Date> inOutDate) {
        this.inOutDate = inOutDate;
    }
}
