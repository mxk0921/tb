package tb;

import android.app.Activity;
import android.app.Application;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.alibaba.android.icart.core.view.ViewManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragmentProxy;
import com.taobao.android.icart.weex.call.CartMegaManager;
import com.taobao.android.icart.weex.call.callback.CartCallbackManager;
import com.taobao.android.megadesign.view.LoadingView;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import java.util.Map;
import kotlin.Metadata;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class gkj extends sv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final f8e f20057a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ zxb f20058a;
        public final /* synthetic */ String b;
        public final /* synthetic */ kmb c;

        public a(zxb zxbVar, String str, kmb kmbVar) {
            this.f20058a = zxbVar;
            this.b = str;
            this.c = kmbVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/call/NativeInstanceWrapper$changeTab$1$1");
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            this.f20058a.W(this.b);
            ViewManager Z = this.c.e();
            if (Z != null) {
                Z.D();
            }
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
            } else {
                this.c.e().K(0);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;

        public b(JSONObject jSONObject) {
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                gkj.s(gkj.this, this.b);
            }
        }
    }

    static {
        t2o.a(478150926);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkj(f8e f8eVar) {
        super(CartMegaManager.InstanceType.NATIVE);
        ckf.g(f8eVar, "cartVEngine");
        this.f20057a = f8eVar;
    }

    public static /* synthetic */ Object ipc$super(gkj gkjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/call/NativeInstanceWrapper");
    }

    public static final /* synthetic */ void s(gkj gkjVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79062c40", new Object[]{gkjVar, jSONObject});
        } else {
            gkjVar.t(jSONObject);
        }
    }

    @Override // tb.sv
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df5fae55", new Object[]{this});
        }
    }

    @Override // tb.sv
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f51c4d6", new Object[]{this});
        }
    }

    @Override // tb.sv
    public void c(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce60f61e", new Object[]{this, str, str2, str3, jSONObject});
            return;
        }
        ckf.g(str, "instanceId");
        ckf.g(str2, "callbackID");
        ckf.g(str3, "method");
        ckf.g(jSONObject, "params");
        if (ckf.b("changeTab", str3)) {
            pav.i(new b(jSONObject), 0L);
        }
    }

    @Override // tb.sv
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf0c8533", new Object[]{this, str});
        } else {
            ckf.g(str, "reason");
        }
    }

    @Override // tb.sv
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55aa027d", new Object[]{this, str});
        } else {
            ckf.g(str, "reason");
        }
    }

    @Override // tb.sv
    public Activity f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.f20057a.getActivity();
    }

    @Override // tb.sv
    public CartCallbackManager g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartCallbackManager) ipChange.ipc$dispatch("dc2dd50", new Object[]{this});
        }
        return null;
    }

    @Override // tb.sv
    public Fragment h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("34dee721", new Object[]{this});
        }
        kmb g = this.f20057a.g();
        ckf.f(g, "cartVEngine.cartPresenter");
        return g.R();
    }

    @Override // tb.sv
    public LoadingView i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoadingView) ipChange.ipc$dispatch("87349190", new Object[]{this});
        }
        Application application = Globals.getApplication();
        ckf.f(application, "Globals.getApplication()");
        return new LoadingView(application);
    }

    @Override // tb.sv
    public ViewGroup j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("26a69771", new Object[]{this});
        }
        kmb g = this.f20057a.g();
        ckf.f(g, "cartVEngine.cartPresenter");
        ViewManager Z = g.e();
        ckf.f(Z, "cartVEngine.cartPresenter.viewManager");
        ViewGroup o0 = Z.o0();
        ckf.f(o0, "cartVEngine.cartPresenter.viewManager.rootView");
        return o0;
    }

    @Override // tb.sv
    public plq k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (plq) ipChange.ipc$dispatch("fc180a65", new Object[]{this});
        }
        return new plq();
    }

    @Override // tb.sv
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb742a89", new Object[]{this})).booleanValue();
        }
        kmb g = this.f20057a.g();
        ckf.f(g, "cartVEngine.cartPresenter");
        ViewManager Z = g.e();
        ckf.f(Z, "cartVEngine.cartPresenter.viewManager");
        return Z.y();
    }

    @Override // tb.sv
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2d6a38e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.sv
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78e360ef", new Object[]{this})).booleanValue();
        }
        Activity activity = this.f20057a.getActivity();
        TBMainHost b2 = TBMainHost.b();
        ckf.f(b2, "TBMainHost.get()");
        return ckf.b(activity, b2.getContext());
    }

    @Override // tb.sv
    public void o(BaseICartFragmentProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5d33775", new Object[]{this, aVar});
        } else {
            ckf.g(aVar, "callback");
        }
    }

    @Override // tb.sv
    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f84d2b7", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.sv
    public void q(plq plqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f239d3", new Object[]{this, plqVar});
        } else {
            ckf.g(plqVar, "stdPopPanel");
        }
    }

    @Override // tb.sv
    public void r(BaseICartFragmentProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11553c8e", new Object[]{this, aVar});
        } else {
            ckf.g(aVar, "callback");
        }
    }

    public final void t(JSONObject jSONObject) {
        kmb g;
        zxb P;
        String A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800ff4a4", new Object[]{this, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString("filterItem");
            if (string != null && (g = this.f20057a.g()) != null && (P = g.d()) != null && (A = P.A()) != null) {
                zxb P2 = g.d();
                P2.W(string);
                IDMComponent u = P2.u("tabCard");
                if (u != null) {
                    hav.d("NativeInstanceWrapper", "changeTab");
                    ViewManager Z = g.e();
                    if (Z != null) {
                        Z.z0(u);
                    }
                    g.i0(true, null, new a(P2, A, g));
                    xhv xhvVar = xhv.INSTANCE;
                }
            }
        } catch (Throwable th) {
            hav.a("UltronCatchException", th.getMessage());
            hav.a("NativeInstanceWrapper", "error:" + th);
            xhv xhvVar2 = xhv.INSTANCE;
        }
    }
}
