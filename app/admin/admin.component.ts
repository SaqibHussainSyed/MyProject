import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { RestapiService } from '../restapi.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  adminLogin=new FormGroup({
    adminLoginId:new FormControl(),
    adminPassword:new FormControl()

  });
  adminlogintoggle=false;
  constructor(private service:RestapiService,private router:Router,private route: ActivatedRoute) { }

  ngOnInit(): void {
  }
  adminVerify(){
    
    this.service.verifyAdmin(this.adminLogin.get('adminLoginId').value,this.adminLogin.get('adminPassword').value)
    .subscribe(
      (result)=>{console.log(result)
      if(result==='Login Successfull'){
        this.adminlogintoggle=true;
        this.router.navigate(['../admin'],{relativeTo:this.route});
      }

      });

  }

}
