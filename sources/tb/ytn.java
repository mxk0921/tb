package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ytn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317422);
    }

    public static Method a(String str, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("ca205709", new Object[]{str, cls});
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Exception unused) {
            tfs.d("failed to getMethod " + str);
            return null;
        }
    }

    public static Object b(String str, Object obj) {
        if (obj == null || str == null) {
            return null;
        }
        try {
            Field declaredField = obj.getClass().getSuperclass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Exception unused) {
            tfs.d("failed to getParentField ".concat(str));
            return null;
        }
    }

    public static Method c(String str, Class cls, Class<?>... clsArr) {
        Method method;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("58c6a10a", new Object[]{str, cls, clsArr});
        }
        try {
            method = cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        if (method != null) {
            return method;
        }
        try {
            method = cls.getDeclaredMethod(str, clsArr);
            method.setAccessible(true);
            return method;
        } catch (Exception unused2) {
            tfs.d("failed to getMethod " + str);
            return method;
        }
    }

    public static Object d(String str, Class cls) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            tfs.d("failed to getStaticField " + str);
            return null;
        }
    }

    public static void e(String str, Object obj, Object obj2) {
        if (obj != null && str != null) {
            try {
                Field declaredField = obj.getClass().getDeclaredField(str);
                declaredField.setAccessible(true);
                declaredField.set(obj, obj2);
            } catch (Exception unused) {
                tfs.d("failed to setField ".concat(str));
            }
        }
    }

    public static void f(Class cls, String str, Object obj, Object obj2) {
        if (obj != null && str != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                declaredField.set(obj, obj2);
            } catch (Exception unused) {
                tfs.d("failed to setField ".concat(str));
            }
        }
    }
}
