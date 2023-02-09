package com.example.tempconuhacks6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tempconuhacks6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding = null;

    private ViewPager2 viewPager2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupViewPager(binding);

        binding.controlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PlaylistsActivity.class));
            }
        });
    }

    private void setupViewPager(ActivityMainBinding binding){
        SelectionAdapter adapter = new SelectionAdapter(ItemLists.allPlaylists);
        viewPager2 = binding.viewPager;
        viewPager2.setAdapter(adapter);
        // Register callback
        binding.dotsIndicator.setViewPager2(viewPager2);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // unregister callback
    }
}