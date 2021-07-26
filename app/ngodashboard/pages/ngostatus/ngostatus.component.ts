import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { NgoService } from 'src/app/ngo.service';
import { RestapiService } from 'src/app/restapi.service';

@Component({
  selector: 'app-ngostatus',
  templateUrl: './ngostatus.component.html',
  styleUrls: ['./ngostatus.component.css']
})
export class NgostatusComponent implements OnInit {

  constructor(private service:RestapiService,private ngoService:NgoService,private router:Router , private route:ActivatedRoute) { }
  msg:string;
  label=false;
  ngoIdDetail= new FormGroup({
    ngoId: new FormControl()
  });
  ngOnInit(): void {
    if(this.ngoService.getNgoId() === 0){
      console.log(this.ngoService.getNgoId());
       this.msg='Please Register';
       this.label=false;
     }
        else{
          console.log(this.ngoService.getNgoId());
          this.label=true;
          this.service.getNgoStatus(this.ngoService.getNgoId()).subscribe((result)=>{
            
            this.msg=result
            console.log(this.msg)
          });
     
     }
  }
  savengoId(){
    this.service.getNgoStatus(this.ngoIdDetail.get('ngoId').value)
    .subscribe((result)=>{
      console.log(result);
      this.ngoService.setNgoId(this.ngoIdDetail.get('ngoId').value)
      this.msg=result;
      this.router.navigate(['../ngostatus'],{relativeTo:this.route});
      this.label=true;

    });

  }

}
