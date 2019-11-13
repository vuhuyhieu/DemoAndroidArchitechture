package com.example.database;

import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.RoomDatabase;

import com.example.model.Student;

@Database(entities = {Student.class}, version = 2)
public class AppDatabase extends RoomDatabase {

}
