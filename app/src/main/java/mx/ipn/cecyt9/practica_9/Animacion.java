package mx.ipn.cecyt9.practica_9;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;


// ejemplo AnimationDrawable
public class Animacion extends Activity {
    AnimationDrawable Anima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Anima = (AnimationDrawable) getResources().getDrawable(R.drawable.animacion);
        ImageView vista = new ImageView(this);
        vista.setBackgroundColor(Color.WHITE);
        vista.setImageDrawable(Anima);
        vista.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Anima.start();

            }
        });
        setContentView(vista);

    }
}
