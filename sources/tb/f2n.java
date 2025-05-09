package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f2n implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final Map<Class, Object> f18964a;

        static {
            t2o.a(1018167304);
            HashMap hashMap = new HashMap(7);
            f18964a = hashMap;
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT));
            hashMap.put(Character.TYPE, (char) 0);
        }

        public static /* synthetic */ Object a(Class cls, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("11e21c70", new Object[]{cls, obj});
            }
            return b(cls, obj);
        }

        public static Object b(Class cls, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("80148641", new Object[]{cls, obj});
            }
            if (obj == null) {
                Map<Class, Object> map = f18964a;
                if (((HashMap) map).containsKey(cls)) {
                    return ((HashMap) map).get(cls);
                }
            }
            return obj;
        }
    }

    static {
        t2o.a(1018167303);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
        }
        rdu rduVar = new rdu();
        rduVar.e(objArr);
        rduVar.f(method);
        return a.a(method.getReturnType(), rkf.b().c(rduVar));
    }
}
