package voc.net.tools.pubggamer;

import android.content.Context;
import android.graphics.PixelFormat;
import android.os.Build;
import android.view.Gravity;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

/**
 * Created by wangxiandeng on 2016/11/25.
 */

class FloatWindowManager {
    private static FloatBallView mBallView;

    private static WindowManager mWindowManager;


    static void addBallView(Context context) {
        if (mBallView == null) {
            WindowManager windowManager = getWindowManager(context);
            int screenWidth = windowManager.getDefaultDisplay().getWidth();
            int screenHeight = windowManager.getDefaultDisplay().getHeight();
            mBallView = new FloatBallView(context);
            LayoutParams params = new LayoutParams();
            if (Build.VERSION.SDK_INT > Build.VERSION_CODES.N_MR1) {

                params.type = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;

            } else if (Build.VERSION.SDK_INT == Build.VERSION_CODES.N_MR1) {

                params.type = LayoutParams.TYPE_SYSTEM_ALERT;

            } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

                params.type = LayoutParams.TYPE_TOAST;

            } else {

                params.type = LayoutParams.TYPE_SYSTEM_ALERT;

            }
            params.x = screenWidth;
            params.y = screenHeight / 2;
            params.width = WindowManager.LayoutParams.WRAP_CONTENT;
            params.height = WindowManager.LayoutParams.WRAP_CONTENT;
            params.gravity = Gravity.LEFT | Gravity.TOP;
            params.type = LayoutParams.TYPE_PHONE;
            params.format = PixelFormat.RGBA_8888;
            params.flags = LayoutParams.FLAG_NOT_TOUCH_MODAL
                    | LayoutParams.FLAG_NOT_FOCUSABLE;
            mBallView.setLayoutParams(params);
            windowManager.addView(mBallView, params);
        }
    }

     static void removeBallView(Context context) {
        if (mBallView != null) {
            WindowManager windowManager = getWindowManager(context);
            windowManager.removeView(mBallView);
            mBallView = null;
        }
    }

    private static WindowManager getWindowManager(Context context) {
        if (mWindowManager == null) {
            mWindowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        }
        return mWindowManager;
    }

}
