package com.materia.os;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("MATERIA OS\n\nЦЕНТР: ЕДУАРД\nСТАТУС: АКТИВНО\n\nСлухаю голос...");
        tv.setTextColor(Color.GREEN);
        tv.setBackgroundColor(Color.BLACK);
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(24);
        setContentView(tv);
    }
}
