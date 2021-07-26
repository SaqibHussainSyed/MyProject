import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TrainingsectorComponent } from './trainingsector.component';

describe('TrainingsectorComponent', () => {
  let component: TrainingsectorComponent;
  let fixture: ComponentFixture<TrainingsectorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TrainingsectorComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TrainingsectorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
