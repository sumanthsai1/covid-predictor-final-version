package com.example.testing_covid.UserDetails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testing_covid.R;

public class ResetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
    }

    public void reset(View view) {
        startActivity(new Intent(ResetPasswordActivity.this,LoginActivity.class));
    }
}