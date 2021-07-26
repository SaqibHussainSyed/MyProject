import { Component, OnInit } from '@angular/core';
import { Ngo } from 'src/app/login';
import { RestapiService } from 'src/app/restapi.service';

@Component({
  selector: 'app-ngodisplay',
  templateUrl: './ngodisplay.component.html',
  styleUrls: ['./ngodisplay.component.css']
})
export class NgodisplayComponent implements OnInit {

  constructor(private service:RestapiService) { }
  courses=["Agriculture","Tailoring","Stitching"];
  ngoAgriculture:any;
  ngoTailoring:any;
  ngoStitching:any;
  ngOnInit(): void {
    this.service.getNgo("Agriculture").subscribe((result)=>{this.ngoAgriculture=result});
    this.service.getNgo("Tailoring").subscribe((result)=>{this.ngoTailoring=result});
    this.service.getNgo("Stitching").subscribe((result)=>{this.ngoStitching=result});
    
  }







}
