package in.souravjha.parineeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class PressingAndStocking extends AppCompatActivity {
    Button production;
    Button drying;
    Button chamber;
    Button loading;
    Button dailyWages;
    Button dailyExpenditure;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        //getting the toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        //setting the title
        toolbar.setTitle("PressingAndStocking");
        //placing toolbar in place of actionbar
        setSupportActionBar(toolbar);

        production=findViewById(R.id.production);
        drying=findViewById(R.id.drying);
        chamber=findViewById(R.id.chamber);
        loading=findViewById(R.id.loading);
        dailyExpenditure=findViewById(R.id.expenditure);
        dailyWages=findViewById(R.id.wages);

        production.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PressingAndStocking.this,Production.class));
            }
        });
        drying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PressingAndStocking.this,Drying.class));
            }
        });
        chamber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PressingAndStocking.this,Chamber.class));
            }
        });
        loading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PressingAndStocking.this,Loading.class));
            }
        });
        dailyWages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PressingAndStocking.this,DailyWages.class));
            }
        });
        dailyExpenditure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PressingAndStocking.this,DailyExpenses.class));
            }
        });

    }
}
