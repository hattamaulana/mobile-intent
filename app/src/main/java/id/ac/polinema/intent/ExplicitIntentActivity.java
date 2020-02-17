package id.ac.polinema.intent;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExplicitIntentActivity extends AppCompatActivity {

    private EditText edtName;
    private TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        edtName = findViewById(R.id.input_name);
        tvOutput = findViewById(R.id.text_output);
    }

    public void clickSubmit(View view) {
        String name = edtName.getText().toString();
        tvOutput.setText("Hello "+ name +", Congratulations");
    }
}
