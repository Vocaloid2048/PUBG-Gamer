package voc.net.tools.pubggamer;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.FRIDAY;
import static java.util.Calendar.MONDAY;
import static java.util.Calendar.SATURDAY;
import static java.util.Calendar.SUNDAY;
import static java.util.Calendar.THURSDAY;
import static java.util.Calendar.TUESDAY;
import static java.util.Calendar.WEDNESDAY;

public class MainActivity extends AppCompatActivity  {
    private SoundPool sp;//声明一个SoundPool
    private int music;//定义一个整型用load（）；来设置suondID
    MediaPlayer mediaPlayer;
    TextView version;

    final static int SHARE_PS4 = 104;
    int lock = 0;


    ImageView gp_img;
    int S = 0;
    String info1 = "手機型號:" + android.os.Build.MODEL;
    String info2 = "SDK版本:" + android.os.Build.VERSION.SDK_INT;
    String info3 = "系統版本:" + android.os.Build.VERSION.RELEASE;
    String info4 = "設備基板名稱:" + android.os.Build.BOARD;
    String info5 = "設備品牌:" + android.os.Build.BRAND;
    String info6 = "設備驅動名稱:" + android.os.Build.DEVICE;
    String info7 = "設備顯示的版本包:" + android.os.Build.DISPLAY;
    String info8 = "設備標識:" + android.os.Build.FINGERPRINT;
    String info9 = "設備硬件名稱:" + android.os.Build.HARDWARE;
    String info10 = "設備主機地址:" + android.os.Build.HOST;
    String info11 = "設備製造商:" + android.os.Build.MANUFACTURER;
    String info12 = "API:" + Build.VERSION.SDK_INT;
    String info13 = "" + android.os.Build.VERSION.RELEASE;
    TextView l1, l2, l3, l4, l5, l6, l7, l8, l9;
    Date date = new Date();
    Calendar c = Calendar.getInstance();

    //ISSAC
    int ISSAC_MON_FRI_FT = 2000;
    int ISSAC_MON_FRI_LT = 2300;
    int ISSAC_SAT_FP_FT = 1300;
    int ISSAC_SAT_FP_LT = 1500;
    int ISSAC_SAT_LP_FT = 1900;
    int ISSAC_SAT_LP_LT = 2300;
    int ISSAC_SUN_FT = 1300;
    int ISSAC_SUN_LT = 2300;

    //VOC
    int VOC_MON_FRI_FT = 1800;
    int VOC_MON_FRI_LT = 2100;
    int VOC_SAT_FT = 1100;
    int VOC_SAT_LT = 2200;
    int VOC_SUN_FT = 1500;
    int VOC_SUN_LT = 2000;

    //聶楚豪
    int LCH_MON_FRI_FT = 2100;
    int LCH_MON_FRI_LT = 2230;
    int LCH_SAT_FT = 2100;
    int LCH_SAT_LT = 2230;
    int LCH_SUN_FT = 2100;
    int LCH_SUN_LT = 2200;

    //    //ISSAC
    //    static final LocalTime ISSAC_MON_FRI_FT = LocalTime.parse ( "20:00:00" );
    //    static final LocalTime ISSAC_MON_FRI_LT = LocalTime.parse ( "23:00:00" );
    //    static final LocalTime ISSAC_SAT_FP_FT = LocalTime.parse ( "13:00:00" );
    //    static final LocalTime ISSAC_SAT_FP_LT = LocalTime.parse ( "15:00:00" );
    //    static final LocalTime ISSAC_SAT_LP_FT = LocalTime.parse ( "19:00:00" );
    //    static final LocalTime ISSAC_SAT_LP_LT = LocalTime.parse ( "23:00:00" );
    //    static final LocalTime ISSAC_SUN_FT = LocalTime.parse ( "13:00:00" );
    //    static final LocalTime ISSAC_SUN_LT = LocalTime.parse ( "23:00:00" );
    //
    //    //Voc
    //    static final LocalTime VOC_MON_FRI_FT = LocalTime.parse ( "18:00:00" );
    //    static final LocalTime VOC_MON_FRI_LT = LocalTime.parse ( "21:00:00" );
    //    static final LocalTime VOC_SAT_FT = LocalTime.parse ( "11:00:00" );
    //    static final LocalTime VOC_SAT_LT = LocalTime.parse ( "22:00:00" );
    //    static final LocalTime VOC_SUN_FT = LocalTime.parse ( "15:00:00" );
    //    static final LocalTime VOC_SUN_LT = LocalTime.parse ( "20:00:00" );
    //
    //    //聶楚豪
    //    static final LocalTime LCH_MON_FRI_FT = LocalTime.parse ( "21:00:00" );
    //    static final LocalTime LCH_MON_FRI_LT = LocalTime.parse ( "22:30:00" );
    //    static final LocalTime LCH_SAT_FT = LocalTime.parse ( "21:00:00" );
    //    static final LocalTime LCH_SAT_LT = LocalTime.parse ( "22:30:00" );
    //    static final LocalTime LCH_SUN_FT = LocalTime.parse ( "21:00:00" );
    //    static final LocalTime LCH_SUN_LT = LocalTime.parse ( "22:00:00" );




    private String[] perms = {Manifest.permission.WRITE_EXTERNAL_STORAGE};
    private final int PERMS_REQUEST_CODE = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);
        MyReceiver mReceiver = new MyReceiver (this);
        registerReceiver(mReceiver, filter);
        Log.i ("P","P");
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        gp_img = findViewById ( R.id.gp_img2 );

        //Android 6.0以上版本需要临时获取权限
        if(Build.VERSION.SDK_INT>Build.VERSION_CODES.LOLLIPOP_MR1&&
                PackageManager.PERMISSION_GRANTED!=checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)){
            requestPermissions(perms,PERMS_REQUEST_CODE);
        }
        mediaPlayer = MediaPlayer.create ( getApplicationContext (), R.raw.dance );
        sp = new SoundPool ( 100, AudioManager.STREAM_MUSIC, 100 );//第一个参数为同时播放数据流的最大个数，第二数据流类型，第三为声音质量
        music = sp.load ( this, R.raw.anson_call, 1 ); //把你的声音素材放到res/raw里，第2个参数即为资源文件，第3个为音乐的优先级
        sp.play ( music, 1, 1, 0, 1, 10 );
       // LocalTime NT = LocalTime.now ();
       // String WD = LocalDate.now ().getDayOfWeek ().name ();
        int WD = Calendar.DAY_OF_WEEK;
        l1 = findViewById ( R.id.online_tv );
        l2 = findViewById ( R.id.online_tv );
        l3 = findViewById ( R.id.online_tv );
        l4 = findViewById ( R.id.online_tv );
        l5 = findViewById ( R.id.online_tv );
        l6 = findViewById ( R.id.online_tv );
        l7 = findViewById ( R.id.online_tv );
        l8 = findViewById ( R.id.online_tv );
        l9 = findViewById ( R.id.online_tv );
        c.setTime(date);
        int t = c.get(Calendar.HOUR_OF_DAY) * 100 + c.get(Calendar.MINUTE);

        //MON - FRI
        if (WD == MONDAY || WD == TUESDAY  || WD == WEDNESDAY || WD ==THURSDAY || WD == FRIDAY) {
            if (t>ISSAC_MON_FRI_FT && t<ISSAC_MON_FRI_LT) {
                ImageView now3 = findViewById ( R.id.now3 );
                now3.setImageResource ( R.drawable.ic_add_circle_black_24dp );
            }
            if (t>VOC_MON_FRI_FT && t<VOC_MON_FRI_LT) {
                ImageView now4 = findViewById ( R.id.now4 );
                now4.setImageResource ( R.drawable.ic_add_circle_black_24dp );
            }
            if (t>LCH_MON_FRI_FT && t<LCH_MON_FRI_LT) {
                ImageView now2 = findViewById ( R.id.now2 );
                now2.setImageResource ( R.drawable.ic_add_circle_black_24dp );
            }
        }
        if (WD == SATURDAY) {
            //---ISSAC---//
            if (t>ISSAC_SAT_FP_FT && t<ISSAC_SAT_FP_LT) {
                ImageView now3 = findViewById ( R.id.now3 );
                now3.setImageResource ( R.drawable.ic_add_circle_black_24dp );
            }
            if (t>ISSAC_SAT_LP_FT && t<ISSAC_SAT_LP_LT) {
                ImageView now3 = findViewById ( R.id.now3 );
                now3.setImageResource ( R.drawable.ic_add_circle_black_24dp );
            }
            if (t>VOC_SAT_FT && t<VOC_SAT_LT) {
                ImageView now4 = findViewById ( R.id.now4 );
                now4.setImageResource ( R.drawable.ic_add_circle_black_24dp );
            }
            if (t>LCH_SAT_FT && t<LCH_SAT_LT) {
                ImageView now2 = findViewById ( R.id.now2 );
                now2.setImageResource ( R.drawable.ic_add_circle_black_24dp );
            }
        }
        if (WD == SUNDAY) {
            if (t>ISSAC_SUN_FT && t<ISSAC_SUN_LT) {
                ImageView now3 = findViewById ( R.id.now3 );
                now3.setImageResource ( R.drawable.ic_add_circle_black_24dp );
            }
            if (t>VOC_SUN_FT && t<VOC_SUN_LT) {
                ImageView now4 = findViewById ( R.id.now4 );
                now4.setImageResource ( R.drawable.ic_add_circle_black_24dp );
            }
            if (t>LCH_SUN_FT && t<LCH_SUN_LT) {
                ImageView now2 = findViewById ( R.id.now2 );
                now2.setImageResource ( R.drawable.ic_add_circle_black_24dp );
            }
        }
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.share:
                        final Dialog dialog = new Dialog ( MainActivity.this, R.style.NormalDialogStyle_L );
                        View view = View.inflate ( MainActivity.this, R.layout.share_point, null );
                        Button whatsapp =  view.findViewById (R.id.whatsapp);
                        Button facebook =  view.findViewById (R.id.facebook);
                        Button instagram =  view.findViewById (R.id.instagram);
                        Button back =  view.findViewById (R.id.back);
                        dialog.setContentView ( view );
                        dialog.setCanceledOnTouchOutside ( true );
                        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( MainActivity.this ).getScreenHeight () * 0.23f) );
                        Window dialogWindow = dialog.getWindow ();
                        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
                        lp.width = (int) (ScreenSizeUtils.getInstance ( MainActivity.this ).getScreenWidth () * 0.9f);
                        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
                        lp.gravity = Gravity.BOTTOM;
                        dialogWindow.setAttributes ( lp );
                        dialog.show ();
                        back.setOnClickListener ( new View.OnClickListener () {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss ();
                            }
                        } );
                        whatsapp.setOnClickListener ( new View.OnClickListener () {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss ();
                                Intent sendIntent = new Intent ();
                                sendIntent.setAction ( Intent.ACTION_SEND );
                                sendIntent.putExtra ( Intent.EXTRA_TEXT, "邀隊友上線又不想打字?PUBG GAMER幫到你!只需30秒!"+"\n"+"Link : http://cmt.25u.com:9513/PUBG_GAMER.apk");
                                sendIntent.setType ( "text/plain" );
                                sendIntent.setPackage ( "com.whatsapp" );
                                startActivity ( sendIntent );
                                ClipboardManager clipboard = (ClipboardManager) getSystemService( Context.CLIPBOARD_SERVICE);
                                ClipData clipData = ClipData.newPlainText(null, "邀隊友上線又不想打字?PUBG GAMER幫到你!只需30秒!"+"\n"+"Link : http://cmt.25u.com:9513/PUBG_GAMER.apk");
                                clipboard.setPrimaryClip(clipData);
                            }
                        } );
                        facebook.setOnClickListener ( new View.OnClickListener () {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss ();
                                Intent sendIntent = new Intent ();
                                sendIntent.setAction ( Intent.ACTION_SEND );
                                sendIntent.putExtra ( Intent.EXTRA_TEXT, "邀隊友上線又不想打字?PUBG GAMER幫到你!只需30秒!"+"\n"+"Link : http://cmt.25u.com:9513/PUBG_GAMER.apk");
                                sendIntent.setType ( "text/plain" );
                                sendIntent.setPackage ( "com.facebook.lite" );
                                startActivity ( sendIntent );
                                ClipboardManager clipboard = (ClipboardManager) getSystemService( Context.CLIPBOARD_SERVICE);
                                ClipData clipData = ClipData.newPlainText(null, "邀隊友上線又不想打字?PUBG GAMER幫到你!只需30秒!"+"\n"+"Link : http://cmt.25u.com:9513/PUBG_GAMER.apk");
                                clipboard.setPrimaryClip(clipData);
                            }
                        } );
                        instagram.setOnClickListener ( new View.OnClickListener () {
                            @Override
                            public void onClick(View v) {
                                dialog.dismiss ();
                                Intent sendIntent = new Intent ();
                                sendIntent.setAction ( Intent.ACTION_SEND );
                                sendIntent.putExtra ( Intent.EXTRA_TEXT, "邀隊友上線又不想打字?PUBG GAMER幫到你!只需30秒!"+"\n"+"Link : http://cmt.25u.com:9513/PUBG_GAMER.apk");
                                sendIntent.setType ( "text/plain" );
                                sendIntent.setPackage ( "com.instagram.android" );
                                startActivity ( sendIntent );
                                ClipboardManager clipboard = (ClipboardManager) getSystemService( Context.CLIPBOARD_SERVICE);
                                ClipData clipData = ClipData.newPlainText(null, "邀隊友上線又不想打字?PUBG GAMER幫到你!只需30秒!"+"\n"+"Link : http://cmt.25u.com:9513/PUBG_GAMER.apk");
                                clipboard.setPrimaryClip(clipData);
                            }
                        } );
                        return true;

                    case R.id.programmer:
                        final Dialog dialog2 = new Dialog ( MainActivity.this, R.style.NormalDialogStyle_L );
                        View view2 = View.inflate ( MainActivity.this, R.layout.programmer, null );
                        dialog2.setContentView ( view2 );
                        dialog2.setCanceledOnTouchOutside ( true );
                        view2.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( MainActivity.this ).getScreenHeight ()*0.6f) );
                        Window dialogWindow2 = dialog2.getWindow ();
                        WindowManager.LayoutParams lp2 = dialogWindow2.getAttributes ();
                        lp2.width = (int) (ScreenSizeUtils.getInstance ( MainActivity.this ).getScreenWidth ());
                        lp2.height = WindowManager.LayoutParams.WRAP_CONTENT;
                        lp2.gravity = Gravity.CENTER;
                        dialogWindow2.setAttributes ( lp2 );
                        dialog2.show ();
                        return true;

                    case R.id.alarm:
                        Intent intent = new Intent (MainActivity.this,AlarmActivity.class);
                        startActivity ( intent );
                        return true;

                    case R.id.treaty:
                        Intent intent2 = new Intent (MainActivity.this,TreatyActivity.class);
                        startActivity ( intent2 );
                        return true;

                }

                return true;
            }

            });

    }

    @PassAway
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_POWER) {
            Log.i ("KEY","POWER_OFF");
            Log.i ("KEY", String.valueOf ( lock ));
            while (lock == 0){
                Intent intent = new Intent (this, LockActivity.class );
                startActivity (intent);
                lock = 1;
                Log.i ("LOCK", String.valueOf ( lock ) );
            }

            return true;
        }
        if ((event.getSource() & InputDevice.SOURCE_GAMEPAD) == InputDevice.SOURCE_GAMEPAD) {
            if (keyCode == KeyEvent.KEYCODE_BUTTON_R2){
                final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
                View view = View.inflate ( this, R.layout.share_point, null );
                Button whatsapp =  view.findViewById (R.id.whatsapp);
                Button facebook =  view.findViewById (R.id.facebook);
                Button instagram =  view.findViewById (R.id.instagram);
                Button back =  view.findViewById (R.id.back);
                dialog.setContentView ( view );
                dialog.setCanceledOnTouchOutside ( true );
                view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight () * 0.23f) );
                Window dialogWindow = dialog.getWindow ();
                WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
                lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth () * 0.9f);
                lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
                lp.gravity = Gravity.BOTTOM;
                dialogWindow.setAttributes ( lp );
                dialog.show ();
                back.setOnClickListener ( new View.OnClickListener () {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss ();
                    }
                } );
                whatsapp.setOnClickListener ( new View.OnClickListener () {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss ();
                        Intent sendIntent = new Intent ();
                        sendIntent.setAction ( Intent.ACTION_SEND );
                        sendIntent.putExtra ( Intent.EXTRA_TEXT, "邀隊友上線又不想打字?PUBG GAMER幫到你!只需30秒!"+"\n"+"Link : http://cmt.25u.com:9513/PUBG_GAMER.apk");
                        sendIntent.setType ( "text/plain" );
                        sendIntent.setPackage ( "com.whatsapp" );
                        startActivity ( sendIntent );
                        ClipboardManager clipboard = (ClipboardManager) getSystemService( Context.CLIPBOARD_SERVICE);
                        ClipData clipData = ClipData.newPlainText(null, "邀隊友上線又不想打字?PUBG GAMER幫到你!只需30秒!"+"\n"+"Link : http://cmt.25u.com:9513/PUBG_GAMER.apk");
                        clipboard.setPrimaryClip(clipData);
                    }
                } );
                facebook.setOnClickListener ( new View.OnClickListener () {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss ();
                        Intent sendIntent = new Intent ();
                        sendIntent.setAction ( Intent.ACTION_SEND );
                        sendIntent.putExtra ( Intent.EXTRA_TEXT, "邀隊友上線又不想打字?PUBG GAMER幫到你!只需30秒!"+"\n"+"Link : http://cmt.25u.com:9513/PUBG_GAMER.apk");
                        sendIntent.setType ( "text/plain" );
                        sendIntent.setPackage ( "com.facebook.lite" );
                        startActivity ( sendIntent );
                        ClipboardManager clipboard = (ClipboardManager) getSystemService( Context.CLIPBOARD_SERVICE);
                        ClipData clipData = ClipData.newPlainText(null, "邀隊友上線又不想打字?PUBG GAMER幫到你!只需30秒!"+"\n"+"Link : http://cmt.25u.com:9513/PUBG_GAMER.apk");
                        clipboard.setPrimaryClip(clipData);
                    }
                } );
                instagram.setOnClickListener ( new View.OnClickListener () {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss ();
                        Intent sendIntent = new Intent ();
                        sendIntent.setAction ( Intent.ACTION_SEND );
                        sendIntent.putExtra ( Intent.EXTRA_TEXT, "邀隊友上線又不想打字?PUBG GAMER幫到你!只需30秒!"+"\n"+"Link : http://cmt.25u.com:9513/PUBG_GAMER.apk");
                        sendIntent.setType ( "text/plain" );
                        sendIntent.setPackage ( "com.instagram.android" );
                        startActivity ( sendIntent );
                        ClipboardManager clipboard = (ClipboardManager) getSystemService( Context.CLIPBOARD_SERVICE);
                        ClipData clipData = ClipData.newPlainText(null, "邀隊友上線又不想打字?PUBG GAMER幫到你!只需30秒!"+"\n"+"Link : http://cmt.25u.com:9513/PUBG_GAMER.apk");
                        clipboard.setPrimaryClip(clipData);
                    }
                } );
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    public void a(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.a, null );
        TextView a = view.findViewById ( R.id.call_btn );
        TextView b = view.findViewById ( R.id.whatsapp_btn );
        TextView btn2 = findViewById ( R.id.button2 );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth ());
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.CENTER;
        dialogWindow.setAttributes ( lp );
        dialog.show ();
        a.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent intent = new Intent ( Intent.ACTION_DIAL );
                intent.setData ( Uri.parse ( "tel:+852 6033 4631" ) );
                startActivity ( intent );
            }
        } );
        b.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent sendIntent = new Intent ();
                sendIntent.setAction ( Intent.ACTION_SEND );
                sendIntent.putExtra ( Intent.EXTRA_TEXT, "@羅浩男快上線!" );
                sendIntent.setType ( "text/plain" );
                sendIntent.setPackage ( "com.whatsapp" );
                startActivity ( sendIntent );
            }
        } );
    }

    public void b(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.b, null );
        TextView a = view.findViewById ( R.id.call_btn );
        TextView b = view.findViewById ( R.id.whatsapp_btn );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth ());
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.START;
        dialogWindow.setAttributes ( lp );
        dialog.show ();
        a.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent intent = new Intent ( Intent.ACTION_DIAL );
                intent.setData ( Uri.parse ( "tel:+852 5307 9861" ) );
                startActivity ( intent );
            }
        } );
        b.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent sendIntent = new Intent ();
                sendIntent.setAction ( Intent.ACTION_SEND );
                sendIntent.putExtra ( Intent.EXTRA_TEXT, "@聶楚豪快上線!" );
                sendIntent.setType ( "text/plain" );
                sendIntent.setPackage ( "com.whatsapp" );
                startActivity ( sendIntent );
            }
        } );
    }

    public void c(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.c, null );
        TextView a = view.findViewById ( R.id.call_btn );
        TextView b = view.findViewById ( R.id.whatsapp_btn );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth ());
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.START;
        dialogWindow.setAttributes ( lp );
        dialog.show ();
        a.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent intent = new Intent ( Intent.ACTION_DIAL );
                intent.setData ( Uri.parse ( "tel:+852 9621 1990" ) );
                startActivity ( intent );
            }
        } );
        b.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent sendIntent = new Intent ();
                sendIntent.setAction ( Intent.ACTION_SEND );
                sendIntent.putExtra ( Intent.EXTRA_TEXT, "@許雍琪快上線!" );
                sendIntent.setType ( "text/plain" );
                sendIntent.setPackage ( "com.whatsapp" );
                startActivity ( sendIntent );
            }
        } );
    }

    public void d(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.d, null );
        TextView a = view.findViewById ( R.id.call_btn );
        TextView b = view.findViewById ( R.id.whatsapp_btn );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth ());
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.START;
        dialogWindow.setAttributes ( lp );
        dialog.show ();
        a.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent intent = new Intent ( Intent.ACTION_DIAL );
                intent.setData ( Uri.parse ( "tel:+852 9513 9789" ) );
                startActivity ( intent );
            }
        } );
        b.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent sendIntent = new Intent ();
                sendIntent.setAction ( Intent.ACTION_SEND );
                sendIntent.putExtra ( Intent.EXTRA_TEXT, "@Voc快上線!" );
                sendIntent.setType ( "text/plain" );
                sendIntent.setPackage ( "com.whatsapp" );
                startActivity ( sendIntent );
            }
        } );
    }

    public void e(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.e, null );
        TextView a = view.findViewById ( R.id.call_btn );
        TextView b = view.findViewById ( R.id.whatsapp_btn );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth ());
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.START;
        dialogWindow.setAttributes ( lp );
        dialog.show ();
        a.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent intent = new Intent ( Intent.ACTION_DIAL );
                intent.setData ( Uri.parse ( "tel:+852 5501 8765" ) );
                startActivity ( intent );
            }
        } );
        b.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent sendIntent = new Intent ();
                sendIntent.setAction ( Intent.ACTION_SEND );
                sendIntent.putExtra ( Intent.EXTRA_TEXT, "@李日朗快上線!" );
                sendIntent.setType ( "text/plain" );
                sendIntent.setPackage ( "com.whatsapp" );
                startActivity ( sendIntent );
            }
        } );
    }

    public void f(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.f, null );
        TextView a = view.findViewById ( R.id.call_btn );
        TextView b = view.findViewById ( R.id.whatsapp_btn );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth ());
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.START;
        dialogWindow.setAttributes ( lp );
        dialog.show ();
        a.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent intent = new Intent ( Intent.ACTION_DIAL );
                intent.setData ( Uri.parse ( "tel:+852 6609 4935" ) );
                startActivity ( intent );
            }
        } );
        b.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent sendIntent = new Intent ();
                sendIntent.setAction ( Intent.ACTION_SEND );
                sendIntent.putExtra ( Intent.EXTRA_TEXT, "@麥定行快上線!" );
                sendIntent.setType ( "text/plain" );
                sendIntent.setPackage ( "com.whatsapp" );
                startActivity ( sendIntent );
            }
        } );
    }

    public void g(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.g, null );
        TextView a = view.findViewById ( R.id.call_btn );
        TextView b = view.findViewById ( R.id.whatsapp_btn );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth ());
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.START;
        dialogWindow.setAttributes ( lp );
        dialog.show ();
        a.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent intent = new Intent ( Intent.ACTION_DIAL );
                intent.setData ( Uri.parse ( "tel:+852 5703 8183" ) );
                startActivity ( intent );
            }
        } );
        b.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent sendIntent = new Intent ();
                sendIntent.setAction ( Intent.ACTION_SEND );
                sendIntent.putExtra ( Intent.EXTRA_TEXT, "@黎浩賢快上線!" );
                sendIntent.setType ( "text/plain" );
                sendIntent.setPackage ( "com.whatsapp" );
                startActivity ( sendIntent );
            }
        } );
    }

    public void h(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.h, null );
        TextView a = view.findViewById ( R.id.call_btn );
        TextView b = view.findViewById ( R.id.whatsapp_btn );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth ());
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.START;
        dialogWindow.setAttributes ( lp );
        dialog.show ();
        a.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent intent = new Intent ( Intent.ACTION_DIAL );
                intent.setData ( Uri.parse ( "tel:+852 9014 3700" ) );
                startActivity ( intent );
            }
        } );
        b.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent sendIntent = new Intent ();
                sendIntent.setAction ( Intent.ACTION_SEND );
                sendIntent.putExtra ( Intent.EXTRA_TEXT, "@劉俊彥快上線!" );
                sendIntent.setType ( "text/plain" );
                sendIntent.setPackage ( "com.whatsapp" );
                startActivity ( sendIntent );
            }
        } );
    }

    public void i(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.i, null );
        TextView a = view.findViewById ( R.id.call_btn );
        TextView b = view.findViewById ( R.id.whatsapp_btn );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth ());
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.START;
        dialogWindow.setAttributes ( lp );
        dialog.show ();
        a.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent intent = new Intent ( Intent.ACTION_DIAL );
                intent.setData ( Uri.parse ( "tel:+852 5388 2286" ) );
                startActivity ( intent );
            }
        } );
        b.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                dialog.dismiss ();
                Intent sendIntent = new Intent ();
                sendIntent.setAction ( Intent.ACTION_SEND );
                sendIntent.putExtra ( Intent.EXTRA_TEXT, "@梁靄雯快上線!" );
                sendIntent.setType ( "text/plain" );
                sendIntent.setPackage ( "com.whatsapp" );
                startActivity ( sendIntent );
            }
        } );
    }

    public void info(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.info, null );
        TextView c = view.findViewById ( R.id.advice_btn );
        TextView d = view.findViewById ( R.id.advice_btn2 );
        TextView e = view.findViewById ( R.id.easter_egg_btn );
        version = findViewById (R.id.version);
        String versionName = BuildConfig.VERSION_NAME;
     //   TextView f = view.findViewById ( R.id.btn_check_update );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth ());
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.START;
        dialogWindow.setAttributes ( lp );
        dialog.show ();
        c.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
//                //給Voc的建議
                dialog.dismiss ();
                final View item = LayoutInflater.from ( MainActivity.this ).inflate ( R.layout.advice, null );
                new AlertDialog.Builder ( MainActivity.this ).setTitle ( "給程式猿的建議" ).setView ( item ).setPositiveButton ( "OK", new DialogInterface.OnClickListener () {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (S == 1) {
                            EditText editText = (EditText) item.findViewById ( R.id.edit_text );
                            String advice = editText.getText ().toString ();
                            Intent sendIntent = new Intent ();
                            sendIntent.setAction ( Intent.ACTION_SEND );
                            sendIntent.putExtra ( Intent.EXTRA_TEXT, "給程式猿的建議 :" + advice + "\n" + "\n" + info1 + "\n" + info2 + "\n" + info3 + "\n" + info4 + "\n" + info5 + "\n" + info6 + "\n" + info7 + "\n" + info8 + "\n" + info9 + "\n" + info10 + "\n" + info11 + "\n" + info12 );
                            sendIntent.setType ( "text/plain" );
                            sendIntent.setPackage ( "com.whatsapp" );
                            startActivity ( sendIntent );
                        }
                        if (S == 0) {
                            EditText editText = (EditText) item.findViewById ( R.id.edit_text );
                            String advice = editText.getText ().toString ();
                            Intent sendIntent = new Intent ();
                            sendIntent.setAction ( Intent.ACTION_SEND );
                            sendIntent.putExtra ( Intent.EXTRA_TEXT, "給程式猿的建議 :" + advice + "\n" + "\n" + info1 + "\n" + info3 );
                            sendIntent.setType ( "text/plain" );
                            sendIntent.setPackage ( "com.whatsapp" );
                            startActivity ( sendIntent );
                        }
                    }
                } ).show ();
            }
        } );
        d.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
//                //給Voc的建議
                int xx = 0;
                dialog.dismiss ();
                Toast.makeText ( MainActivity.this, "Let's sing", Toast.LENGTH_SHORT ).show ();
                mediaPlayer.start ();
                Intent intent = new Intent ( MainActivity.this, VersionTreeActivity.class );
                startActivity ( intent );


            }
        } );
        e.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
//                //給Voc的建議
                int xx = 0;
                dialog.dismiss ();
                Intent intent = new Intent ( MainActivity.this, EasterEggActivity.class );
                startActivity ( intent );


            }
        } );

    }

    public void add(View view) {
        Intent intent = new Intent ( MainActivity.this, InviteActivity.class );
        startActivity ( intent );
    }

    public void lala(View view) {
        if (S == 0) {
            S = S + 1;

            Toast.makeText ( this, "您已同意" , Toast.LENGTH_SHORT ).show ();
        }
    }


    public void time_01(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.a_time, null );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth () * 0.5);
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.CENTER;
        dialogWindow.setAttributes ( lp );
        dialog.show ();

    }

    public void time_02(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.b_time, null );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth () * 0.5);
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.CENTER;
        dialogWindow.setAttributes ( lp );
        dialog.show ();

    }

    public void time_03(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.c_time, null );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth () * 0.5);
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.CENTER;
        dialogWindow.setAttributes ( lp );
        dialog.show ();

    }

    public void time_04(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.d_time, null );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth () * 0.5);
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.CENTER;
        dialogWindow.setAttributes ( lp );
        dialog.show ();

    }

    public void time_05(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.e_time, null );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth () * 0.5);
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.CENTER;
        dialogWindow.setAttributes ( lp );
        dialog.show ();

    }

    public void time_06(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.f_time, null );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth () * 0.5);
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.CENTER;
        dialogWindow.setAttributes ( lp );
        dialog.show ();

    }

    public void time_07(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.g_time, null );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth () * 0.5);
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.CENTER;
        dialogWindow.setAttributes ( lp );
        dialog.show ();

    }

    public void time_08(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.h_time, null );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth () * 0.5);
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.CENTER;
        dialogWindow.setAttributes ( lp );
        dialog.show ();

    }

    public void time_09(View view) {
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.i_time, null );
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth () * 0.5);
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.CENTER;
        dialogWindow.setAttributes ( lp );
        dialog.show ();

    }


    public void Update(View v) {
        String versionName = BuildConfig.VERSION_NAME;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        // 设置提示框的标题
        builder.setTitle("版本提醒").
                setIcon(R.drawable.unnamed). // 设置提示框的图标
                setMessage("版本 : "+versionName).// 设置要显示的信息
                setPositiveButton("已知會,檢查更新", new DialogInterface.OnClickListener() {// 设置确定按钮
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("http://cmt.25u.com:9513"));
                startActivity(myWebLink);
            }
        });
        AlertDialog alertDialog = builder.create();
        // 显示对话框
        alertDialog.show();
    }
    public void swing(View view){
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.N_MR1) {
            Intent i = new Intent (this,SwingActivity.class);
            startActivity (i);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Toast.makeText ( this, "Android "+info13+" :對不起，暫不支援", Toast.LENGTH_SHORT ).show ();
        }

    }
}