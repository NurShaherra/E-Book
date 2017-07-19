package sg.edu.rp.c346.e_book;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class skin extends AppCompatActivity {

    Spinner spnSkin;
    TextView tvContent;
    Button btnSkin;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin);

        spnSkin = (Spinner) findViewById(R.id.spinnerSkin);
        tvContent = (TextView) findViewById(R.id.textViewContent);
        btnSkin = (Button) findViewById(R.id.btnSkinType);
        img = (ImageView) findViewById(R.id.imageView2);

        Intent intentReceived = getIntent();


        btnSkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), typesSkin.class);
                startActivity(intent);
            }
        });

//        btnGo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String url = tvLink.getText().toString();
//                Uri uri = Uri.parse(url); // missing 'http://' will cause crashed
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//            }
//        });


        spnSkin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(spnSkin.getSelectedItem().toString().equalsIgnoreCase("Dry skin")){
                    img.setImageResource(R.drawable.honeyoat);

                    tvContent.setText("1. Use mild, gentle soap or cleansers. Avoid deodorant soaps\n\n" +
                            "2. Smooth on a rich mosturizing lotion right after bathing. \n\n" +
                            "Homemade face mask for Dry Skin:\n" +
                            "Honey and Oatmeal Mask: \n•\tMake sure your oats are finely-ground, place it into a bowl. Add some hot water and mix it. Let the mixture cool. Add a tablespoon of honey and stir. Place it onto your face for 10 mins. Wash it off.  ");
                } else if (spnSkin.getSelectedItem().toString().equalsIgnoreCase("Oily Skin")) {
                    img.setImageResource(R.drawable.whip);

                    tvContent.setText("\n1. Wash your face twice a day, morning and night with warm water" +
                            "\n 2. Use oil-free cosmetics. Look for 'noncomedogenic' so that it won't clog pores" +
                            "\n 3. Avoid milk cleansers. Use gentle cleansers\n"+
                            "4. Mosturise using hydrating lotion \n\n" +
                            "Homemade face masks: \n " +
                            "Egg white mask:\n" +
                            "•\tYou only need 1 ingredient: an egg white. Remove the egg yolk and then whip all the egg white in. If it's done, apply it on your face. Let it stay for 15 mins. Wash it off. Do this once a week.");
                } else if (spnSkin.getSelectedItem().toString().equalsIgnoreCase("Normal Skin")){
                    img.setImageResource(R.drawable.cleanser);

                    tvContent.setText("1. Follow the basic skincare methods closely. \n\n " +
                            "Homemade face masks:\n" +
                            "Fruits face pack: \n" +
                            "• \tBlend & make a paste of apple, peer, orange, grapes, strawberries and a few drops of honey. Gently apply the paste on your face. Relax for twenty to thirty minutes and leave this pack on. Wash of your face with lukewarm water and feel having a glowing skin.\n\n" +
                            "2.Apple, egg, honey face pack: \n" +
                            "•\tMix one sliced apple, yolk of one egg, 4 teaspoons of olive oil, 2 teaspoons of honey in liquidizer and make out a smooth paste. Apply this on your face and body, let it dry for twenty minutes and then wash it off with clean water.");

                } else if (spnSkin.getSelectedItem().toString().equalsIgnoreCase("Basics of skincare")){
                    img.setImageResource(R.drawable.skincaree);

                    tvContent.setText("1. Exfoliating (ALL skin types) \n\n Wash face with lukewarm water, calm your skin with cold water\n\n" +
                            "2. Cleansing \n \t Types: Foam, Gel, Milk, Lotion \n\n" +
                            "3. Toning \n \t Avoid toner with alcohol. \n \t Shrink pores \n \tGive your skin PH balance \n \t Adds a layer of protection \n\n" +
                            "4. Mosturising \n \t Types: Serum, Hydrating lotion, Cream \n\n" +
                            "5. Protection (Sunblock) \n \t Avoid SPF > 50");

                } else if (spnSkin.getSelectedItem().toString().equalsIgnoreCase("Combination skin")){
                    img.setImageResource(R.drawable.bananamask);

                    tvContent.setText("1. Clean your face once or twice daily with a rose milk cleanser" +
                            "\n2. Exfoliate sparingly, once a week." +
                            "\n3. Mosturize once in the morning and evening. \n\nRecommended: Olay Total effects cream for mosturising." +
                            "\n\n Homemade face mask:" +
                            "\nBANANA mask: \n•\t 1/3 banana, 1 egg, 1 tsp honey, 1 tsp full fat milk(avoid skimmed/semi skimmed). Pour some full fat milk into a pan, boil it. Cool it down. Apply to face for 15 mins. ");

                } else if(spnSkin.getSelectedItem().toString().equalsIgnoreCase("acne-prone skin")){
                    img.setImageResource(R.drawable.teatree);

                    tvContent.setText("1. Use a mild skin cleanser to wash your face at the start of the day & before going to bed\n" +
                            "2. Don't touch affected areas with dirty hands. This will pass on extra dirt, oil, bacteria to affected areas which can trigger acne. \n" +
                            "3. Use skin care products which are oil-free and grease less\n" +
                            "4. Avoid excess of oily foods and sugary products\n" +
                            "\n HomeMade Acne Masks: \n" +
                            "•\tEgg white and Honey Mask. Put a teaspoon of organic honey in a bowl. Remove the egg yolk and take only the egg white into the same bowl with organic honey. Mix them. Apply them to your face. Wait around 10 mins and wash it off. "+
                            ""+
                            "\nTreat and prevent acne: " +
                            "\n •\t Tea tree oil available in Body Shops: Use it at night before sleeping.");

                } else if (spnSkin.getSelectedItem().toString().equalsIgnoreCase("sensitive skin")){
                    img.setImageResource(R.drawable.combinationskin);

                    tvContent.setText("1. Drink lemon water daily. It helps combat free-radical damage. \n \n •\t To make lemon water, squeeze the juice from ½ lemon into a glass of lukewarm water. •\tAdd a little raw honey and drink it on an empty stomach every morning. Wait at least 30 minutes, then enjoy your breakfast." +
                            "\n\n2. Avoid skin care & cosmetic produtcs that have alcohol, harsh exfoliants, sodium lauryl sulfate, petrochemicals, acids, coloring agents, synthetic fragrances - can irritate the skin" +
                            "\n\n Homemade face masks:" +
                            "\n•\t To make a moisturizing raw milk face mask, add ½ teaspoon of gram flour, also called besan, to enough raw milk to make a paste. Mix in a few drops of raw honey and rose water. Apply it on your face and neck, leave it on for 10 minutes and then rinse it off using lukewarm water. Use this face mask once a week.");
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

        } else if (id == R.id.menu_hair) {
            Intent intent = new Intent(getBaseContext(), hair.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.menu_hairtype) {
            Intent intent = new Intent(getBaseContext(), typesHair.class);
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
