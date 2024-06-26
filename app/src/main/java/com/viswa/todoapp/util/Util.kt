package com.viswa.todoapp.util

import android.content.Context
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.viswa.todoapp.model.TodoDatabase

val DB_NAME = "newtododb"

val MIGRATION_2_3 = object : Migration(2,3){
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("ALTER TABLE todo ADD COLUMN is_done INTEGER DEFAULT 0 not null")
    }
}

fun buildDb(context:Context):TodoDatabase{
    val db = TodoDatabase.buildDatabase(context)
    return db
}