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


public class question_2 extends Activity {
    EditText v2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_2);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_question_2, menu);
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


    public void shreyasub(View view)
    {
        v2 = (EditText) findViewById(R.id.editText2);
        String s = v2.getText().toString();
        if (s.equals("Shastri")) { //razin answer

            Toast.makeText(this, "True That", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, shreya_pari.class);
            startActivity(intent);


        } else {
            Toast.makeText(this, "Wrong", Toast.LENGTH_SHORT).show();

        }
    }
}
