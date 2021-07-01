package com.luv2code.ecommerce.util;

import com.luv2code.ecommerce.models.common.ResponseStatus;
import com.luv2code.ecommerce.models.response.ApiResponse;
import com.luv2code.ecommerce.models.response.ResponseMeta;

public class Utils {

    public static <T> ApiResponse createResponse(T body, ResponseStatus status, ResponseMeta meta) {
        ApiResponse response = new ApiResponse();
        response.setData(body);
        ResponseMeta responseMeta = new ResponseMeta();
        responseMeta.setStatus(status);
        response.setMeta(responseMeta);
        return response;
    }

}
