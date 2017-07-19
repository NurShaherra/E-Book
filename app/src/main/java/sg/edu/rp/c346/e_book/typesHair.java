package sg.edu.rp.c346.e_book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class typesHair extends AppCompatActivity {
    TextView tv17;
    TextView tv15;
    TextView tv16;
    TextView tv12;
    Button btnNext;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_hair);

        tv17 = (TextView) findViewById(R.id.textView17);
        tv15 = (TextView) findViewById(R.id.textView15);
        tv16 = (TextView) findViewById(R.id.textView16);
        tv12 = (TextView) findViewById(R.id.textView12);
        btnNext = (Button) findViewById(R.id.buttonNext);
        btnBack = (Button) findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), hair.class);
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

        tv12.setText(
                "\n •\tDab a tissue on your scalp the second day after wash.\n" +
                "•\tIf there’s an oil blot, you have normal hair. \n" +
                "•\tIf the tissue shows nothing, you have dry hair. \n" +
                "•\tIf strands stick to each other then it is greasy, you have oily hair.");

        tv17.setText("\n\n•\tThe hair looks dull and lifeless most of the times. \n" +
                "•\tHowever much you shampoo, your hair will look greasy and limp in just a day or two. \n " +
                "•\tExcess oil secretion leads to dandruff which results in a lot of hair fall.");

        tv15.setText("•\tDry and frizzy hair due to overexposure to the sun, using harsh shampoos and chemical treatment \n" +
                "•\tSplit ends \n" +
                "•\tExcessive hair breakage and loss");

        tv16.setText("\n•\tHealthy hair with minimal hair loss \n" +
                "•\tMinimal dandruff and other issues");

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
        } else if (id == R.id.menu_skintype) {
            Intent intent = new Intent(getBaseContext(), typesSkin.class);
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
