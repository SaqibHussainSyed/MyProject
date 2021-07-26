export interface Login {
    username;
    password;
}
export interface UserRegistration {
    dob;
    userName;
    contactNo;
    email;
    
    password;
}

export interface StepRegistration {
    registrationId;
    userName;
   
    ngoId;
 
    maritalStatus;
    
    aadharNo;
    
    stepStatus;
   
    userAge;
   
    noOfChildren;
    
    physicallyChallenged;
    
    ageOfChildren;
}


export interface Ngo {

    ngoId;
    ngoName;
    ngoLocation;
    ngoStatus;
    courseId;
    startDate;
    capacity;
}

export class Admin {
    adminLoginId;
    adminPassword;
}