package myp.app.fabus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static myp.app.fabus.R.id.listView;
import static myp.app.fabus.R.id.listView2;


public class shreya_pari extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shreya_pari);
        String[] shreyamem = new String[] { "Memory 1","Memory 2","Memory 3","Memory 4","Memory 5"};
        ArrayAdapter<String> shreyamemArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, shreyamem);
        ListView shreyapari = (ListView)findViewById(listView2);
        shreyapari.setAdapter(shreyamemArrayAdapter);
        shreyapari.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // String item = ((TextView)view).getText().toString();
                //Toast.makeText(getBaseContext(),item,Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(shreya_pari.this, Memory_r_1.class);
                //startActivity(intent);
                switch( position )
                {
                    case 0:  Intent newActivity = new Intent(shreya_pari.this, Memory_s_1.class);
                        startActivity(newActivity);
                        break;
                    case 1:  Intent newActivity1 = new Intent(shreya_pari.this, Memory_s_2.class);
                        startActivity(newActivity1);
                        break;
                    case 2:  Intent newActivity2 = new Intent(shreya_pari.this, Memory_s_3.class);
                        startActivity(newActivity2);
                        break;
                    case 3:  Intent newActivity3 = new Intent(shreya_pari.this, Memory_s_4.class);
                        startActivity(newActivity3);
                        break;
                    case 4:  Intent newActivity4 = new Intent(shreya_pari.this, Memory_s_5.class);
                        startActivity(newActivity4);
                        break;
                }
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_komal_shreya, menu);
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