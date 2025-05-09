package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zv7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Object a(Context context, String str, Object obj) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("303e21a5", new Object[]{context, str, obj});
        }
        if (context == null) {
            return obj;
        }
        try {
            sharedPreferences = context.getSharedPreferences("DL_Downloader", 0);
        } catch (Throwable th) {
            fs7.e("SPUtil", "get from share preference failed", th.toString());
        }
        if (obj instanceof String) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
        }
        return obj;
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50002d3f", new Object[]{context, str});
        } else if (context != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("DL_Downloader", 0).edit();
                edit.remove(str);
                edit.commit();
            } catch (Throwable th) {
                fs7.e("SPUtil", "save to share preference failed", th.toString());
            }
        }
    }

    public static void c(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f405e5", new Object[]{context, str, obj});
        } else if (context != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("DL_Downloader", 0).edit();
                if (obj instanceof String) {
                    edit.putString(str, (String) obj);
                } else if (obj instanceof Integer) {
                    edit.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    edit.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Float) {
                    edit.putFloat(str, ((Float) obj).floatValue());
                } else if (obj instanceof Long) {
                    edit.putLong(str, ((Long) obj).longValue());
                } else {
                    edit.putString(str, obj.toString());
                }
                edit.commit();
            } catch (Throwable th) {
                fs7.e("SPUtil", "save to share preference failed", th.toString());
            }
        }
    }
}
