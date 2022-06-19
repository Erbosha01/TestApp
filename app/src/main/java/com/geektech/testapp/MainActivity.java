package com.geektech.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.geektech.testapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initClickListener();
    }

    private void initClickListener() {
        binding.btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Math math = new Math();
                String a = binding.etOne.getText().toString();
                String b = binding.etTwo.getText().toString();
                String result = math.add(a, b);
                binding.txtNumber.setText(result);
            }
        });

        binding.btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Math math = new Math();
                String a = binding.etOne.getText().toString();
                String b = binding.etTwo.getText().toString();
                String result = math.divide(a, b);
                binding.txtNumber.setText(result);
            }
        });

    }
}