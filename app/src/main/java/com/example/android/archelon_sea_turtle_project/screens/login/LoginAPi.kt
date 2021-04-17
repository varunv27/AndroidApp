package com.example.android.archelon_sea_turtle_project.screens.login



import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.MultipartBody
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.*
import java.lang.Boolean.FALSE

// Support functions and class to setup Login API request
private val BASE_URL =
        "http://archaelon.roussos.mobi/"

private val logging = HttpLoggingInterceptor()
        .setLevel(HttpLoggingInterceptor.Level.BODY);

private val httpClient = OkHttpClient.Builder()
        .addInterceptor(logging)
        .followRedirects(FALSE)
        .followSslRedirects(FALSE)
        .build();

private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

private val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .baseUrl(BASE_URL)
        .client(httpClient)
        .build()


// Define API end points
interface LoginApiService {

    @POST("login/")
    fun authenticateUser(@Body body: MultipartBody):
            Deferred<LoginTokenData>

}

object LoginApi {
    val retrofitService : LoginApiService by lazy {
        retrofit.create(LoginApiService::class.java) }
}