package com.ta.audid.permission;

import android.content.Context;
import android.os.Binder;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.android.utils.PhoneInfoUtils;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PermissionUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(966787078);
    }

    public static boolean checkReadPhoneStatePermissionGranted(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbdfe3a", new Object[]{context})).booleanValue();
        }
        try {
            return selfPermissionGranted(context, "android.permission.READ_PHONE_STATE");
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean checkStoragePermissionGranted(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b10f31ec", new Object[]{context})).booleanValue();
        }
        if (PhoneInfoUtils.isSdcardPrivacyMode()) {
            return false;
        }
        try {
            return selfPermissionGranted(context, "android.permission.WRITE_EXTERNAL_STORAGE");
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean selfPermissionGranted(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f017caf", new Object[]{context, str})).booleanValue();
        }
        if (context != null && context.checkPermission(str, Binder.getCallingPid(), Binder.getCallingUid()) == 0) {
            return true;
        }
        return false;
    }
}
