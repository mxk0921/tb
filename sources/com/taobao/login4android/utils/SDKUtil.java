package com.taobao.login4android.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SDKUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String TAG = "login.SDKUtil";

    public static boolean inList(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b3fa82", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
        } catch (Throwable th) {
            String str3 = TAG;
            LoginTLogAdapter.e(str3, "get showui_blacklist Failed,message=" + th.getMessage());
        }
        if (inStringList(str, str2)) {
            return true;
        }
        return false;
    }

    private static boolean inStringList(String str, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cf2f173", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str2) && (split = str2.split(";")) != null && split.length > 0) {
            for (String str3 : split) {
                if (TextUtils.equals(str3, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    static {
        t2o.a(516948013);
    }
}
