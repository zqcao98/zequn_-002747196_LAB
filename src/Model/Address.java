/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author zequncao
 */
public class Address {
    String sname;
    String aptno;
    String city;
    String zipcode;
    
    public Address() {
        this.sname = "";
        this.aptno = "";
        this.city = "";
        this.zipcode = "";
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAptno() {
        return aptno;
    }

    public void setAptno(String aptno) {
        this.aptno = aptno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
}
