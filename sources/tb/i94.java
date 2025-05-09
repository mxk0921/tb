package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class i94 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<m94> f21166a;
    public final k94 b;
    public final yzm c;
    public final Context d;
    public final AtomicInteger e;

    static {
        t2o.a(768606217);
    }

    public i94(Context context, k94 k94Var) {
        this(context, new yum(), k94Var);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b24e55ce", new Object[]{this})).intValue();
        }
        int i = this.e.get();
        if (i == 0 || i < this.b.d) {
            return this.e.incrementAndGet();
        }
        vhh.a("CompileContext", "reached retry time limitation, discard");
        return -1;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb993f2f", new Object[]{this})).intValue();
        }
        return this.e.get();
    }

    public k94 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k94) ipChange.ipc$dispatch("5901d6ab", new Object[]{this});
        }
        return this.b;
    }

    public Context d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("4d41f905", new Object[]{this});
        }
        return this.d;
    }

    public yzm e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yzm) ipChange.ipc$dispatch("3a427db", new Object[]{this});
        }
        return this.c;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7074a2b1", new Object[]{this});
        } else {
            this.f21166a.get().a(this);
        }
    }

    public i94 g(m94 m94Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i94) ipChange.ipc$dispatch("9e7de908", new Object[]{this, m94Var});
        }
        vhh.a("CompileContext", "state machine " + this.f21166a.getAndSet(m94Var).getName() + " -> " + m94Var.getName());
        return this;
    }

    public i94(Context context, m94 m94Var, k94 k94Var) {
        AtomicReference<m94> atomicReference = new AtomicReference<>(null);
        this.f21166a = atomicReference;
        this.e = new AtomicInteger(0);
        this.b = k94Var;
        sng.a(atomicReference, null, m94Var);
        this.c = new zzm(context);
        this.d = context;
    }
}
