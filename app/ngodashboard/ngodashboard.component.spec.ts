import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgodashboardComponent } from './ngodashboard.component';

describe('NgodashboardComponent', () => {
  let component: NgodashboardComponent;
  let fixture: ComponentFixture<NgodashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgodashboardComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NgodashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
