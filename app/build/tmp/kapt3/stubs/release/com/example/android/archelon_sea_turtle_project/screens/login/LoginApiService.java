package com.example.android.archelon_sea_turtle_project.screens.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/android/archelon_sea_turtle_project/screens/login/LoginApiService;", "", "authenticateUser", "Lkotlinx/coroutines/Deferred;", "Lcom/example/android/archelon_sea_turtle_project/screens/login/LoginTokenData;", "body", "Lokhttp3/MultipartBody;", "app_release"})
public abstract interface LoginApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "login/")
    public abstract kotlinx.coroutines.Deferred<com.example.android.archelon_sea_turtle_project.screens.login.LoginTokenData> authenticateUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.MultipartBody body);
}