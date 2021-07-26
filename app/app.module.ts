import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { FaqComponent } from './faq/faq.component';
import { LegislationComponent } from './legislation/legislation.component';
import { StepdashboardComponent } from './stepdashboard/stepdashboard.component';
import { GuidelinesComponent } from './stepdashboard/pages/guidelines/guidelines.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RestapiService } from './restapi.service';
import { TrainingsectorComponent } from './stepdashboard/pages/trainingsector/trainingsector.component';
import { NgodisplayComponent } from './stepdashboard/pages/ngodisplay/ngodisplay.component';
import { StepregistrationComponent } from './stepdashboard/pages/stepregistration/stepregistration.component';
import { StatusComponent } from './stepdashboard/pages/status/status.component';
import { AdminComponent } from './admin/admin.component';
import { NgoadminComponent } from './admin/pages/ngoadmin/ngoadmin.component';
import { StepadminComponent } from './admin/pages/stepadmin/stepadmin.component';
import { NgodashboardComponent } from './ngodashboard/ngodashboard.component';
import { CriteriaComponent } from './ngodashboard/pages/criteria/criteria.component';
import { FundingComponent } from './ngodashboard/pages/funding/funding.component';
import { NgoregistrationComponent } from './ngodashboard/pages/ngoregistration/ngoregistration.component';
import { NgostatusComponent } from './ngodashboard/pages/ngostatus/ngostatus.component';
import { FooterComponent } from './footer/footer.component';
import { ForgotpasswordComponent } from './forgotpassword/forgotpassword.component';
import { NgoService } from './ngo.service';
import { StepService } from './step.service';
import { ToggleService } from './toggle.service';




@NgModule({
  declarations: [
    AppComponent,
    
    HomeComponent,
    
    AboutusComponent,
    
    FaqComponent,
    
    LegislationComponent,
    
    StepdashboardComponent,
    
    GuidelinesComponent,
    
    TrainingsectorComponent,
    
    NgodisplayComponent,
    
    StepregistrationComponent,
    
    StatusComponent,
    
    AdminComponent,
    
    
    NgoadminComponent,
    
    StepadminComponent,
    
    NgodashboardComponent,
    
    CriteriaComponent,
    
    
    
    FundingComponent,
    
    NgoregistrationComponent,
    
    NgostatusComponent,
    
    FooterComponent,
    
    ForgotpasswordComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [RestapiService,NgoService,StepService,ToggleService],
  bootstrap: [AppComponent]
})
export class AppModule { }
