import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgostatusComponent } from './ngostatus.component';

describe('NgostatusComponent', () => {
  let component: NgostatusComponent;
  let fixture: ComponentFixture<NgostatusComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgostatusComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NgostatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
