package com.example.sistema_huoc;
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

// Substitua com os dados reais do seu backend
data class LoginRequest(val email: String, val senha: String)
data class LoginResponse(val token: String, val nome: String)

interface ApiService {

    @POST("login") // endpoint da sua API
    fun login(@Body request: LoginRequest): Call<LoginResponse>
}
