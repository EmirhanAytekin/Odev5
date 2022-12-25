package com.example.odev5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.odev5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    public void digerActivity (View view) {
        String adSoyad = binding.adSoyad.getText().toString();
        String telefonNo = binding.phone.getText().toString();
        Intent intent = new Intent(MainActivity.this,BilgiActivity.class);
        intent.putExtra("adSoyadKey",adSoyad);
        intent.putExtra("telefonNoKey",telefonNo);
        startActivity(intent);
    }


}