package voc.net.tools.pubggamer;

import android.app.Service;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AlarmActivity extends AppCompatActivity {
   //private LockScreenView mLockScreenView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_alarm );
        Vibrator vibrator = (Vibrator) getSystemService ( Service.VIBRATOR_SERVICE);
        vibrator.vibrate (new long[]{1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000,1000},10);


     //   mLockScreenView = (LockScreenView) findViewById(R.id.lock_screen_pad);
     //   mLockScreenView.setTargetDrawablesAndTexts(
     //           R.drawable.ic_alarm_off_black_24dp, R.drawable.ic_alarm_white_24dp, "STOP", "Wait 5 mins");



        //initViews();
        //    }
        //
        //    private void initViews() {
        //        mLockScreenView = (LockScreenView) findViewById(R.id.lock_screen_pad);
        //        //    mLockScreenView.setTargetDrawablesAndTexts(0, R.drawable.ic_alarm_white_24dp, null, null);
        //        mLockScreenView.setOnTriggerListener(this);
    }

    //@Override
    //    protected void onResume() {
    //        super.onResume();
    //        // 设置该广告的左划收益和右划收益
    //     //   mLockScreenView.setTargetDrawablesAndTexts(
    //     //           R.drawable.ic_alarm_off_black_24dp, R.drawable.ic_alarm_white_24dp, "STOP", "Wait 5 mins");
    //
    //    }

    public void stop(View view) {
        finish ();
        Vibrator vibrator = (Vibrator) getSystemService ( Service.VIBRATOR_SERVICE);
        openApp(this, "com.tencent.ig");
        vibrator.cancel ();
    }


    public void sleep(View view) {
        Vibrator vibrator = (Vibrator) getSystemService ( Service.VIBRATOR_SERVICE);
        vibrator.cancel ();
        Intent sendIntent = new Intent ();
        sendIntent.setAction ( Intent.ACTION_SEND );
        sendIntent.putExtra ( Intent.EXTRA_TEXT, "我五分鐘後上線");
        sendIntent.setType ( "text/plain" );
        sendIntent.setPackage ( "com.whatsapp" );
        startActivity ( sendIntent );
    }
    public static boolean openApp(Context context, String packageName) {
        PackageManager manager = context.getPackageManager();
        try {
            Intent i = manager.getLaunchIntentForPackage(packageName);
            if (i == null) {
                Toast.makeText ( context, "請安裝PUBG Mobile", Toast.LENGTH_SHORT ).show ();
                return false;
                //throw new ActivityNotFoundException();
            }
            i.addCategory(Intent.CATEGORY_LAUNCHER);
            context.startActivity(i);
            return true;
        } catch (ActivityNotFoundException e) {
            return false;
        }
    }

    public void finish(View view) {
        Vibrator vibrator = (Vibrator) getSystemService ( Service.VIBRATOR_SERVICE);
        vibrator.cancel ();
        finish ();
    }
}
