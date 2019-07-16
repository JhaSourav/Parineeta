package in.souravjha.parineeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Loading extends AppCompatActivity {
    ListView workers;
    Button addWorker,newLoad;
    TextView emptyText;
    EditText quantity9x9,quantity12x8,quantity9x6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        workers = findViewById(R.id.workers);
        emptyText = findViewById(R.id.empty);
        workers.setEmptyView(emptyText);
        quantity9x6=findViewById(R.id.quantity9x6);
        quantity9x9=findViewById(R.id.quantity9x9);
        quantity12x8=findViewById(R.id.quantity12x8);
        addWorker=findViewById(R.id.addWorker);
        Toolbar toolbar =findViewById(R.id.toolbar);
        toolbar.setTitle("Loading");
        setSupportActionBar(toolbar);

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        String[] values = new String[] {
                "NAME1",
                "NAME2",
                "NAME3",
        };
        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        workers.setAdapter(adapter);

        // ListView Item Click Listener
        workers.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) workers.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG)
                        .show();

            }

        });
        addWorker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
