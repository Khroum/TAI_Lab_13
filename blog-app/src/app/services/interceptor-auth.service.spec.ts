import { TestBed } from '@angular/core/testing';

import { HttpIntercepterBasicAuthService } from './interceptor-auth.service';

describe('InterceptorAuthService', () => {
  let service: HttpIntercepterBasicAuthService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HttpIntercepterBasicAuthService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
