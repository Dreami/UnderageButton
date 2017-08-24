package com.example.maple.underagebutton;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.maple.underagebutton.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private Button fake;
    private Button underage;
    private Button cop;

    private int clicks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        clicks = 0;
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.underage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(clicks) {
                    case 0:
                        binding.underage.setText("Picame mas");
                        clicks++;
                        break;
                    case 1:
                        binding.underage.setText("MAS");
                        binding.underage.setBackgroundColor(Color.CYAN);
                        clicks++;
                        break;
                    case 2:
                        binding.underage.setText("OH SI");
                        binding.underage.setBackgroundColor(Color.MAGENTA);
                        clicks++;
                        break;
                    case 3:
                        binding.underage.setText("Abusa de mis scripts!");
                        binding.underage.setBackgroundColor(Color.RED);
                        clicks++;
                        break;
                    case 4:
                        binding.underage.setText("Ya, parale, era broma");
                        binding.underage.setBackgroundColor(Color.YELLOW);
                        clicks++;
                        break;
                    case 5:
                        binding.underage.setText("Por suerte no hay botones de menor edad en este app :)");
                        clicks = 0;
                        break;
                }
            }
        });

        binding.cop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textView.setText("El botón era un policia disfrazado, ha sido arrestado. " +
                        "\nTocar botones menores no es un tema de risa.");
                binding.imageView.setVisibility(View.VISIBLE);
            }
        });

        binding.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(binding.imageView.getVisibility() == View.VISIBLE) {
                    binding.textView.setText("");
                    binding.imageView.setVisibility(View.INVISIBLE);
                }
            }
        });

        binding.fake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.fake.setBackgroundColor(Color.GRAY);
                binding.fake.setText("Me rompiste...");
            }
        });

    }
}
