package br.com.ufpb.dispositivosmoveis.manualdofera;

import android.content.Context;
        import android.graphics.Typeface;
        import android.util.AttributeSet;
        import android.widget.TextView;

/**
 * Created by Raphael on 09/02/2015.
 */
public class RobotoBoldTextView extends TextView {

    public RobotoBoldTextView(Context context, AttributeSet attributeSet, int defStyle){
        super(context, attributeSet, defStyle);
        alterarFonte(context);
    }

    public RobotoBoldTextView(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
        alterarFonte(context);
    }

    public RobotoBoldTextView(Context context){
        super(context);
        alterarFonte(context);
    }

    private void alterarFonte(Context context){
        if(!isInEditMode()){ //Se não estiver em modo de edição
            Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/roboto_bold.ttf");
            setTypeface(typeface);
        }
    }
    
}