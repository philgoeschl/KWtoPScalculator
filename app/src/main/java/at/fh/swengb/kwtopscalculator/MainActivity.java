package at.fh.swengb.kwtopscalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextInput;
    private TextView resultView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextInput = (EditText)findViewById(R.id.editTextInput);
        resultView = (TextView)findViewById(R.id.textViewOutput);
    }

    public void calcPS(View view){
        String num1String = editTextInput.getText().toString();

        double num1=0;
        double num2=1.35962;
        double result=0;

        try {
            num1=Double.parseDouble(num1String);
            result=num1*num2;
            result*=100;
            result=Math.round(result);
            result/=100;
            resultView.setText(result+" PS");
        } catch (NumberFormatException e) {
            resultView.setText("WRONG INPUT!");
            e.printStackTrace();
        }
    }

    public void showAbout(View view){
        Intent intent = new Intent(this, AboutActivity.class);
        String message = resultView.getText().toString();
        intent.putExtra("calculationResult",message);
        startActivity(intent);
    }
}
