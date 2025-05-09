package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.ObserverFrameLayout;
import com.taobao.android.dinamicx.DXRootView;
import tb.eo7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dns {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_BOTTOM_DX = "bottomDX";
    public static final String KEY_FLOAT_VIEW = "detail3FloatView";

    /* renamed from: a  reason: collision with root package name */
    public DXRootView f17976a;
    public final ze7 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ObserverFrameLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ eo7 f17977a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ ObserverFrameLayout d;

        public a(eo7 eo7Var, JSONObject jSONObject, JSONObject jSONObject2, ObserverFrameLayout observerFrameLayout) {
            this.f17977a = eo7Var;
            this.b = jSONObject;
            this.c = jSONObject2;
            this.d = observerFrameLayout;
        }

        @Override // com.taobao.android.detail.ttdetail.widget.ObserverFrameLayout.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc3c9bc8", new Object[]{this, new Integer(i)});
            } else {
                dns.a(dns.this, this.f17977a, this.b, this.c, this.d, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements eo7.s {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f17978a;
        public final /* synthetic */ int b;
        public final /* synthetic */ eo7 c;
        public final /* synthetic */ JSONObject d;

        public b(FrameLayout frameLayout, int i, eo7 eo7Var, JSONObject jSONObject) {
            this.f17978a = frameLayout;
            this.b = i;
            this.c = eo7Var;
            this.d = jSONObject;
        }

        @Override // tb.eo7.s
        public void a(l38 l38Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8845bc8b", new Object[]{this, l38Var});
                return;
            }
            if (dns.b(dns.this) != null) {
                this.f17978a.removeView(dns.b(dns.this));
            }
            int j = pb6.j();
            int i = this.b;
            if (i != 0) {
                j = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            }
            ViewGroup i2 = hl6.i(this.c, this.d, l38Var, j, pb6.i());
            if (i2 instanceof DXRootView) {
                dns.c(dns.this, (DXRootView) i2);
                this.f17978a.addView(dns.b(dns.this));
                this.c.y(dns.b(dns.this));
            }
        }

        @Override // tb.eo7.s
        public void b(l38 l38Var, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c26b7f5c", new Object[]{this, l38Var, str});
                return;
            }
            tgh.b("TTDBottomFloatDXController", "onRenderFailure:" + str);
        }
    }

    static {
        t2o.a(912261769);
    }

    public dns(ze7 ze7Var) {
        this.b = ze7Var;
    }

    public static /* synthetic */ void a(dns dnsVar, eo7 eo7Var, JSONObject jSONObject, JSONObject jSONObject2, FrameLayout frameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16126423", new Object[]{dnsVar, eo7Var, jSONObject, jSONObject2, frameLayout, new Integer(i)});
        } else {
            dnsVar.f(eo7Var, jSONObject, jSONObject2, frameLayout, i);
        }
    }

    public static /* synthetic */ DXRootView b(dns dnsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("29f185ec", new Object[]{dnsVar});
        }
        return dnsVar.f17976a;
    }

    public static /* synthetic */ DXRootView c(dns dnsVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("6253414d", new Object[]{dnsVar, dXRootView});
        }
        dnsVar.f17976a = dXRootView;
        return dXRootView;
    }

    public static JSONObject e(ze7 ze7Var) {
        JSONObject j;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("53fc46da", new Object[]{ze7Var});
        }
        if (!vbl.F() || (j = ze7Var.e().j()) == null || (jSONObject = j.getJSONObject(KEY_FLOAT_VIEW)) == null) {
            return null;
        }
        return jSONObject.getJSONObject(KEY_BOTTOM_DX);
    }

    public void d(ObserverFrameLayout observerFrameLayout, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89e06d05", new Object[]{this, observerFrameLayout, jSONObject});
        } else if (observerFrameLayout != null) {
            if (this.f17976a != null) {
                tgh.b("TTDBottomFloatDXController", "addToParent removeView");
                observerFrameLayout.removeView(this.f17976a);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                eo7 g = this.b.g();
                if (nj7.h()) {
                    observerFrameLayout.setOnSizeChangedListener(new a(g, jSONObject, jSONObject2, observerFrameLayout));
                } else {
                    f(g, jSONObject, jSONObject2, observerFrameLayout, 0);
                }
            }
        }
    }

    public final void f(eo7 eo7Var, JSONObject jSONObject, JSONObject jSONObject2, FrameLayout frameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a869f9", new Object[]{this, eo7Var, jSONObject, jSONObject2, frameLayout, new Integer(i)});
        } else {
            hl6.e(eo7Var, jSONObject, new b(frameLayout, i, eo7Var, jSONObject2));
        }
    }
}
