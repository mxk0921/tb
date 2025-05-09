package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import tb.o02;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class acx<DS extends o02<? extends BaseSearchResult, ?>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tnl<DS> f15669a;
    public final DS b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements h9m {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.h9m
        public void a(j8m j8mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c23f666", new Object[]{this, j8mVar});
            } else {
                j8mVar.c(acx.this);
            }
        }
    }

    static {
        t2o.a(993001703);
    }

    public acx(tnl<DS> tnlVar, DS ds) {
        this.f15669a = tnlVar;
        this.b = ds;
        ds.c().p(new a());
        String c = tnlVar.c();
        if (ds.getBundleUrl() == null) {
            ds.setBundleUrl(c);
        }
    }

    public DS a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DS) ((o02) ipChange.ipc$dispatch("23e2536f", new Object[]{this}));
        }
        return this.f15669a.e();
    }

    public DS b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DS) ((o02) ipChange.ipc$dispatch("feccab72", new Object[]{this}));
        }
        return this.f15669a.g();
    }

    public <T extends bsi> T c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((bsi) ipChange.ipc$dispatch("3ffbf943", new Object[]{this}));
        }
        return (T) this.f15669a.d((com.taobao.android.meta.data.a) this.b);
    }

    public tnl<DS> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tnl) ipChange.ipc$dispatch("1c77a5ac", new Object[]{this});
        }
        return this.f15669a;
    }

    public DS e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DS) ((o02) ipChange.ipc$dispatch("ffa3208a", new Object[]{this}));
        }
        return this.b;
    }

    public tnd f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tnd) ipChange.ipc$dispatch("1a30297d", new Object[]{this});
        }
        return this.f15669a.j();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb2d0d5b", new Object[]{this})).booleanValue();
        }
        if (this.b == this.f15669a.e()) {
            return true;
        }
        return false;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7651e483", new Object[]{this})).booleanValue();
        }
        return this.f15669a.k();
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b7bbf3f", new Object[]{this})).booleanValue();
        }
        return this.f15669a.l();
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33aa83c8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f15669a.p(z);
        this.f15669a.r(z);
    }

    public void k(bsi bsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c5f541", new Object[]{this, bsiVar});
        } else {
            this.f15669a.m(bsiVar);
        }
    }
}
