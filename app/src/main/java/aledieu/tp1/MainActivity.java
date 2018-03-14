package aledieu.tp1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTexteName;
    private Button OKbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_relative);
        OKbutton = findViewById(R.id.btnOK);
        editTexteName = findViewById(R.id.inputNom);

        OKbutton.setOnClickListener(this);
        editTexteName.setOnClickListener(this);
    }


    //Fonction permettant de réaliser les actions après un click sur un bouton
    public void alerter(String message) {
        //Log.i("DWM", message);
        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG);
        toast.show();


    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnOK:
                alerter(editTexteName.getText() + " une chanson !");
                break;
            case R.id.inputNom:
                alerter("Click sur input");
                break;
        }
    }
}
