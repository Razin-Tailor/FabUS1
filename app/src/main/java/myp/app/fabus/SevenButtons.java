package myp.app.fabus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class SevenButtons extends Activity {
 public void komal(View view)
 {
     Intent intent = new Intent(this,question_1.class);
     startActivity(intent);
 }
    public void shreya(View view)
    {
        Intent intent = new Intent(this,question_2.class);
        startActivity(intent);
    }
    public void hetashvi(View view)
    {
        Intent intent = new Intent(this,question_3.class);
        startActivity(intent);
    }
    public void mayank(View view)
    {
        Intent intent = new Intent(this,question_4.class);
        startActivity(intent);
    }
    public void gaurang(View view)
    {
        Intent intent = new Intent(this,question_5.class);
        startActivity(intent);
    }
    public void devesh(View view)
    {
        Intent intent = new Intent(this,question_6.class);
        startActivity(intent);
    }
    public void kishan(View view)
    {
        Intent intent = new Intent(this,question_7.class);
        startActivity(intent);
    }
    public void razin(View view)
    {
        Intent intent = new Intent(this,question_raj.class);
        startActivity(intent);
    }

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_seven_buttons);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.seven_buttons, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
