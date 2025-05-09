package tb;

import android.content.Context;
import android.util.Log;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.meizu.flyme.openidsdk.b;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class u3l {

    /* renamed from: a  reason: collision with root package name */
    public static Method f29121a;

    static {
        t2o.a(147849256);
    }

    public static String a(Context context) {
        b a2 = b.a();
        return a2.b(context.getApplicationContext(), a2.b);
    }

    public static final boolean b() {
        Context context = null;
        try {
            if (f29121a == null) {
                Method method = Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]);
                f29121a = method;
                method.setAccessible(true);
            }
            context = (Context) f29121a.invoke(null, new Object[0]);
        } catch (Exception e) {
            Log.e("OpenIdHelper", "ActivityThread:currentApplication --> " + e.toString());
        }
        if (context == null) {
            return false;
        }
        return b.a().g(context, false);
    }
}
