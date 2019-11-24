package voc.net.tools.pubggamer;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class AlarmService extends Service {
    public static final String TAG = "MyService";

    AlarmManager alarmManager;

    private MyBinder mBinder = new MyBinder();

    String hour,mins;


    @Override
    public void onCreate() {
        super .onCreate();
        Log.d(TAG, "onCreate() executed");
//取得傳遞過來的資料
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        hour = intent.getStringExtra("hour");
        mins = intent.getStringExtra("mins");
        String CH = new SimpleDateFormat ("HH", Locale.getDefault()).format(new Date ());
        String MH = new SimpleDateFormat ("mm", Locale.getDefault()).format(new Date ());
        String SH = new SimpleDateFormat ("ss", Locale.getDefault()).format(new Date ());
        Log.d(TAG, "onStartCommand() executed "+hour+" "+mins+" "+CH+" "+MH);
        Calendar cal = Calendar.getInstance();
        // 設定於 3 分鐘後執行
        cal.add(Calendar.MINUTE, 1);
        PendingIntent pi = PendingIntent.getBroadcast(this, 1, intent, PendingIntent.FLAG_ONE_SHOT);
        alarmManager.set(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), pi);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() executed");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    class MyBinder extends Binder {
        public void startDownload() {
            Log.d("TAG", "startDownload() executed");
            // 執行任務
        }
    }

}