import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Ngo } from 'src/app/login';
import { NgoService } from 'src/app/ngo.service';
import { RestapiService } from 'src/app/restapi.service';

@Component({
  selector: 'app-ngoregistration',
  templateUrl: './ngoregistration.component.html',
  styleUrls: ['./ngoregistration.component.css']
})
export class NgoregistrationComponent implements OnInit {

  constructor(private service:RestapiService,private router:Router,private route: ActivatedRoute,private ngoService:NgoService) { }
  ngoregister=new FormGroup({});
  ngOnInit(): void {
    this.ngoregister=new FormGroup({
      ngoId: new FormControl(''),
      ngoName: new FormControl(''),
      ngoLocation:new FormControl(''),
      capacity:new FormControl(''),
      startDate:new FormControl(''),
      courseId:new FormControl(''),
      ngoStatus:new FormControl('Pending')
    });
  }
  ngo:Ngo;
  msg;
  courses = new Map()
    .set(1,"Agriculture")
    .set(2,"Stitching")
    .set(3,"Tailoring");
  addNgo(){
    this.ngo=this.ngoregister.value;
    this.service.addNgo(this.ngo).subscribe((result)=>{
    this.msg=result;
    console.log(this.msg);
    if('Ngo added'===this.msg){
      this.ngoService.setNgoId(this.ngo.ngoId);
      this.router.navigate(['../ngostatus'],{relativeTo:this.route});
    }
   
    });
  }
}
