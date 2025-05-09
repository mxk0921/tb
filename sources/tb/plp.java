package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class plp {

    /* renamed from: a  reason: collision with root package name */
    public final Context f26159a;
    public SharedPreferences b;
    public final Object c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final plp f26160a = new plp();

        static {
            t2o.a(612368429);
        }
    }

    static {
        t2o.a(612368427);
    }

    public static plp b() {
        return b.f26160a;
    }

    public String a() {
        SharedPreferences c = c();
        if (c != null) {
            return c.getString("decryptTag", "DES");
        }
        return "DES";
    }

    public final SharedPreferences c() {
        Context context;
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        synchronized (this.c) {
            try {
                SharedPreferences sharedPreferences2 = this.b;
                if (sharedPreferences2 != null || (context = this.f26159a) == null) {
                    return sharedPreferences2;
                }
                SharedPreferences sharedPreferences3 = context.getSharedPreferences("shared_msg_sdk", 0);
                this.b = sharedPreferences3;
                return sharedPreferences3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context d(Context context) {
        Context createDeviceProtectedStorageContext;
        boolean b2 = l11.b();
        dgh.a("fbeVersion is " + b2);
        if (!b2 || Build.VERSION.SDK_INT < 24) {
            return context.getApplicationContext();
        }
        createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        return createDeviceProtectedStorageContext;
    }

    public boolean e() {
        SharedPreferences c = c();
        if (c != null) {
            return c.getBoolean("hasDefaultChannelCreated", false);
        }
        return false;
    }

    public void f(String str) {
        SharedPreferences c = c();
        if (c != null) {
            c.edit().putString("decryptTag", str).commit();
        }
    }

    public void g(boolean z) {
        SharedPreferences c = c();
        if (c != null) {
            c.edit().putBoolean("hasDefaultChannelCreated", z).commit();
        }
    }

    public plp() {
        this.c = new Object();
        Context q = b6n.s().q();
        if (q != null) {
            this.f26159a = d(q);
        }
        Context context = this.f26159a;
        if (context != null) {
            this.b = context.getSharedPreferences("shared_msg_sdk", 0);
        }
    }
}
