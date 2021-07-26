import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgoadminComponent } from './ngoadmin.component';

describe('NgoadminComponent', () => {
  let component: NgoadminComponent;
  let fixture: ComponentFixture<NgoadminComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgoadminComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NgoadminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
