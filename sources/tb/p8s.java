package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.DefaultAdapterImpl;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class p8s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TMSAdapterManager";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Class<?>, Object> f25951a = new ConcurrentHashMap();
    public static final Map<Class<?>, o8s<?>> b = new ConcurrentHashMap();
    public static TMSLogger.Adapter c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Class f25952a;

        public a(Class cls) {
            this.f25952a = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
            }
            Class<?> returnType = method.getReturnType();
            TMSLogger.b(p8s.TAG, "unimplemented proxy:" + this.f25952a.getSimpleName() + "." + method.getName());
            if (!returnType.isPrimitive()) {
                return null;
            }
            Class<?> cls = Boolean.TYPE;
            if (returnType == cls || returnType == cls) {
                return Boolean.FALSE;
            }
            return 0;
        }
    }

    static {
        t2o.a(839909758);
    }

    public static <T> T a(Class<? super T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d55288a7", new Object[]{cls});
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public static <T> T b(Class<? super T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ea288332", new Object[]{cls});
        }
        return (T) e(cls, true);
    }

    public static <T> T c(Class<? super T> cls) {
        DefaultAdapterImpl defaultAdapterImpl = (DefaultAdapterImpl) cls.getAnnotation(DefaultAdapterImpl.class);
        if (defaultAdapterImpl != null) {
            try {
                Class<?> cls2 = Class.forName(defaultAdapterImpl.value());
                if (cls.isAssignableFrom(cls2)) {
                    T t = (T) cls2.newInstance();
                    ((ConcurrentHashMap) f25951a).put(cls, t);
                    return t;
                }
                TMSLogger.b(TAG, "Default impl " + defaultAdapterImpl.value() + " is not instance of " + cls);
            } catch (Throwable th) {
                TMSLogger.b(TAG, "DefaultImpl instantiate exception!" + th);
            }
        }
        return null;
    }

    public static synchronized <T> T d(Class<? super T> cls) {
        synchronized (p8s.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("eb0921a6", new Object[]{cls});
            }
            Map<Class<?>, Object> map = f25951a;
            T t = (T) ((ConcurrentHashMap) map).get(cls);
            if (t != null) {
                return t;
            }
            o8s o8sVar = (o8s) ((ConcurrentHashMap) b).get(cls);
            if (o8sVar == null) {
                return null;
            }
            T t2 = (T) o8sVar.get();
            ((ConcurrentHashMap) map).put(cls, t2);
            return t2;
        }
    }

    public static <T> T e(Class<? super T> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3621f761", new Object[]{cls, new Boolean(z)});
        }
        T t = (T) ((ConcurrentHashMap) f25951a).get(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) d(cls);
        if (t2 != null) {
            return t2;
        }
        T t3 = (T) c(cls);
        if (t3 != null) {
            return t3;
        }
        if (z) {
            return null;
        }
        TMSLogger.b(TAG, "get unimplemented adapter with notNull mode! return with mock dynamic proxy");
        return (T) a(cls);
    }

    public static TMSLogger.Adapter f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSLogger.Adapter) ipChange.ipc$dispatch("dd2a0ec5", new Object[0]);
        }
        return c;
    }

    public static <T> T g(Class<? super T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("1c927020", new Object[]{cls});
        }
        return (T) e(cls, false);
    }

    public static <T> void h(Class<T> cls, o8s<T> o8sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bf4276", new Object[]{cls, o8sVar});
        } else if (!cls.isInterface() || !n8s.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(cls.getSimpleName().concat("must be interface and extend TMSAdapter!"));
        } else {
            TMSLogger.a(TAG, "register adapterFactory ".concat(cls.getSimpleName()));
            ((ConcurrentHashMap) b).put(cls, o8sVar);
        }
    }

    public static <T> void i(Class<? super T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c41f7ef", new Object[]{cls, t});
        } else if (!cls.isInterface() || !n8s.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(cls.getSimpleName().concat(" must be interface and extend TMSAdapter!"));
        } else {
            TMSLogger.a(TAG, "register Adapter ".concat(cls.getSimpleName()));
            ((ConcurrentHashMap) f25951a).put(cls, t);
        }
    }

    public static void j(TMSLogger.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e12dfcc", new Object[]{adapter});
        } else {
            c = adapter;
        }
    }
}
