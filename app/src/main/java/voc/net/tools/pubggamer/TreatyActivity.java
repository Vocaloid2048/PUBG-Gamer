package voc.net.tools.pubggamer;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class TreatyActivity extends AppCompatActivity {
    //TextView treaty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_treaty );
        Toolbar toolbar = (Toolbar) findViewById ( R.id.my_toolbar );
        //treaty = findViewById (R.id.treaty_txt);
        // treaty.setText ("群組規例 :\n" + "第一章 關於洗版 ,照片,信息戰 以及違反規則 \n" + "1.未經當事人同意下不得上載當事人照片。\n" + "2.如發生大規模星戰,又未能秒和解,所有參與及引戰者要簽定《最高權力群管之人力資源管理架構降級和議定群組內的戰爭問題及保守行為和約》，簡稱TPGWA。\n" + "3.不得於此群進行詆毀，罵戰，引戰等負面行為。\n" + "4.違犯上述任何一項將會被褫奪群管資格。\n" + "5.再犯者將被踢出。\n" +"\n"+ "第二章 關於 資料,訊息, 圖片 \n" + "1.此群組内一切照片以及對話不可外傳, 否則此群組內所有人都可以對此追究");    }

    }
}
