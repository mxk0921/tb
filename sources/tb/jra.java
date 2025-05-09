package tb;

import android.os.Looper;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class jra {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Object f22173a;
    public static Object b;

    public static Object a() throws Exception {
        if (f22173a == null) {
            Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            declaredMethod.setAccessible(true);
            if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
                f22173a = declaredMethod.invoke(null, new Object[0]);
            }
        }
        return f22173a;
    }

    public static Object b(Object obj, String str) throws Exception {
        Object obj2 = b;
        if (obj2 != null) {
            return obj2;
        }
        if (fx4.m().k() != null) {
            Field field = fx4.m().k().getClass().getField("mLoadedApk");
            field.setAccessible(true);
            b = field.get(fx4.m().k());
        }
        Object obj3 = b;
        if (obj3 != null) {
            return obj3;
        }
        Field declaredField = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredField("mPackages");
        declaredField.setAccessible(true);
        WeakReference weakReference = (WeakReference) ((Map) declaredField.get(obj)).get(str);
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        b = weakReference.get();
        return weakReference.get();
    }
}
