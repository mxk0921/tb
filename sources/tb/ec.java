package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ec {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "api_framework";

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f18466a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ec f18467a = new ec();

        static {
            t2o.a(1018167298);
        }

        public static /* synthetic */ ec a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ec) ipChange.ipc$dispatch("9407547f", new Object[0]);
            }
            return f18467a;
        }
    }

    static {
        t2o.a(1018167297);
    }

    public static ec c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ec) ipChange.ipc$dispatch("94993fa4", new Object[0]);
        }
        return a.a();
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        w8m.b().a(context.getApplicationContext());
        rkf.b().a();
    }

    public <T> T a(Class<T> cls) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bb314f9b", new Object[]{this, cls});
        }
        if (cls.isInterface()) {
            synchronized (this.f18466a) {
                try {
                    t = (T) ((HashMap) this.f18466a).get(cls);
                    if (t == null) {
                        t = (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new f2n());
                        ((HashMap) this.f18466a).put(cls, t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return t;
        }
        throw new IllegalArgumentException("only accept interface: " + cls);
    }
}
