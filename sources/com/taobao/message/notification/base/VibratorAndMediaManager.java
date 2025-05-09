package com.taobao.message.notification.base;

import android.app.Application;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.message.notification.util.ThreadPoolUtil;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.TBSoundPlayer;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class VibratorAndMediaManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ISOPENSERVICE = "is_OpenService";
    public static final String ISVIBRATIONON = "is_VibrationOn";
    public static final String RINGON = "ringOn";
    public static final String TAG = "VibratorAndMediaManager";
    private Vibrator mVibrator = null;
    public static final long[] CURRENT_MSG_VIBRATE_TIME = {0, 140, 80, 140};
    public static final long[] SILENT_MSG_VIBRATE_TIME = {0, 0};
    private static Application mApplication = null;
    private static VibratorAndMediaManager mVibratorAndMediaManger = new VibratorAndMediaManager();

    static {
        t2o.a(610271294);
    }

    private VibratorAndMediaManager() {
    }

    public static /* synthetic */ Vibrator access$000(VibratorAndMediaManager vibratorAndMediaManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Vibrator) ipChange.ipc$dispatch("3dedcf01", new Object[]{vibratorAndMediaManager});
        }
        return vibratorAndMediaManager.mVibrator;
    }

    public static /* synthetic */ Vibrator access$002(VibratorAndMediaManager vibratorAndMediaManager, Vibrator vibrator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Vibrator) ipChange.ipc$dispatch("affffeb4", new Object[]{vibratorAndMediaManager, vibrator});
        }
        vibratorAndMediaManager.mVibrator = vibrator;
        return vibrator;
    }

    public static /* synthetic */ Application access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("57e7de87", new Object[0]);
        }
        return mApplication;
    }

    public static /* synthetic */ boolean access$200(VibratorAndMediaManager vibratorAndMediaManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d9850ba", new Object[]{vibratorAndMediaManager})).booleanValue();
        }
        return vibratorAndMediaManager.isVibrate();
    }

    public static /* synthetic */ boolean access$300(VibratorAndMediaManager vibratorAndMediaManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ee9e03b", new Object[]{vibratorAndMediaManager})).booleanValue();
        }
        return vibratorAndMediaManager.isRing();
    }

    public static boolean canVibrate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18fed08a", new Object[0])).booleanValue();
        }
        AudioManager audioManager = (AudioManager) mApplication.getSystemService("audio");
        if (audioManager != null && audioManager.getRingerMode() == 0) {
            return false;
        }
        return true;
    }

    private void doRing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70610c62", new Object[]{this});
            return;
        }
        TLog.logw(TAG, "ring!");
        ThreadPoolUtil.doAsyncTask(new Runnable() { // from class: com.taobao.message.notification.base.VibratorAndMediaManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (VibratorAndMediaManager.access$300(VibratorAndMediaManager.this)) {
                    TBSoundPlayer.getInstance().playScene(0);
                }
            }
        });
    }

    private void doVibrate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("937490eb", new Object[]{this});
            return;
        }
        TLog.logw(TAG, "vibrate!");
        ThreadPoolUtil.doAsyncTask(new Runnable() { // from class: com.taobao.message.notification.base.VibratorAndMediaManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (VibratorAndMediaManager.access$000(VibratorAndMediaManager.this) == null) {
                    VibratorAndMediaManager.access$002(VibratorAndMediaManager.this, (Vibrator) VibratorAndMediaManager.access$100().getSystemService("vibrator"));
                }
                if (VibratorAndMediaManager.canVibrate() && VibratorAndMediaManager.access$200(VibratorAndMediaManager.this)) {
                    VibratorAndMediaManager.access$000(VibratorAndMediaManager.this).vibrate(VibratorAndMediaManager.CURRENT_MSG_VIBRATE_TIME, -1);
                }
            }
        });
    }

    public static VibratorAndMediaManager getInstance(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VibratorAndMediaManager) ipChange.ipc$dispatch("9a9178a6", new Object[]{application});
        }
        mApplication = application;
        return mVibratorAndMediaManger;
    }

    private boolean isVibrate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5aca46f0", new Object[]{this})).booleanValue();
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(mApplication);
        if (!EnvUtil.isAppBackGround(TAG)) {
            return defaultSharedPreferences.getBoolean(ISVIBRATIONON, false);
        }
        return false;
    }

    public void ring() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62a56b7", new Object[]{this});
        } else {
            vibrateAndRing(false, true);
        }
    }

    public void vibrate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed5aa76", new Object[]{this});
        } else {
            vibrateAndRing(true, false);
        }
    }

    public void vibrateAndRing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5534bf", new Object[]{this});
        } else {
            vibrateAndRing(true, true);
        }
    }

    private boolean isRing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86e1fe05", new Object[]{this})).booleanValue();
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(mApplication);
        if (!EnvUtil.isAppBackGround(TAG)) {
            return defaultSharedPreferences.getBoolean(RINGON, false);
        }
        return false;
    }

    public void vibrateAndRing(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd44cc9", new Object[]{this, str});
        } else {
            vibrateAndRing(true, true, str);
        }
    }

    private void doRing(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b4a1ac", new Object[]{this, str});
            return;
        }
        TLog.logw(TAG, "ring!");
        ThreadPoolUtil.doAsyncTask(new Runnable() { // from class: com.taobao.message.notification.base.VibratorAndMediaManager.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (VibratorAndMediaManager.access$300(VibratorAndMediaManager.this)) {
                    TBSoundPlayer.getInstance().play(str);
                }
            }
        });
    }

    public void vibrateAndRing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2051d624", new Object[]{this, new Integer(i)});
        } else {
            vibrateAndRing(true, true, i);
        }
    }

    private void vibrateAndRing(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f15b7f", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z) {
            doVibrate();
        }
        if (z2) {
            doRing();
        }
    }

    private void doRing(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc0f2e1", new Object[]{this, new Integer(i)});
            return;
        }
        TLog.logw(TAG, "ring!");
        ThreadPoolUtil.doAsyncTask(new Runnable() { // from class: com.taobao.message.notification.base.VibratorAndMediaManager.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (VibratorAndMediaManager.access$300(VibratorAndMediaManager.this)) {
                    TBSoundPlayer.getInstance().play(i);
                }
            }
        });
    }

    private void vibrateAndRing(boolean z, boolean z2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cabc4389", new Object[]{this, new Boolean(z), new Boolean(z2), str});
            return;
        }
        if (z) {
            doVibrate();
        }
        if (!z2) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            doRing(str);
        } else {
            doRing();
        }
    }

    private void vibrateAndRing(boolean z, boolean z2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("543a8764", new Object[]{this, new Boolean(z), new Boolean(z2), new Integer(i)});
            return;
        }
        if (z) {
            doVibrate();
        }
        if (!z2) {
            return;
        }
        if (i != 0) {
            doRing(i);
        } else {
            doRing();
        }
    }
}
