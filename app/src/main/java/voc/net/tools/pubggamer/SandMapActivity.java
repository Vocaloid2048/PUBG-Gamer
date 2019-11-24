package voc.net.tools.pubggamer;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SandMapActivity extends AppCompatActivity {
    String name4;
    Button ip1,	ip2,	ip3,	ip4,	ip5,	ip6,	ip7,	ip8,	ip9,	ip10,	ip11,	ip12,	ip13,	ip14,	ip15,	ip16,	ip17,	ip18,	ip19,	ip20,	ip21,	ip22,	ip23,	ip24,	ip25 , ip26 , ip27 , ip28 , ip29;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_sand_map );
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
        ip25	= findViewById (R.id.ip25);
        ip26	= findViewById (R.id.ip26);
        ip27	= findViewById (R.id.ip27);
        ip28	= findViewById (R.id.ip28);
        ip29	= findViewById (R.id.ip29);

        ip1.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v) 	{ name4 ="火電廠";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
        ip2.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="軍事基地";Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip3.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="廢墟";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
        ip4.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="火車站";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
        ip5.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="拖車場";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
        ip6.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="農場";Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip7.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="水廠";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
        ip8.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="斷城";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
        ip9.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="提波鎮";Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip10.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="伊波城";Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip11.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="別墅區";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
        ip12.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="橙花鎮";Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip13.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="新山城";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
        ip14.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="電站";Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip15.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="聖馬丁";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
        ip16.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="皮卡多";Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip17.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="墓地";Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip18.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="大礦山";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
        ip19.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="幸福村";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
        ip20.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="磚廠";Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip21.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="獅城";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
        ip22.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="黑斑羚鎮";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
        ip23.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="老工業區";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
        ip24.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="濱海小鎮";Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip25.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="小礦山";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
        ip26.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="普羅港";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
        ip27.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="南部礦山";  Intent intent = new Intent(); intent.putExtra("name4",name4);setResult(RESULT_OK, intent); finish();}} );
        ip28.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="監獄";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
        ip29.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="無花果鎮";  Intent intent = new Intent(); intent.putExtra("name4_sand",name4);setResult(RESULT_OK, intent); finish();}} );
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
