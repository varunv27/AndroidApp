package com.example.android.archelon_sea_turtle_project.screens.surveyStart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010&\u001a\u00020\'J\u000e\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020\'2\u0006\u0010)\u001a\u00020*J\b\u0010,\u001a\u00020\'H\u0014R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0004R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/example/android/archelon_sea_turtle_project/screens/surveyStart/SurveyStartViewModel;", "Landroidx/lifecycle/ViewModel;", "token", "", "(Ljava/lang/String;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "db", "Lcom/example/android/archelon_sea_turtle_project/database/MorningSurveyDatabase;", "getDb", "()Lcom/example/android/archelon_sea_turtle_project/database/MorningSurveyDatabase;", "setDb", "(Lcom/example/android/archelon_sea_turtle_project/database/MorningSurveyDatabase;)V", "fusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getFusedLocationClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setFusedLocationClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "morningDao", "Lcom/example/android/archelon_sea_turtle_project/database/MorningSurveyDatabaseDAO;", "getMorningDao", "()Lcom/example/android/archelon_sea_turtle_project/database/MorningSurveyDatabaseDAO;", "setMorningDao", "(Lcom/example/android/archelon_sea_turtle_project/database/MorningSurveyDatabaseDAO;)V", "newSurvey", "Lcom/example/android/archelon_sea_turtle_project/database/MorningSurvey;", "getNewSurvey", "()Lcom/example/android/archelon_sea_turtle_project/database/MorningSurvey;", "setNewSurvey", "(Lcom/example/android/archelon_sea_turtle_project/database/MorningSurvey;)V", "getToken", "()Ljava/lang/String;", "setToken", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "loadDataIntoDB", "", "loadDb", "context", "Landroid/content/Context;", "loadLocationProvider", "onCleared", "app_release"})
public final class SurveyStartViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String token;
    @org.jetbrains.annotations.NotNull()
    private com.example.android.archelon_sea_turtle_project.database.MorningSurvey newSurvey;
    @org.jetbrains.annotations.Nullable()
    private com.example.android.archelon_sea_turtle_project.database.MorningSurveyDatabase db;
    @org.jetbrains.annotations.Nullable()
    private com.example.android.archelon_sea_turtle_project.database.MorningSurveyDatabaseDAO morningDao;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationClient;
    private kotlinx.coroutines.CompletableJob viewModelJob;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.archelon_sea_turtle_project.database.MorningSurvey getNewSurvey() {
        return null;
    }
    
    public final void setNewSurvey(@org.jetbrains.annotations.NotNull()
    com.example.android.archelon_sea_turtle_project.database.MorningSurvey p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.android.archelon_sea_turtle_project.database.MorningSurveyDatabase getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.Nullable()
    com.example.android.archelon_sea_turtle_project.database.MorningSurveyDatabase p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.android.archelon_sea_turtle_project.database.MorningSurveyDatabaseDAO getMorningDao() {
        return null;
    }
    
    public final void setMorningDao(@org.jetbrains.annotations.Nullable()
    com.example.android.archelon_sea_turtle_project.database.MorningSurveyDatabaseDAO p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.location.FusedLocationProviderClient getFusedLocationClient() {
        return null;
    }
    
    public final void setFusedLocationClient(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.location.FusedLocationProviderClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return null;
    }
    
    public final void loadDb(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void loadLocationProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void loadDataIntoDB() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public SurveyStartViewModel(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        super();
    }
}