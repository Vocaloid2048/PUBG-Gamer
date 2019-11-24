package voc.net.tools.pubggamer;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ForestMapActivity extends AppCompatActivity {
    String name4;
    Button ip1,	ip2,	ip3,	ip4,	ip5,	ip6,	ip7,	ip8,	ip9,	ip10,	ip11,	ip12,	ip13,	ip14,	ip15,	ip16,	ip17,	ip18,	ip19,	ip20,	ip21,	ip22,	ip23,	ip24,	ip25 , ip26 , ip27 , ip28 , ip29;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_forest_map );
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


        ip1.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v) 	{ name4 ="克豪鎮";  Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish();}} );
        ip2.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="椰樹林";Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip3.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="河靜";  Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish();}} );
        ip4.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="塔莫克";  Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish();}} );
        ip5.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="一號營地";  Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish();}} );
        ip6.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="天堂度假村";Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip7.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="二號營地";  Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish();}} );
        ip8.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="訓練基地";  Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish();}} );
        ip9.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="榕樹林";Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip10.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="祭壇";Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip11.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="派南";  Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish();}} );
        ip12.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="沼澤(採石場)";Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip13.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="拉卡維";  Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish();}} );
        ip14.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="塔姆幫";Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip15.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="洞穴";  Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish();}} );
        ip16.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="坎邦";Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip17.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="納坎";Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip18.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="莎米";  Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish();}} );
        ip19.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="班泰";  Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish();}} );
        ip20.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="碼頭";Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish(); }} );
        ip21.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ name4 ="三號營地";  Intent intent = new Intent(); intent.putExtra("name4_forest",name4);setResult(RESULT_OK, intent); finish();}} );


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
