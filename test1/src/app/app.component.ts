import { Component, OnInit, ResolvedReflectiveFactory } from '@angular/core';
import { FormGroup, NgForm } from '@angular/forms';
import { Observable, VirtualTimeScheduler } from 'rxjs';
import { VoyageService } from './service/voyageService.service';
import {MatButtonModule} from '@angular/material/button';

export class Voyage{
  public departure: string = "";
  public date: string = "";
  public arrival: string = "";
  public price: string = "";
  public classe: string = "";
  public id!:number;
  public origin: string = "";
  public destination: string = "";
  public constructor(){
  }
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  public date: string = ""; 
  public origin: string = "";
  public dest: string = "";
  public flights !: Voyage[];
  public voy!:Voyage;
  public submitted=false;
  public voyageForm: Voyage = new Voyage();



  constructor(private voyageS:VoyageService){}

  

 
  ngOnInit(): void {}

  run(){
    console.log(this.date);
    console.log(this.origin);
    console.log(this.dest);
    this.voyageS.getVoyage(this.dest, this.origin, this.date).subscribe((data: any)=>{this.flights = data; console.log(data);});
  }


  
      deleteVoyage(id:Number){
        let index =this.flights.findIndex(res => res.id===id);
        if(confirm("qu'est ce que tu fais ya wildi")){
          this.voyageS.delete(id).subscribe(()=>
          {
            if(index!== -1){
              this.flights.splice(index,1);
            } 
          });
        }
      }
 
     /**  deleteVoyage(vs:VoyageService){
        if(confirm(",?????????,")){
          this.voyage.delete(this.id).subscribe(res =>{
            alert(res.message);
            this.run();
          })
        }
      }**/

      /**deleteVoyage(id:Number){
        this.vs.delete(id).subscribe(res =>{console.log(res)})
        this.run();
      }**/


      /**addVoyage( voyage:{departure:String,arrival:String ,price:String,classe:String }){
     console.log(voyage);
      }**/


      createVoyage(){
        this.voyageS.add(this.voyageForm)
        .subscribe(
          rep =>{        
            this.submitted=true;
            console.log(rep);
            //this.voyageForm.id = rep.id;
          }
        );

      }


}


