package sg.edu.rp.c346.e_book;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class hair extends AppCompatActivity {
    Spinner spnHair;
    TextView tv1;
    Button btnHair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair);

        Intent intentReceived = getIntent();

        spnHair = (Spinner) findViewById(R.id.spinnerSkin);
        tv1 = (TextView) findViewById(R.id.textViewContent);
        btnHair = (Button) findViewById(R.id.btnHairType);

        btnHair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), typesHair.class);
                startActivity(intent);
            }
        });

        spnHair.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(spnHair.getSelectedItem().toString().equalsIgnoreCase("Dry")){


                    tv1.setText("Dry Hair: \n\n" +
                            "Ineffective oil glands leads to dry hair." +
                            "\n" +
                            "If you have dry skin, then it is most likely that you will have dry hair. This is a result of the insufficient production of sebum by the glands on your scalp. \n \n " +
                            "Care:\n" +
                            "\n" +
                            "•\tHot oil massage\n" +
                            "•\tDeep conditioning or even leave in treatments like L’oreal total repair\n" +
                            "•\tRefrain from using flat irons etc.\n" +
                            "•\tRepair damage with avocado \n" +
                            "Mash a ripe avocado (pit removed) with one egg, then apply this home remedy to wet hair."
                            + "Avocados are rich in vitamins, essential fatty acids, and minerals that will help restore luster to your hair, says Stephen Sanna, expert colorist at the Pierre Michel Salon in New York City. Leave on for at least 20 minutes, then rinse several times. Repeat once a week for damaged hair and once a month for healthy hair.");

                } else if(spnHair.getSelectedItem().toString().equalsIgnoreCase("Oily")){

                    tv1.setText("Oily Hair: \n" +
                            "It is very common for those with oily skin to have oily hair. Skin type does not vary between the visible surface and your scalp, hence you have oily hair. Oily skin means oily scalp and if your scalp is oily, your hair will automatically become oily.\n" +
                            "\n" +
                            "This is primarily due to excess secretion of oil. \n \n " +
                            "Care:\n" +
                            "\n" +
                            "•\tShampoo frequently\n" +
                            "•\tThe vitamins, minerals and enzymes present in aloe vera are very helpful for getting rid of oily hair. Aloe vera helps detoxify the scalp of impurities and control oil secretion, while also nourishing your hair roots. Plus, the gentle and soothing nature of aloe vera will keep your hair healthy."
                            +
                            "Mix one teaspoon of aloe vera gel and one tablespoon of lemon juice in one cup of any mild shampoo.\n" +
                                    "•\n\tWash your hair and allow the shampoo to remain on your hair for a few minutes before rinsing it off.\n"

                            );
                } else if(spnHair.getSelectedItem().toString().equalsIgnoreCase("Normal")){


                    tv1.setText("Normal Hair: \n\n " +
                            "You are lucky if you have this hair type!\n" +
                            "\n" +
                            "Proper pH balance, shiny and healthy hair come in conjunction with this type. Though we must tell you that the name is a huge misnomer. This is the most uncommon hair type to find. Take the regular precautions to clean, moisturise and protect it from sun damage and you will never face too many troubles with this hair type. \n\n" +
                            "Care:\n\n" +
                            "•\tEgg yolk treatment.\n" +
                            "•\tMassaging the yellow portion of the egg on your scalp or a mixture of three egg yolks, 1 tbsp olive oil and three drops of Vitamin E can be a wonderful hair remedy. \n" +

                            "Leave treatment on hair for 10 minutes and then rinse and shampoo hair. You can repeat the procedure at least once a week to ensure best results. This treatment will soften and condition your hair.");
                } else if(spnHair.getSelectedItem().toString().equalsIgnoreCase("Basics of HairCare")){

                tv1.setText(
                        "•\tIt’s important to wash your scalp thoroughly because an unhealthy scalp is the root of all hair problems. This is also why you only need one pump of shampoo.\n\n" +
                        "•\tIf your scalp feels oily and the shampoo is not lathering up well, don’t add more shampoo. Instead, continue shampooing, rinse and repeat the process. The shampoo should lather up into a nice foam. If it doesn’t, it might be due to leftover sebum and buildup on your scalp.\n\n" +
                        "•\tYour body deserves a massage as a treat once in a while, and so does your scalp. The reason why the hairstylist usually massages your scalp when they shampoo your hair is not to kill time, but to stimulate blood circulation so your scalp will be healthy. If you have no idea how to go about doing it, invest in a scalp brush to do the job.\n\n" +
                        "•\tDon’t apply conditioner on your scalp. Conditioner is made for your tresses, not your scalp. It should only be applied on areas where your hair is dry (usually the ends). If the itch persists, consult a doctor, as it could point to a skin condition.\n\n"


                        //"•\tA deep cleansing shampoo shouldn’t be used every day. It might strip the natural oils and dry out your scalp.");
                );

            }


        }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
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

        } else if (id == R.id.menu_hairtype) {
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
        } else if (id == R.id.menu_email) {
            Intent intent = new Intent(getBaseContext(), email.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}