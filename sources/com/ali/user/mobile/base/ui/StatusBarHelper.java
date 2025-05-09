package com.ali.user.mobile.base.ui;

import android.app.Activity;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class StatusBarHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(69206094);
    }

    public static void setStatusBarMode(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c29f159", new Object[]{activity, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT < 23) {
        } else {
            if (z) {
                activity.getWindow().getDecorView().setSystemUiVisibility(8192);
            } else {
                activity.getWindow().getDecorView().setSystemUiVisibility(0);
            }
        }
    }
}
