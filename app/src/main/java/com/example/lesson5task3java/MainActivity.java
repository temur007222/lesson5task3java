package com.example.lesson5task3java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lesson5task3java.Model.User;

public class MainActivity extends AppCompatActivity {
    TextView u_detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        EditText Uid = findViewById(R.id.u_length);
        EditText Upw = findViewById(R.id.pw_detail);

        String id = Uid.getText().toString();
        String pw = Upw.getText().toString();

        User user = new User(id, pw);

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(User.class.getSimpleName(), user);
        startActivity(intent);
    }
}