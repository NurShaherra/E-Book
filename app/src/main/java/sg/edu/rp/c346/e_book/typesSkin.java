package sg.edu.rp.c346.e_book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class typesSkin extends AppCompatActivity {
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;

    Button btnNext;
    Button btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_skin);

        tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView4);
        tv4 = (TextView) findViewById(R.id.textView6);
        tv5 = (TextView) findViewById(R.id.textView7);
        btnNext = (Button) findViewById(R.id.buttonNext);
        btnBack = (Button) findViewById(R.id.buttonBack);


        Intent intentReceived = getIntent();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), skin.class);
                startActivity(intent);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        tv1.setText("Wash your face. Wash with a gentle cleanser and pat dry. Remove make-up. This cleans away oils and dirt, giving your skin a fresh start."
                );

        tv2.setText("Wait an hour. Your skin should return to its natural state, the characteristics of which will determine your skin type. Do not touch your face.");

        tv3.setText("Dab your face with a tissue. Pay attention to the 'T-zone' the area of your forehead and nose.");

        tv4.setText("See what your skin type falls under: \n" +
              "•\tNormal skin shows neither oil nor flaking skin. It should feel supple and smooth.\n"  +
              "•\tOily skin is characterized by the grease on the tissue. There would be large pores and a shine.\n" +
        "•\tDry skin may feel taut or show flakes of dead skin with small pores. \n" +
        "•\tCombination skin. the skin is oily in the T-zone & normal to dry elsewhere. \n");


        tv5.setText("There are usually 2 'problems' your skin might have: \n" +
                "•\tSensitive skin.\n" +
                "•\tAcne-Prone skin.");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();
        int TextView = item.getItemId();


        if (id == R.id.menu_home) {
            Intent intent = new Intent(getBaseContext(), MainActivity.class);
            startActivity(intent);
            return true;

        } else if (id == R.id.menu_hair) {
            Intent intent = new Intent(getBaseContext(), hair.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.menu_skin) {
            Intent intent = new Intent(getBaseContext(), skin.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.menu_hairtype) {
            Intent intent = new Intent(getBaseContext(), typesHair.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.menu_email) {
            Intent intent = new Intent(getBaseContext(), email.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
