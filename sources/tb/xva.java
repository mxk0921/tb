package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xva {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Object a(Class<?> cls, Object obj, String str) {
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
            field.setAccessible(true);
            return field.get(obj);
        } catch (Throwable th) {
            th.printStackTrace();
            throw new RuntimeException(th);
        }
    }

    public static Object b(Class<?> cls, String str, Object obj, Class<?>[] clsArr, Object[] objArr) throws RuntimeException {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method.invoke(obj, objArr);
        } catch (Throwable th) {
            th.printStackTrace();
            throw new RuntimeException(th);
        }
    }

    public static Object c(Class<?> cls, String str, Class<?>[] clsArr, Object[] objArr) throws RuntimeException {
        try {
            Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
            method.setAccessible(true);
            return method.invoke(null, objArr);
        } catch (Throwable th) {
            th.printStackTrace();
            throw new RuntimeException(th);
        }
    }
}
