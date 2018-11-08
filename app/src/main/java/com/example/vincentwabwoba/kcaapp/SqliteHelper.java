package com.example.vincentwabwoba.kcaapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SqliteHelper extends SQLiteOpenHelper {

   public static final String DATABASE_NAME ="KCA";

   public static  final int DATABASE_VERSION=1;

   public static final String TABLE_USERS="users";
    //TABLE USERS COLUMNS
    //ID COLUMN @primaryKey
    public static final String KEY_ID = "id";

    //COLUMN user name
    public static final String KEY_USER_NAME = "username";

    //COLUMN email
    public static final String KEY_EMAIL = "email";

    //COLUMN password
    public static final String KEY_PASSWORD = "password";

    //creating the table

    public static final String SQL_TABLE_USERS = " CREATE TABLE " + TABLE_USERS
            + " ( "
            + KEY_ID + " INTEGER PRIMARY KEY, "
            + KEY_USER_NAME + " TEXT, "
            + KEY_EMAIL + " TEXT, "
            + KEY_PASSWORD + " TEXT"
            + " ) ";

    public SqliteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //Create Table when oncreate gets called
        sqLiteDatabase.execSQL(SQL_TABLE_USERS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        //drop table to create new one if database version updated
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS " + TABLE_USERS);
    }
    public void addUser(Student student)
    {
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(KEY_USER_NAME,student.getFullnames());
        values.put(KEY_EMAIL, student.getEmail());
        values.put(KEY_PASSWORD, student.getPassword());

        long todo_id=db.insert(TABLE_USERS, null, values);
    }

public Student Authenticate(Student student)
{
   SQLiteDatabase db= this.getReadableDatabase();
    Cursor cursor= db.query(TABLE_USERS,
            new String[] {KEY_ID,KEY_USER_NAME,KEY_EMAIL,KEY_PASSWORD},
            KEY_EMAIL +"=?",
            new  String[]{student.getEmail()},null,null,null
            );
    if(cursor!=null&&cursor.moveToFirst() &&cursor.getCount()>0){
        Student student1 = new Student(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3));

        //Match both passwords check they are same or not
        if (student.getPassword().equalsIgnoreCase(student1.getPassword())) {
            return student1;
        }
    }

    //if user password does not matches or there is no record with that email then return @false
    return null;
}

public boolean isEmailExists(String email)
{
SQLiteDatabase db= this.getReadableDatabase();
Cursor cursor=db.query(TABLE_USERS,
        new  String[]{KEY_ID, KEY_USER_NAME,KEY_EMAIL, KEY_PASSWORD},
        KEY_EMAIL +"=?",
        new String[]{email}, null, null, null);

if(cursor!=null && cursor.moveToFirst()&& cursor.getCount()>0)
{
    return true;
}

    return false;
}

}
