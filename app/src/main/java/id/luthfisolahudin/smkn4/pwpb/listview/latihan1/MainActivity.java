package id.luthfisolahudin.smkn4.pwpb.listview.latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText firstNumber;
    private EditText secondNumber;
    private EditText resultNumber;

    private Button buttonAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Element
        firstNumber = findViewById(R.id.first_number);
        secondNumber = findViewById(R.id.second_number);
        resultNumber = findViewById(R.id.result_number);

        buttonAction = findViewById(R.id.button_action);

        // Set Event Handler
        buttonAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResultNumber();
            }
        });
    }

    private void calculateResultNumber() {
        int integerFirstNumber = Integer.parseInt(firstNumber.getText().toString());
        int integerSecondNumber = Integer.parseInt(secondNumber.getText().toString());
        int total = integerFirstNumber + integerSecondNumber;
        resultNumber.setText(String.valueOf(total));
    }
}