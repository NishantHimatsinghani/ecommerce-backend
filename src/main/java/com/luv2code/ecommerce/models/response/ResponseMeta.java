package com.luv2code.ecommerce.models.response;

import com.luv2code.ecommerce.models.common.ResponseStatus;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
public class ResponseMeta {
    ResponseStatus status;
    Instant requestTime;
}
