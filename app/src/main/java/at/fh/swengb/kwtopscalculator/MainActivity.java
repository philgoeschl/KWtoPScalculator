package at.fh.swengb.kwtopscalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcPS(View view){
        String num1String = editTextInput.getText().toString();

        double num1=0;
        double num2=1.35962;
        double result=0;

        try {
            num1=Double.parseDouble(numString);
            result=num1*num2;
            resultView.setText(result);
        } catch (NumberFormatException e) {
            resultView.setText("WRONG INPUT!");
            e.printStackTrace();
        }
    }
}
