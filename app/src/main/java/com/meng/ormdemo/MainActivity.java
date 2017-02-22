package com.meng.ormdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.j256.ormlite.dao.Dao;
import com.meng.ormdemo.bean.UserInfo;
import com.meng.ormdemo.db.MySqliteOpenHelper;

import java.sql.SQLException;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    public static String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TAG = MainActivity.this.getClass().getSimpleName();

        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    Dao<UserInfo, Integer> dao = new MySqliteOpenHelper(MainActivity.this).getDao(UserInfo.class);

                    UserInfo userInfo = new UserInfo();
                    userInfo.setName("孟先生");
                    userInfo.setAddress("河南漯河");
                    userInfo.setSex(23);

                    dao.create(userInfo);

                    List<UserInfo> userInfos = dao.queryForAll();
                    Log.d(TAG,"集合长度："+userInfos.size());
                } catch (SQLException e) {
                    e.printStackTrace();
                }


            }
        });
    }
}
