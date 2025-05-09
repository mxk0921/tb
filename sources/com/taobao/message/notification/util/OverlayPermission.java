package com.taobao.message.notification.util;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.provider.Settings;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class OverlayPermission {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(610271343);
    }

    public static boolean hasPermission(Context context) {
        boolean canDrawOverlays;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a17da9bc", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23) {
            return hasPermissionBelowMarshmallow(context);
        }
        canDrawOverlays = Settings.canDrawOverlays(context);
        return canDrawOverlays;
    }

    public static boolean hasPermissionBelowMarshmallow(Context context) {
        try {
            Class cls = Integer.TYPE;
            if (((Integer) AppOpsManager.class.getMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getApplicationContext().getPackageName())).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception | NoClassDefFoundError unused) {
            return false;
        }
    }
}
