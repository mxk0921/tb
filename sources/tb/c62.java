package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class c62 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Object> f16887a = new HashMap();
    public static final Map<String, Class> b = new HashMap();

    static {
        t2o.a(947912753);
    }

    public static final <T> T getInstance(Class<T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("b9451627", new Object[]{cls}) : (T) getInstance(cls.getName(), cls);
    }

    public static void registerClass(Class... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("393b78e4", new Object[]{clsArr});
            return;
        }
        for (Class cls : clsArr) {
            Class<?>[] interfaces = cls.getInterfaces();
            if (interfaces == null || interfaces.length <= 0) {
                ((HashMap) b).put(cls.getSuperclass().getName(), cls);
            } else {
                for (Class<?> cls2 : interfaces) {
                    ((HashMap) b).put(cls2.getName(), cls);
                }
            }
        }
    }

    public static void registerInstance(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6de182fb", new Object[]{obj});
            return;
        }
        Class<?> cls = obj.getClass();
        Class<?>[] interfaces = cls.getInterfaces();
        if (interfaces == null || interfaces.length <= 0) {
            ((HashMap) b).put(cls.getSuperclass().getName(), cls);
            ((HashMap) f16887a).put(cls.getSuperclass().getName(), obj);
            return;
        }
        for (Class<?> cls2 : interfaces) {
            ((HashMap) b).put(cls2.getName(), cls);
            ((HashMap) f16887a).put(cls2.getName(), obj);
        }
    }

    public static final <T> T getInstance(String str, Class<T> cls) {
        T t = (T) ((HashMap) f16887a).get(str);
        if (t != null) {
            return t;
        }
        Class cls2 = (Class) ((HashMap) b).get(str);
        if (cls2 == null) {
            return null;
        }
        try {
            return cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            Log.e("bf", "get Instance exception ", e);
            return null;
        }
    }

    public static void registerClass(String str, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4036a97", new Object[]{str, cls});
        } else {
            ((HashMap) b).put(str, cls);
        }
    }

    public static void registerInstance(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec02a485", new Object[]{str, obj});
        } else {
            ((HashMap) f16887a).put(str, obj);
        }
    }
}
