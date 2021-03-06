package br.com.ufpb.dispositivosmoveis.manualdofera;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class ListFuncions extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_funcions);

        createListFuncions();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_funcions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if(id == R.id.about){
            //Toast.makeText(this, "Version 0.2",Toast.LENGTH_SHORT).show();
            intent = new Intent(ListFuncions.this, AboutScreen.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    private void createListFuncions(){
        final String[] listFuncions = getResources().getStringArray(R.array.funcions);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listFuncions);
        ListView listView = (ListView)findViewById(R.id.listFuncions);
        listView.setAdapter(adapter);
        final List<Class> list = getListClass();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                for (int i = 0; i < listFuncions.length; i++) {
                    if (position == i) {
                        Intent intent = new Intent(ListFuncions.this, list.get(i));
                        if (intent == null) {
                            Toast.makeText(getBaseContext(),"Coming Soon",Toast.LENGTH_SHORT).show();
                        }else {
                            startActivity(intent);
                        }
                    }
                }
            }
        });
    }


    private List<Class> getListClass(){
        List<Class> list = new ArrayList<>();
        list.add(null);
        list.add(FuncionsDisciplinasScreen.class);
        list.add(null);
        list.add(null);
        list.add(null);

        return list;
    }
}
