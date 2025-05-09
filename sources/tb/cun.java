package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class cun {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Method> f17331a = new ConcurrentHashMap();

    static {
        t2o.a(989855823);
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static String b(Class<?> cls, String str, Class<?>[] clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("522dc780", new Object[]{cls, str, clsArr});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append("#");
        sb.append(str);
        sb.append("#");
        for (Class<?> cls2 : clsArr) {
            sb.append(cls2.getName());
            sb.append("-");
        }
        return sb.toString();
    }

    public static Method a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("db244dd0", new Object[]{cls, str, clsArr});
        }
        String b = b(cls, str, clsArr);
        Map<String, Method> map = f17331a;
        Method method = (Method) ((ConcurrentHashMap) map).get(b);
        if (method == null) {
            synchronized (map) {
                try {
                    method = (Method) ((ConcurrentHashMap) map).get(b);
                    if (method == null) {
                        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                        if (!declaredMethod.isAccessible()) {
                            declaredMethod.setAccessible(true);
                        }
                        method = declaredMethod;
                    }
                    ((ConcurrentHashMap) map).put(b, method);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return method;
    }
}
