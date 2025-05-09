package tb;

import android.content.Context;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a3v {
    public static synchronized void a(Context context, String str, String str2) {
        synchronized (a3v.class) {
            try {
                context.getSharedPreferences(str, 0).edit().remove(str2).commit();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean b(Context context, String str, String str2) {
        return context.getSharedPreferences(str, 0).contains(str2);
    }

    public static <T> T c(Context context, String str, String str2, T t) {
        try {
            if (b(context, str, str2)) {
                String a2 = qd8.a(context.getSharedPreferences(str, 0).getString(str2, ""));
                if (t instanceof Integer) {
                    return (T) Integer.valueOf(a2);
                }
                if (t instanceof Boolean) {
                    return (T) Boolean.valueOf(a2);
                }
                if (t instanceof Long) {
                    return (T) Long.valueOf(a2);
                }
                if (t instanceof String) {
                    return (T) String.valueOf(a2);
                }
                throw new Exception("unsupported type");
            }
        } catch (Exception unused) {
        }
        return t;
    }

    public static <T> void d(Context context, String str, String str2, T t) {
        try {
            context.getSharedPreferences(str, 0).edit().putString(str2, qd8.b(t.toString())).commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
