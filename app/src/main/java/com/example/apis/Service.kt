package com.example.apis

import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Service {

    @FormUrlEncoded
    @POST("fetch_all_suppliers.php")
    fun fetchSuppliers(
        @Field("__api_key__") apikey: String)
            : Call<Response>


}

