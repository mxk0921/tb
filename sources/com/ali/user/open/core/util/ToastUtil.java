package com.ali.user.open.core.util;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ToastUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ToastUtil";
    private static final Handler mMainThreadHandler = new Handler(Looper.getMainLooper());

    static {
        t2o.a(71303255);
    }

    public static void cancelToast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f2249d4", new Object[0]);
        }
    }

    public static void show(Toast toast) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc87dd7", new Object[]{toast});
        } else if (toast != null) {
            toast.show();
        }
    }

    public static void showToast(final Context context, final CharSequence charSequence, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3e7a88", new Object[]{context, charSequence, new Integer(i)});
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        mMainThreadHandler.post(new Runnable() { // from class: com.ali.user.open.core.util.ToastUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Toast.makeText(context, charSequence, i).show();
                }
            }
        });
    }

    public static void showToast(Context context, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccd073db", new Object[]{context, charSequence});
        } else {
            showToast(context, charSequence, 0);
        }
    }
}
