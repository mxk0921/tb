package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class d62 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map f17614a = new HashMap();
    public static final Map<Class, Constructor> b = new HashMap();

    static {
        t2o.a(676331521);
    }

    public static <T> T a(Class<? extends T> cls, Object... objArr) {
        Map map = f17614a;
        if (((HashMap) map).containsKey(cls)) {
            return (T) ((HashMap) map).get(cls);
        }
        Map<Class, Constructor> map2 = b;
        if (((HashMap) map2).containsKey(cls)) {
            Constructor constructor = (Constructor) ((HashMap) map2).get(cls);
            constructor.setAccessible(true);
            try {
                T t = (T) constructor.newInstance(objArr);
                ((HashMap) map).put(cls, t);
                return t;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InstantiationException e2) {
                e2.printStackTrace();
                return null;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return null;
            }
        } else {
            throw new IllegalStateException(cls.getName().concat("has no instance registed!"));
        }
    }

    public static <T> T b(Class<? extends T> cls, Object... objArr) {
        Map<Class, Constructor> map = b;
        if (((HashMap) map).containsKey(cls)) {
            Constructor constructor = (Constructor) ((HashMap) map).get(cls);
            constructor.setAccessible(true);
            try {
                return (T) constructor.newInstance(objArr);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InstantiationException e2) {
                e2.printStackTrace();
                return null;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return null;
            }
        } else {
            throw new IllegalStateException(cls.getName().concat("has no instance registed!"));
        }
    }

    public static <T> void c(Class<? super T> cls, Class<? extends T> cls2, Class<?>... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c6831a", new Object[]{cls, cls2, clsArr});
        } else if (!((HashMap) f17614a).containsKey(cls)) {
            try {
                ((HashMap) b).put(cls, cls2.getDeclaredConstructor(clsArr));
            } catch (NoSuchMethodException e) {
                Log.e("Flex", "no such constructor with parameterTypes:" + clsArr.toString());
                e.printStackTrace();
            }
        } else {
            throw new IllegalStateException(cls.getName().concat("instance can only regist once!"));
        }
    }

    public static <T> void d(Class<? super T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a07367", new Object[]{cls, t});
            return;
        }
        Map map = f17614a;
        if (!((HashMap) map).containsKey(cls)) {
            ((HashMap) map).put(cls, t);
            return;
        }
        throw new IllegalStateException(cls.getName().concat("instance can only regist once!"));
    }
}
