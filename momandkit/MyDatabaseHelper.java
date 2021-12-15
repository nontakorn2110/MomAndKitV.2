package com.utcc.momandkit;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;
import androidx.annotation.Nullable;


public class MyDatabaseHelper extends SQLiteOpenHelper {

    private Context context ;
    private static final String DATABASE_NAME = "Child";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "add_child";
    private static final String COL_ID = "id";
    private static final String COL_NAME = "name";
    private static final String COL_BIRTHDAY = "birthday";
    private static final String COL_SEX = "sex";
    private static final String COL_OLD = "old";
    private static final String COL_BLOODGROUP = "bloodGroup";
    private static final String COL_WEIGHT = "weight";
    private static final String COL_HEIGHT = "height";
    private static final String COL_HEAD = "head";


    public MyDatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + " (" + COL_ID +
                " INTEGER PRIMARY KEY AUTOINCREMENT," + COL_NAME +
                " VARCHAR(256)," + COL_BIRTHDAY + " VARCHAR(256)," + COL_SEX +
                " VARCHAR(256)," + COL_OLD + " VARCHAR(256)," + COL_BLOODGROUP +
                " VARCHAR(256)," + COL_WEIGHT + " VARCHAR(256)," + COL_HEIGHT +
                " VARCHAR(256)," + COL_HEAD + " VARCHAR(256))";
        db.execSQL(query);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    void addchild(String name, String birthday, String sex, String old, String bloodGroup, String weight, String height, String head) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COL_NAME, name);
        cv.put(COL_BIRTHDAY, birthday);
        cv.put(COL_SEX, sex);
        cv.put(COL_OLD, old);
        cv.put(COL_BLOODGROUP, bloodGroup);
        cv.put(COL_WEIGHT, weight);
        cv.put(COL_HEIGHT, height);
        cv.put(COL_HEAD, head);
        long result = db.insert(TABLE_NAME, null, cv);
        if (result == 0) {
            Toast.makeText(context, "เกืดข้อผิดพลาดข้อมูล", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "ข้อมูลถูกต้อง", Toast.LENGTH_SHORT).show();
        }
    }

}

