package voc.net.tools.pubggamer;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class VersionTreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_version_tree );
        Toolbar toolbar = (Toolbar) findViewById (R.id.version_toolbar);

    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_POWER) {
            Intent intent = new Intent (this, LockActivity.class );
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
