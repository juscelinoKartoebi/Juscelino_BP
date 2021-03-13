package sr.unasat.juscelino;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderDetails extends AppCompatActivity {
    TextView listView,priceView;
    String list_choice;
    Double price_bd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);

        listView = (TextView) findViewById(R.id.listView);
        priceView = (TextView) findViewById(R.id.priceView);

        //getting the passed value from MainCtivity
        Bundle bundle = getIntent().getExtras();
        list_choice = bundle.getString("choices");
        price_bd = bundle.getDouble("price");

        listView.setText(list_choice);
        priceView.setText("Srd : "+ price_bd.toString());
    }

}