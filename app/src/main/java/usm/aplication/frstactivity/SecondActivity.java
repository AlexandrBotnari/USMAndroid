package usm.aplication.frstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text = findViewById(R.id.text);

        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        text.setText(str);
    }
}
