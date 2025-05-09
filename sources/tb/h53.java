package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView;
import com.etao.feimagesearch.capture.dynamic.templates.PltTemplatesManager;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSComponent;
import com.taobao.android.searchbaseframe.business.weex.multiplelist.XslMUSLayout;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class h53 extends d32<f53, yr3, CaptureManager> implements CaptureBottomAreaView.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FrameLayout l;
    public FrameLayout m;
    public View n;
    public View o;
    public View p;
    public com.taobao.android.weex_framework.a q;
    public boolean r;
    public JSONObject s;
    public boolean t;
    public int u;
    public int v;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.npc
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            }
        }

        @Override // tb.npc
        public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
            }
        }

        @Override // tb.npc
        public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
            }
        }

        @Override // tb.npc
        public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            }
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            }
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            }
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            View view;
            com.taobao.android.weex_framework.a P;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                return;
            }
            h53.S(h53.this, true);
            com.taobao.android.weex_framework.a P2 = h53.P(h53.this);
            if (P2 == null) {
                view = null;
            } else {
                view = P2.getRenderRoot();
            }
            FrameLayout N = h53.N(h53.this);
            if (N != null) {
                N.addView(view);
                JSONObject O = h53.O(h53.this);
                if (O != null && (P = h53.P(h53.this)) != null) {
                    P.refresh(O, null);
                    return;
                }
                return;
            }
            ckf.y("browsedContainer");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ ViewGroup d;
        public final /* synthetic */ h53 e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ int g;
        public final /* synthetic */ int h;

        public b(boolean z, ViewGroup viewGroup, h53 h53Var, boolean z2, int i, int i2) {
            this.c = z;
            this.d = viewGroup;
            this.e = h53Var;
            this.f = z2;
            this.g = i;
            this.h = i2;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/browsed/CaptureBrowsedView$onViewStateChanged$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            if (this.c) {
                this.d.removeAllViews();
                ViewGroup viewGroup = this.d;
                FrameLayout Q = h53.Q(this.e);
                if (Q != null) {
                    viewGroup.addView(Q, -1, -1);
                    h53.R(this.e, this.f);
                } else {
                    ckf.y("rootView");
                    throw null;
                }
            }
            this.e.X(this.g, this.h);
        }
    }

    static {
        t2o.a(481296583);
        t2o.a(481296531);
        t2o.a(481296538);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h53(Activity activity, rcc<yr3, CaptureManager> rccVar) {
        super(activity, rccVar, true);
        ckf.g(activity, "activity");
    }

    public static final /* synthetic */ FrameLayout N(h53 h53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2c7defe4", new Object[]{h53Var});
        }
        return h53Var.m;
    }

    public static final /* synthetic */ JSONObject O(h53 h53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("52691e26", new Object[]{h53Var});
        }
        return h53Var.s;
    }

    public static final /* synthetic */ com.taobao.android.weex_framework.a P(h53 h53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("6ccb0f36", new Object[]{h53Var});
        }
        return h53Var.q;
    }

    public static final /* synthetic */ FrameLayout Q(h53 h53Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f094f5c4", new Object[]{h53Var});
        }
        return h53Var.l;
    }

    public static final /* synthetic */ void R(h53 h53Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b743a60", new Object[]{h53Var, new Boolean(z)});
        } else {
            h53Var.Z(z);
        }
    }

    public static final /* synthetic */ void S(h53 h53Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32485c86", new Object[]{h53Var, new Boolean(z)});
        } else {
            h53Var.r = z;
        }
    }

    public static /* synthetic */ Object ipc$super(h53 h53Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1805108756:
                super.D();
                return null;
            case -587316827:
                super.F();
                return null;
            case -3136315:
                super.K();
                return null;
            case 1411002928:
                super.A();
                return null;
            case 1876185637:
                super.G(((Number) objArr[0]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/bottom/browsed/CaptureBrowsedView");
        }
    }

    @Override // tb.d32
    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541a3230", new Object[]{this});
            return;
        }
        super.A();
        com.taobao.android.weex_framework.a aVar = this.q;
        if (aVar != null && !aVar.isDestroyed()) {
            aVar.destroy();
        }
        this.q = null;
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
            com.taobao.android.weex_framework.a aVar = this.q;
            if (aVar != null) {
                aVar.onActivityPause();
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
            com.taobao.android.weex_framework.a aVar = this.q;
            if (aVar != null) {
                aVar.onActivityResume();
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
        com.taobao.android.weex_framework.a aVar = this.q;
        if (aVar != null) {
            aVar.addInstanceEnv(k7m.KEY_SCREEN_STYLE, ScreenType.h(i));
            aVar.refresh(null, null);
        }
    }

    /* renamed from: T */
    public f53 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f53) ipChange.ipc$dispatch("28b54a21", new Object[]{this});
        }
        return new f53();
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63367cc", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a b2 = com.taobao.android.weex_framework.b.f().b(this.c);
        b2.setTag(XslMUSComponent.KEY_META_SEARCH, Boolean.valueOf(lg4.s4()));
        b2.registerRenderListener(new a());
        ScreenType g = ScreenType.g(this.c);
        if (g != null) {
            b2.addInstanceEnv(k7m.KEY_SCREEN_STYLE, ScreenType.h(g.c()));
        }
        this.q = b2;
    }

    public final void V() {
        yr3 yr3Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("428c13fa", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.q;
        if (aVar != null) {
            String Y1 = lg4.Y1("orangeCameraTab3Url");
            if (TextUtils.isEmpty(Y1)) {
                Y1 = PltTemplatesManager.f("plt_camera_page_tab3");
                if (TextUtils.isEmpty(Y1)) {
                    Y1 = lg4.T1();
                }
            }
            rcc<M, C> rccVar = this.b;
            Map<String, String> map = null;
            if (!(rccVar == 0 || (yr3Var = (yr3) rccVar.p()) == null)) {
                map = yr3Var.getAllParams();
            }
            if (map == null) {
                map = new LinkedHashMap<>();
            }
            map.put(uyv.WX_TPL, Y1);
            String a2 = pov.a("https://h5.m.taobao.com/tusou/image_editor/index.html?", map);
            ckf.f(a2, "appendQueryParameter(\n  …,\n      innerParams\n    )");
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                    jSONObject.put((JSONObject) entry.getKey(), entry.getValue());
                }
            }
            zwh.Companion.a(aVar, Y1, a2, jSONObject, null);
        }
    }

    public void X(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f9d2d0", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.u != i) {
            this.u = i;
            this.v = i2;
            a0(i, i2);
        }
    }

    public void Y(ViewGroup viewGroup, boolean z, boolean z2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bb1cbcd", new Object[]{this, viewGroup, new Boolean(z), new Boolean(z2), new Integer(i), new Integer(i2)});
            return;
        }
        ckf.g(viewGroup, "container");
        if (this.t != z) {
            this.t = z;
            vpt.g("CaptureBrowsedView_addView", new b(z, viewGroup, this, z2, i, i2));
        }
    }

    public final void Z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24002b45", new Object[]{this, new Boolean(z)});
        } else if (z) {
            View view = this.n;
            if (view == null) {
                ckf.y("hintContainer");
                throw null;
            } else if (view.getVisibility() != 0) {
                FrameLayout frameLayout = this.m;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(0.0f);
                } else {
                    ckf.y("browsedContainer");
                    throw null;
                }
            }
        } else {
            FrameLayout frameLayout2 = this.m;
            if (frameLayout2 != null) {
                frameLayout2.setTranslationY(-p1p.b(40.0f));
            } else {
                ckf.y("browsedContainer");
                throw null;
            }
        }
    }

    @Override // com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView.b
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25fbc59f", new Object[]{this})).booleanValue();
        }
        com.taobao.android.weex_framework.a aVar = this.q;
        if (aVar == null) {
            return false;
        }
        ckf.d(aVar);
        XslMUSLayout xslMUSLayout = (XslMUSLayout) hgw.d(aVar.getRenderRoot(), XslMUSLayout.class);
        if (xslMUSLayout == null) {
            return false;
        }
        return xslMUSLayout.isReachTop();
    }

    @Override // com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView.b
    public void d(int i, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c39d8911", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        X(i, i2);
        if (i <= i2 / 2) {
            z = false;
        }
        Z(z);
    }

    @Override // com.etao.feimagesearch.capture.dynamic.bottom.CaptureBottomAreaView.b
    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51db6da", new Object[]{this, new Boolean(z)});
        }
    }

    public final void W(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91dd2e9f", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            FrameLayout frameLayout = this.m;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                View view = this.n;
                if (view != null) {
                    view.setVisibility(0);
                    a0(this.u, this.v);
                    return;
                }
                ckf.y("hintContainer");
                throw null;
            }
            ckf.y("browsedContainer");
            throw null;
        } else {
            FrameLayout frameLayout2 = this.m;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
                View view2 = this.n;
                if (view2 != null) {
                    view2.setVisibility(8);
                    if (this.r) {
                        com.taobao.android.weex_framework.a aVar = this.q;
                        if (aVar != null) {
                            aVar.refresh(jSONObject, null);
                            return;
                        }
                        return;
                    }
                    this.s = jSONObject;
                    return;
                }
                ckf.y("hintContainer");
                throw null;
            }
            ckf.y("browsedContainer");
            throw null;
        }
    }

    @Override // tb.d32
    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        super.K();
        View inflate = LayoutInflater.from(this.c).inflate(R.layout.feis_view_capture_borwsed, (ViewGroup) null, false);
        if (inflate != null) {
            FrameLayout frameLayout = (FrameLayout) inflate;
            this.l = frameLayout;
            View findViewById = frameLayout.findViewById(R.id.fl_browsed_container);
            ckf.f(findViewById, "rootView.findViewById(R.id.fl_browsed_container)");
            FrameLayout frameLayout2 = (FrameLayout) findViewById;
            this.m = frameLayout2;
            frameLayout2.setTranslationY(-p1p.b(40.0f));
            FrameLayout frameLayout3 = this.l;
            if (frameLayout3 != null) {
                View findViewById2 = frameLayout3.findViewById(R.id.fl_empty_container);
                ckf.f(findViewById2, "rootView.findViewById(R.id.fl_empty_container)");
                this.n = findViewById2;
                findViewById2.setVisibility(0);
                FrameLayout frameLayout4 = this.l;
                if (frameLayout4 != null) {
                    View findViewById3 = frameLayout4.findViewById(R.id.ll_empty_hint);
                    ckf.f(findViewById3, "rootView.findViewById(R.id.ll_empty_hint)");
                    this.o = findViewById3;
                    FrameLayout frameLayout5 = this.l;
                    if (frameLayout5 != null) {
                        ((TUrlImageView) frameLayout5.findViewById(R.id.iv_empty_hint)).setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01p6cuBa1ClvBluXI7s_!!6000000000122-2-tps-104-102.png");
                        FrameLayout frameLayout6 = this.l;
                        if (frameLayout6 != null) {
                            View findViewById4 = frameLayout6.findViewById(R.id.ll_empty_full);
                            ckf.f(findViewById4, "rootView.findViewById(R.id.ll_empty_full)");
                            this.p = findViewById4;
                            FrameLayout frameLayout7 = this.l;
                            if (frameLayout7 != null) {
                                ((TextView) frameLayout7.findViewById(R.id.tv_empty_hint)).setTextSize(1, m().M() ? 17.0f : 15.0f);
                                FrameLayout frameLayout8 = this.l;
                                if (frameLayout8 != null) {
                                    ((TUrlImageView) frameLayout8.findViewById(R.id.iv_empty_hint_full)).setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN01p6cuBa1ClvBluXI7s_!!6000000000122-2-tps-104-102.png");
                                    U();
                                    V();
                                    return;
                                }
                                ckf.y("rootView");
                                throw null;
                            }
                            ckf.y("rootView");
                            throw null;
                        }
                        ckf.y("rootView");
                        throw null;
                    }
                    ckf.y("rootView");
                    throw null;
                }
                ckf.y("rootView");
                throw null;
            }
            ckf.y("rootView");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    public final void a0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e98ad0ed", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        View view = this.n;
        if (view == null) {
            ckf.y("hintContainer");
            throw null;
        } else if (view.getVisibility() == 0) {
            if (i > i2 / 3) {
                View view2 = this.o;
                if (view2 != null) {
                    if (view2.getVisibility() != 8) {
                        View view3 = this.o;
                        if (view3 != null) {
                            view3.setVisibility(8);
                            View view4 = this.o;
                            if (view4 != null) {
                                view4.setVisibility(8);
                            } else {
                                ckf.y("emptyHintView");
                                throw null;
                            }
                        } else {
                            ckf.y("emptyHintView");
                            throw null;
                        }
                    }
                    View view5 = this.p;
                    if (view5 == null) {
                        ckf.y("emptyHintFullView");
                        throw null;
                    } else if (view5.getVisibility() != 0) {
                        View view6 = this.p;
                        if (view6 != null) {
                            view6.setVisibility(0);
                        } else {
                            ckf.y("emptyHintFullView");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("emptyHintView");
                    throw null;
                }
            } else {
                View view7 = this.o;
                if (view7 != null) {
                    if (view7.getVisibility() != 0) {
                        View view8 = this.o;
                        if (view8 != null) {
                            view8.setVisibility(0);
                            View view9 = this.o;
                            if (view9 != null) {
                                view9.setVisibility(0);
                            } else {
                                ckf.y("emptyHintView");
                                throw null;
                            }
                        } else {
                            ckf.y("emptyHintView");
                            throw null;
                        }
                    }
                    View view10 = this.p;
                    if (view10 == null) {
                        ckf.y("emptyHintFullView");
                        throw null;
                    } else if (view10.getVisibility() != 8) {
                        View view11 = this.p;
                        if (view11 != null) {
                            view11.setVisibility(8);
                        } else {
                            ckf.y("emptyHintFullView");
                            throw null;
                        }
                    }
                } else {
                    ckf.y("emptyHintView");
                    throw null;
                }
            }
            View view12 = this.o;
            if (view12 != null) {
                if (view12.getVisibility() == 0) {
                    View view13 = this.o;
                    if (view13 != null) {
                        ViewGroup.LayoutParams layoutParams = view13.getLayoutParams();
                        if (layoutParams != null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                            layoutParams2.topMargin = ((i - p1p.a(48.0f)) - CaptureBottomAreaView.Companion.c()) / 2;
                            View view14 = this.o;
                            if (view14 != null) {
                                view14.setLayoutParams(layoutParams2);
                            } else {
                                ckf.y("emptyHintView");
                                throw null;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                    } else {
                        ckf.y("emptyHintView");
                        throw null;
                    }
                }
                View view15 = this.p;
                if (view15 == null) {
                    ckf.y("emptyHintFullView");
                    throw null;
                } else if (view15.getVisibility() == 0) {
                    View view16 = this.p;
                    if (view16 != null) {
                        ViewGroup.LayoutParams layoutParams3 = view16.getLayoutParams();
                        if (layoutParams3 != null) {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                            layoutParams4.topMargin = ((i - CaptureBottomAreaView.Companion.c()) / 2) - p1p.a(152.0f);
                            View view17 = this.p;
                            if (view17 != null) {
                                view17.setLayoutParams(layoutParams4);
                            } else {
                                ckf.y("emptyHintFullView");
                                throw null;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                    } else {
                        ckf.y("emptyHintFullView");
                        throw null;
                    }
                }
            } else {
                ckf.y("emptyHintView");
                throw null;
            }
        }
    }
}
