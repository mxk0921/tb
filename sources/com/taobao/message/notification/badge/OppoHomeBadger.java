package com.taobao.message.notification.badge;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class OppoHomeBadger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(610271236);
    }

    public static boolean isOPPO() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f03f1755", new Object[0])).booleanValue();
        }
        return Build.BRAND.toLowerCase().equals("oppo");
    }

    public static boolean executeBadge(Context context, ComponentName componentName, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35e71d2b", new Object[]{context, componentName, new Integer(i)})).booleanValue();
        }
        try {
            String str = MsgShortcutBadger.TAG;
            TLog.loge(str, "executeBadge " + componentName + " with " + i);
            Bundle bundle = new Bundle();
            bundle.putString("package", context.getPackageName());
            bundle.putString("class", componentName.getClassName());
            bundle.putInt("app_badge_count", i);
            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
            return true;
        } catch (Throwable th) {
            TLog.loge(MsgShortcutBadger.TAG, Log.getStackTraceString(th));
            return false;
        }
    }
}
