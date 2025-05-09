package tb;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class t2 implements r2 {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, t2> f28422a = new HashMap();
    public static final Object b = new Object();

    public static t2 b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return c(context, context.getPackageName());
    }

    public static t2 c(Context context, String str) {
        t2 t2Var;
        synchronized (b) {
            try {
                Map<String, t2> map = f28422a;
                t2Var = (t2) ((HashMap) map).get(str);
                if (t2Var == null) {
                    t2Var = new syx(context, str);
                    ((HashMap) map).put(str, t2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t2Var;
    }
}
