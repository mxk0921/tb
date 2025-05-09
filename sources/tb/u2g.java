package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class u2g<T, TC> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static u2g<?, ?> b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, t2g<T, TC>> f29087a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1002438715);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final <T, TC> u2g<T, TC> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (u2g) ipChange.ipc$dispatch("9634a35e", new Object[]{this});
            }
            if (u2g.a() == null) {
                u2g.b(new u2g(null));
            }
            u2g<T, TC> a2 = u2g.a();
            ckf.e(a2, "null cannot be cast to non-null type com.taobao.kmp.kernel.arch.kernel.multi_instance_manage.KernelMultiInstanceService<T of com.taobao.kmp.kernel.arch.kernel.multi_instance_manage.KernelMultiInstanceService.Companion.getService, TC of com.taobao.kmp.kernel.arch.kernel.multi_instance_manage.KernelMultiInstanceService.Companion.getService>");
            return a2;
        }

        public a() {
        }
    }

    static {
        t2o.a(1002438714);
    }

    public /* synthetic */ u2g(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ u2g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u2g) ipChange.ipc$dispatch("7acaec18", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ void b(u2g u2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7faf80e", new Object[]{u2gVar});
        } else {
            b = u2gVar;
        }
    }

    public static /* synthetic */ t2g e(u2g u2gVar, Object obj, Object obj2, boolean z, int i, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t2g) ipChange.ipc$dispatch("918dbc87", new Object[]{u2gVar, obj, obj2, new Boolean(z), new Integer(i), obj3});
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return u2gVar.d(obj, obj2, z);
    }

    public final t2g<T, TC> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t2g) ipChange.ipc$dispatch("f6e1b651", new Object[]{this, str});
        }
        return (t2g) ((LinkedHashMap) this.f29087a).get(str);
    }

    public final t2g<T, TC> d(T t, TC tc, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t2g) ipChange.ipc$dispatch("d67878e9", new Object[]{this, t, tc, new Boolean(z)});
        }
        t2g<T, TC> t2gVar = new t2g<>(t, tc);
        t2gVar.c(z);
        this.f29087a.put(t2gVar.a(), t2gVar);
        return t2gVar;
    }

    public final t2g<T, TC> f(t2g<T, TC> t2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t2g) ipChange.ipc$dispatch("c74c24b7", new Object[]{this, t2gVar});
        }
        ckf.g(t2gVar, "description");
        return this.f29087a.remove(t2gVar.a());
    }

    public u2g() {
        this.f29087a = new LinkedHashMap();
    }
}
