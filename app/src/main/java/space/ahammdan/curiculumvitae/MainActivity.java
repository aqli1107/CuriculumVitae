package space.ahammdan.curiculumvitae;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import space.ahammdan.curiculumvitae.fragment.eduFragment;
import space.ahammdan.curiculumvitae.fragment.experienceFragment;
import space.ahammdan.curiculumvitae.fragment.meFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView  bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        //meload deafult fragment
        loadFragment(new meFragment());
    }


    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;

        switch (menuItem.getItemId()) {
            case R.id.item_me:
                fragment = new meFragment();
                break;
            case R.id.item_edu:
                fragment = new eduFragment();
                break;
            case R.id.item_exp:
                fragment = new experienceFragment();
                break;
        }
        return loadFragment(fragment);
    }
}
