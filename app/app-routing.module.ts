import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AdminComponent } from './admin/admin.component';
import { NgoadminComponent } from './admin/pages/ngoadmin/ngoadmin.component';
import { StepadminComponent } from './admin/pages/stepadmin/stepadmin.component';

import { FaqComponent } from './faq/faq.component';
import { ForgotpasswordComponent } from './forgotpassword/forgotpassword.component';
import { HomeComponent } from './home/home.component';
import { LegislationComponent } from './legislation/legislation.component';
import { NgodashboardComponent } from './ngodashboard/ngodashboard.component';
import { CriteriaComponent } from './ngodashboard/pages/criteria/criteria.component';
import { FundingComponent } from './ngodashboard/pages/funding/funding.component';
import { NgoregistrationComponent } from './ngodashboard/pages/ngoregistration/ngoregistration.component';
import { NgostatusComponent } from './ngodashboard/pages/ngostatus/ngostatus.component';
import { GuidelinesComponent } from './stepdashboard/pages/guidelines/guidelines.component';
import { NgodisplayComponent } from './stepdashboard/pages/ngodisplay/ngodisplay.component';
import { StatusComponent } from './stepdashboard/pages/status/status.component';
import { StepregistrationComponent } from './stepdashboard/pages/stepregistration/stepregistration.component';
import { TrainingsectorComponent } from './stepdashboard/pages/trainingsector/trainingsector.component';
import { StepdashboardComponent } from './stepdashboard/stepdashboard.component';

const routes: Routes = [
  {path:'forgotpassword',
  component: ForgotpasswordComponent},
  {
  path :'aboutus',
  component : AboutusComponent
},
{
  path :'faq',
  component:FaqComponent
},{
  path :'legislation',
  component : LegislationComponent
},{
  path:'stepdashboard',
  component:StepdashboardComponent,
  children:[
   {
     path:'guidelines',
     component: GuidelinesComponent,
     outlet:'step'
    },{
      path:'trainingsector',
      component: TrainingsectorComponent,
      outlet:'step'
    },{
      path:'ngodisplay',
      component: NgodisplayComponent,
      outlet:'step'
    },{
      path:'stepregistration',
      component: StepregistrationComponent,
      outlet:'step'
    },{
      path:'status',
      component: StatusComponent,
      outlet:'step'
      
    }
  ]
  
},{
  path:'home',
  component: HomeComponent
},{
  path:'admin',
  component: AdminComponent,
  children:[
    {
      path:'ngoadmin',
      component: NgoadminComponent,
      outlet:'admins'
    },{
      path:'stepadmin',
      component: StepadminComponent,
      outlet:'admins'
    }
  ]
  
},{
  path:'ngodashboard',
  component:NgodashboardComponent,
  children:[
    {
      path:'criteria',
      component: CriteriaComponent,
      outlet:'ngo_main'
    },{
      path:'funding',
      component:FundingComponent,
      outlet:'ngo_main'
    },{
      path:'ngoregister',
      component:NgoregistrationComponent,
      outlet:'ngo_main'
      
    },{
      path:'ngostatus',
      component:NgostatusComponent,
      outlet:'ngo_main'
    }
  ]
}
  


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
