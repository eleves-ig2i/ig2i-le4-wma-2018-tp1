package aledieu.tp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("name");

        TextView textView = findViewById(R.id.MessageView);

        textView.setText(message);


    }
}
