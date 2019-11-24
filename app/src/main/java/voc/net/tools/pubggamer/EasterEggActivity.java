package voc.net.tools.pubggamer;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class EasterEggActivity extends AppCompatActivity {
    int play = 0;
    MediaPlayer mediaPlayer;
    ImageView b01;
    ImageView b02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_easter_egg );
        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        MyReceiver mReceiver = new MyReceiver (this);
        registerReceiver(mReceiver, filter);
        b01 = findViewById (R.id.b01);
        b02 = findViewById (R.id.b02);
        Toolbar toolbar = (Toolbar) findViewById(R.id.easter_toolbar);
    }
    public void b01 (View view){
        if (play == 0){
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.anson_call );
            mediaPlayer.start ();
            play = 1;
        }
        else{
        mediaPlayer.pause ();
        mediaPlayer.stop ();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.anson_call );
        mediaPlayer.start ();}
    }
    public void b02 (View view){
        if (play == 0){
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lee_hello );
            mediaPlayer.start ();
            play = 1;
        }
        else{
        mediaPlayer.pause ();
        mediaPlayer.stop ();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lee_hello );
        mediaPlayer.start ();
        }
    }

    public void b03 (View view){
        if (play == 0){
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lhm_ps );
            mediaPlayer.start ();
            play = 1;
        }
        else{
        mediaPlayer.pause ();
        mediaPlayer.stop ();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lhm_ps );
        mediaPlayer.start ();
        }

    }
    public void b04 (View view){
        if (play == 0){
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.anson_how_help );
            mediaPlayer.start ();
            play = 1;
        }
        else {
            mediaPlayer.pause ();
            mediaPlayer.stop ();
            mediaPlayer = MediaPlayer.create ( getApplicationContext (), R.raw.anson_how_help );
            mediaPlayer.start ();
        }
    }
    public void b05 (View view){
        if (play == 0){
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.anson_no_presents );
            mediaPlayer.start ();
            play = 1;
        }
        else {
            mediaPlayer.pause ();
            mediaPlayer.stop ();
            mediaPlayer = MediaPlayer.create ( getApplicationContext (), R.raw.anson_no_presents );
            mediaPlayer.start ();
        }
    }

    public void b06 (View view){
        if (play == 0){
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.anson_not_buy_promise );
            mediaPlayer.start ();
            play = 1;
        }
        else {
            mediaPlayer.pause ();
            mediaPlayer.stop ();
            mediaPlayer = MediaPlayer.create ( getApplicationContext (), R.raw.anson_not_buy_promise );
            mediaPlayer.start ();
        }
    }
    public void b07 (View view){
        if (play == 0){
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.anson_online_ar );
            mediaPlayer.start ();
            play = 1;
        }
        else {
            mediaPlayer.pause ();
            mediaPlayer.stop ();
            mediaPlayer = MediaPlayer.create ( getApplicationContext (), R.raw.anson_online_ar );
            mediaPlayer.start ();
        }
    }
    public void b08 (View view){
        if (play == 0){
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.anson_punish_lhm );
            mediaPlayer.start ();
            play = 1;
        }
        else {
            mediaPlayer.pause ();
            mediaPlayer.stop ();
            mediaPlayer = MediaPlayer.create ( getApplicationContext (), R.raw.anson_punish_lhm );
            mediaPlayer.start ();
        }
    }

    public void b09 (View view){
        if (play == 0){
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.anson_shoot );
            mediaPlayer.start ();
            play = 1;
        }
        else {
            mediaPlayer.pause ();
            mediaPlayer.stop ();
            mediaPlayer = MediaPlayer.create ( getApplicationContext (), R.raw.anson_shoot );
            mediaPlayer.start ();
        }

    }
    public void b10 (View view){
        if (play == 0){
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.anson_why );
            mediaPlayer.start ();
            play = 1;
        }
        else {
            mediaPlayer.pause ();
            mediaPlayer.stop ();
            mediaPlayer = MediaPlayer.create ( getApplicationContext (), R.raw.anson_why );
            mediaPlayer.start ();
        }
    }
    public void b11 (View view){
        if (play == 0){
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.anson_year );
            mediaPlayer.start ();
            play = 1;
        }
        else {
            mediaPlayer.pause ();
            mediaPlayer.stop ();
            mediaPlayer = MediaPlayer.create ( getApplicationContext (), R.raw.anson_year );
            mediaPlayer.start ();
        }
    }

    public void b12 (View view){
        if (play == 0){
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.anson_you_have_question );
            mediaPlayer.start ();
            play = 1;
        }
        else {
            mediaPlayer.pause ();
            mediaPlayer.stop ();
            mediaPlayer = MediaPlayer.create ( getApplicationContext (), R.raw.anson_you_have_question );
            mediaPlayer.start ();
        }

    }
    public void b13 (View view){
        if (play == 0){
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lcy_byebye );
            mediaPlayer.start ();
            play = 1;
        }
        else {
            mediaPlayer.pause ();
            mediaPlayer.stop ();
            mediaPlayer = MediaPlayer.create ( getApplicationContext (), R.raw.lcy_byebye );
            mediaPlayer.start ();
        }
    }
    public void b14 (View view){
        if (play == 0){
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lhy_help );
            mediaPlayer.start ();
            play = 1;
        }
        else {
            mediaPlayer.pause ();
            mediaPlayer.stop ();
            mediaPlayer = MediaPlayer.create ( getApplicationContext (), R.raw.lhy_help );
            mediaPlayer.start ();
        }
    }

    public void b15 (View view){
        if (play == 0){
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lhy_seafood_ghost);
            mediaPlayer.start ();
            play = 1;
        }
        else {
            mediaPlayer.pause ();
            mediaPlayer.stop ();
            mediaPlayer = MediaPlayer.create ( getApplicationContext (), R.raw.lhy_seafood_ghost );
            mediaPlayer.start ();
        }

    }


    public void tau(View view) {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("audio/*"); // specify "audio/mp3" to filter only mp3 files
        startActivityForResult(intent,1);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        /*check whether you're working on correct request using requestCode , In this case 1*/

        if(requestCode == 1 && resultCode == Activity.RESULT_OK){
            Uri audio = data.getData (); //declared above Uri audio;
            Log.d("media", "onActivityResult: "+audio);
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("audio/*");
            sharingIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse( String.valueOf ( audio )
            ));
            sharingIntent.setPackage("com.whatsapp");
            startActivity(sharingIntent);
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "'Easter'我要投稿!!");
            sendIntent.setType("text/plain");
            sendIntent.setPackage("com.whatsapp");
            startActivity (sendIntent);
        }

        super.onActivityResult(requestCode, resultCode, data);

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
