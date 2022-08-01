import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable }from '@angular/core';
import { Observable } from 'rxjs';
import { Voyage } from '../app.component';


@Injectable( {
    providedIn: 'root'
})
export class VoyageService{
    public _url:string="http://localhost:8080/api/v1/tableauVoyage";
  createVoyage: any;
    

    constructor(private http:HttpClient){}
    
    getVoyage(dest:string, origin:string, date:string){
        let queryParams = new HttpParams();
        queryParams =queryParams.append("departure_date",date);
        queryParams =queryParams.append("origin",origin);
        queryParams =queryParams.append("destination",dest);
        return this.http.get(this._url,{params:queryParams});
    }

    delete(id: Number){
        return this.http.delete(this._url+"/"+id);
    }

    add(voyage:Voyage){
        return this.http.post(this._url,voyage);
    }
}
