package voc.net.tools.pubggamer;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class IslandMapActivity extends AppCompatActivity {
    String name4;
    Button ip1,	ip2,	ip3,	ip4,	ip5,	ip6,	ip7,	ip8,	ip9,	ip10,	ip11,	ip12,	ip13,	ip14,	ip15,	ip16,	ip17,	ip18,	ip19,	ip20,	ip21,	ip22,	ip23,	ip24,	ip25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_island_map );

        ip1 = findViewById (R.id.ip1);
        ip2	= findViewById (R.id.ip2);
        ip3	= findViewById (R.id.ip3);
        ip4	= findViewById (R.id.ip4);
        ip5	= findViewById (R.id.ip5);
        ip6	= findViewById (R.id.ip6);
        ip7	= findViewById (R.id.ip7);
        ip8	= findViewById (R.id.ip8);
        ip9	= findViewById (R.id.ip9);
        ip10	= findViewById (R.id.ip10);
        ip11	= findViewById (R.id.ip11);
        ip12	= findViewById (R.id.ip12);
        ip13	= findViewById (R.id.ip13);
        ip14	= findViewById (R.id.ip14);
        ip15	= findViewById (R.id.ip15);
        ip16	= findViewById (R.id.ip16);
        ip17	= findViewById (R.id.ip17);
        ip18	= findViewById (R.id.ip18);
        ip19	= findViewById (R.id.ip19);
        ip20	= findViewById (R.id.ip20);
        ip21	= findViewById (R.id.ip21);
        ip22	= findViewById (R.id.ip22);
        ip23	= findViewById (R.id.ip23);
        ip24	= findViewById (R.id.ip24);
        ip25	= findViewById (R.id.ip25);

        ip1.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v) 	{ name4 ="Z城";  Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish();}} );
        ip2.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="S城";Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip3.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="山頂廢墟";  Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish();}} );
        ip4.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="K城";  Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish();}} );
        ip5.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="靶場";  Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish();}} );
        ip6.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="G港";Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip7.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="R城";  Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish();}} );
        ip8.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="Y城";  Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish();}} );
        ip9.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="醫院";Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip10.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="廢墟";Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip11.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="學校";  Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish();}} );
        ip12.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="洋房";Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip13.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="L城";  Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish();}} );
        ip14.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="G鎮";Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip15.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="P城";  Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish();}} );
        ip16.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="防空洞";Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip17.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="監獄";Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip18.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="農場";  Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish();}} );
        ip19.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="M城";  Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish();}} );
        ip20.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="核電廠";Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip21.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="礦場";  Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish();}} );
        ip22.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="P港";  Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish();}} );
        ip23.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="軍事基地";  Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish();}} );
        ip24.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="N港";Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip25.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="漁村";  Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish();}} );
//       Intent intent = new Intent(IslandMapActivity.this,AddActivity.class);startActivity(intent);

    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_POWER) {
            Log.i ("KEY","POWER_OFF");
            Intent intent = new Intent (this, LockActivity.class );
            startActivity (intent);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}
