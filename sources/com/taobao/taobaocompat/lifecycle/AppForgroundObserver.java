package com.taobao.taobaocompat.lifecycle;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppForgroundObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean isForeground = false;

    static {
        t2o.a(775946453);
    }

    public static boolean isAppForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c553f8c5", new Object[0])).booleanValue();
        }
        return isForeground;
    }

    public void onStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b167bb", new Object[]{this, activity});
        } else {
            isForeground = true;
        }
    }

    public void onStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82d37207", new Object[]{this, activity});
        } else {
            isForeground = false;
        }
    }
}
