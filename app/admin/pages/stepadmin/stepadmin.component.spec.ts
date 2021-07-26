import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StepadminComponent } from './stepadmin.component';

describe('StepadminComponent', () => {
  let component: StepadminComponent;
  let fixture: ComponentFixture<StepadminComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StepadminComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StepadminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
