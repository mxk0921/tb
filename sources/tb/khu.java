package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.alibaba.android.triver.base.api.ITriverRemoteProxy;
import com.alibaba.triver.base.taobao.TriverRemoteManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import kotlin.Result;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class khu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements ITriverRemoteProxy.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d1a<xhv> f22677a;
        public final /* synthetic */ d1a<xhv> b;

        public a(d1a<xhv> d1aVar, d1a<xhv> d1aVar2) {
            this.f22677a = d1aVar;
            this.b = d1aVar2;
        }

        @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            this.b.invoke();
            npp.Companion.b(ckf.p("tRiver remote init failed : ", str));
        }

        @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                this.f22677a.invoke();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements ITriverRemoteProxy.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g1a<Integer, xhv> f22678a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(g1a<? super Integer, xhv> g1aVar) {
            this.f22678a = g1aVar;
        }

        @Override // com.alibaba.android.triver.base.api.ITriverRemoteProxy.b
        public final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e93d99cc", new Object[]{this, new Integer(i)});
                return;
            }
            g1a<Integer, xhv> g1aVar = this.f22678a;
            if (g1aVar != null) {
                g1aVar.invoke(Integer.valueOf(i));
            }
        }
    }

    static {
        t2o.a(766509555);
    }

    public static final void a(Activity activity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3799cd29", new Object[]{activity, new Boolean(z)});
            return;
        }
        ckf.g(activity, "<this>");
        try {
            Result.m1108constructorimpl(Boolean.valueOf(new r2r(activity).a(z)));
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
        }
    }

    public static final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3cec5212", new Object[0])).intValue();
        }
        chb g = c21.g();
        ckf.f(g, "getAppPreferences()");
        return g.getInt("deviceLevel", -1);
    }

    public static final String c(Context context) {
        sih loginContext;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bdba789", new Object[]{context});
        }
        ckf.g(context, "<this>");
        rid a2 = nyn.a(Mtop.instance(Mtop.Id.INNER, context));
        if (a2 == null || (loginContext = a2.getLoginContext()) == null || (str = loginContext.b) == null) {
            return "defaultUser";
        }
        return str;
    }

    public static final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7734a6ed", new Object[0])).booleanValue();
        }
        if (b() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("522b454b", new Object[0])).booleanValue();
        }
        if (b() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("984fc4a0", new Object[0])).booleanValue();
        }
        if (b() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("484dd9e3", new Object[0])).booleanValue();
        }
        return new TriverRemoteManager().hasInstalled(ITriverRemoteProxy.DependenceMode.TRIVER_AND_UC);
    }

    public static final void h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12ecc5ed", new Object[]{context, str});
            return;
        }
        ckf.g(context, "<this>");
        if (str != null) {
            npp.Companion.f(ckf.p(" navTo ", str));
            Nav.from(context).toUri(str);
        }
    }

    public static final void i(String str, String str2, Context context, d1a<xhv> d1aVar, d1a<xhv> d1aVar2, g1a<? super Integer, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb9bba5d", new Object[]{str, str2, context, d1aVar, d1aVar2, g1aVar});
            return;
        }
        ckf.g(str, "bizType");
        ckf.g(context, "context");
        ckf.g(d1aVar, "initSuccess");
        ckf.g(d1aVar2, "initFailed");
        TriverRemoteManager.getInstance().install(str, str2, ITriverRemoteProxy.DependenceMode.TRIVER_AND_UC, context, new a(d1aVar, d1aVar2), new b(g1aVar));
    }

    public static final void j(Context context) {
        Object obj;
        ckf.g(context, "context");
        Class<?> y = r54.y("com.alibaba.triver.TRiverSDK");
        if (y != null) {
            try {
                obj = Result.m1108constructorimpl(y.getDeclaredMethod("init", Application.class).invoke(null, context.getApplicationContext()));
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(kotlin.b.a(th));
            }
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.b(ckf.p("try to init triver error : ", th2));
            }
        }
    }
}
