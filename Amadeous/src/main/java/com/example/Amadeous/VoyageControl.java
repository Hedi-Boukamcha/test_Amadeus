package com.example.Amadeous;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/api/v1/tableauVoyage")
public class VoyageControl {

    private final VoyageRestService voyService;
    @Autowired
    public VoyageControl(VoyageRestService voyService){
        this.voyService=voyService;
    }
// post: responsebody


    @GetMapping
    /**public String getALLVoyage( @RequestParam String date ,@RequestParam String origin, @RequestParam String dest){
        ArrayList<VoyageEntities> petite_liste = new ArrayList() ;

        // 0. ajouter un control dans la signature pour dire que les variables sont des url param qui viennent du REST (pathVariable / requestParam)
        // 0. MAYBE ajouter anotation responseBody pour transformer java en json

        // 1. créer petite list vide
        // 2. parcourir la liste pleine avec boucle foreach
        for(VoyageEntities v: voyService.listVoyage){
            if ((v.getOrigin1().equals(origin)) && (v.getDeparture().equals(dest)) && (v.getDate1().equals(departure_date))){
                petite_liste.add(new VoyageEntities(v.getId(),v.getDeparture(),v.getArrival(),v.getPrix()));
            }

        }

        // 3. faire une ligne de if pour vérifier si les requestParam sont égaux
        // 4. si oui ajouter dans la petite list
        // 5. return la petite liste

        return  date;
     }**/
     public List<VoyageEntities> getVoyageParams(@RequestParam(name = "departure_date") String date,@RequestParam(name = "origin") String origin, @RequestParam(name = "destination") String destination) {
        List<VoyageEntities> smallList = new ArrayList();
        for (VoyageEntities v : voyService.getALLVoyage()) {
            if ((v.getOrigin().equals(origin)) && (v.getDestination().equals(destination)) && (v.getDate().equals(date))) {
                smallList.add(new VoyageEntities(v.getId(), v.getDeparture(), v.getArrival(), v.getPrice(), v.getClasse()));
            }
        }
        return smallList;
     }

    @DeleteMapping("/{id}")
    public void deleteVoyage(@PathVariable int id){
        voyService.getALLVoyage().removeIf(voyageEntities -> voyageEntities.getId()==id);
    }


    /**@PostMapping()
    VoyageEntities newEmployee(@RequestBody VoyageEntities newVoyage) {
        return voyService.save(newVoyage);
    }**/

    @ResponseBody
    @PostMapping
    public Integer create(@RequestBody VoyageEntities voyage) {
        voyage.setId(VoyageEntities.generateID());
        voyService.getALLVoyage().add(voyage);
        return voyage.getId();
    }


}










