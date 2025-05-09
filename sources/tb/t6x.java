package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragment;
import com.taobao.android.icart.BaseICartFragmentProxy;
import com.taobao.android.icart.weex.call.CartMegaManager;
import com.taobao.android.icart.weex.call.callback.CartCallbackManager;
import com.taobao.android.megadesign.view.LoadingView;
import kotlin.Metadata;
import tb.ne3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class t6x extends sv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f28515a;
    public plq b = new plq();
    public final CartCallbackManager c;
    public volatile boolean d;
    public final j2e e;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public a(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseICartFragment baseICartFragment;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BaseICartFragmentProxy i = t6x.s(t6x.this).i();
            if (i != null) {
                baseICartFragment = i.g();
            } else {
                baseICartFragment = null;
            }
            if (baseICartFragment != null) {
                baseICartFragment.u2(BaseICartFragment.b.c(baseICartFragment));
            }
            ne3.c.e(ne3.Companion, "DowngradeH5", this.b, 0.0f, 4, null);
        }
    }

    static {
        t2o.a(478150930);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6x(j2e j2eVar, CartMegaManager.InstanceType instanceType) {
        super(instanceType);
        ckf.g(j2eVar, "tradeHybridInstance");
        ckf.g(instanceType, "instanceType");
        this.e = j2eVar;
        this.c = new CartCallbackManager(j2eVar.getInstanceId());
    }

    public static /* synthetic */ Object ipc$super(t6x t6xVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/call/WeexInstanceWrapper");
    }

    public static final /* synthetic */ j2e s(t6x t6xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j2e) ipChange.ipc$dispatch("83b80f80", new Object[]{t6xVar});
        }
        return t6xVar.e;
    }

    @Override // tb.sv
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df5fae55", new Object[]{this});
        } else {
            this.e.g();
        }
    }

    @Override // tb.sv
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f51c4d6", new Object[]{this});
        } else {
            this.d = true;
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
        this.e.b(str2, str3, jSONObject);
    }

    @Override // tb.sv
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf0c8533", new Object[]{this, str});
            return;
        }
        ckf.g(str, "reason");
        this.e.a();
        new Handler(Looper.getMainLooper()).post(new a(str));
    }

    @Override // tb.sv
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55aa027d", new Object[]{this, str});
            return;
        }
        ckf.g(str, "reason");
        BaseICartFragmentProxy i = this.e.i();
        if (i != null) {
            i.a(str);
        }
    }

    @Override // tb.sv
    public Activity f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        return this.e.getActivity();
    }

    @Override // tb.sv
    public CartCallbackManager g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartCallbackManager) ipChange.ipc$dispatch("dc2dd50", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.sv
    public Fragment h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("34dee721", new Object[]{this});
        }
        BaseICartFragmentProxy i = this.e.i();
        if (i != null) {
            return i.g();
        }
        return null;
    }

    @Override // tb.sv
    public LoadingView i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoadingView) ipChange.ipc$dispatch("87349190", new Object[]{this});
        }
        return this.e.getLoadingView();
    }

    @Override // tb.sv
    public ViewGroup j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("26a69771", new Object[]{this});
        }
        return this.e.getRootView();
    }

    @Override // tb.sv
    public plq k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (plq) ipChange.ipc$dispatch("fc180a65", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.sv
    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb742a89", new Object[]{this})).booleanValue();
        }
        return this.f28515a;
    }

    @Override // tb.sv
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2d6a38e", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    @Override // tb.sv
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78e360ef", new Object[]{this})).booleanValue();
        }
        return this.e.l();
    }

    @Override // tb.sv
    public void o(BaseICartFragmentProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5d33775", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "callback");
        BaseICartFragmentProxy i = this.e.i();
        if (i != null) {
            i.C(aVar);
        }
    }

    @Override // tb.sv
    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f84d2b7", new Object[]{this, new Boolean(z)});
        } else {
            this.f28515a = z;
        }
    }

    @Override // tb.sv
    public void q(plq plqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f239d3", new Object[]{this, plqVar});
            return;
        }
        ckf.g(plqVar, "stdPopPanel");
        this.b = plqVar;
    }

    @Override // tb.sv
    public void r(BaseICartFragmentProxy.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11553c8e", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "callback");
        BaseICartFragmentProxy i = this.e.i();
        if (i != null) {
            i.D(aVar);
        }
    }
}
