package com.taobao.login4android.utils;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.thread.LoginThreadHelper;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ToastUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(516948016);
    }

    public static void showToast(final Context context, final CharSequence charSequence, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3e7a88", new Object[]{context, charSequence, new Integer(i)});
        } else if (charSequence != null && charSequence.length() != 0) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
            }
            LoginThreadHelper.runOnUIThread(new Runnable() { // from class: com.taobao.login4android.utils.ToastUtil.1
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
    }
}
