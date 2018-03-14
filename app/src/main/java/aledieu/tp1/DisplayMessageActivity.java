package aledieu.tp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        textView = findViewById(R.id.MessageView);

        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("name");

        textView.setText(message);
    }


}
