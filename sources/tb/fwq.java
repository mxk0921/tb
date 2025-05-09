package tb;

import com.alipay.android.msp.constants.MspFlybirdDefine;
import de.greenrobot.event.EventBusException;
import de.greenrobot.event.ThreadMode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class fwq {
    public static final Map<String, List<ewq>> b = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Class<?>> f19581a = new ConcurrentHashMap();

    public fwq(List<Class<?>> list) {
        if (list != null) {
            for (Class<?> cls : list) {
                this.f19581a.put(cls, cls);
            }
        }
    }

    public final void a(List<ewq> list, HashMap<String, Class> hashMap, StringBuilder sb, Method[] methodArr) {
        ThreadMode c;
        for (Method method : methodArr) {
            String name = method.getName();
            if (name.startsWith(MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT)) {
                int modifiers = method.getModifiers();
                Class<?> declaringClass = method.getDeclaringClass();
                if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1 && (c = c(declaringClass, method, name)) != null) {
                        Class<?> cls = parameterTypes[0];
                        sb.setLength(0);
                        sb.append(name);
                        sb.append('>');
                        sb.append(cls.getName());
                        String sb2 = sb.toString();
                        Class put = hashMap.put(sb2, declaringClass);
                        if (put == null || put.isAssignableFrom(declaringClass)) {
                            list.add(new ewq(method, c, cls));
                        } else {
                            hashMap.put(sb2, put);
                        }
                    }
                } else if (!((ConcurrentHashMap) this.f19581a).containsKey(declaringClass)) {
                    hj8 hj8Var = hj8.p;
                    Objects.toString(declaringClass);
                }
            }
        }
    }

    public List<ewq> b(Class<?> cls) {
        List<ewq> list;
        String name = cls.getName();
        Map<String, List<ewq>> map = b;
        synchronized (map) {
            list = (List) ((HashMap) map).get(name);
        }
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        HashMap<String, Class> hashMap = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            String name2 = cls2.getName();
            if (name2.startsWith("java.") || name2.startsWith("javax.") || name2.startsWith("android.")) {
                break;
            }
            try {
                a(arrayList, hashMap, sb, cls2.getDeclaredMethods());
            } catch (Throwable th) {
                th.printStackTrace();
                Method[] methods = cls.getMethods();
                arrayList.clear();
                hashMap.clear();
                a(arrayList, hashMap, sb, methods);
            }
        }
        if (!arrayList.isEmpty()) {
            Map<String, List<ewq>> map2 = b;
            synchronized (map2) {
                ((HashMap) map2).put(name, arrayList);
            }
            return arrayList;
        }
        throw new EventBusException("Subscriber " + cls + " has no public methods called onEvent");
    }

    public final ThreadMode c(Class<?> cls, Method method, String str) {
        String substring = str.substring(7);
        if (substring.length() == 0) {
            return ThreadMode.PostThread;
        }
        if (substring.equals("MainThread")) {
            return ThreadMode.MainThread;
        }
        if (substring.equals("BackgroundThread")) {
            return ThreadMode.BackgroundThread;
        }
        if (substring.equals("Async")) {
            return ThreadMode.Async;
        }
        if (((ConcurrentHashMap) this.f19581a).containsKey(cls)) {
            return null;
        }
        throw new EventBusException("Illegal onEvent method, check for typos: " + method);
    }
}
