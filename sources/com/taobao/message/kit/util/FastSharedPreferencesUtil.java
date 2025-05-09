package com.taobao.message.kit.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.tao.log.TLog;
import tb.m7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FastSharedPreferencesUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FastSharedPreferencesUtil";

    static {
        t2o.a(529531001);
    }

    public static void addStringSharedPreference(String str, String str2) {
        String defaultSharedPreferencesName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6edfbb6d", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str)) {
            TLog.loge(TAG, "addStringSharedPreference error: key:" + str);
        } else if (Build.VERSION.SDK_INT >= 24) {
            defaultSharedPreferencesName = PreferenceManager.getDefaultSharedPreferencesName(ApplicationUtil.getApplication());
            addStringSharedPreference(defaultSharedPreferencesName, str, str2);
        } else {
            addStringSharedPreference(getDefaultSharedPreferencesName(ApplicationUtil.getApplication()), str, str2);
        }
    }

    public static void clearFileAsync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e60b14e4", new Object[]{str});
        } else {
            m7l.a(ApplicationUtil.getApplication(), str, 0).edit().clear().apply();
        }
    }

    public static void clearFileSync(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a6d0b35", new Object[]{str});
        } else {
            m7l.a(ApplicationUtil.getApplication(), str, 0).edit().clear().commit();
        }
    }

    public static SharedPreferences createFastSP(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("749d98b1", new Object[]{str, new Integer(i)});
        }
        return m7l.a(ApplicationUtil.getApplication(), str, i);
    }

    public static boolean getBooleanSharedPreference(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcade12b", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            TLog.loge(TAG, "key is null: " + str + z);
            return z;
        } else if (ApplicationUtil.getApplication() != null) {
            return m7l.a(ApplicationUtil.getApplication(), str, 0).getBoolean(str2, z);
        } else {
            TLog.loge(TAG, "application is null: " + str + str2 + z);
            return z;
        }
    }

    private static String getDefaultSharedPreferencesName(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c866592", new Object[]{context});
        }
        return context.getPackageName() + "_preferences";
    }

    public static float getFloatSharedPreference(String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f20b7cf", new Object[]{str, str2, new Float(f)})).floatValue();
        }
        if (TextUtils.isEmpty(str2)) {
            TLog.loge(TAG, "key is null: " + str + f);
            return f;
        } else if (ApplicationUtil.getApplication() != null) {
            return m7l.a(ApplicationUtil.getApplication(), str, 0).getFloat(str2, f);
        } else {
            TLog.loge(TAG, "application is null: " + str + str2 + f);
            return f;
        }
    }

    public static int getIntSharedPreference(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a86efa62", new Object[]{str, str2, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str2)) {
            TLog.loge(TAG, "key is null: " + str + i);
            return i;
        } else if (ApplicationUtil.getApplication() != null) {
            return m7l.a(ApplicationUtil.getApplication(), str, 0).getInt(str2, i);
        } else {
            TLog.loge(TAG, "application is null: " + str + str2 + i);
            return i;
        }
    }

    public static long getLongSharedPreference(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e425fe0b", new Object[]{str, str2, new Long(j)})).longValue();
        }
        if (TextUtils.isEmpty(str2)) {
            TLog.loge(TAG, "key is null: " + str + j);
            return j;
        } else if (ApplicationUtil.getApplication() != null) {
            return m7l.a(ApplicationUtil.getApplication(), str, 0).getLong(str2, j);
        } else {
            TLog.loge(TAG, "application is null: " + str + str2 + j);
            return j;
        }
    }

    public static String getStringSharedPreference(String str) {
        String defaultSharedPreferencesName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3441b808", new Object[]{str});
        }
        if (Build.VERSION.SDK_INT < 24) {
            return getStringSharedPreference(getDefaultSharedPreferencesName(ApplicationUtil.getApplication()), str, "");
        }
        defaultSharedPreferencesName = PreferenceManager.getDefaultSharedPreferencesName(ApplicationUtil.getApplication());
        return getStringSharedPreference(defaultSharedPreferencesName, str, "");
    }

    public static void removeKey(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52c55a56", new Object[]{str, str2});
            return;
        }
        SharedPreferences.Editor edit = m7l.a(ApplicationUtil.getApplication(), str, 0).edit();
        edit.remove(str2);
        edit.apply();
    }

    public static void addBooleanSharedPreference(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ffdf272", new Object[]{str, str2, new Boolean(z)});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            TLog.loge(TAG, "addStringSharedPreference error: prefsName:" + str + "|key:" + str2);
        } else {
            SharedPreferences.Editor edit = m7l.a(ApplicationUtil.getApplication(), str, 0).edit();
            edit.putBoolean(str2, z);
            edit.apply();
        }
    }

    public static void addFloatSharedPreference(String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e54a9fea", new Object[]{str, str2, new Float(f)});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            TLog.loge(TAG, "addStringSharedPreference error: prefsName:" + str + "|key:" + str2);
        } else {
            SharedPreferences.Editor edit = m7l.a(ApplicationUtil.getApplication(), str, 0).edit();
            edit.putFloat(str2, f);
            edit.apply();
        }
    }

    public static void addIntSharedPreference(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b779693a", new Object[]{str, str2, new Integer(i)});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            TLog.loge(TAG, "addStringSharedPreference error: prefsName:" + str + "|key:" + str2);
        } else {
            SharedPreferences.Editor edit = m7l.a(ApplicationUtil.getApplication(), str, 0).edit();
            edit.putInt(str2, i);
            edit.apply();
        }
    }

    public static void addLongSharedPreference(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b66968ac", new Object[]{str, str2, new Long(j)});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            TLog.loge(TAG, "addStringSharedPreference error: prefsName:" + str + "|key:" + str2);
        } else {
            SharedPreferences.Editor edit = m7l.a(ApplicationUtil.getApplication(), str, 0).edit();
            edit.putLong(str2, j);
            edit.apply();
        }
    }

    public static String getStringSharedPreference(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae5d117e", new Object[]{str, str2}) : getStringSharedPreference(str, str2, "");
    }

    public static String getStringSharedPreference(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d3974", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str2)) {
            TLog.loge(TAG, "key is null:  " + str + str3);
            return str3;
        } else if (ApplicationUtil.getApplication() != null) {
            return m7l.a(ApplicationUtil.getApplication(), str, 0).getString(str2, str3);
        } else {
            TLog.loge(TAG, "application is null: " + str + str2 + str3);
            return str3;
        }
    }

    public static void addStringSharedPreference(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed7c3f7", new Object[]{str, str2, str3});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            TLog.loge(TAG, "addStringSharedPreference error: prefsName:" + str + "|key:" + str2);
        } else {
            SharedPreferences.Editor edit = m7l.a(ApplicationUtil.getApplication(), str, 0).edit();
            edit.putString(str2, str3);
            edit.apply();
        }
    }
}
