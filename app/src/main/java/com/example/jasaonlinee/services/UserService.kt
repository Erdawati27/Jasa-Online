package com.example.jasaonlinee.services

import com.example.jasaonlinee.models.LoginResponse
import retrofit2.Call
import retrofit2.http.*
interface UserService {
    @GET("login")
    fun loginUser(
        @QueryMap filter: HashMap<String, String>
    ): Call<LoginResponse>
}
