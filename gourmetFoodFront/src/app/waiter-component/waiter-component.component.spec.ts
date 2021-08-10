import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WaiterComponentComponent } from './waiter-component.component';

describe('WaiterComponentComponent', () => {
  let component: WaiterComponentComponent;
  let fixture: ComponentFixture<WaiterComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WaiterComponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(WaiterComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
