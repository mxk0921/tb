package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gmp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Object> f20093a = new HashMap<>();

    public static SharedPreferences a(Context context, String str) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("f1a401d6", new Object[]{context, str});
        }
        HashMap<String, Object> hashMap = f20093a;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new amp(b(context, str)));
                }
                sharedPreferences = (SharedPreferences) hashMap.get(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }

    public static File b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("b76465f", new Object[]{context, str});
        }
        String absolutePath = d(context, str).getAbsolutePath();
        return new File(absolutePath.substring(0, absolutePath.length() - 4) + ".sp");
    }

    public static SharedPreferences c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("3cdb9bc2", new Object[]{context, str});
        }
        e(context, str);
        return a(context, str);
    }

    public static File d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("2720f0c4", new Object[]{context, str});
        }
        return (File) f(context, "getSharedPrefsFile", new Class[]{String.class}, new Object[]{str});
    }

    public static Object f(Object obj, String str, Class[] clsArr, Object[] objArr) {
        try {
            Method method = obj.getClass().getMethod(str, clsArr);
            method.setAccessible(true);
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static synchronized void e(Context context, String str) {
        synchronized (gmp.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("221b2bbf", new Object[]{context, str});
            } else if (context != null) {
                SharedPreferences a2 = a(context, "sp_replace_flag");
                if (!a2.contains(str)) {
                    SharedPreferences a3 = a(context, str);
                    SharedPreferences.Editor edit = a3.edit();
                    if (((amp) a3).s() <= 1) {
                        Map<String, ?> all = context.getSharedPreferences(str, 0).getAll();
                        if (all.size() > 0) {
                            for (Map.Entry<String, ?> entry : all.entrySet()) {
                                String key = entry.getKey();
                                Object value = entry.getValue();
                                if (!(key == null || key.trim().length() <= 0 || value == null)) {
                                    if (value instanceof String) {
                                        edit.putString(key, (String) value);
                                    } else if (value instanceof Long) {
                                        edit.putLong(key, ((Long) value).longValue());
                                    } else if (value instanceof Integer) {
                                        edit.putInt(key, ((Integer) value).intValue());
                                    } else if (value instanceof Float) {
                                        edit.putFloat(key, ((Float) value).floatValue());
                                    } else if (value instanceof Boolean) {
                                        edit.putBoolean(key, ((Boolean) value).booleanValue());
                                    }
                                }
                            }
                            edit.apply();
                        }
                    }
                    a2.edit().putBoolean(str, true).apply();
                }
            }
        }
    }
}
