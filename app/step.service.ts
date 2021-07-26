import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StepService {
userName;
aadharNo=null;
  constructor() { }

 setStepAadhar(aadharNo: string){

  this.aadharNo=aadharNo;
  console.log(this.aadharNo);

  }

  getStepAadhar(){
    return this.aadharNo;
  }

 
}
