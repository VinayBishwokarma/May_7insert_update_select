package com.example.may_7insert_update_select;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;

public class DbHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "mydb";
    private static final int DB_VERSION = 1;


    public DbHelper(Context context) {
        super(context, DB_NAME, null, 1);


    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(Student.TBL_QRY);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int newVersion) {
        String qry ="DROP TABLE IF EXISTS students";
        sqLiteDatabase.execSQL(qry);
        onCreate(sqLiteDatabase);
    }

    public long Add_Student(Student student) {

        SQLiteDatabase sqLiteDatabase = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", student.getName());
        contentValues.put("phone", student.getPhone());
        contentValues.put("email", student.getEmail());
        contentValues.put("image", student.getImage());
        long id = sqLiteDatabase.insert(Student.TBL_NAME, null, contentValues);
        return id;
    }

    //public List<Student> GetStudents(SQLiteDatabase sqLiteDatabase)
}
