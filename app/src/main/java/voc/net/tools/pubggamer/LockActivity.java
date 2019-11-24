package voc.net.tools.pubggamer;

import android.app.Service;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.hardware.fingerprint.FingerprintManagerCompat;
import androidx.core.os.CancellationSignal;

public class LockActivity extends AppCompatActivity {
    TextView txt_code ,txt_lock;

    private final String TAG = "LockActivity";

    private TextView mResultInfo = null;
    // private Button mCancelBtn = null;
    private ImageView mStartBtn = null;
    String LMZS = "A片呂王";
    String CBKS = "鄭板橋到此一悠";

    private FingerprintManagerCompat fingerprintManager = null;
    private MyAuthCallback myAuthCallback = null;
    private CancellationSignal cancellationSignal = null;

    private Handler handler = null;
    public static final int MSG_AUTH_SUCCESS = 100;
    public static final int MSG_AUTH_FAILED = 101;
    public static final int MSG_AUTH_ERROR = 102;
    public static final int MSG_AUTH_HELP = 103;
    public static final int MSG_AUTH_TOO_FAST = 104;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_lock );
        txt_code = findViewById (R.id.txt_welcome2);
        txt_lock = findViewById (R.id.txt_welcome3);
        String versionName = BuildConfig.VERSION_NAME;
        txt_code.setText ("Version : "+versionName);
        mResultInfo = findViewById (R.id.fingerprint_status);
        mResultInfo.setText(R.string.fingerprint_hint);
//        mStartBtn.setImageResource (R.drawable.ic_fingerprint_black_24dp);
        mResultInfo.setTextColor(getColor(R.color.hint_color));
        mStartBtn = findViewById (R.id.fingerprint_icon);


        mStartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // reset result info.
                mResultInfo.setText(R.string.fingerprint_hint);
                mResultInfo.setTextColor(getColor(R.color.colorPrimary));

                // start fingerprint auth here.
                try {
                    CryptoObjectHelper cryptoObjectHelper = new CryptoObjectHelper();
                    if (cancellationSignal == null) {
                        cancellationSignal = new CancellationSignal();
                    }
                    fingerprintManager.authenticate(cryptoObjectHelper.buildCryptoObject(), 0,
                            cancellationSignal, myAuthCallback, null);
                    // set button state.
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(LockActivity.this, "手速太快,請重試!", Toast.LENGTH_SHORT).show();
                }
            }
        });


        handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);

                Log.d(TAG, "msg: " + msg.what + " ,arg1: " + msg.arg1);
                switch (msg.what) {
                    case MSG_AUTH_SUCCESS:
                        setResultInfo(R.string.fingerprint_success);
                        //mCancelBtn.setEnabled(false);
                        //mStartBtn.setEnabled(true);
                        cancellationSignal = null;
                        setVibrate(100);
                        txt_lock.setText ("  PUBG GAMER 已解鎖");
                        mStartBtn.setImageResource (R.drawable.ic_check_circle_black_24dp);
                        finish();
                        break;
                    case MSG_AUTH_FAILED:
                        setResultInfo(R.string.fingerprint_not_recognized);
                        //mCancelBtn.setEnabled(false);
                        //mStartBtn.setEnabled(true);
                        cancellationSignal = null;
                        setVibrate(500);
                        break;
                    case MSG_AUTH_TOO_FAST:
                        setResultInfo(R.string.fingerprint_too_fast);
                        //mCancelBtn.setEnabled(false);
                        //mStartBtn.setEnabled(true);
                        cancellationSignal = null;
                        setVibrate(100);
                        setVibrate(100);
                        break;
                }
            }
        };

        // init fingerprint.
        fingerprintManager = FingerprintManagerCompat.from(this);

        if (!fingerprintManager.isHardwareDetected()) {
            // no fingerprint sensor is detected, show dialog to tell user. m
            finish ();
        } else if (!fingerprintManager.hasEnrolledFingerprints()) {
            finish ();
        } else {
            try {
                myAuthCallback = new MyAuthCallback(handler);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
    }
    public void onBackPressed(){
        Log.i ("","");
    }

    private void handleHelpCode(int code) {
        switch (code) {
            case FingerprintManager.FINGERPRINT_ACQUIRED_GOOD:
                setResultInfo(R.string.AcquiredGood_warning);
                break;
            case FingerprintManager.FINGERPRINT_ACQUIRED_IMAGER_DIRTY:
                setResultInfo(R.string.AcquiredImageDirty_warning);
                break;
            case FingerprintManager.FINGERPRINT_ACQUIRED_INSUFFICIENT:
                setResultInfo(R.string.AcquiredInsufficient_warning);
                break;
            case FingerprintManager.FINGERPRINT_ACQUIRED_PARTIAL:
                setResultInfo(R.string.AcquiredPartial_warning);
                break;
            case FingerprintManager.FINGERPRINT_ACQUIRED_TOO_FAST:
                setResultInfo(R.string.AcquiredTooFast_warning);
                break;
            case FingerprintManager.FINGERPRINT_ACQUIRED_TOO_SLOW:
                setResultInfo(R.string.AcquiredToSlow_warning);
                break;
        }
    }

    private void handleErrorCode(int code) {
        switch (code) {
            case FingerprintManager.FINGERPRINT_ERROR_CANCELED:
                setResultInfo(R.string.ErrorCanceled_warning);
                break;
            case FingerprintManager.FINGERPRINT_ERROR_HW_UNAVAILABLE:
                setResultInfo(R.string.ErrorHwUnavailable_warning);
                break;
            case FingerprintManager.FINGERPRINT_ERROR_LOCKOUT:
                setResultInfo(R.string.ErrorLockout_warning);
                break;
            case FingerprintManager.FINGERPRINT_ERROR_NO_SPACE:
                setResultInfo(R.string.ErrorNoSpace_warning);
                break;
            case FingerprintManager.FINGERPRINT_ERROR_TIMEOUT:
                setResultInfo(R.string.ErrorTimeout_warning);
                break;
            case FingerprintManager.FINGERPRINT_ERROR_UNABLE_TO_PROCESS:
                setResultInfo(R.string.ErrorUnableToProcess_warning);
                break;
        }
    }

    private void setResultInfo(int stringId) {
        if (mResultInfo != null) {
            if (stringId == R.string.fingerprint_success) {
                mResultInfo.setTextColor(getColor(R.color.success_color));
            } else {
                mResultInfo.setTextColor(getColor(R.color.warning_color));
            }
            mResultInfo.setText(stringId);
        }
    }
    public void setVibrate(int time){
        Vibrator myVibrator = (Vibrator) getSystemService( Service.VIBRATOR_SERVICE);
        myVibrator.vibrate(time);
    }
    public void LMZ(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Permission (Easter Egg)");
        builder.setMessage("LMZ : "+LMZS+"\n"+"CBK : "+CBKS);
        builder.setIcon(R.mipmap.ic_launcher_round);
        //点击对话框以外的区域是否让对话框消失
        builder.setCancelable(true);
        builder.show ();
    }

}


