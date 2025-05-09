package tb;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dhe {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f17821a;
    public static final Class<?> b;
    public static final Method c;

    public static String a(Context context) {
        return b(context, c);
    }

    public static String b(Context context, Method method) {
        Object obj = f17821a;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, context);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception e) {
            Log.e("IdentifierManager", "invoke exception!", e);
            return null;
        }
    }

    public static boolean c() {
        if (b == null || f17821a == null) {
            return false;
        }
        return true;
    }

    static {
        t2o.a(147849262);
        c = null;
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            b = cls;
            f17821a = cls.newInstance();
            cls.getMethod("getUDID", Context.class);
            c = cls.getMethod("getOAID", Context.class);
            cls.getMethod("getVAID", Context.class);
            cls.getMethod("getAAID", Context.class);
        } catch (Exception e) {
            Log.e("IdentifierManager", "reflect exception!", e);
        }
    }
}
