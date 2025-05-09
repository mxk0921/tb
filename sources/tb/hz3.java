package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.business.videocollection.PopupDialog;
import com.taobao.android.fluid.core.FluidContext;
import tb.kon;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hz3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String POPLAYER_NAME = "Collection_PopLayer";
    public static final String TAG = "PopupDialog";

    /* renamed from: a  reason: collision with root package name */
    public PopupDialog f20976a;
    public final gz3 b = new gz3();
    public final FluidContext c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (hz3.a(hz3.this) != null) {
                hz3.a(hz3.this).K2();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ iim f20978a;

        public b(iim iimVar) {
            this.f20978a = iimVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            int m;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f20978a != null && hz3.a(hz3.this) != null && hz3.a(hz3.this).v2()) {
                this.f20978a.o(s6o.m(), r3, r3);
                this.f20978a.b(r3, 0);
                this.f20978a.g(true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements dob {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ prp f20979a;

        public c(hz3 hz3Var, prp prpVar) {
            this.f20979a = prpVar;
        }

        @Override // tb.dob
        public void a(FluidContext fluidContext, PopupDialog popupDialog, PopupDialog popupDialog2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3330bd50", new Object[]{this, fluidContext, popupDialog, popupDialog2});
            } else {
                popupDialog2.C2(this.f20979a);
            }
        }
    }

    static {
        t2o.a(468713655);
    }

    public hz3(FluidContext fluidContext) {
        this.c = fluidContext;
    }

    public static /* synthetic */ PopupDialog a(hz3 hz3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupDialog) ipChange.ipc$dispatch("477e3d12", new Object[]{hz3Var});
        }
        return hz3Var.f20976a;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("743774a7", new Object[]{this})).booleanValue();
        }
        PopupDialog popupDialog = this.f20976a;
        if (popupDialog == null || !popupDialog.v2()) {
            return false;
        }
        return true;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95201726", new Object[]{this})).booleanValue();
        }
        PopupDialog popupDialog = this.f20976a;
        if (popupDialog == null || !popupDialog.f) {
            return false;
        }
        return true;
    }

    public bob f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bob) ipChange.ipc$dispatch("84eaa8aa", new Object[]{this});
        }
        PopupDialog popupDialog = this.f20976a;
        if (popupDialog != null) {
            return popupDialog.u2();
        }
        return null;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbb86b0", new Object[]{this});
        } else if (e()) {
            PopupDialog popupDialog = this.f20976a;
            if (popupDialog == null || !popupDialog.isAdded()) {
                if (this.f20976a == null) {
                    i(PopupDialog.z2(this.c), this.c);
                }
                ir9.b("PopupDialog", "打开了合集浮层; mPopupDialog=" + this.f20976a);
                k();
                nwv.y0(new a());
            }
        } else {
            ir9.b("PopupDialog", "UseNativePopupCollection is false");
        }
    }

    public final void i(PopupDialog popupDialog, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1b462cd", new Object[]{this, popupDialog, fluidContext});
            return;
        }
        this.b.a(fluidContext, this.f20976a, popupDialog);
        this.f20976a = popupDialog;
    }

    public void j(iim iimVar, View view, prp prpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a6d3a1", new Object[]{this, iimVar, view, prpVar});
        } else if (d()) {
            if (b() && c() && iimVar != null) {
                view.post(new b(iimVar));
            }
            PopupDialog popupDialog = this.f20976a;
            if (popupDialog != null) {
                popupDialog.E2(iimVar);
                this.f20976a.C2(prpVar);
                return;
            }
            this.b.b(new c(this, prpVar));
        }
    }

    public final void k() {
        PopupDialog popupDialog;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c637cac", new Object[]{this});
            return;
        }
        PopupDialog popupDialog2 = this.f20976a;
        if (popupDialog2 == null || !popupDialog2.isAdded()) {
            FragmentManager supportFragmentManager = ((FragmentActivity) this.c.getContext()).getSupportFragmentManager();
            if (!supportFragmentManager.isStateSaved() && (popupDialog = this.f20976a) != null) {
                popupDialog.show(supportFragmentManager, POPLAYER_NAME);
            }
        }
    }

    public void l(kon.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c128b6a", new Object[]{this, hVar});
            return;
        }
        PopupDialog popupDialog = this.f20976a;
        if (popupDialog != null) {
            popupDialog.J2(hVar);
        }
    }

    public void h() {
        Uri fluidUrl;
        com.taobao.android.fluid.framework.data.datamodel.a aVar;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d98695b1", new Object[]{this});
        } else if (e() && jz3.c() && (fluidUrl = this.c.getInstanceConfig().getFluidUrl()) != null && (aVar = kz3.d().c().get(fluidUrl.getQueryParameter("dxShareData"))) != null) {
            JSONObject jSONObject2 = aVar.e().d;
            if (!(jSONObject2 == null || jSONObject2.get("transmitParams") == null || (jSONObject = jSONObject2.getJSONObject("transmitParams")) == null)) {
                ((ICollectionService) this.c.getService(ICollectionService.class)).setCollectionTotal(nwv.t(jSONObject.get(iiz.PERF_STAG_TOTAL), 0));
            }
            i(PopupDialog.z2(this.c), this.c);
            k();
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("764f930a", new Object[]{this})).booleanValue();
        }
        if (!e()) {
            ir9.b("PopupDialog", "Native浮层关闭");
            return false;
        }
        boolean e = jz3.e();
        if (!e) {
            ir9.b("PopupDialog", e + "--isResizeCollectionVideoOrange");
            return false;
        }
        ir9.b("PopupDialog", "使用合集浮层联动功能");
        return true;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdccbbbf", new Object[]{this})).booleanValue();
        }
        if (!jz3.b()) {
            ir9.b("PopupDialog", "Native Orange开关关闭");
            return false;
        }
        Uri fluidUrl = this.c.getInstanceConfig().getFluidUrl();
        if (fluidUrl == null || !TextUtils.equals(fluidUrl.getQueryParameter("type"), dgf.GUANGGUANG_COLLECTION)) {
            ir9.b("PopupDialog", "当前非二跳页");
            return false;
        }
        ir9.b("PopupDialog", "位于native合集页面");
        return true;
    }
}
