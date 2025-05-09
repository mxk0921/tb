package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b8y {

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f16257a;

    public static long a(String str, long j, Context context) {
        return c(context).getLong(str, j);
    }

    public static String b(String str, String str2, Context context) {
        return c(context).getString(str, str2);
    }

    public static synchronized SharedPreferences c(Context context) {
        SharedPreferences sharedPreferences;
        Context createDeviceProtectedStorageContext;
        synchronized (b8y.class) {
            try {
                if (f16257a == null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                        f16257a = createDeviceProtectedStorageContext.getSharedPreferences("aegis", 0);
                    } else {
                        f16257a = context.getApplicationContext().getSharedPreferences("aegis", 0);
                    }
                }
                sharedPreferences = f16257a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }

    public static void d(String str, long j, Context context) {
        c(context).edit().putLong(str, j).apply();
    }

    public static void e(String str, String str2, Context context) {
        c(context).edit().putString(str, str2).apply();
    }
}
