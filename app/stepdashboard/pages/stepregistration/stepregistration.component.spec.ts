import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StepregistrationComponent } from './stepregistration.component';

describe('StepregistrationComponent', () => {
  let component: StepregistrationComponent;
  let fixture: ComponentFixture<StepregistrationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StepregistrationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StepregistrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
