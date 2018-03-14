package aledieu.tp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_relative);

        Button button = findViewById(R.id.btnOK);
        EditText editText = findViewById(R.id.inputNom);

        button.setOnClickListener(this);
        editText.setOnClickListener(this);
    }


    //Fonction permettant de réaliser les actions après un click sur un bouton
    public void alerter(String message) {
        Log.i("DWM", message);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnOK:
                alerter("Clic sur bouton");
                break;
            case R.id.inputNom:
                alerter("Click sur input");
                break;
        }
    }
}
