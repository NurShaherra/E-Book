package sg.edu.rp.c346.e_book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btnskin;
    Button btnhair;
    Button btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intentReceived = getIntent();

        btnskin = (Button) findViewById(R.id.buttonSkin);
        btnhair = (Button) findViewById(R.id.buttonHair);
        btnEmail = (Button) findViewById(R.id.buttonEmail);

        btnskin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), typesSkin.class);
                startActivity(intent);
            }
        });

        btnhair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), typesHair.class);
                startActivity(intent);
            }
        });


        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), email.class);
                startActivity(intent);
            }
        });


    }




}
