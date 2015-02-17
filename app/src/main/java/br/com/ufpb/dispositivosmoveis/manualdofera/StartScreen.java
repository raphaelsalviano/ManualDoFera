package br.com.ufpb.dispositivosmoveis.manualdofera;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


public class StartScreen extends Activity {

    private Typeface typeface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);

        createComboCourses();
        buttonTypeFace();
    }

    private void createComboCourses() {
        Spinner combo_course = (Spinner) findViewById(R.id.combo_course);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.courses, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_course.setAdapter(adapter);

    }

    private void buttonTypeFace(){
        Button button = (Button) findViewById(R.id.choose_start);
        button.setTypeface(this.typeface);
    }

    public void nextScreen(View v){
        Intent intent = new Intent(StartScreen.this, ListFuncions.class);
        startActivity(intent);
        StartScreen.this.finish();
    }
}
