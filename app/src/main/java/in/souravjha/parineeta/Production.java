package in.souravjha.parineeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Production extends AppCompatActivity {
    Button disinticator1;
    Button disindicator2;
    Button sewing;
    Button pressingAndStocking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_production);
        // toolbar
        Toolbar toolbar =findViewById(R.id.toolbar);
        toolbar.setTitle("Production");
        setSupportActionBar(toolbar);

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        disinticator1=findViewById(R.id.disindicator1);
        disindicator2=findViewById(R.id.disindicator2);
        sewing=findViewById(R.id.sewing);
        pressingAndStocking=findViewById(R.id.processing);

        disinticator1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Production.this,Disindicator1.class));

            }
        });
        disindicator2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Production.this,Disindicator2.class));

            }
        });
        sewing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Production.this,Sewing.class));

            }
        });
        pressingAndStocking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Production.this,PressingAndStocking.class));

            }
        });

    }
}
