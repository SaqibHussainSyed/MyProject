import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgodisplayComponent } from './ngodisplay.component';

describe('NgodisplayComponent', () => {
  let component: NgodisplayComponent;
  let fixture: ComponentFixture<NgodisplayComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgodisplayComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NgodisplayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
