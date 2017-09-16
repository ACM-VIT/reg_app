package com.adeep.acmreg;

import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    String[] spacecrafts={"Juno","Hubble","Casini","WMAP","Spitzer","Pioneer","Columbia","Challenger","Apollo","Curiosity"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog2);
        spinner = (Spinner) findViewById(R.id.spinner);
        //ADAPTER
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, spacecrafts);
        spinner.setAdapter(adapter);
        //LISTENER
        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, spacecrafts[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}

