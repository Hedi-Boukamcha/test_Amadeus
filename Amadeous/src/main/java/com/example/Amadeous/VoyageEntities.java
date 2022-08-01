package com.example.Amadeous;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class VoyageEntities implements Serializable {
    public static final long serialVersionUID = 1L;

    private static Integer ID = 0;

    private int id;
    private String departure;
    private String arrival;
    private String price;
    private String classe;
    private String origin;
    private String destination;
    private String date ;

    public VoyageEntities(){

    }

    public VoyageEntities(int id,String departure,String arrival,String price,String classe, String origin ,String destination ,String date){
//origin....
        this.id=id;
        this.departure=departure;
        this.arrival=arrival;
        this.price=price;
        this.classe=classe;
        this.origin=origin;
        this.destination=destination;
        this.date=date;

    }

    public VoyageEntities(int id, String departure, String arrival, String price, String classe) {
        this.id=id;
        this.departure=departure;
        this.arrival=arrival;
        this.price=price;
        this.classe = classe;
    }


    // getters

    public int getId() {
        return id;
    }
    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getPrice() {
        return price;
    }

    public String getClasse() {
        return classe;
    }

    public String getOrigin() {return origin;}

    public String getDestination() {return destination;}
    public String getDate() {return date;}

    //setters


    public void setId(int id) {
        this.id = id;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setOrigin(String origin) {this.origin = origin;}

    public void setDestination(String destination) {this.destination = destination;}

    public void setDate(String date) {this.date = date;}

    @Override
    public String toString() {
        return "VoyageEntities{" +
                "id=" + id +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", price='" + price + '\'' +
                ", classe='" + classe + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public static Integer generateID(){
        ID++;
        return ID;
    }
}
