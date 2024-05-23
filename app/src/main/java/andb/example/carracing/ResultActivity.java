package andb.example.carracing;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    private TextView winnerText;
    private TextView secondWinnerText;
    private TextView profitText;
    private TextView moneyLeftText;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

//        // Initialize Views
//        winnerText = findViewById(R.id.winnerText);
//        secondWinnerText = findViewById(R.id.secondWinnerText);
//        profitText = findViewById(R.id.profitText);
//        moneyLeftText = findViewById(R.id.moneyLeftText);
//        btnBack = findViewById(R.id.btnBack);
//
//        // Get Data from Intent
//        Intent intent = getIntent();
//        String winner = intent.getStringExtra("winner");
//        String secondWinner = intent.getStringExtra("secondWinner");
//        double profit = intent.getDoubleExtra("profit", 0.0);
//        double moneyLeft = intent.getDoubleExtra("moneyLeft", 0.0);
//
//        // Set Data to Views
//        winnerText.setText(winner);
//        secondWinnerText.setText(secondWinner);
//        profitText.setText(String.valueOf(profit));
//        moneyLeftText.setText(String.valueOf(moneyLeft));
//
//        // Handle Back Button Click
//        btnBack.setOnClickListener(v -> finish());
        TextView winnerTextView = findViewById(R.id.winnerText);
        TextView secondWinnerTextView = findViewById(R.id.secondWinnerText);
        TextView profitTextView = findViewById(R.id.profitText);
        TextView moneyLeftTextView = findViewById(R.id.moneyLeftText);

        Intent intent = getIntent();
        String winner = intent.getStringExtra("winner");
        String secondWinner = intent.getStringExtra("secondWinner");
        double profit = intent.getDoubleExtra("profit", 0.0);
        double moneyLeft = intent.getDoubleExtra("moneyLeft", 0.0);

        winnerTextView.setText(winner);
        secondWinnerTextView.setText(secondWinner);
        profitTextView.setText(String.valueOf(profit));
        moneyLeftTextView.setText(String.valueOf(moneyLeft));

        findViewById(R.id.btnBack).setOnClickListener(v -> {
            Intent resultIntent = new Intent();
            resultIntent.putExtra("moneyLeft", moneyLeft);
            setResult(RESULT_OK, resultIntent);
            finish();
        });
    }
}

