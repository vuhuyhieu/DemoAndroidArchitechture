package com.example.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Query;

import com.example.model.Student;

import java.util.ArrayList;

public interface StudentDAO {
    @Query("select * from Students")
    LiveData<ArrayList<Student>> loadStudents();
}
