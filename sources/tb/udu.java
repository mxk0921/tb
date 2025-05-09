package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.api.AbsServiceImpl;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class udu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, a> f29315a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, Method> f29316a = new HashMap();
        public final AbsServiceImpl b;

        static {
            t2o.a(1018167309);
        }

        public a(Class<?> cls, Class<? extends AbsServiceImpl> cls2) {
            Method[] declaredMethods;
            for (Method method : cls.getDeclaredMethods()) {
                this.f29316a.put(rdu.c(method), method);
            }
            try {
                this.b = (AbsServiceImpl) cls2.newInstance();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public Object a(rdu rduVar) throws Throwable {
            return ((Method) ((HashMap) this.f29316a).get(rduVar.b())).invoke(this.b, rduVar.a());
        }
    }

    static {
        t2o.a(1018167308);
    }

    public udu() {
        for (Map.Entry<Class<?>, Class<? extends AbsServiceImpl>> entry : w8m.b().d().entrySet()) {
            b(entry.getKey(), entry.getValue());
        }
        ((HashMap) this.f29315a).size();
    }

    public Object a(rdu rduVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ddfdced4", new Object[]{this, rduVar});
        }
        a aVar = (a) ((HashMap) this.f29315a).get(rduVar.d());
        if (aVar == null) {
            Log.e(ec.LOG_TAG, "service not found, transaction= " + rduVar);
            return null;
        }
        try {
            rduVar.toString();
            return aVar.a(rduVar);
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e(ec.LOG_TAG, "execute " + rduVar + " error", th);
            return null;
        }
    }

    public final void b(Class<?> cls, Class<? extends AbsServiceImpl> cls2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfe8a59c", new Object[]{this, cls, cls2});
            return;
        }
        cls.getSimpleName();
        cls2.getCanonicalName();
        ((HashMap) this.f29315a).put(cls.getSimpleName(), new a(cls, cls2));
    }
}
