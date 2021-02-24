package vn.behemoth.mycomics.base;

import android.os.Bundle;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @CallSuper
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getLayoutRes() > 0) {
            setContentView(getLayoutRes());
        }

        onViewCreated();
    }

    public abstract void onViewCreated();

    public abstract int getLayoutRes();
}
