package tb;

import android.app.Application;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lm7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Application f23407a;

    static {
        t2o.a(444596233);
    }

    public static synchronized Application a() {
        synchronized (lm7.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
            }
            if (f23407a == null) {
                f23407a = b();
            }
            return f23407a;
        }
    }

    public static Application b() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception unused) {
            ul7 a2 = f65.n().a();
            if (a2 != null) {
                a2.d(tl7.TAG, "getApplication", 1.0d);
            }
            return null;
        }
    }
}
