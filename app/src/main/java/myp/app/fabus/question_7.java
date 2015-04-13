package myp.app.fabus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static myp.app.fabus.R.id.editText7;


public class question_7 extends Activity {
    EditText v7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_7);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_question_7, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }





    public void kishsub(View view)
    {
        v7 = (EditText) findViewById(editText7);
        String s = v7.getText().toString();
        if (s.equals("Shastri")) { //razin answer

            Toast.makeText(this, "True That", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, kish_pari.class);
            startActivity(intent);


        } else {
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();

        }
    }
}
