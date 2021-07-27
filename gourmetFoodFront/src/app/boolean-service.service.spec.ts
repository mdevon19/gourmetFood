import { TestBed } from '@angular/core/testing';

import { BooleanServiceService } from './boolean-service.service';

describe('BooleanServiceService', () => {
  let service: BooleanServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BooleanServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
