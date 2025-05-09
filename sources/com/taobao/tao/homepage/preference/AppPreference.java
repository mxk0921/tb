package com.taobao.tao.homepage.preference;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AppPreference {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(775946340);
    }

    public static boolean getBoolean(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return getSharedPreferences().getBoolean(str, z);
    }

    public static int getInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{str, new Integer(i)})).intValue();
        }
        return getSharedPreferences().getInt(str, i);
    }

    private static SharedPreferences getSharedPreferences() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("75ba1678", new Object[0]);
        }
        return PreferenceManager.getDefaultSharedPreferences(Globals.getApplication());
    }

    public static String getString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        return getSharedPreferences().getString(str, str2);
    }

    public static void putBoolean(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("932aec2a", new Object[]{str, new Boolean(z)});
            return;
        }
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public static void putInt(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4330032", new Object[]{str, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public static void putString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb567a1b", new Object[]{str, str2});
            return;
        }
        SharedPreferences.Editor edit = getSharedPreferences().edit();
        edit.putString(str, str2);
        edit.apply();
    }
}
