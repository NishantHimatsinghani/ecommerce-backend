package com.luv2code.ecommerce.models.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<M extends ResponseMeta, D> {
    protected M meta;
    protected D data;

}
