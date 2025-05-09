package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.android.weex_framework.a;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class pv1 extends d32<ov1, yr3, CaptureManager> implements p3e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a l;
    public boolean m;
    public boolean n;
    public volatile String o = "";
    public FrameLayout p;
    public q22 q;

    static {
        t2o.a(481296633);
        t2o.a(481297504);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv1(Activity activity, rcc<yr3, CaptureManager> rccVar) {
        super(activity, rccVar);
        ckf.g(activity, "activity");
        ckf.g(rccVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
    }

    public static /* synthetic */ Object ipc$super(pv1 pv1Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1805108756:
                super.D();
                return null;
            case -587316827:
                super.F();
                return null;
            case 1411002928:
                super.A();
                return null;
            case 1876185637:
                super.G(((Number) objArr[0]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/hybrid/BaseHybridView");
        }
    }

    @Override // tb.d32
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541a3230", new Object[]{this});
        } else if (!this.n) {
            this.n = true;
            super.A();
            a aVar = this.l;
            if (aVar != null && !aVar.isDestroyed()) {
                aVar.destroy();
            }
            this.l = null;
        }
    }

    @Override // tb.d32
    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("946839ec", new Object[]{this});
            return;
        }
        super.D();
        try {
            a aVar = this.l;
            if (aVar != null) {
                aVar.onActivityPause();
            }
            a aVar2 = this.l;
            if (aVar2 != null) {
                aVar2.onActivityStop();
            }
        } catch (Exception unused) {
        }
    }

    @Override // tb.d32
    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcfe41a5", new Object[]{this});
            return;
        }
        super.F();
        try {
            a aVar = this.l;
            if (aVar != null) {
                aVar.onActivityStart();
            }
            a aVar2 = this.l;
            if (aVar2 != null) {
                aVar2.onActivityResume();
            }
        } catch (Exception unused) {
        }
    }

    @Override // tb.d32
    public void G(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd45225", new Object[]{this, new Integer(i)});
            return;
        }
        super.G(i);
        if (!this.n && !m().T()) {
            a aVar = this.l;
            if (aVar != null) {
                R().removeView(aVar.getRenderRoot());
                aVar.destroy();
                X(null);
                Y(false);
            }
            T();
        }
    }

    @Override // tb.d32
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        m().B0(this);
        View findViewById = this.c.findViewById(R.id.fl_capture_ui);
        ckf.f(findViewById, "activity.findViewById(R.id.fl_capture_ui)");
        Z((FrameLayout) findViewById);
        this.m = false;
    }

    /* renamed from: N */
    public ov1 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ov1) ipChange.ipc$dispatch("b29b8514", new Object[]{this});
        }
        return new ov1();
    }

    public final boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4986226e", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public final a Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("47446b25", new Object[]{this});
        }
        return this.l;
    }

    public final FrameLayout R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2ea43a8e", new Object[]{this});
        }
        FrameLayout frameLayout = this.p;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("rootViewContainer");
        throw null;
    }

    public final String S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2bff576", new Object[]{this});
        }
        return this.o;
    }

    public abstract void T();

    public final boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2d6a38e", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bce9970", new Object[]{this});
            return;
        }
        q22 q22Var = this.q;
        if (q22Var != null) {
            t(q22Var);
            this.q = null;
        }
    }

    public void W(String str, q22 q22Var) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f998659c", new Object[]{this, str, q22Var});
            return;
        }
        ckf.g(str, "target");
        if (q22Var != null && !TextUtils.isEmpty(q22Var.a()) && (aVar = this.l) != null) {
            aVar.sendInstanceMessage(str, q22Var.a(), q22Var.b());
        }
    }

    public final void X(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("360a0bb9", new Object[]{this, aVar});
        } else {
            this.l = aVar;
        }
    }

    public final void Y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd7d1c2", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public final void Z(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339de4e2", new Object[]{this, frameLayout});
            return;
        }
        ckf.g(frameLayout, "<set-?>");
        this.p = frameLayout;
    }

    public final void a0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c18147c0", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    @Override // tb.p3e
    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e57dc0ff", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    @Override // tb.p3e
    public void t(q22 q22Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23dba8a6", new Object[]{this, q22Var});
        } else if (q()) {
            W(pg1.ATOM_EXT_window, q22Var);
        } else {
            this.q = q22Var;
        }
    }

    public final JSONObject O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf62c17f", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "index", String.valueOf(p().getInitTabIndex()));
        jSONObject.put((JSONObject) "hideBack", (String) Boolean.valueOf(!CaptureManager.b0));
        if (p().scanOnly()) {
            jSONObject.put((JSONObject) wxi.KEY_IS_SCAN_MODE, "true");
            jSONObject.put((JSONObject) "isSplitScanAndTakePhoto", "false");
            jSONObject.put((JSONObject) "alwaysShowCaptureButton", "false");
            jSONObject.put((JSONObject) "isNativeAlbumShow", "true");
        } else {
            int r = m().r();
            if (r == 0) {
                jSONObject.put((JSONObject) "isSplitScanAndTakePhoto", "false");
                jSONObject.put((JSONObject) "alwaysShowCaptureButton", "false");
            } else if (r != 1) {
                jSONObject.put((JSONObject) "isSplitScanAndTakePhoto", "false");
                jSONObject.put((JSONObject) "alwaysShowCaptureButton", "true");
            } else {
                jSONObject.put((JSONObject) "isSplitScanAndTakePhoto", "true");
                jSONObject.put((JSONObject) "alwaysShowCaptureButton", "false");
            }
            jSONObject.put((JSONObject) wxi.KEY_IS_SCAN_MODE, "false");
            jSONObject.put((JSONObject) "isNativeAlbumShow", String.valueOf(true ^ m().f()));
        }
        jSONObject.put((JSONObject) "isScreenshotFloatBtnEnable", (String) Boolean.valueOf(lg4.l1()));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) r4p.KEY_EDITION_CODE, k1p.c());
        xhv xhvVar = xhv.INSTANCE;
        jSONObject.put((JSONObject) "marketingClientParams", (String) jSONObject2);
        Pair<String, String> b = u7j.b();
        if (b != null) {
            jSONObject.put((JSONObject) b.first, b.second);
        }
        jSONObject.put((JSONObject) "isOpenAlbumPopIntensification", String.valueOf(lg4.X3()));
        jSONObject.put((JSONObject) "screenshotsIntensHint", lg4.S1());
        jSONObject.put((JSONObject) "isTriggerElder", String.valueOf(m().M()));
        jSONObject.put((JSONObject) "enableSecondaryRequest", String.valueOf(m().O()));
        jSONObject.put((JSONObject) "enableTranslate", String.valueOf(lg4.W()));
        agh.h(e63.TAG, ckf.p("params=", JSON.toJSONString(jSONObject)));
        jSONObject.putAll(p().getAllParams());
        return jSONObject;
    }
}
