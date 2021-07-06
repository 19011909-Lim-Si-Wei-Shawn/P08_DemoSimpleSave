package sg.edu.rp.c346.id19011909.demosimplesave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onResume() {
        super.onResume();

        //Retrieve SharedPreferences Instance,
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);

        //Obtaining Data from SharedPreference,
        String Msg = prefs.getString("Greetings", "No Greeting Name");

        //If Key does not Exist,
        Toast toast = Toast.makeText(MainActivity.this, Msg, Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        //Obtaining SharedPreferences Instance,
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);

        //Creating SharedPreference Editor,
        SharedPreferences.Editor prefEdit = prefs.edit();

        //Setting Key-Value Pair,
        prefEdit.putString("Greetings", "Hello!");

        //Saving Changes to SharedPreference,
        prefEdit.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}
