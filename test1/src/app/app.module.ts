import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppComponent } from './app.component';
import { VoyageService } from './service/voyageService.service';
import { FormsModule } from '@angular/forms';
import {MatTabsModule} from '@angular/material/tabs'
import { MatSliderModule } from '@angular/material/slider';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations'; 
import {MatButtonModule} from '@angular/material/button';
import {MatSelectModule} from '@angular/material/select';

@NgModule({
  declarations: [
    AppComponent
  ],

  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    MatTabsModule,
    MatSliderModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatSelectModule
  ],
  exports:[
    MatTabsModule,
    MatButtonModule,
    MatSelectModule
  ],
 
  providers: [VoyageService],
  bootstrap: [AppComponent]
})
export class AppModule { }
