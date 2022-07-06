import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComponetloginComponent } from './componetlogin.component';

describe('ComponetloginComponent', () => {
  let component: ComponetloginComponent;
  let fixture: ComponentFixture<ComponetloginComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ComponetloginComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ComponetloginComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
