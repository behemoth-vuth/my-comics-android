package vn.behemoth.mycomics;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import vn.behemoth.mycomics.base.BaseActivity;
import vn.behemoth.mycomics.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        
        binding.getRoot().findViewById(R.id.icMenuLeft).setOnClickListener(v -> {
            binding.drawerLayout.openDrawer(Gravity.LEFT);
        });

        setContentView(binding.getRoot());
    }

    @Override
    public int getLayoutRes() {
        return R.layout.activity_main;
    }
}