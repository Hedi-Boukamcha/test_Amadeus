package com.example.Amadeous;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class VoyageRestService {

    public static ArrayList<VoyageEntities> listVoyage = new ArrayList();

    public  static void createList(){

        //  le 7 : dep paris orly  arr casablanca 1-> 10
        listVoyage.add(new VoyageEntities(0, "2022-06-28T11:55:00", "2022-06-28T16:10:00", "90.98 EUR", "ECONOMY","ORY","CMN","2022-07-07"));
        listVoyage.add(new VoyageEntities(1, "2022-06-28T10:20:00", "2022-06-28T16:10:00", "90.98 EUR", "ECONOMY","ORY","CMN","2022-07-07"));
        listVoyage.add(new VoyageEntities(2, "2022-06-28T07:35:00", "2022-06-28T16:10:00", "90.98 EUR", "ECONOMY","ORY","CMN","2022-07-07"));
        listVoyage.add(new VoyageEntities(3, "2022-06-28T06:00:00", "2022-06-28T10:50:00", "102.98 EUR", "ECONOMY","ORY","CMN","2022-07-07"));
        listVoyage.add(new VoyageEntities(4, "2022-06-28T06:00:00", "2022-06-28T16:10:00", "102.98 EUR", "ECONOMY","ORY","CMN","2022-07-07"));
        listVoyage.add(new VoyageEntities(5, "2022-06-28T21:05:00", "2022-06-29T16:10:00", "114.98 EUR", "ECONOMY","ORY","CMN","2022-07-07"));
        listVoyage.add(new VoyageEntities(6, "2022-06-28T19:45:00", "2022-06-29T16:10:00", "114.98EUR", "ECONOMY","ORY","CMN","2022-07-07"));
        listVoyage.add(new VoyageEntities(7, "2022-06-28T16:40:00", "2022-06-29T16:10:00", "119.84 EUR", "ECONOMY","ORY","CMN","2022-07-07"));
        listVoyage.add(new VoyageEntities(8, "2022-06-28T14:40:00", "2022-06-29T16:10:00", "119.84 EUR", "ECONOMY","ORY","CMN","2022-07-07"));
        listVoyage.add(new VoyageEntities(9, "2022-06-28T21:05:00", "2022-06-29T10:50:00", "126.98 EUR", "ECONOMY","ORY","CMN","2022-07-07"));

        //  le 8 : dep tunis arr london
        listVoyage.add(new VoyageEntities(0, "2022-06-27T12:00:00", "2022-06-27T18:45:00", "298.92 EUR", "ECONOMY","TUN","LCY","2022-07-08"));
        listVoyage.add(new VoyageEntities(1, "2022-06-27T02:15:00", "2022-06-27T08:40:00", "373.92 EUR", "ECONOMY","TUN","LCY","2022-07-08"));
        listVoyage.add(new VoyageEntities(2, "2022-06-27T07:45:00", "2022-06-27T18:45:00", "2061.88 EUR", "ECONOMY","TUN","LCY","2022-07-08"));

        //  le 11 : dep hong kong arr madinah
        listVoyage.add(new VoyageEntities(0, "2022-06-25T09:00:00", "2022-06-26T00:35:00", "4374.54 EUR", "BUSINESS","HKG","MED","2022-07-11"));
        listVoyage.add(new VoyageEntities(1, "2022-06-25T21:30:00", "2022-06-26T13:30:00", "7450.52 EUR", "BUSINESS","HKG","MED","2022-07-11"));
        listVoyage.add(new VoyageEntities(2, "2022-06-25T14:35:00", "2022-06-27T00:35:00", "1762.61 EUR", "ECONOMY","HKG","MED","2022-07-11"));

        //  le 12 : dep tunis arr madinah
        listVoyage.add(new VoyageEntities(0,"2022-06-26T11:35:00", "2022-06-27T01:40:00", "245.11 EUR", "ECONOMY","TUN","MED","2022-07-12"));
        listVoyage.add(new VoyageEntities(2,"2022-06-26T11:40:00", "2022-06-27T14:25:00", "361.28 EUR", "ECONOMY","TUN","MED","2022-07-12"));
    }

    public ArrayList<VoyageEntities> getALLVoyage() {
        return listVoyage;
    }

}