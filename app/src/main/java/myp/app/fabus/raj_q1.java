package myp.app.fabus;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class raj_q1 extends Activity {

    Context ctx = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raj_q1);

        final RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton);
        final RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton2);
        final RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3);
        final RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton4);
        final Button sub = (Button) findViewById(R.id.button18);

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb2.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
            }
        });

        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb1.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);
            }
        });

        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb2.setChecked(false);
                rb1.setChecked(false);
                rb4.setChecked(false);
            }
        });

        rb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb2.setChecked(false);
                rb3.setChecked(false);
                rb1.setChecked(false);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rb1.isChecked()){
                   Database db = new Database(ctx);
                   Cursor cr = db.getInfo(db);
                   Integer count = 0;
                   Integer flag = 0;
                   TextView tv1 = (TextView) findViewById(R.id.textView14);
                   cr.moveToFirst();
                    do{
                        if(cr.getString(0).equals("Raj") && cr.getInt(1) == 1 ){
                            count = cr.getInt(2);
                            if(flag ==0)
                                flag = cr.getInt(3);
                        }
                    }while(cr.moveToNext());
                    if(flag == 0)
                        count++;
                   tv1.setText(count.toString());
                   if(count != 0 && flag == 0)
                        db.putInfo(db,"Raj",1,count+1,1);
                   else if (count ==0 && flag == 0)
                        db.putInfo(db,"Raj",1,1,1);
                   rb1.setTextColor(getResources().getColor(R.color.green));
                   rb2.setTextColor(getResources().getColor(R.color.red));
                   rb3.setTextColor(getResources().getColor(R.color.red));
                   rb4.setTextColor(getResources().getColor(R.color.red));
                }
                else{
                    Database db = new Database(ctx);
                    Cursor cr = db.getInfo(db);
                    Integer count = 0;
                    Integer flag = 0;
                    TextView  tv1 = (TextView) findViewById(R.id.textView14);
                    cr.moveToFirst();
                    if(cr.getCount() >= 1) {
                        do {
                            if (cr.getString(0).equals("Raj") && cr.getInt(1) == 1) {
                                count = cr.getInt(2);
                                if(flag == 0)
                                    flag = cr.getInt(3);
                            }
                        } while (cr.moveToNext());
                    }
                    if(flag == 0)
                        count++;
                    tv1.setText(count.toString());
                    if(count != 0 && flag == 0)
                        db.putInfo(db,"Raj",1,count,0);
                    else if (count ==0 && flag == 0)
                        db.putInfo(db,"Raj",1,1,0);
                    if(rb2.isChecked())
                        rb2.setTextColor(getResources().getColor(R.color.red));
                    else if(rb3.isChecked())
                        rb3.setTextColor(getResources().getColor(R.color.red));
                    else
                        rb4.setTextColor(getResources().getColor(R.color.red));
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_raj_q1, menu);
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
}
