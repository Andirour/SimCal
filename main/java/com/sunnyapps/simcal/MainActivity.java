package com.sunnyapps.simcal;


import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;





public class MainActivity extends AppCompatActivity {

    private static EditText text1,text2;
    private static Button but1,but2,but3,but4,but5,but6,but7;
    private static TextView ansr;
    private static Double num1,num2;
    private static Double num3=0.0;
    private static String str1,str2,ans;

    public void hideKeyboard(View view) {
        InputMethodManager inputMethodManager =(InputMethodManager)getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but1=(Button)findViewById(R.id.button);
        but2=(Button)findViewById(R.id.button2);
        but3=(Button)findViewById(R.id.button3);
        but4=(Button)findViewById(R.id.button4);
        text1=(EditText)findViewById(R.id.editText);
        text2=(EditText)findViewById(R.id.editText2);
        ansr=(TextView)findViewById(R.id.textView2);
        but5=(Button)findViewById(R.id.button5);
        but6=(Button)findViewById(R.id.button6);
        but7=(Button)findViewById(R.id.button7);


        text1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(v);
                }
            }
        });

        text2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(v);
                }
            }
        });



        but5.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        try {
                            text1.setText(ans);
                        }
                        catch(Exception e){
                            ansr.setText("Error");
                        }
                    }
                }
        );

        but1.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        try {
                            str1 = text1.getText().toString();
                            num1 = Double.parseDouble(str1);
                            str2 = text2.getText().toString();
                            num2 = Double.parseDouble(str2);
                            num3 = num1 + num2;

                            ans = Double.toString(num3);
                            ans = ans.indexOf(".") < 0 ? ans : ans.replaceAll("0*$", "").replaceAll("\\.$", "");
                            ansr.setText(ans);
                            hideKeyboard(v);
                        }
                        catch(Exception e){
                            ansr.setText("Error");
                        }
                    }
                }
        );
        but2.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        try {
                            str1 = text1.getText().toString();
                            num1 = Double.parseDouble(str1);
                            str2 = text2.getText().toString();
                            num2 = Double.parseDouble(str2);
                            num3 = num1 - num2;
                            ans = Double.toString(num3);
                            ans = ans.indexOf(".") < 0 ? ans : ans.replaceAll("0*$", "").replaceAll("\\.$", "");
                            ansr.setText(ans);
                        }
                        catch(Exception e){
                            ansr.setText("Error");
                        }
                    }
                }
        );
        but3.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        try {
                            str1 = text1.getText().toString();
                            num1 = Double.parseDouble(str1);
                            str2 = text2.getText().toString();
                            num2 = Double.parseDouble(str2);
                            num3 = num1 * num2;
                            ans = Double.toString(num3);
                            ans = ans.indexOf(".") < 0 ? ans : ans.replaceAll("0*$", "").replaceAll("\\.$", "");
                            ansr.setText(ans);
                        }
                        catch(Exception e){
                            ansr.setText("Error");
                        }
                    }
                }
        );
        but4.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        try {
                            str1 = text1.getText().toString();
                            num1 = Double.parseDouble(str1);
                            str2 = text2.getText().toString();
                            num2 = Double.parseDouble(str2);
                            num3 = num1 / num2;

                                ans = Double.toString(num3);
                                ans = ans.indexOf(".") < 0 ? ans : ans.replaceAll("0*$", "").replaceAll("\\.$", "");
                                ansr.setText(ans);

                        }
                        catch(Exception e){
                            ansr.setText("Error");
                        }
                    }
                }
        );
        but6.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        try {
                            str1 = text1.getText().toString();
                            num1 = Double.parseDouble(str1);
                            str2 = text2.getText().toString();
                            num2 = Double.parseDouble(str2);
                            num3 = Math.pow(num1,num2);

                            ans = Double.toString(num3);
                            ans = ans.indexOf(".") < 0 ? ans : ans.replaceAll("0*$", "").replaceAll("\\.$", "");
                            ansr.setText(ans);
                            hideKeyboard(v);
                        }
                        catch(Exception e){
                            ansr.setText("Error");
                        }
                    }
                }
        );
        but7.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        try {
                            str1 = text1.getText().toString();
                            num1 = Double.parseDouble(str1);
                            str2 = text2.getText().toString();
                            num2 = Double.parseDouble(str2);
                            num3 = Math.sqrt(num1);

                            ans = Double.toString(num3);
                            ans = ans.indexOf(".") < 0 ? ans : ans.replaceAll("0*$", "").replaceAll("\\.$", "");
                            ansr.setText(ans);
                            hideKeyboard(v);
                        }
                        catch(Exception e){
                            ansr.setText("Error");
                        }
                    }
                }
        );


    }

}
