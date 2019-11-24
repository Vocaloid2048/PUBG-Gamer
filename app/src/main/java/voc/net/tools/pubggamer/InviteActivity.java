package voc.net.tools.pubggamer;


import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Vibrator;
import android.provider.AlarmClock;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class InviteActivity extends FragmentActivity
{
    private ViewPager viewPager; //宣告 ViewPager 元件
    private ArrayList<View> viewPager_List;
    private MyViewPagerAdapter mAdapter;
    TextView next;
    TextView reset;
    String list;
    String send = "";
    String whatsapp_send = "";
    int view_int;
    String who;
    String who_fin;
    String join = "";
    String join_fin;
    String map;
    String day = "今天";
    String map_fin;
    String jump;
    String jump_fin;
    String time;
    String time_fin;
    String join_before;
    String j1 ="";
    String j2 ="";
    String j3 ="";
    String j4 ="";
    String j5 ="";
    String j6 ="";
    String j7 ="";
    String j8 ="";
    String j9 ="";
    String h,m;

    private AlarmManager alarmManager;
    private PendingIntent pendingIntent;

    int cd1,cd2,cd3,cd4,cd5,cd6,cd7,cd8,cd9 = 0;
    int position_fin = 0;
    boolean c1,c2,c3,c4,c5,c6,c7,c8,c9 = false;
    boolean end =false;
    EditText hour;
    EditText min;
    TextView p_list;
    TextView p_send;

    int YN = 0;

    private RadioGroup radioGroup;
    private RadioButton
            radioButton0,
            radioButton1,
            radioButton2,
            radioButton3,
            radioButton4;

    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9;
    private Object MainActivity;

    private Button btn=null;
   // private AlarmManager alarmManager=null;
    Calendar cal=Calendar.getInstance();
Vibrator vibrator;


    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if(resultCode == RESULT_OK) {
                String key = data.getStringExtra("name4");
                jump = key;
            }
        }
        if (requestCode == 2) {
            if(resultCode == RESULT_OK) {
                String key = data.getStringExtra("name4_sand");
                jump = key;
            }
        }
        if (requestCode == 3) {
            if(resultCode == RESULT_OK) {
                String key = data.getStringExtra("name4_forest");
                jump = key;
            }
        }
        if (requestCode == 4) {
            if (resultCode == RESULT_OK) {
                String key = data.getStringExtra ( "name4_snow" );
                jump = key;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite);
        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_ON);
        filter.addAction(Intent.ACTION_SCREEN_OFF);

        alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        MyReceiver mReceiver = new MyReceiver (this);
        registerReceiver(mReceiver, filter);
        next = findViewById (R.id.next);
        next.setText ("NEXT");
        next.setVisibility (View.GONE);
        reset = findViewById (R.id.reset);
        reset.setText ("RESET");
        reset.setVisibility (View.GONE);
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        hour = findViewById (R.id.hour_txt);
        min = findViewById (R.id.min_txt);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioButton0 = (RadioButton) findViewById(R.id.radioButton0);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton) findViewById(R.id.radioButton4);

        cb1 = (CheckBox) findViewById ( R.id.cb1 );
        cb2 = (CheckBox) findViewById ( R.id.cb2 );
        cb3 = (CheckBox) findViewById ( R.id.cb3 );
        cb4 = (CheckBox) findViewById ( R.id.cb4 );
        cb5 = (CheckBox) findViewById ( R.id.cb5 );
        cb6 = (CheckBox) findViewById ( R.id.cb6 );
        cb7 = (CheckBox) findViewById ( R.id.cb7 );
        cb8 = (CheckBox) findViewById ( R.id.cb8 );
        cb9 = (CheckBox) findViewById ( R.id.cb9 );

        alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        final LayoutInflater mInflater = getLayoutInflater().from(this);

        View viewPager0 = mInflater.inflate(R.layout.ia01, null);
        View viewPager1 = mInflater.inflate(R.layout.ia02, null);
        View viewPager2 = mInflater.inflate(R.layout.ia03, null);
        View viewPager3 = mInflater.inflate(R.layout.ia04, null);
        View viewPager4 = mInflater.inflate(R.layout.ia05, null);

        viewPager_List = new ArrayList<View>();
        viewPager_List.add(viewPager0);
        viewPager_List.add(viewPager1);
        viewPager_List.add(viewPager2);
        viewPager_List.add(viewPager3);
        viewPager_List.add(viewPager4);

        viewPager.setAdapter(new MyViewPagerAdapter(viewPager_List));
        viewPager.setCurrentItem(0);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() //ViewPager 頁面滑動監聽器
        {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels)
            {}

            @Override
            public void onPageSelected(int position) //當頁面滑動到其中一頁時，觸發該頁對應的 RadioButton 按鈕
            {
                switch (position)
                {
                    case 0:
                        radioGroup.check(R.id.radioButton0);
                        position_fin = 0;
                        next.setText ("NEXT");
                        next.setVisibility (View.GONE);
                        reset.setText ("RESET");
                        reset.setVisibility (View.GONE);
                        break;

                    case 1:
                        radioGroup.check(R.id.radioButton1);
                        next.setText ("OK");
                        next.setVisibility (View.GONE);
                        reset.setText ("RESET");
                        reset.setVisibility (View.GONE);
                        position_fin = 1;
                        break;

                    case 2:
                        radioGroup.check(R.id.radioButton2);
                        next.setText ("NEXT");
                        next.setVisibility (View.GONE);
                        reset.setText ("RESET");
                        reset.setVisibility (View.GONE);
                        position_fin = 2;
                        break;

                    case 3:
                        radioGroup.check(R.id.radioButton3);
                        next.setText ("CHECK");
                        next.setVisibility (View.GONE);
                        reset.setText ("RESET");
                        reset.setVisibility (View.GONE);
                        position_fin = 3;
                        break;
                    case 4:
                        p_list = findViewById (R.id.preview_list);
                        p_send = findViewById (R.id.preview_send);
                        join = j1+j2+j3+j4+j5+j6+j7+j8+j9;
                        list = "LIST :"+"\n"+"Your Name :"+who+"\n"+"Invite :"+join+"\n"+"When :"+time+"\n"+"Map :"+map+"\n"+"Jump :"+jump;
                        if (jump == null){send = "將會send : "+"\n"+who+": 請 "+join+"於"+time+"上線 , 組隊游玩"+map;}
                        else if (jump == null && map == null){send = who+": 請 "+join+"於"+time+"上線";}
                        else if (who == null){send = "ERROR";}
                        else if (join.equals ( "" )){send = "ERROR";}
                        else if (time == null){send = "ERROR";}else{send = "將會send : "+"\n"+who+": 請 "+join+"於"+time+"上線 , 組隊游玩"+map+",跳 "+jump;}
                        //   if (jump.equals ( "" )&&who.equals ( "" )&&join.equals ( "" )&&map.equals ( "" )&&time.equals ( "今天" )){send ="...";}else{send = "將會send : "+"\n"+who+": 請 "+join+"於"+time+"上線 , 組隊游玩"+map+",跳 "+jump;}
                        // if (jump == null&&who == null&&join == ""&&map == null&&time == "今天"){send ="...";}else{send = "將會send : "+"\n"+who+": 請 "+join+"於"+time+"上線 , 組隊游玩"+map+",跳 "+jump;}
                        p_list.setText (list);
                        p_send.setText (send);
                        radioGroup.check(R.id.radioButton4);
                        position_fin = 4;
                        next.setText ("SEND");
                        next.setVisibility (View.VISIBLE);
                        reset.setText ("RESET");
                        reset.setVisibility (View.VISIBLE);
                        end = true;
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state)
            {}
        });
    }

    public void alarm(View view) {
        Toast.makeText ( this, "設定提醒時間", Toast.LENGTH_SHORT ).show ();
        String info2;
        if (jump == null){ info2 = time+"上線 , 組隊游玩"+map;}
        else {info2 = time+"上線 , 組隊游玩"+map+",跳 "+jump;}
        Intent intent = new Intent();
        intent.putExtra (AlarmClock.EXTRA_MESSAGE,info2);
        intent.putExtra(AlarmClock.EXTRA_HOUR, h);
        intent.putExtra(AlarmClock.EXTRA_MINUTES, m);
        intent.putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        intent.setPackage ("com.android.deskclock");
        startActivity(intent);
    }

    public class MyViewPagerAdapter extends PagerAdapter
    {
        private List<View> mListViews;

        public MyViewPagerAdapter(List<View> mListViews)
        {
            this.mListViews = mListViews;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object)
        {
            container.removeView((View) object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position)
        {
            View view = mListViews.get(position);
            container.addView(view);
            return view;
        }

        @Override
        public int getCount()
        {
            return  mListViews.size();
        }

        @Override
        public boolean isViewFromObject(View arg0, Object arg1)
        {
            return arg0 == arg1;
        }
    }
    public void onClick (View v){

        switch (v.getId()) {
            case R.id.name1:
                who = "羅浩男";
                Toast.makeText ( this, "你是" + who, Toast.LENGTH_SHORT ).show ();
            //   cb1.setVisibility (View.GONE);
                break;
            case R.id.name2:
                who = "聶楚豪";
                Toast.makeText ( this, "你是" + who, Toast.LENGTH_SHORT ).show ();
     //           cb2.setVisibility (View.GONE);
                break;
            case R.id.name3:
                who = "許雍琪";
                Toast.makeText ( this, "你是" + who, Toast.LENGTH_SHORT ).show ();
        //        cb3.setVisibility (View.GONE);
                break;
            case R.id.name4:
                who = "Voc";
                Toast.makeText ( this, "你是" + who, Toast.LENGTH_SHORT ).show ();
//                cb4.setVisibility (View.GONE);
                break;
            case R.id.name5:
                who = "李日朗";
                Toast.makeText ( this, "你是" + who, Toast.LENGTH_SHORT ).show ();
    //            cb5.setVisibility (View.GONE);
                break;
            case R.id.name6:
                who = "麥定行";
                Toast.makeText ( this, "你是" + who, Toast.LENGTH_SHORT ).show ();
    //            cb6.setVisibility (View.GONE);
                break;
            case R.id.name7:
                who = "黎浩賢";
                Toast.makeText ( this, "你是" + who, Toast.LENGTH_SHORT ).show ();
   //             cb7.setVisibility (View.GONE);
                break;
            case R.id.name8:
                who = "劉俊彥";
                Toast.makeText ( this, "你是" + who, Toast.LENGTH_SHORT ).show ();
   //             cb8.setVisibility (View.GONE);
                break;
            case R.id.name9:
                who = "梁靄雯";
                Toast.makeText ( this, "你是" + who, Toast.LENGTH_SHORT ).show ();
   //             cb9.setVisibility (View.GONE);
                break;
        }
    }
    public void cb (View v){
        boolean checked = ((CheckBox) v).isChecked();
        switch (v.getId()) {
            case R.id.cb1:
                if (checked){
                    if (who.equals ( "羅浩男" )){
                        j1 = "";
                    }else {
                        j1 = " @羅浩男";}
                }
            else
                j1 = "";
                break;
            case R.id.cb2:
                if (checked){
                    if (who.equals ( "聶楚豪" )){
                        j2 = "";
                    }else {
                        j2 = " @聶楚豪";}
                }
                else
                    j2 = "";
                break;
            case R.id.cb3:
                if (checked){
                    if (who.equals ( "許雍琪" )){
                        j3 = "";
                    }else {
                        j3 = " @許雍琪";}
                }
                else
                    j3 = "";
                break;
            case R.id.cb4:
                if (checked){
                    if (who.equals ( "Voc" )){
                        j4 = "";
                    }else {
                        j4 = " @Voc";}
                }
                else
                    j4 = "";
                break;
            case R.id.cb5:
                if (checked){
                    if (who.equals ( "李日朗" )){
                        j5 = "";
                    }else {
                        j5 = " @李日朗";}
                }
                else
                    j5 = "";
                break;
            case R.id.cb6:
                if (checked){
                    if (who.equals ( "麥定行" )){
                        j6 = "";
                    }else {
                        j6 = " @麥定行";}
                }
                else
                    j6 = "";
                break;
            case R.id.cb7:
                if (checked){
                    if (who.equals ( "黎浩賢" )){
                        j7 = "";
                    }else {
                        j7 = " @黎浩賢";}
                }
                else
                    j7 = "";
                break;
            case R.id.cb8:
                if (checked){
                    if (who.equals ( "劉俊彥" )){
                        j8 = "";
                    }else {
                        j8 =  " @劉俊彥";}
                }
                else
                    j8 = "";
                break;
            case R.id.cb9:
                if (checked){
                    if (who.equals ( "梁靄雯" )){
                        j9 = "";
                    }else {
                        j9 = " @梁靄雯";}
                }
                else
                    j9 = "";
                break;

        }
    }


    public void next (View view){
        if (next.getText () == "CHECK"){
            p_list = findViewById (R.id.preview_list);
            p_send = findViewById (R.id.preview_send);
            join = j1+j2+j3+j4+j5+j6+j7+j8+j9;
            list = "LIST :"+"\n"+"Your Name :"+who+"\n"+"Invite :"+join+"\n"+"When :"+time+"\n"+"Map :"+map+"\n"+"Jump :"+jump;
            if (jump == null){send = "將會send : "+"\n"+who+": 請 "+join+"於"+time+"上線 , 組隊游玩"+map;}
            else if (jump == null && map == null){send = who+": 請 "+join+"於"+time+"上線";}
            else if (who == null){send = "ERROR";}
            else if (join.equals ( "" )){send = "ERROR";}
            else if (time == null){send = "ERROR";}else{send = "將會send : "+"\n"+who+": 請 "+join+"於"+time+"上線 , 組隊游玩"+map+",跳 "+jump;}
            //   if (jump.equals ( "" )&&who.equals ( "" )&&join.equals ( "" )&&map.equals ( "" )&&time.equals ( "今天" )){send ="...";}else{send = "將會send : "+"\n"+who+": 請 "+join+"於"+time+"上線 , 組隊游玩"+map+",跳 "+jump;}
            // if (jump == null&&who == null&&join == ""&&map == null&&time == "今天"){send ="...";}else{send = "將會send : "+"\n"+who+": 請 "+join+"於"+time+"上線 , 組隊游玩"+map+",跳 "+jump;}
            p_list.setText (list);
            p_send.setText (send);
        }

        if (next.getText () == "SEND"){

        who_fin = who;
        join_fin = join;
        map_fin = map;
        jump_fin = jump;
        time_fin = time;

        Log.i ("Voc",who_fin+": 請 "+join_fin+" 於"+time_fin+"上線 , 組隊游玩"+map_fin+",跳 "+jump_fin);
            if (jump == null){whatsapp_send = who+": 請 "+join+"於"+time+"上線 , 組隊游玩"+map;}
            else if (jump == null && map == null){whatsapp_send = who+": 請 "+join+"於"+time+"上線";}
            else if (who == null){whatsapp_send = "ERROR";}
            else if (join.equals ( "" )){whatsapp_send = "ERROR";}
            else if (time == null){whatsapp_send = "E" +
                    "RROR";}else{whatsapp_send = who+": 請 "+join+"於"+time+"上線 , 組隊游玩"+map+",跳 "+jump;}
            String packageNameWhatsapp = "com.whatsapp";
            final List<String> installedPackages = getInstalledAppsPackageNameList();
            if(installedPackages.contains(packageNameWhatsapp)){
                Intent sendIntent = new Intent ();
                sendIntent.setAction ( Intent.ACTION_SEND );
                sendIntent.putExtra ( Intent.EXTRA_TEXT, whatsapp_send);
                sendIntent.setType ( "text/plain" );
                sendIntent.setPackage ( "com.whatsapp" );
                startActivity ( sendIntent );
                }
            else {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);

// 创建一个剪贴数据集，包含一个普通文本数据条目（需要复制的数据）
                ClipData clipData = ClipData.newPlainText(null, whatsapp_send);

// 把数据集设置（复制）到剪贴板
                clipboard.setPrimaryClip(clipData);
                Toast.makeText ( this, "命令已儲存,請轉發!", Toast.LENGTH_SHORT ).show ();
                }

        }
    }
    public void comfirm (View view){
        EditText hour2 = findViewById (R.id.hour_txt);
        EditText min2 = findViewById (R.id.min_txt);
        h = hour2.getText().toString();
        m = min2.getText().toString();
        if (h.equals ( "00" ) |	h.equals ( "01" ) |	h.equals ( "02" ) |	h.equals ( "03" ) |	h.equals ( "04" ) |	h.equals ( "05" ) |	h.equals ( "06" ) |	h.equals ( "07" ) |	h.equals ( "08" ) |	h.equals ( "09" ) |	h.equals ( "10" ) |	h.equals ( "11" ) |	h.equals ( "12" ) |	h.equals ( "13" ) |	h.equals ( "14" ) |	h.equals ( "15" ) |	h.equals ( "16" ) |	h.equals ( "17" ) |	h.equals ( "18" ) |	h.equals ( "19" ) |	h.equals ( "20" ) |	h.equals ( "21" ) |	h.equals ( "22" ) |	h.equals ( "23" ) )
        {
            if (m.equals ( "00" ) |	m.equals ( "01" ) |	m.equals ( "02" ) |	m.equals ( "03" ) |	m.equals ( "04" ) |	m.equals ( "05" ) |	m.equals ( "06" ) |	m.equals ( "07" ) |	m.equals ( "08" ) |	m.equals ( "09" ) |	m.equals ( "10" ) |	m.equals ( "11" ) |	m.equals ( "12" ) |	m.equals ( "13" ) |	m.equals ( "14" ) |	m.equals ( "15" ) |	m.equals ( "16" ) |	m.equals ( "17" ) |	m.equals ( "18" ) |	m.equals ( "19" ) |	m.equals ( "20" ) |	m.equals ( "21" ) |	m.equals ( "22" ) |	m.equals ( "23" ) |	m.equals ( "24" ) |	m.equals ( "25" ) |	m.equals ( "26" ) |	m.equals ( "27" ) |	m.equals ( "28" ) |	m.equals ( "29" ) |	m.equals ( "30" ) |	m.equals ( "31" ) |	m.equals ( "32" ) |	m.equals ( "33" ) |	m.equals ( "34" ) |	m.equals ( "35" ) |	m.equals ( "36" ) |	m.equals ( "37" ) |	m.equals ( "38" ) |	m.equals ( "39" ) |	m.equals ( "40" ) |	m.equals ( "41" ) |	m.equals ( "42" ) |	m.equals ( "43" ) |	m.equals ( "44" ) |	m.equals ( "45" ) |	m.equals ( "46" ) |	m.equals ( "47" ) |	m.equals ( "48" ) |	m.equals ( "49" ) |	m.equals ( "50" ) |	m.equals ( "51" ) |	m.equals ( "52" ) |	m.equals ( "53" ) |	m.equals ( "54" ) |	m.equals ( "55" ) |	m.equals ( "56" ) |	m.equals ( "57" ) |	m.equals ( "58" ) |m.equals ( "59" ))
            {
                time = day+h+":"+m;
                Toast.makeText ( this, "Play at : "+time, Toast.LENGTH_SHORT ).show ();
                try {
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                } catch(Exception ignored) {
                }
            }

        }else {
            Toast.makeText ( this, "Time Error !", Toast.LENGTH_SHORT ).show ();
            try {
                InputMethodManager imm = (InputMethodManager) getSystemService( Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
            } catch(Exception ignored) {
            }

        }
    }
    public void today(View view){
        day = "今天";
        Toast.makeText ( this, "你選擇了今天", Toast.LENGTH_SHORT ).show ();
    }
    public void tomorrow(View view){
        day = "明天";
        Toast.makeText ( this, "你選擇了明天", Toast.LENGTH_SHORT ).show ();
    }
    public void mc (View v){
        switch (v.getId()) {
            case R.id.island_btn:
                map = "孤島地圖";
                Toast.makeText ( getApplicationContext (), "遊玩" + map, Toast.LENGTH_SHORT ).show ();
                Intent intent = new Intent (InviteActivity.this,IslandMapActivity.class);
                startActivityForResult(intent, 1);
                break;
            case R.id.sand_btn:
                map = "沙漠地圖";
                Toast.makeText ( getApplicationContext (), "遊玩" + map, Toast.LENGTH_SHORT ).show ();
                Intent intent2 = new Intent (InviteActivity.this,SandMapActivity.class);
                startActivityForResult(intent2, 2);
                break;
            case R.id.forest_btn:
                map = "雨林地圖";
                Toast.makeText ( getApplicationContext (), "遊玩" + map, Toast.LENGTH_SHORT ).show ();
                Intent intent3 = new Intent (InviteActivity.this,ForestMapActivity.class);
                startActivityForResult(intent3, 3);
                break;
            case R.id.snow_btn:
                map = "雪地地圖";
                Toast.makeText ( getApplicationContext (), "遊玩" + map, Toast.LENGTH_SHORT ).show ();
                Intent intent4 = new Intent (InviteActivity.this,SnowMapActivity.class);
                startActivityForResult(intent4, 4);
                break;
            case R.id.zombie_btn:
                map = "殭屍地圖";
                jump = null;
                Toast.makeText ( getApplicationContext (), "遊玩" + map, Toast.LENGTH_SHORT ).show ();
                break;
            case R.id.fun_btn:
                map = "倉庫地圖";
                jump = null;
                Toast.makeText ( getApplicationContext (), "遊玩" + map, Toast.LENGTH_SHORT ).show ();
                break;
            case R.id.fire_btn:
                map = "火力全開";
                jump = null;
                Toast.makeText ( getApplicationContext (), "遊玩" + map, Toast.LENGTH_SHORT ).show ();
                break;
            case R.id.wai_jik:
                map = "遺蹟地圖";
                jump = null;
                Toast.makeText ( getApplicationContext (), "遊玩" + map, Toast.LENGTH_SHORT ).show ();
                break;
        }
    }
    public void reset (View view){
        who = null;
        join = null;
        map = null;
        jump = null;
        time = null;
        j1 ="";
        j2 ="";
        j3 ="";
        j4 ="";
        j5 ="";
        j6 ="";
        j7 ="";
        j8 ="";
        j9 ="";

        whatsapp_send = "";
        send = "";
    }
    protected List<String> getInstalledAppsPackageNameList(){
        // Initialize a new intent
        Intent intent = new Intent(Intent.ACTION_MAIN,null);

        // Set intent category
        intent.addCategory(Intent.CATEGORY_LAUNCHER);

        // Set intent flags
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);

        // Initialize a new list of resolve info
        List<ResolveInfo> resolveInfoList = getPackageManager().queryIntentActivities(intent,0);

        // Initialize a new list of package name
        List<String> packageNameList = new ArrayList<>();

        for(ResolveInfo resolveInfo: resolveInfoList){

            // Get the activity info from resolve info
            ActivityInfo activityInfo = resolveInfo.activityInfo;

            // Get the package name from activity info's application info
            // Add the package name to the list
            packageNameList.add(activityInfo.applicationInfo.packageName);
        }

        // Return the package name list
        return packageNameList;
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