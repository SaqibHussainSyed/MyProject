import { Component, OnInit } from '@angular/core';
import { Ngo } from 'src/app/login';
import { RestapiService } from 'src/app/restapi.service';

@Component({
  selector: 'app-ngoadmin',
  templateUrl: './ngoadmin.component.html',
  styleUrls: ['./ngoadmin.component.css']
})
export class NgoadminComponent implements OnInit {

  constructor(private service:RestapiService) { }
  ngos:Ngo[];
  ngOnInit(): void {
    this.service.displayNgo().subscribe((result)=>{this.ngos=result;
    console.log(this.ngos);
    });

  }
  approveNgo(ngo:Ngo){
    this.service.approveNgo(ngo.ngoId).subscribe((result)=>{console.log("done");
    const index = this.ngos.indexOf(ngo);
    this.ngos.splice(index, 1);});
 
  }
  rejectNgo(ngo:Ngo){
    this.service.rejectNgo(ngo.ngoId).subscribe((result)=>{console.log("done");
    const index = this.ngos.indexOf(ngo);
    this.ngos.splice(index, 1);});
 
    
  }

}
