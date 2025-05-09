package com.ali.user.mobile.base.helper;

import android.content.Context;
import android.content.SharedPreferences;
import com.ali.user.mobile.login.model.LoginConstant;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CPHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NO_CLIENT_LOGIN = "no_client_login";
    private static SharedPreferences sPrefs;

    static {
        t2o.a(69206067);
    }

    public static void delete(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3bdba0", new Object[]{context, str});
            return;
        }
        SharedPreferences.Editor edit = getPrefs(context).edit();
        edit.remove(str);
        edit.apply();
    }

    public static String getAccountInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee703824", new Object[]{context});
        }
        return getPrefs(context).getString(LoginConstant.ACCOUNT, "");
    }

    public static void save(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72cb2bd8", new Object[]{context, str, str2});
            return;
        }
        SharedPreferences.Editor edit = getPrefs(context).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    private static SharedPreferences getPrefs(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("1f33057b", new Object[]{context});
        }
        if (sPrefs == null) {
            sPrefs = context.getSharedPreferences(NO_CLIENT_LOGIN, 0);
        }
        return sPrefs;
    }
}
