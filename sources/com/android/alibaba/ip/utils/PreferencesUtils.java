package com.android.alibaba.ip.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.m7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PreferencesUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Map<String, SharedPreferences.Editor> spCaches = new HashMap();

    static {
        t2o.a(493879341);
    }

    public static void apply(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e2577f", new Object[]{str});
            return;
        }
        SharedPreferences.Editor editor = spCaches.get(str);
        if (editor != null) {
            spCaches.remove(str);
            editor.apply();
        }
    }

    public static SharedPreferences.Editor clear(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("20e8a7f3", new Object[]{context, str});
        }
        return getEditor(context, str).clear();
    }

    public static boolean getBoolean(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2b9e3c07", new Object[]{context, str, str2})).booleanValue() : getBoolean(context, str, str2, false);
    }

    public static SharedPreferences.Editor getEditor(Context context, String str) {
        SharedPreferences.Editor editor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("b9572409", new Object[]{context, str});
        }
        synchronized (spCaches) {
            try {
                editor = spCaches.get(str);
                if (editor == null) {
                    editor = m7l.a(context, str, 0).edit();
                    spCaches.put(str, editor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return editor;
    }

    public static float getFloat(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("93e8d1bf", new Object[]{context, str, str2})).floatValue() : getFloat(context, str, str2, -1.0f);
    }

    public static int getInt(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eba56c0f", new Object[]{context, str, str2})).intValue() : getInt(context, str, str2, -1);
    }

    public static long getLong(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5ad94f7", new Object[]{context, str, str2})).longValue() : getLong(context, str, str2, -1L);
    }

    public static String getString(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a804d6d2", new Object[]{context, str, str2}) : getString(context, str, str2, null);
    }

    public static SharedPreferences.Editor putBoolean(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("1c0fc459", new Object[]{context, str, str2, new Boolean(z)});
        }
        return getEditor(context, str).putBoolean(str2, z);
    }

    public static SharedPreferences.Editor putFloat(Context context, String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("3f6ea9f9", new Object[]{context, str, str2, new Float(f)});
        }
        return getEditor(context, str).putFloat(str2, f);
    }

    public static SharedPreferences.Editor putInt(Context context, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("b64e6a63", new Object[]{context, str, str2, new Integer(i)});
        }
        return getEditor(context, str).putInt(str2, i);
    }

    public static SharedPreferences.Editor putLong(Context context, String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("411b6b17", new Object[]{context, str, str2, new Long(j)});
        }
        return getEditor(context, str).putLong(str2, j);
    }

    public static SharedPreferences.Editor putString(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("203d8392", new Object[]{context, str, str2, str3});
        }
        return getEditor(context, str).putString(str2, str3);
    }

    public static SharedPreferences.Editor remove(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences.Editor) ipChange.ipc$dispatch("9771e260", new Object[]{context, str, str2});
        }
        return getEditor(context, str).remove(str2);
    }

    public static boolean commit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df0d908c", new Object[]{str})).booleanValue();
        }
        synchronized (spCaches) {
            try {
                SharedPreferences.Editor editor = spCaches.get(str);
                if (editor == null) {
                    return false;
                }
                spCaches.remove(str);
                return editor.commit();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean getBoolean(Context context, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4829f735", new Object[]{context, str, str2, new Boolean(z)})).booleanValue() : m7l.a(context, str, 0).getBoolean(str2, z);
    }

    public static float getFloat(Context context, String str, String str2, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e931cfc1", new Object[]{context, str, str2, new Float(f)})).floatValue() : m7l.a(context, str, 0).getFloat(str2, f);
    }

    public static int getInt(Context context, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("89088a5a", new Object[]{context, str, str2, new Integer(i)})).intValue() : m7l.a(context, str, 0).getInt(str2, i);
    }

    public static long getLong(Context context, String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b0058215", new Object[]{context, str, str2, new Long(j)})).longValue() : m7l.a(context, str, 0).getLong(str2, j);
    }

    public static String getString(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1745d1c8", new Object[]{context, str, str2, str3}) : m7l.a(context, str, 0).getString(str2, str3);
    }
}
