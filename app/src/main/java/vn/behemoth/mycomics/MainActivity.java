package vn.behemoth.mycomics;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

import vn.behemoth.mycomics.base.BaseActivity;
import vn.behemoth.mycomics.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (BuildConfig.Env == Env.BETA) {
            // bản beta
        } else if (BuildConfig.Env == Env.STABLE) {
            // bản STABLE
        } else if (BuildConfig.Env == Env.ROLL_OUT) {
            // bản ROLL_OUT
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        RecyclerView rcvData = findViewById(R.id.rcvUpcomingComics);
        rcvData.setLayoutManager(new LinearLayoutManager(this));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, fakeData());

        rcvData.setAdapter(adapter);
    }

    private List<Post> fakeData() {
        List<Post> listData = new ArrayList<>();
        Post ps;
        for (int i = 1; i < 6; i ++) {
            ps = new Post();
            ps.id = i;
            ps.author="Author " + String.valueOf(i);
            ps.chapter= String.valueOf(i);
            ps.datetime="11/11/2021";
            ps.name="Naruto";
            ps.img = R.drawable.manga1;

            listData.add(ps);
        }
        return  listData;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.activity_main;
    }
}