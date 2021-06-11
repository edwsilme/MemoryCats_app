package com.example.memorycats;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Edward E Silva M.
 * Versión 2.0
 * 25/03/2021
 */

public class MainActivity extends Activity {

    Button btnjugar, btnsalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnjugar = (Button) findViewById(R.id.botonJugar);
        btnsalir = (Button) findViewById(R.id.botonSalir);

        btnjugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jugar();
            }
        });

        btnsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void jugar() {
        Intent i = new Intent(this, Juego.class);
        startActivity(i);
    }
}


