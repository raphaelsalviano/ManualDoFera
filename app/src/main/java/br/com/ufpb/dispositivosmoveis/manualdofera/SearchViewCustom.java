package br.com.ufpb.dispositivosmoveis.manualdofera;

import android.support.v7.widget.SearchView;
import android.util.Log;


public class SearchViewCustom implements SearchView.OnQueryTextListener {
    @Override
    public boolean onQueryTextSubmit(String s) {
        Log.i("Teste","onQuerryTextMessage > " + s);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        Log.i("Teste","onQuerryTextMessage > " + s);
        return false;
    }
}
