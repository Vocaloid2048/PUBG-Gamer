package voc.net.tools.pubggamer;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AddActivity extends AppCompatActivity {
    TextView p1, p2, p3, p4, p5, p6, p7, p8, p9;
    ImageView o1, o2, o3, o4, o5, o6, o7, o8, o9;
    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9;
    Button ip1,	ip2,	ip3,	ip4,	ip5,	ip6,	ip7,	ip8,	ip9,	ip10,	ip11,	ip12,	ip13,	ip14,	ip15,	ip16,	ip17,	ip18,	ip19,	ip20,	ip21,	ip22,	ip23,	ip24,	ip25;
    StringBuilder aa = new StringBuilder ();
    String name2;
    int cd = 0;
    String name3,name4;
    EditText editText ;
    private TimePickerDialog timePickerDialog;
    String Time;
    String Day_of_Game;
    private GestureDetector mGestureDetector;

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if(resultCode == RESULT_OK) {
                String key = data.getStringExtra("name4");
                name4 = key;
            }
        }
        if (requestCode == 2) {
            if(resultCode == RESULT_OK) {
                String key = data.getStringExtra("name4_sand");
                name4 = key;
            }
        }
        if (requestCode == 3) {
            if(resultCode == RESULT_OK) {
                String key = data.getStringExtra("name4_forest");
                name4 = key;
            }
        }
        if (requestCode == 4) {
            if(resultCode == RESULT_OK) {
                String key = data.getStringExtra("name4_snow");
                name4 = key;
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_add );
        editText = findViewById (R.id.pw_et);

        mGestureDetector = new GestureDetector (this,new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                if((e1.getRawX() - e2.getRawX()) >100){
                    return true;
                }
                return super.onFling(e1, e2, velocityX, velocityY);
            }
        });

        GregorianCalendar calendar = new GregorianCalendar();

        // 實作TimePickerDialog的onTimeSet方法，設定時間後將所設定的時間show在textTime上
        timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener () {
            //將時間轉為12小時製顯示出來
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                Time = (hourOfDay + ":" + minute);
            }
        }, calendar.get( Calendar.HOUR_OF_DAY), calendar.get(calendar.MINUTE),
                true);

    final ArrayList<Object> lunch = new ArrayList<> ();
        lunch.add ( "羅浩男" );
        lunch.add ( "聶楚豪" );
        lunch.add ( "許雍琪" );
        lunch.add ( "Voc" );
        lunch.add ( "李日朗" );
        lunch.add ( "麥定行" );
        lunch.add ( "黎浩賢" );
        //lunch.add ( "劉俊彥" );
        lunch.add ( "梁靄雯" );

        p1 = findViewById ( R.id.name1 );
        p2 = findViewById ( R.id.name2 );
        p3 = findViewById ( R.id.name3 );
        p4 = findViewById ( R.id.name4 );
        p5 = findViewById ( R.id.name5 );
        p6 = findViewById ( R.id.name6 );
        p7 = findViewById ( R.id.name7 );
        p8 = findViewById ( R.id.name8 );
        p9 = findViewById ( R.id.name9 );
        cb1 = findViewById ( R.id.cb1 );
        cb2 = findViewById ( R.id.cb2 );
        cb3 = findViewById ( R.id.cb3 );
        cb4 = findViewById ( R.id.cb4 );
        cb5 = findViewById ( R.id.cb5 );
        cb6 = findViewById ( R.id.cb6 );
        cb7 = findViewById ( R.id.cb7 );
        cb8 = findViewById ( R.id.cb8 );
        cb9 = findViewById ( R.id.cb9 );
        o1 = findViewById ( R.id.photo1 );
        o2 = findViewById ( R.id.photo2 );
        o3 = findViewById ( R.id.photo3 );
        o4 = findViewById ( R.id.photo4 );
        o5 = findViewById ( R.id.photo5 );
        o6 = findViewById ( R.id.photo6 );
        o7 = findViewById ( R.id.photo7 );
        o8 = findViewById ( R.id.photo8 );
        o9 = findViewById ( R.id.photo9 );

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
        new AlertDialog.Builder ( AddActivity.this ).setTitle ( "請問你是誰?" ).setItems ( lunch.toArray ( new String[lunch.size ()] ), new DialogInterface.OnClickListener () {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            String name = (String) lunch.get ( which );
            name2 = name;
            Toast.makeText ( getApplicationContext (), "你是" + name, Toast.LENGTH_SHORT ).show ();
            if (name.equals ( "羅浩男" )) {
                cb1.setChecked ( true );
            }
            if (name.equals ( "聶楚豪" )) {
                cb2.setChecked ( true );
            }
            if (name.equals ( "許雍琪" )) {
                cb3.setChecked ( true );
            }
            if (name.equals ( "Voc" )) {
                cb4.setChecked ( true );
            }
            if (name.equals ( "李日朗" )) {
                cb5.setChecked ( true );
            }
            if (name.equals ( "麥定行" )) {
                cb6.setChecked ( true );
            }
            if (name.equals ( "黎浩賢" )) {
                cb7.setChecked ( true );
            }
            if (name.equals ( "劉俊彥" )) {
                cb8.setChecked ( true );
            }
            if (name.equals ( "梁靄雯" )) {
                cb9.setChecked ( true );
            }
        }
    } ).show ();
}

    public void add(View view) {
        final String[] choose = {"羅浩男", "聶楚豪", "許雍琪", "Voc", "李日朗", "麥定行"//1, "黎浩賢"
                , "劉俊彥","梁靄雯"};
        final boolean[] selected = new boolean[choose.length];
        new AlertDialog.Builder ( this ).setTitle ( "組織小隊" ).setMultiChoiceItems ( choose, selected, new DialogInterface.OnMultiChoiceClickListener () {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                selected[i] = b;
                Toast.makeText ( AddActivity.this, "You choose " + choose[i], Toast.LENGTH_SHORT ).show ();
            }
        } ).setPositiveButton ( "Ok", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                StringBuilder sb = new StringBuilder ();
                StringBuilder sb2 = new StringBuilder ();
                for (int i = 0; i < selected.length; i++) {
                    if (selected[i]) {
                        sb.append ( choose[i] ).append ( "\n" );
                        //TextView textView = findViewById ( R.id.blank_btn1 );
                        //textView.setText ( sb );
                        sb2.append ( "@" ).append ( choose[i] );
                        aa = sb2;
                        Intent sendIntent = new Intent ();
                        sendIntent.setAction ( Intent.ACTION_SEND );
                        sendIntent.putExtra ( Intent.EXTRA_TEXT, sb2 + " 快上線" );
                        sendIntent.setType ( "text/plain" );
                        sendIntent.setPackage ( "com.whatsapp" );
                        startActivity ( sendIntent );
                    }
                }
            }
        } ).show ();
    }

    public void whatsapp(View view) {
        String message_base = "以下仁兄請於"+Day_of_Game+Time+"上線 :";
        if (cb1.isChecked ()) {
            if (name2.equals ( "羅浩男" )) {
                message_base = message_base;
            } else {
                message_base = message_base + "@羅浩男";
            }
        }
        if (cb2.isChecked ()) {
            if (name2.equals ( "聶楚豪" )) {
                message_base = message_base;
            } else {
                message_base = message_base + "@聶楚豪";
            }
        }
        if (cb3.isChecked ()) {
            if (name2.equals ( "許雍琪" )) {
                message_base = message_base;
            } else {
                message_base = message_base + "@許雍琪";
            }
        }
        if (cb4.isChecked ()) {
            if (name2.equals ( "Voc" )) {
                message_base = message_base;
            } else {
                message_base = message_base + "@Voc";
            }
        }
        if (cb5.isChecked ()) {
            if (name2.equals ( "李日朗" )) {
                message_base = message_base;
            } else {
                message_base = message_base + "@李日朗";
            }
        }
        if (cb6.isChecked ()) {
            if (name2.equals ( "麥定行" )) {
                message_base = message_base;
            } else {
                message_base = message_base + "@麥定行";
            }
        }
        if (cb7.isChecked ()) {
            if (name2.equals ( "黎浩賢" )) {
                message_base = message_base;
            } else {
                message_base = message_base + "@黎浩賢";
            }
        }
        if (cb8.isChecked ()) {
            if (name2.equals ( "劉俊彥" )) {
                message_base = message_base;
            } else {
                message_base = message_base + "@劉俊彥";
            }
        }
        if (cb9.isChecked ()) {
            if (name2.equals ( "梁靄雯" )) {
                message_base = message_base;
            } else {
                message_base = message_base + "@梁靄雯";
            }
        }
        Intent sendIntent = new Intent ();
        // Intent sendIntent2 = new Intent();
        //  Bundle bundle=new Bundle();
        //  bundle.putInt("image",R.drawable.pubg);
        sendIntent.setAction ( Intent.ACTION_SEND );
        if(name4 == null){sendIntent.putExtra ( Intent.EXTRA_TEXT, "@" + name2 + " : " + message_base+","+"一起玩"+name3);}
        if (name3 == null){sendIntent.putExtra ( Intent.EXTRA_TEXT, "@" + name2 + " : " + message_base);}
        if (name2 == null){Toast.makeText ( this, "請先輸入你是誰", Toast.LENGTH_SHORT ).show ();sendIntent.putExtra ( Intent.EXTRA_TEXT, "");}
        if (message_base.equals ( "" )){Toast.makeText ( this, "你找我笨?!",Toast.LENGTH_SHORT).show (); sendIntent.putExtra ( Intent.EXTRA_TEXT, "");}
        if (name2 == null&&name3 == null){Toast.makeText ( this, "你找我笨?!",Toast.LENGTH_SHORT).show (); sendIntent.putExtra ( Intent.EXTRA_TEXT, "");}
        else{
        sendIntent.putExtra ( Intent.EXTRA_TEXT, "@" + name2 + " : " + message_base+","+"一起玩"+name3+","+"跳"+name4 );}
        sendIntent.setType ( "text/plain" );
        sendIntent.setPackage ( "com.whatsapp" );
        startActivity ( sendIntent );
    }
    public void map (View view){
        final ArrayList<Object> man = new ArrayList<> ();
        man.add ( "孤島地圖" );//"聶楚豪","許雍琪","Voc","李日朗","麥定行","黎浩賢","劉俊彥"
        man.add ( "沙漠地圖" );
        man.add ( "雨林地圖" );
        man.add ( "雪地地圖" );
        man.add ( "殭屍地圖" );
        man.add ( "倉庫地圖" );

        final ArrayList<Object> island = new ArrayList<> ();
        island.add("Z城");
        island.add("S城");
        island.add("山頂廢墟");
        island.add("K城");
        island.add("靶場");
        island.add("G港");
        island.add("R城");
        island.add("Y城");
        island.add("醫院");
        island.add("廢墟");
        island.add("學校");
        island.add("洋房");
        island.add("L城");
        island.add("G鎮");
        island.add("P城");
        island.add("防空洞");
        island.add("監獄");
        island.add("農場");
        island.add("M城");
        island.add("核電廠");
        island.add("礦場");
        island.add("P港");
        island.add("漁村");
        island.add("軍事基地");
        island.add("N港");

        final ArrayList<Object> sand = new ArrayList<> ();
        sand.add("火電廠");
        sand.add("軍事基地");
        sand.add("廢墟");
        sand.add("火車站");
        sand.add("拖車場");
        sand.add("農場");
        sand.add("水廠");
        sand.add("斷城");
        sand.add("提波鎮");
        sand.add("伊波城");
        sand.add("別墅區");
        sand.add("橙花鎮");
        sand.add("新山城");
        sand.add("電站");
        sand.add("聖馬丁");
        sand.add("皮卡多");
        sand.add("墓地");
        sand.add("大礦山");
        sand.add("幸福村");
        sand.add("磚廠");
        sand.add("獅城");
        sand.add("黑斑羚鎮");
        sand.add("老工業區");
        sand.add("濱海小鎮");
        sand.add("小礦山");
        sand.add("普羅港");
        sand.add("南部礦山");
        sand.add("監獄");
        sand.add("無花果鎮");

        final ArrayList<Object> snow = new ArrayList<> ();
        snow.add("軍港");
        snow.add("扎魯鎮");
        snow.add("亞力克港");
        snow.add("煤礦");
        snow.add("航天基地");
        snow.add("雙池鎮");
        snow.add("冰湖鎮");
        snow.add("鐘塔港");
        snow.add("滑雪場");
        snow.add("雙橋鎮");
        snow.add("哈達農場");
        snow.add("豪宅");
        snow.add("水泥廠");
        snow.add("希恩港");
        snow.add("布格沃鎮");
        snow.add("愛情小鎮");
        snow.add("城堡");
        snow.add("恐龍樂園");
        snow.add("凜冬城");
        snow.add("莊園");
        snow.add("溫泉");
        snow.add("中央公園");
        snow.add("釀酒廠");
        snow.add("漁村");


        final ArrayList<Object> forest = new ArrayList<> ();
        forest.add("克豪鎮");
        forest.add("椰樹林");
        forest.add("河靜");
        forest.add("塔莫克");
        forest.add("一號營地");
        forest.add("天堂度假村");
        forest.add("二號營地");
        forest.add("訓練基地");
        forest.add("榕樹林");
        forest.add("祭壇");
        forest.add("派南");
        forest.add("沼澤(採石場)");
        forest.add("拉卡維");
        forest.add("塔姆幫");
        forest.add("洞穴");
        forest.add("坎邦");
        forest.add("納坎");
        forest.add("莎米");
        forest.add("班泰");
        forest.add("碼頭");
        forest.add("三號營地");

        new AlertDialog.Builder ( AddActivity.this ).setTitle ( "請問遊玩甚麼地圖?" ).setItems ( man.toArray ( new String[man.size ()] ), new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String map = (String) man.get ( which );
                name3 = map;
                Toast.makeText ( getApplicationContext (), "遊玩" + map, Toast.LENGTH_SHORT ).show ();
               if (map.equals ( "孤島地圖" )){
                                 dialog.dismiss ();

                   Intent intent = new Intent (AddActivity.this,IslandMapActivity.class);
                   startActivityForResult(intent, 1);
                }

                if (map.equals ( "沙漠地圖" )){
                    dialog.dismiss ();
                    Intent intent = new Intent (AddActivity.this,SandMapActivity.class);
                    startActivityForResult(intent, 2);
                }
                if (map.equals ( "雨林地圖" )){
                    dialog.dismiss ();
                    Intent intent = new Intent (AddActivity.this,ForestMapActivity.class);
                    startActivityForResult(intent, 3);
                }
                if (map.equals ( "雪地地圖" )){
                    dialog.dismiss ();
                    Intent intent = new Intent (AddActivity.this,SnowMapActivity.class);
                    startActivityForResult(intent, 4);
                }

            }
        } ).show ();
    }

    public void time (View view){
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        view = View.inflate ( this, R.layout.day_play, null );
        TextView today = view.findViewById (R.id.today);
        TextView tomorrow = view.findViewById (R.id.today2);
        TextView ok = view.findViewById (R.id.ok_tt);
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight () ));
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth () );
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.CENTER;
        dialogWindow.setAttributes ( lp );
        dialog.show ();
        Day_of_Game = "";

        today.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Day_of_Game = "今天";
                //timePickerDialog.show();
            }
        } );
        tomorrow.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Day_of_Game = "明天";
                //timePickerDialog.show();
            }
        } );
        ok.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if (Day_of_Game.equals ( "今天" )){
                    Toast.makeText ( AddActivity.this, "今天的GAME今天玩! ", Toast.LENGTH_SHORT ).show ();dialog.dismiss ();timePickerDialog.show();}
                if (Day_of_Game.equals ( "明天" )){
                    Toast.makeText ( AddActivity.this, "今天沒空,明天玩! ", Toast.LENGTH_SHORT ).show ();dialog.dismiss ();timePickerDialog.show();}
                if (Day_of_Game.equals ( "" )){
                    Toast.makeText ( AddActivity.this, "你想怎樣?!重選! ", Toast.LENGTH_SHORT ).show ();}
                //timePickerDialog.show();

            }
        } );

    }
    public void maps (View view){
        finish();
    }
    public void li(){
        final Dialog dialog = new Dialog ( this, R.style.NormalDialogStyle_L );
        final View view = View.inflate ( this, R.layout.activity_island_map, null );
        TextView ip1 	= findViewById (R.id.ip1);
        TextView ip2	= findViewById (R.id.ip2);
        TextView ip3	= findViewById (R.id.ip3);
        TextView ip4	= findViewById (R.id.ip4);
        TextView ip5	= findViewById (R.id.ip5);
        TextView ip6	= findViewById (R.id.ip6);
        TextView ip7	= findViewById (R.id.ip7);
        TextView ip8	= findViewById (R.id.ip8);
        TextView ip9	= findViewById (R.id.ip9);
        TextView ip10	= findViewById (R.id.ip10);
        TextView ip11	= findViewById (R.id.ip11);
        TextView ip12	= findViewById (R.id.ip12);
        TextView ip13	= findViewById (R.id.ip13);
        TextView ip14	= findViewById (R.id.ip14);
        TextView ip15	= findViewById (R.id.ip15);
        TextView ip16	= findViewById (R.id.ip16);
        TextView ip17	= findViewById (R.id.ip17);
        TextView ip18	= findViewById (R.id.ip18);
        TextView ip19	= findViewById (R.id.ip19);
        TextView ip20	= findViewById (R.id.ip20);
        TextView ip21	= findViewById (R.id.ip21);
        TextView ip22	= findViewById (R.id.ip22);
        TextView ip23	= findViewById (R.id.ip23);
        TextView ip24	= findViewById (R.id.ip24);
        TextView ip25	= findViewById (R.id.ip25);
        dialog.setContentView ( view );
        dialog.setCanceledOnTouchOutside ( true );
        view.setMinimumHeight ( (int) (ScreenSizeUtils.getInstance ( this ).getScreenHeight ()) );
        Window dialogWindow = dialog.getWindow ();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes ();
        lp.width = (int) (ScreenSizeUtils.getInstance ( this ).getScreenWidth () );
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.START;
        dialogWindow.setAttributes ( lp );
        dialog.show ();

        ip1.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v) 	{ dialog.dismiss ();name4 ="Z城"; }} );
        ip2.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="S城"; }} );
        ip3.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="山頂廢墟"; }} );
        ip4.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="K城"; }} );
        ip5.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="靶場"; }} );
        ip6.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="G港"; }} );
        ip7.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="R城"; }} );
        ip8.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="Y城"; }} );
        ip9.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="醫院"; }} );
        ip10.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="廢墟"; }} );
        ip11.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="學校"; }} );
        ip12.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="洋房"; }} );
        ip13.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="L城"; }} );
        ip14.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="G鎮"; }} );
        ip15.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="P城"; }} );
        ip16.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="防空洞"; }} );
        ip17.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="監獄"; }} );
        ip18.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="農場"; }} );
        ip19.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="M城"; }} );
        ip20.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="核電廠"; }} );
        ip21.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="礦場"; }} );
        ip22.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="P港"; }} );
        ip23.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="軍事基地"; }} );
        ip24.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="N港"; }} );
        ip25.setOnClickListener ( new View.OnClickListener () {@Override public void onClick(View v)	{ dialog.dismiss ();name4 ="漁村"; }} );

    }
}




