package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.adapter.DAIUserAdapter;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ld0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int USER_ADAPTER = 1;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, Class> f23267a = new HashMap();
    public static final Map<Integer, Object> b = new HashMap();

    static {
        t2o.a(1034944607);
    }

    public static <T> T a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4ca751af", new Object[]{new Integer(i)});
        }
        return (T) b(i);
    }

    public static Object b(int i) {
        Map<Integer, Object> map = b;
        Object obj = ((HashMap) map).get(Integer.valueOf(i));
        if (obj != null) {
            return obj;
        }
        Class cls = (Class) ((HashMap) f23267a).get(Integer.valueOf(i));
        if (cls == null) {
            return null;
        }
        try {
            Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            ((HashMap) map).put(Integer.valueOf(i), newInstance);
            return newInstance;
        } catch (Exception e) {
            kgh.d("AdapterBinder", "getInstance", e);
            return null;
        }
    }

    public static DAIUserAdapter c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DAIUserAdapter) ipChange.ipc$dispatch("b214ace0", new Object[0]);
        }
        return (DAIUserAdapter) a(1);
    }

    public static void d(int i, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("325af18d", new Object[]{new Integer(i), cls});
        } else {
            ((HashMap) f23267a).put(Integer.valueOf(i), cls);
        }
    }

    public static void e(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d99f8c", new Object[]{new Integer(i), obj});
            return;
        }
        ((HashMap) b).put(Integer.valueOf(i), obj);
        ((HashMap) f23267a).put(Integer.valueOf(i), obj.getClass());
    }

    public static void f(DAIUserAdapter dAIUserAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c6baee7", new Object[]{dAIUserAdapter});
        } else {
            e(1, dAIUserAdapter);
        }
    }

    public static void g(Class<? extends DAIUserAdapter> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a4fdd5", new Object[]{cls});
        } else {
            d(1, cls);
        }
    }
}
