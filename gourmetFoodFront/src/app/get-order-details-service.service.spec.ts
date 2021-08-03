import { TestBed } from '@angular/core/testing';

import { GetOrderDetailsServiceService } from './get-order-details-service.service';

describe('GetOrderDetailsServiceService', () => {
  let service: GetOrderDetailsServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GetOrderDetailsServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
