package sg.edu.rp.c346.e_book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class email extends AppCompatActivity {
    EditText etTo;
    EditText etSubject;
    EditText etMessage;
    Button btnSend;
    Button btnDiscard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        etTo = (EditText) findViewById(R.id.editTextTo);
        etTo.setText("shaherraa0804@hotmail.com");
        etSubject = (EditText) findViewById(R.id.editTextSubject);
        etMessage = (EditText) findViewById(R.id.editTextMessage);
        btnSend = (Button) findViewById(R.id.buttonSend);
        btnDiscard = (Button) findViewById(R.id.buttonDiscard);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to = etTo.getText().toString();
                String subject = etSubject.getText().toString();
                String message = etMessage.getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{ to});
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, message);

                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Choose an Email Client: "));
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }@Override
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
        }

        else if (id == R.id.menu_hairtype) {
            Intent intent = new Intent(getBaseContext(), typesHair.class);
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
        }
        return super.onOptionsItemSelected(item);
    }


}
