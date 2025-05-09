package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class yff {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final List<u7<?>> f32044a = new ArrayList();
    public final jmi b;
    public final fll c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963213);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(689963212);
    }

    public yff(jmi jmiVar, fll fllVar) {
        ckf.g(jmiVar, "messageCenter");
        ckf.g(fllVar, "pageBaseInfoManager");
        this.b = jmiVar;
        this.c = fllVar;
    }

    public final void a(u7<?> u7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("482d805e", new Object[]{this, u7Var});
            return;
        }
        ckf.g(u7Var, "interactPageAdapter");
        ((ArrayList) this.f32044a).add(u7Var);
    }

    public final void b(kxd kxdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19855b82", new Object[]{this, kxdVar});
            return;
        }
        ckf.g(kxdVar, "serviceDelegate");
        vgh.c(this, "InteractTabAdapterManager", "页面创建的时机");
        Iterator it = ((ArrayList) this.f32044a).iterator();
        while (it.hasNext()) {
            this.b.c((u7) it.next());
        }
        this.c.a(kxdVar);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5077dfb2", new Object[]{this});
            return;
        }
        vgh.c(this, "InteractTabAdapterManager", "页面销毁的时机");
        Iterator it = ((ArrayList) this.f32044a).iterator();
        while (it.hasNext()) {
            this.b.f((u7) it.next());
        }
        this.c.b();
    }
}
