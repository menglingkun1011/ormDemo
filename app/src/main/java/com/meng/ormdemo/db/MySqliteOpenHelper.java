package com.meng.ormdemo.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.meng.ormdemo.bean.UserInfo;

import java.sql.SQLException;

/**
 * Created by MENG on 2017/2/22.
 */

public class MySqliteOpenHelper extends OrmLiteSqliteOpenHelper {

    public static final String databaseName ="user.db";
    public static final SQLiteDatabase.CursorFactory factory = null;
    private static final int databaseVersion = 1;

    public MySqliteOpenHelper(Context context) {
        super(context, databaseName, factory, databaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTable(connectionSource, UserInfo.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }
}
