package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbicontext.TBILifecycleManager;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class jfr<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final AtomicInteger h = new AtomicInteger(1);

    /* renamed from: a  reason: collision with root package name */
    public Context f21971a;
    public final gfr b;
    public final hfr c;
    public final bgr d;
    public final pfr e;
    public final tfr f;
    public final TBILifecycleManager g;
    public final yfr j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(803209246);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(803209245);
    }

    public jfr() {
        this(String.valueOf(h.getAndIncrement()));
    }

    public final gfr a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfr) ipChange.ipc$dispatch("cf236d49", new Object[]{this});
        }
        return this.b;
    }

    public final hfr b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hfr) ipChange.ipc$dispatch("e92e221b", new Object[]{this});
        }
        return this.c;
    }

    public final Context c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        Context context = this.f21971a;
        if (context != null) {
            return context;
        }
        ckf.y("context");
        throw null;
    }

    public abstract kfr<T> d();

    public final pfr e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pfr) ipChange.ipc$dispatch("45b4db29", new Object[]{this});
        }
        return this.e;
    }

    public final tfr f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tfr) ipChange.ipc$dispatch("8672559b", new Object[]{this});
        }
        return this.f;
    }

    public final TBILifecycleManager g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBILifecycleManager) ipChange.ipc$dispatch("cb668f3b", new Object[]{this});
        }
        return this.g;
    }

    public final bgr h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bgr) ipChange.ipc$dispatch("e85b727b", new Object[]{this});
        }
        return this.d;
    }

    public final void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
            return;
        }
        ckf.g(context, "<set-?>");
        this.f21971a = context;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.c.f();
        this.d.e();
        this.e.e();
        this.j.a();
        this.b.c();
        this.f.d();
        d().d();
    }

    public jfr(String str) {
        ckf.g(str, hxj.UNIQID);
        this.b = new gfr();
        this.c = new hfr();
        this.d = new bgr();
        this.e = new pfr();
        this.f = new tfr();
        this.j = new yfr();
        this.g = new TBILifecycleManager();
    }
}
