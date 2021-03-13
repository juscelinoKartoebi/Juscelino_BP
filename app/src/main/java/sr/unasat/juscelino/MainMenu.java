package sr.unasat.juscelino;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainMenu extends AppCompatActivity {
    Button komkommerButton,pompoenButton,kousebandButton,antroewaButton,boulangerButton,bitawieriButton,koolButton,klaroenButton;
    String choices = "";
    Double price = 0.00;
    //RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        komkommerButton = (Button) findViewById(R.id.komkommerButton);
        pompoenButton = (Button) findViewById(R.id.pompoenButton);
        kousebandButton = (Button) findViewById(R.id.kousebandButton);
        antroewaButton = (Button) findViewById(R.id.antroewaButton);
        boulangerButton = (Button) findViewById(R.id.boulangerButton);
        bitawieriButton = (Button) findViewById(R.id.bitawieriButton);
        koolButton = (Button) findViewById(R.id.koolButton);
        klaroenButton = (Button) findViewById(R.id.klaroenButton);
        //recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        //recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
       // recyclerView.setHasFixedSize(true);
//        recyclerView.setAdapter();
        setContentView(R.layout.activity_main_menu);

    }
    // string is voor lijst van de cart gemaakt met prijs
    public void add_to_list(View view)
    {
        if (view == findViewById(R.id.komkommerButton))
        {
            choices = choices + "Komkommer" + "\n";
            price = price + 3;
//            textfield.setTxt(choices)
        }
        else if (view == findViewById(R.id.pompoenButton))
        {
            choices = choices + "Pompoen" + "\n";
            price = price + 20;
        }
        else if (view == findViewById(R.id.kousebandButton))
        {
            choices = choices + "Kouseband" + "\n";
            price = price + 5;
        }
        else if (view == findViewById(R.id.antroewaButton))
        {
            choices = choices + "Antroewa" + "\n";
            price = price + 10;
        }
        else if (view == findViewById(R.id.boulangerButton))
        {
            choices = choices + "Boulanger" + "\n";
            price = price + 5;
        }
        else if (view == findViewById(R.id.bitawieriButton))
        {
            choices = choices + "Bitawieri" + "\n";
            price = price + 10;
        }
        else if (view == findViewById(R.id.koolButton))
        {
            choices = choices + "Kool" + "\n";
            price = price + 17.50;
        }
        else if (view == findViewById(R.id.klaroenButton))
        {
            choices = choices + "Klaroen" + "\n";
            price = price + 15;
        }
    }
    public void placeOrder(View view){
        Intent i= new Intent(MainMenu.this,OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        i.putExtras(bundle);
        startActivity(i);
    }
}