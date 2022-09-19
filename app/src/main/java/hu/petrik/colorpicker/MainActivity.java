package hu.petrik.colorpicker;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.slider.RangeSlider;

public class MainActivity extends AppCompatActivity {

    private RangeSlider rangeRed;
    private RangeSlider rangeGreen;
    private RangeSlider rangeBlue;
    private TextView redtext;
    private TextView greentext;
    private TextView bluetext;
    private FrameLayout framelayoutszin;
    private TextView layouttext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        rangeRed.addOnChangeListener(new RangeSlider.OnChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @SuppressLint({"RestrictedApi", "SetTextI18n"})
            @Override
            public void onValueChange(@NonNull RangeSlider slider, float value, boolean fromUser) {
                redtext.setText("Red: " + Math.round(rangeRed.getValues().get(rangeRed.getActiveThumbIndex()).intValue()));
                String redcolor = redtext.getText().toString();
                int red = Integer.parseInt(redcolor.replaceAll("[\\D]", ""));
                String greencolor = greentext.getText().toString();
                int green = Integer.parseInt(greencolor.replaceAll("[\\D]", ""));
                String bluecolor = bluetext.getText().toString();
                int blue = Integer.parseInt(bluecolor.replaceAll("[\\D]", ""));
                framelayoutszin.setBackgroundColor(Color.rgb(red, green, blue));
                layouttext.setText("(" + red + "," + green + "," + blue + ")");
                if (red+green+blue>430){
                    layouttext.setTextColor(Color.BLACK);
                }else{
                    layouttext.setTextColor(Color.WHITE);
                }
            }
        });
        rangeGreen.addOnChangeListener(new RangeSlider.OnChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @SuppressLint({"RestrictedApi", "SetTextI18n"})
            @Override
            public void onValueChange(@NonNull RangeSlider slider, float value, boolean fromUser) {
                greentext.setText("Green: " + Math.round(rangeGreen.getValues().get(rangeGreen.getActiveThumbIndex()).intValue()));
                String redcolor = redtext.getText().toString();
                int red = Integer.parseInt(redcolor.replaceAll("[\\D]", ""));
                String greencolor = greentext.getText().toString();
                int green = Integer.parseInt(greencolor.replaceAll("[\\D]", ""));
                String bluecolor = bluetext.getText().toString();
                int blue = Integer.parseInt(bluecolor.replaceAll("[\\D]", ""));
                framelayoutszin.setBackgroundColor(Color.rgb(red, green, blue));
                layouttext.setText("(" + red + "," + green + "," + blue + ")");
                if (red+green+blue>430){
                    layouttext.setTextColor(Color.BLACK);
                }else{
                    layouttext.setTextColor(Color.WHITE);
                }
            }
        });
        rangeBlue.addOnChangeListener(new RangeSlider.OnChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @SuppressLint({"RestrictedApi", "SetTextI18n"})
            @Override
            public void onValueChange(@NonNull RangeSlider slider, float value, boolean fromUser) {
                bluetext.setText("Blue: " + Math.round(rangeBlue.getValues().get(rangeBlue.getActiveThumbIndex()).intValue()));
                String redcolor = redtext.getText().toString();
                int red = Integer.parseInt(redcolor.replaceAll("[\\D]", ""));
                String greencolor = greentext.getText().toString();
                int green = Integer.parseInt(greencolor.replaceAll("[\\D]", ""));
                String bluecolor = bluetext.getText().toString();
                int blue = Integer.parseInt(bluecolor.replaceAll("[\\D]", ""));
                framelayoutszin.setBackgroundColor(Color.rgb(red, green, blue));
                layouttext.setText("(" + red + "," + green + "," + blue + ")");
                if (red+green+blue>430){
                    layouttext.setTextColor(Color.BLACK);
                }else{
                    layouttext.setTextColor(Color.WHITE);
                }
            }
        });


    }

    private void init() {
        rangeRed = findViewById(R.id.rangeRed);
        rangeGreen = findViewById(R.id.rangeGreen);
        rangeBlue = findViewById(R.id.rangeBlue);
        redtext = findViewById(R.id.redtext);
        greentext = findViewById(R.id.greentext);
        bluetext = findViewById(R.id.bluetext);
        framelayoutszin = findViewById(R.id.framelayoutszin);
        layouttext = findViewById(R.id.layouttext);
    }
}