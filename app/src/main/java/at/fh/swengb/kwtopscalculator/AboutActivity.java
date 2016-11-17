package at.fh.swengb.kwtopscalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Intent intent = getIntent();

        String message = intent.getStringExtra("calculationResult");
        TextView textView = (TextView) findViewById(R.id.textViewAboutOutput);

        textView.setText(message);
    }
}
