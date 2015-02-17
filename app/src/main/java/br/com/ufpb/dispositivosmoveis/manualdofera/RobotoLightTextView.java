package br.com.ufpb.dispositivosmoveis.manualdofera;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class RobotoLightTextView extends TextView {

    public RobotoLightTextView(Context context, AttributeSet attributeSet, int defStyle){
        super(context, attributeSet, defStyle);
        alterarFonte(context);
    }

    public RobotoLightTextView(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
        alterarFonte(context);
    }

    public RobotoLightTextView(Context context){
        super(context);
        alterarFonte(context);
    }

    private void alterarFonte(Context context){
        if(!isInEditMode()){ //Se não estiver em modo de edição
            Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/roboto_light.ttf");
            setTypeface(typeface);
        }
    }

}
