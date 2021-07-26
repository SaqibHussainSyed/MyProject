import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ToggleService {
  
  constructor() { }
  logintoggle=false;
  setLoginToggle(logintoggle:boolean){
    this.logintoggle=logintoggle;
  }

  getLoginToggle():boolean{
    return this.logintoggle;
  }
}
