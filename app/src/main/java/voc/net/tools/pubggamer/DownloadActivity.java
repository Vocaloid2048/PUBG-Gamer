package voc.net.tools.pubggamer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DownloadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );

        Intent intent = new Intent(android.content.Intent.ACTION_VIEW);
        intent.setData( Uri.parse("http://cmt.25u.com:9513/PUBG_GAMER.apk"));
        startActivity (intent);

    }
}
