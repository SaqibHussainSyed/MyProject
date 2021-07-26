import { Component, OnInit } from '@angular/core';
import { StepRegistration } from 'src/app/login';
import { RestapiService } from 'src/app/restapi.service';

@Component({
  selector: 'app-stepadmin',
  templateUrl: './stepadmin.component.html',
  styleUrls: ['./stepadmin.component.css']
})
export class StepadminComponent implements OnInit {

  constructor(private service:RestapiService) { }

 
  steps:StepRegistration[];
  ngOnInit(): void {
    this.service.displayStepUser().subscribe((result)=>{this.steps=result;
    console.log(this.steps);
    });

  }
  approveNgo(step:StepRegistration){
    this.service.approveStepUser(step.registrationId).subscribe((result)=>{console.log("done"); 
    const index = this.steps.indexOf(step);
    this.steps.splice(index, 1);});
  }
  rejectNgo(step:StepRegistration){
    this.service.rejectStepUser(step.registrationId).subscribe((result)=>{console.log("done");
    const index = this.steps.indexOf(step);
    this.steps.splice(index, 1);});
  }


}
