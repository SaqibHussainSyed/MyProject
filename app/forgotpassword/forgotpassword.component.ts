import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { RestapiService } from '../restapi.service';

@Component({
  selector: 'app-forgotpassword',
  templateUrl: './forgotpassword.component.html',
  styleUrls: ['./forgotpassword.component.css']
})
export class ForgotpasswordComponent implements OnInit {

  forgotId= new FormGroup({
    emailid:new FormControl('')
  });
  msg;
  constructor(private service:RestapiService) { }

  ngOnInit(): void {
  }
  forgotPassword(){
    this.service.forgotPassword(this.forgotId.get('emailid').value)
    .subscribe((result)=>{this.msg=result});
  }
}
