import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})


export class NgoService {
  
  constructor() { }

 ngoId=0;
  getNgoId() {
    return this.ngoId;
  }
  setNgoId(ngoId:number){
    this.ngoId=ngoId;
  }

  
}
