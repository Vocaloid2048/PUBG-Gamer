package voc.net.tools.pubggamer;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SnowMapActivity extends AppCompatActivity {
    String name4;
    Button ip1,	ip2,	ip3,	ip4,	ip5,	ip6,	ip7,	ip8,	ip9,	ip10,	ip11,	ip12,	ip13,	ip14,	ip15,	ip16,	ip17,	ip18,	ip19,	ip20,	ip21,	ip22,	ip23,	ip24,	ip25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_snow_map );
        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        MyReceiver mReceiver = new MyReceiver (this);
        registerReceiver(mReceiver, filter);

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

        ip1.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v) 	{ name4 ="軍港";  Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish();}} );
        ip2.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="扎魯鎮";Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip3.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="亞力克港";  Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish();}} );
        ip4.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="煤礦";  Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish();}} );
        ip5.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="航天基地";  Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish();}} );
        ip6.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="雙池鎮";Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip7.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="冰湖鎮";  Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish();}} );
        ip8.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="鐘塔港";  Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish();}} );
        ip9.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="滑雪場";Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip10.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="雙橋鎮";Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip11.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="哈達農場";  Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish();}} );
        ip12.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="豪宅";Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip13.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="水泥廠";  Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish();}} );
        ip14.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="希恩港";Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip15.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="布格沃鎮";  Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish();}} );
        ip16.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="愛情小鎮";Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip17.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="城堡";Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip18.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="恐龍樂園";  Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish();}} );
        ip19.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="凜冬城";  Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish();}} );
        ip20.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="莊園";Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip21.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="溫泉";  Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish();}} );
        ip22.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="中央公園";  Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish();}} );
        ip23.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="釀酒廠";  Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish();}} );
        ip24.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="漁村";Intent intent = new Intent(); intent.putExtra("name4_snow",name4);setResult(RESULT_OK, intent); finish(); }} );
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
