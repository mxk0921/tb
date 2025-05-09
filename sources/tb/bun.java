package tb;

import androidx.collection.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bun {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, Method> f16641a = new LruCache<>(8);

    static {
        t2o.a(444596357);
    }

    public static Method a(Object obj, String str, Object... objArr) {
        Class<?> cls;
        Method[] declaredMethods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("dd589794", new Object[]{obj, str, objArr});
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        String str2 = cls.getName() + "_" + str;
        Method method = f16641a.get(str2);
        if (method != null) {
            return method;
        }
        while (cls != null) {
            for (Method method2 : cls.getDeclaredMethods()) {
                if (str.equals(method2.getName()) && c(method2.getGenericParameterTypes(), objArr)) {
                    method2.setAccessible(true);
                    f16641a.put(str2, method2);
                    return method2;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    public static Object b(Object obj, String str, Object... objArr) {
        try {
            Method a2 = a(obj, str, objArr);
            if (a2 == null) {
                return null;
            }
            if (obj instanceof Class) {
                return a2.invoke(null, objArr);
            }
            return a2.invoke(obj, objArr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean c(Type[] typeArr, Object... objArr) {
        Class cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fa284a3", new Object[]{typeArr, objArr})).booleanValue();
        }
        if (typeArr.length != objArr.length) {
            return false;
        }
        if (typeArr.length == 0) {
            return true;
        }
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            Type type = typeArr[i];
            if (type instanceof Class) {
                cls = (Class) type;
            } else {
                cls = null;
            }
            if (cls == null) {
                return true;
            }
            obj.getClass();
        }
        return true;
    }
}
