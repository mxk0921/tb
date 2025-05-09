package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cdf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mdp extends he1 implements adf<Object> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final xdp e;
    public final wnc f = (wnc) d62.b(wnc.class, "ServiceInstantiator");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements cdf.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.mdp$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0996a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Object f23975a;

            public RunnableC0996a(Object obj) {
                this.f23975a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    mdp.d(mdp.this).e().b(this.f23975a, mdp.d(mdp.this).a());
                }
            }
        }

        public a() {
        }

        @Override // tb.cdf.b
        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f954954", new Object[]{this, obj});
                return;
            }
            mdp.c(mdp.this).c("ServiceInstantiator  Instance %s created onFinished", obj);
            if (mdp.d(mdp.this).e() != null && obj != null) {
                if (mdp.d(mdp.this).i() != null) {
                    mdp.d(mdp.this).i().execute(new RunnableC0996a(obj));
                } else {
                    mdp.d(mdp.this).e().b(obj, mdp.d(mdp.this).a());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements cdf.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f23977a;

            public a(String str) {
                this.f23977a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    mdp.d(mdp.this).e().a(this.f23977a, mdp.d(mdp.this).a());
                }
            }
        }

        public b() {
        }

        @Override // tb.cdf.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ef4d4afc", new Object[]{this, str});
                return;
            }
            mdp.c(mdp.this).c("ServiceInstantiator", "Instance %s created failed", mdp.d(mdp.this).b());
            if (mdp.d(mdp.this).e() == null) {
                return;
            }
            if (mdp.d(mdp.this).i() != null) {
                mdp.d(mdp.this).i().execute(new a(str));
            } else {
                mdp.d(mdp.this).e().a(str, mdp.d(mdp.this).a());
            }
        }
    }

    static {
        t2o.a(676331620);
        t2o.a(676331614);
    }

    public mdp(xdp xdpVar) {
        this.e = xdpVar;
    }

    public static /* synthetic */ wnc c(mdp mdpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wnc) ipChange.ipc$dispatch("726e95e6", new Object[]{mdpVar});
        }
        return mdpVar.f;
    }

    public static /* synthetic */ xdp d(mdp mdpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xdp) ipChange.ipc$dispatch("51ca6a67", new Object[]{mdpVar});
        }
        return mdpVar.e;
    }

    public static /* synthetic */ Object ipc$super(mdp mdpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/split/instantiation/ServiceInstantiator");
    }

    @Override // tb.adf
    public Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d3c58656", new Object[]{this});
        }
        try {
            cdf c = this.c.c();
            c.c = this.e.c();
            c.b = this.e.d();
            c.i = this;
            c.g = this.e.k();
            c.j = this.e.j();
            c.d = this.e.h();
            c.e = new a();
            c.f = new b();
            this.c.a(c);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
