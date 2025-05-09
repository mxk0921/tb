package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import java.util.HashMap;
import java.util.Map;
import tb.o02;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tnl<DS extends o02<? extends BaseSearchResult, ?>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DS f28825a;
    public DS b;
    public String e;
    public final tnd f;
    public bsi h;
    public final qj9 c = new qj9();
    public final Map<String, Object> d = new HashMap();
    public final Map<gy, bsi> g = new HashMap();

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
                j8mVar.b(tnl.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            tnl.this.g().postEvent(tnl.a(tnl.this));
            tnl.this.g().getCore().i().k(tnl.a(tnl.this));
            xno srpLifeCycleWatcher = tnl.b(tnl.this).getSrpLifeCycleWatcher();
            if (srpLifeCycleWatcher != null) {
                srpLifeCycleWatcher.h();
            }
        }
    }

    static {
        t2o.a(993001700);
    }

    public tnl(DS ds, tnd tndVar) {
        this.e = null;
        this.f28825a = ds;
        this.b = ds;
        this.f = tndVar;
        if (ds.getBundleUrl() != null) {
            this.e = ds.getBundleUrl();
        }
        ds.c().p(new a());
    }

    public static /* synthetic */ qj9 a(tnl tnlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qj9) ipChange.ipc$dispatch("b852211e", new Object[]{tnlVar});
        }
        return tnlVar.c;
    }

    public static /* synthetic */ o02 b(tnl tnlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o02) ipChange.ipc$dispatch("d2594319", new Object[]{tnlVar});
        }
        return tnlVar.f28825a;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee20482", new Object[]{this});
        }
        return this.e;
    }

    public bsi d(com.taobao.android.meta.data.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bsi) ipChange.ipc$dispatch("69b9807d", new Object[]{this, aVar});
        }
        bsi bsiVar = (bsi) ((HashMap) this.g).get(aVar);
        if (bsiVar == null) {
            return this.h;
        }
        return bsiVar;
    }

    public DS e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DS) ((o02) ipChange.ipc$dispatch("23e2536f", new Object[]{this}));
        }
        return this.b;
    }

    public qj9 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qj9) ipChange.ipc$dispatch("a23f13e4", new Object[]{this});
        }
        return this.c;
    }

    public DS g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DS) ((o02) ipChange.ipc$dispatch("feccab72", new Object[]{this}));
        }
        return this.f28825a;
    }

    public Object h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a9af03a", new Object[]{this, str});
        }
        return ((HashMap) this.d).get(str);
    }

    public boolean i(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("705b3d16", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Object obj = ((HashMap) this.d).get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return z;
    }

    public tnd j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tnd) ipChange.ipc$dispatch("1a30297d", new Object[]{this});
        }
        return this.f;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7651e483", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b7bbf3f", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void m(bsi bsiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ca7f4c9", new Object[]{this, bsiVar});
        } else {
            this.h = bsiVar;
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f9c479c", new Object[]{this, str});
            return;
        }
        this.e = str;
        if (this.f28825a.getBundleUrl() == null) {
            this.f28825a.setBundleUrl(str);
        }
    }

    public void o(o02<? extends BaseSearchResult, ?> o02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfdfb4d", new Object[]{this, o02Var});
        } else {
            this.b = o02Var;
        }
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9bada65", new Object[]{this, new Boolean(z)});
        }
    }

    public void q(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a45b89e0", new Object[]{this, str, obj});
        } else {
            ((HashMap) this.d).put(str, obj);
        }
    }

    public void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29d568d", new Object[]{this, new Boolean(z)});
        }
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a68a52", new Object[]{this});
        } else if (!this.c.f()) {
            this.c.g(true);
            if (this.c.e() != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                g().c().l().c("XSPerfTimestamp", "FirstCellRender: %d", Long.valueOf(currentTimeMillis));
                this.c.h(currentTimeMillis);
                if (((BaseSearchResult) this.f28825a.getTotalSearchResult()) != null) {
                    this.c.j(this.f28825a.getTrackingPageName());
                } else {
                    this.c.j("");
                }
                this.c.i(this.f28825a.getTrackingName());
                new Handler(Looper.getMainLooper()).post(new b());
            }
        }
    }
}
