package br.com.ufpb.dispositivosmoveis.manualdofera;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;


public class FeedbackScreen extends ActionBarActivity {

    private Typeface typeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback_screen);

        homeBack();
        buttonTypeFace();
        createSeekBar();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_feedback_screen, menu);
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            Intent intent = new Intent(this, ListFuncions.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    private void homeBack(){
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    private void buttonTypeFace(){
        Button button = (Button) findViewById(R.id.send);
        button.setTypeface(this.typeface);
    }

    private void createSeekBar(){
        SeekBar seekBar = (SeekBar)findViewById(R.id.feedback_seekBar);
        seekBar.setMax(10);
    }

    public void sendFeedback(View view){
        Toast.makeText(getBaseContext(),"Coming Soon",Toast.LENGTH_SHORT).show();
    }
}
