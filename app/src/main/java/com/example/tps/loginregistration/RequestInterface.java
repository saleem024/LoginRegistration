package com.example.tps.loginregistration;

/**
 * Created by tps on 2/15/2017.
 */

import models.ServerRequest;
import models.ServerResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface RequestInterface {

    @POST("learn2crack-login-register/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}
