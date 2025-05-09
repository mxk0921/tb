package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rdu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f27304a = a.a();
    public final transient b b = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final AtomicInteger f27305a = new AtomicInteger(0);

        static {
            t2o.a(1018167306);
        }

        public static int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[0])).intValue();
            }
            return f27305a.incrementAndGet();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Method f27306a;
        public String b;
        public Object[] c;

        static {
            t2o.a(1018167307);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return " method: " + this.b;
        }
    }

    static {
        t2o.a(1018167305);
    }

    public static String c(Method method) {
        Class<?>[] parameterTypes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f25c6d0", new Object[]{method});
        }
        StringBuilder sb = new StringBuilder(method.getName());
        for (Class<?> cls : method.getParameterTypes()) {
            sb.append("_");
            sb.append(cls.getSimpleName());
        }
        return sb.toString();
    }

    public Object[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("60d4303b", new Object[]{this});
        }
        return this.b.c;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3726f8", new Object[]{this});
        }
        return c(this.b.f27306a);
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afa701da", new Object[]{this});
        }
        return this.b.f27306a.getDeclaringClass().getSimpleName();
    }

    public rdu e(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rdu) ipChange.ipc$dispatch("b3f2becd", new Object[]{this, objArr});
        }
        this.b.c = objArr;
        return this;
    }

    public rdu f(Method method) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rdu) ipChange.ipc$dispatch("4dbf47e6", new Object[]{this, method});
        }
        b bVar = this.b;
        bVar.f27306a = method;
        bVar.b = d() + "/" + b();
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Transaction: [id: " + this.f27304a + ", " + this.b + "]";
    }
}
