package com.example.odev5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.odev5.databinding.ActivityBilgiBinding;

public class BilgiActivity extends AppCompatActivity {

    private ActivityBilgiBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBilgiBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        String bilgiAdSoyad = intent.getStringExtra("adSoyadKey");
        String bilgiTelefonNo = intent.getStringExtra("telefonNoKey");
        binding.textViewAdSoyad.setText(bilgiAdSoyad);
        binding.textViewPhone.setText(bilgiTelefonNo);
    }
}