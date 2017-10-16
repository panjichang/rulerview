package com.pan.ruler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.seek.ruler.R;


public class MainActivity extends AppCompatActivity implements RulerView.OnChangeListener{
    private  TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((RulerView)findViewById(R.id.simple_ruler)).setOnChangeListener(this);
        textView1 = (TextView)findViewById(R.id.text1);
        textView1.setText(Html.fromHtml("<big>0.0</big>kg"));
    }


    @Override
    public void onChange(RulerView view, int position, float value) {
        switch (view.getId()){
            case R.id.simple_ruler:
                textView1.setText(Html.fromHtml("<big>"+value + "</big>kg"));
                break;
        }
    }

}
