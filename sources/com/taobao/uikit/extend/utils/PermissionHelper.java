package com.taobao.uikit.extend.utils;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PermissionHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "PermissionHelper";

    static {
        t2o.a(932184196);
    }

    public static boolean checkOp(Context context, int i) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            Class.forName(appOpsManager.getClass().getName());
            Class<?> cls = appOpsManager.getClass();
            Class<?> cls2 = Integer.TYPE;
            int intValue = ((Integer) cls.getDeclaredMethod("checkOp", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(i), Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue();
            Log.e(TAG, "0 invoke " + intValue);
            if (intValue == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            Log.e(TAG, "CheckOp failed for some reason!");
            return false;
        }
    }

    public static boolean isMezuFloatWindowOpAllowed(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1386b0ed", new Object[]{context})).booleanValue();
        }
        return checkOp(context, 24);
    }

    public static boolean isMiuiFloatWindowOpAllowed(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("253dbc30", new Object[]{context})).booleanValue();
        }
        return checkOp(context, 24);
    }

    public static boolean isPermissionGranted(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c057f509", new Object[]{activity, str})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23 || ContextCompat.checkSelfPermission(activity, str) == 0) {
            return true;
        }
        ActivityCompat.requestPermissions(activity, new String[]{str}, 1);
        return false;
    }
}
