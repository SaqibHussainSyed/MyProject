import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { StepRegistration } from 'src/app/login';
import { RestapiService } from 'src/app/restapi.service';
import { StepService } from 'src/app/step.service';

@Component({
  selector: 'app-stepregistration',
  templateUrl: './stepregistration.component.html',
  styleUrls: ['./stepregistration.component.css']
})
export class StepregistrationComponent implements OnInit {

  constructor(private service: RestapiService, private router: Router, private route: ActivatedRoute, private stepService: StepService) { }
  courses = ["Agriculture", "Tailoring", "Stitching"];

  ngOnInit(): void {
  }
  ngos: {};
  stepregister = new FormGroup({
    userName: new FormControl('', Validators.requiredTrue),
    aadharNo: new FormControl(),
    userAge: new FormControl(),
    noOfChildren: new FormControl(),
    ageOfChildren: new FormControl(),
    physicallyChallenged: new FormControl(),
    maritalStatus: new FormControl(),
    courseName: new FormControl(''),
    ngoId: new FormControl(''),
    stepStatus: new FormControl('Pending')
  });

  stepRegistration: StepRegistration;

  msg;
  fnerror;


  onSelectCourse(courseName: string) {
    if (courseName) {
      this.service.getNgo(courseName)
        .subscribe((result) => { this.ngos = result });

    } else {
      this.ngos = null;
    }
  }
  // onSelectNgo(ngoId: number){
  //   this.stepRegistration.ngoId=ngoId;
  //   this.stepRegistration.stepStatus='Pending';
  // }
  addStepUser() {
    this.stepRegistration = this.stepregister.value;
    console.log(this.stepRegistration.ngoId);
    console.log(this.stepRegistration.stepStatus);
    // if (this.stepregister.get('userName').errors) {
    //   console.log("abc");
    //   this.fnerror = "Full Name required"
    // }
    // else {
      this.service.addStepUser(this.stepRegistration).subscribe((result) => {
        this.msg = result
        if (this.msg === "User Registered") {
          this.stepService.setStepAadhar(this.stepRegistration.aadharNo);
          console.log("inside");
          this.router.navigate(['../status'], { relativeTo: this.route });
        }
      });
    //}



  }
}
