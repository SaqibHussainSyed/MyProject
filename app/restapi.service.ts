import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ngo, StepRegistration, UserRegistration } from './login';
import { throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class RestapiService {
  getNgoStatus(ngoId: number) {
    return this.http.get('http://localhost:8080/Projectglad/ngo/status/'+ngoId,{responseType:'text'});
  }
 
msg;
  constructor(private http:HttpClient) { }

  verifyUser(email: string,password: string):Observable<any>{
    console.log(email);
    return this.http.get('http://localhost:8080/Projectglad/user/login/'+email+'/'+password,{responseType:'text'});
  }
  addUser(userregistration : UserRegistration ): Observable<any>{
     return this.http.post('http://localhost:8080/Projectglad/user/adduser/',userregistration,{responseType:'text'});
  }

  getNgo(courseName: string){
    return this.http.get('http://localhost:8080/Projectglad/step/viewngo/'+courseName);
  }

  addStepUser(stepregistration : StepRegistration){
    return this.http.post('http://localhost:8080/Projectglad/step/register',stepregistration,{responseType:'text'});
  }
  getStepStatus(aadharNo: string) {
      return this.http.get('http://localhost:8080/Projectglad/step/status/'+aadharNo,{responseType:'text'});
  }
  verifyAdmin(adminLoginId:number,adminPassword: string){
    return this.http.get('http://localhost:8080/Projectglad/admin/login/'+adminLoginId+'/'+adminPassword,{responseType:'text'});
  }

  displayNgo():Observable<any>{
    return this.http.get('http://localhost:8080/Projectglad/admin/fetchngo');
  }
  displayStepUser():Observable<any>{
    return this.http.get('http://localhost:8080/Projectglad/admin/fetchuser');
  }

  approveNgo(ngoId:number){
    return this.http.get('http://localhost:8080/Projectglad/admin/addngo/'+ngoId,{responseType:'text'});
  }
  rejectNgo(ngoId:number){
    return this.http.get('http://localhost:8080/Projectglad/admin/deletengo/'+ngoId,{responseType:'text'});
  
  }

  approveStepUser(registrationId:number){
    return this.http.get('http://localhost:8080/Projectglad/admin/adduser/'+registrationId,{responseType:'text'});
  }

  rejectStepUser(registrationId:number){
    return this.http.get('http://localhost:8080/Projectglad/admin/deleteuser/'+registrationId,{responseType:'text'});
  
  }
  addNgo(ngo:Ngo){
    const header = new HttpHeaders({ 'Content-Type': 'application/json' });  

      return this.http.post('http://localhost:8080/Projectglad/ngo/add',ngo,{responseType:'text',headers:header});
  }
  forgotPassword(email:String){
    return this.http.get('http://localhost:8080/Projectglad/user/forgetpassword/'+email+'/',{responseType:'text'});

  }




}
