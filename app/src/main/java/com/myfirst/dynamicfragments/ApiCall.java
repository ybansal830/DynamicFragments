package com.myfirst.dynamicfragments;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiCall {

    @GET("shivarajp/2cbe00030c04472c9d8ad4b0ec112dbe/raw/" +
            "c651391e428182f08d60d59e79073f3fcf79b858/nobroker")
    Call<List<ResponseDTO>> getData();
}
