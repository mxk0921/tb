package tb;

import android.app.Application;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.lp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fkr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIGH_DEVICE = 1;
    public static final int LOW_DEVICE = 3;
    public static final int MIDDLE_DEVICE = 2;
    public static final int UNKNOWN_DEVICE = 0;

    /* renamed from: a  reason: collision with root package name */
    public static lp0.e f19371a;
    public static Application b;

    static {
        t2o.a(806356546);
    }

    public static synchronized Application a() {
        synchronized (fkr.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Application) ipChange.ipc$dispatch("5749e470", new Object[0]);
            }
            if (b == null) {
                b = c();
            }
            return b;
        }
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        if (f19371a == null) {
            f19371a = lp0.d().f();
        }
        lp0.e eVar = f19371a;
        if (eVar != null) {
            return eVar.f23479a;
        }
        return -1;
    }

    public static int d() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9108b6ea", new Object[0])).intValue();
        }
        if (f19371a == null) {
            f19371a = lp0.d().f();
        }
        lp0.e eVar = f19371a;
        if (eVar == null || -1 == (i = eVar.f23479a)) {
            return 0;
        }
        if (i == 0) {
            return 1;
        }
        if (1 == i) {
            return 2;
        }
        if (2 == i) {
            return 3;
        }
        return 0;
    }

    public static Application c() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
