package aledieu.tp1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
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
    }

    @Override
    protected void onStart() {
        super.onStart();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String login = prefs.getString("login", "user1");
        editTexteName.setText(login);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent intentPreference = new Intent(MainActivity.this, PreferencesActivity.class);
                startActivity(intentPreference);
                break;
            case R.id.action_pagnien:
                alerter("Antoine Pagnien");
                break;
        }
        return super.onOptionsItemSelected(item);
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
                sendNameToActivity(view);
                break;
        }
    }

    public void sendNameToActivity(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("name", editTexteName.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
