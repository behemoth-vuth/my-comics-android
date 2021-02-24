package vn.behemoth.mycomics;

import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import vn.behemoth.mycomics.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    public void onViewCreated() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.activity_main;
    }
}