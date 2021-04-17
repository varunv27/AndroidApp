package com.example.android.archelon_sea_turtle_project.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [MorningSurvey::class], version = 1, exportSchema = false)
abstract class MorningSurveyDatabase : RoomDatabase() {

    abstract val MorningSurveyDatabaseDAO: MorningSurveyDatabaseDAO

    companion object {

        @Volatile
        private var INSTANCE: MorningSurveyDatabase? = null

        fun getInstance(context: Context): MorningSurveyDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                            context.applicationContext,
                            MorningSurveyDatabase::class.java,
                            "Morning_survey_database"
                    )
                            .fallbackToDestructiveMigration()
                            .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}