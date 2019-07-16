package challenge.alc.kelvinwaithira;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnAlc, btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instantiate our buttons here

        btnAlc = findViewById(R.id.btnAlc);
        btnProfile = findViewById(R.id.btnProfile);

        // set onclick listeners to our buttons :-)
        btnAlc.setOnClickListener(this);
        btnProfile.setOnClickListener(this);
        getSupportActionBar().setTitle("ALC 4 Phase 1");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnAlc) {
            // start Intent for ALC Web View
            Intent intentWebview = new Intent(getApplicationContext(), WebviewActivity.class);
            startActivity(intentWebview);
        }

        if (v.getId() == R.id.btnProfile) {
            // start Intent  Profile
            Intent intentProfile = new Intent(getApplicationContext(), ProfileActivity.class);
            startActivity(intentProfile);
        }
    }
}
