import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';

import { RestapiService } from 'src/app/restapi.service';
import { StepService } from 'src/app/step.service';

@Component({
  selector: 'app-status',
  templateUrl: './status.component.html',
  styleUrls: ['./status.component.css']
})
export class StatusComponent implements OnInit {

  constructor(private service:RestapiService,private stepService:StepService,private router:Router , private route:ActivatedRoute) { }
msg;
label=false;
aadharDetail= new FormGroup({
  aadharNo: new FormControl()
});
  ngOnInit(): void {
   
   if(this.stepService.getStepAadhar() === null){
   console.log('abs');
    this.msg='Please Register';
    this.label=false;
  }
     else{
       console.log(this.stepService.getStepAadhar());
    this.service.getStepStatus(this.stepService.getStepAadhar()).subscribe((result)=>{this.msg=result+' '+this.stepService.getStepAadhar();});
this.label=true;
  }
  }
  saveAadhar(){
    this.service.getStepStatus(this.aadharDetail.get('aadharNo').value)
    .subscribe((result)=>{
      this.stepService.setStepAadhar(this.aadharDetail.get('aadharNo').value)
      this.msg=result;
      this.router.navigate(['../status'],{relativeTo:this.route});
      this.label=true;

    });
  }

}
