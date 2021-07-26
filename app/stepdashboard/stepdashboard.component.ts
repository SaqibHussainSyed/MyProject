import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { UserRegistration } from '../login';
import { RestapiService } from '../restapi.service';
import { ToggleService } from '../toggle.service';

@Component({
  selector: 'app-stepdashboard',
  templateUrl: './stepdashboard.component.html',
  styleUrls: ['./stepdashboard.component.css']
})
export class StepdashboardComponent implements OnInit {

  constructor(private route: ActivatedRoute, private router:Router,private restservice:RestapiService,private toggle: ToggleService) { }
  // logintoggle=false;
  logintoggle:boolean;
  userlogin =new FormGroup({
    email:new FormControl(),
    password:new FormControl()
    
  });
   
  userregistration =new FormGroup({
    dob :new FormControl(),
    userName : new FormControl(),
    contactNo : new FormControl(),
    email:new FormControl(),
    password:new FormControl()
  });
  user : UserRegistration;
  msg;
  ngOnInit(): void {
    
     this.logintoggle=this.toggle.getLoginToggle();
  }
  verifyUser():any {
   
    
    this.restservice.verifyUser(this.userlogin.get('email').value,this.userlogin.get('password').value).subscribe
    (
      (result)=>
      {
        
        this.msg = result;
        if(this.msg === 'Success'){
          console.log(this.msg)
          this.toggle.setLoginToggle(true);
          this.logintoggle=this.toggle.getLoginToggle();
        }
        
      },
      (error) => console.log(error)
    )
  }

  addUser(){
    this.user=this.userregistration.value;
    console.log("add");
    this.restservice.addUser(this.user)
      .subscribe((result) => {
        this.msg = result;
        console.log(this.msg);
        if(this.msg==='User Registered Successfully'){
          this.toggle.setLoginToggle(true);
          this.router.navigate(['../aboutus']);
           
        }
      });
    
  }

  nav(){
    this.router.navigate(['../forgotpassword']);
  }

  logoOut(){
    this.toggle.setLoginToggle(false);
  }

 
}
