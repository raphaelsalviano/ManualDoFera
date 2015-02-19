package br.com.ufpb.dispositivosmoveis.manualdofera;


import android.widget.SeekBar;

public class OnSeekBarChangeListener implements SeekBar.OnSeekBarChangeListener {

    private int progress;

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        this.progress = progress;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    public int getProgress(){
        return progress;
    }
}
