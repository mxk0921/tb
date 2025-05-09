package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.PerceptionSizeFrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.b;
import tb.ckf;
import tb.gop;
import tb.kew;
import tb.npp;
import tb.t2o;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ShopDataParser f3250a;
    public Context b;
    public ShopDXEngine c;
    public PerceptionSizeFrameLayout d;
    public View e;
    public boolean f;
    public final ArrayList<Runnable> g = new ArrayList<>();
    public u1a<? super BaseTemplateComponent, ? super ViewGroup.LayoutParams, xhv> h;

    static {
        t2o.a(766510032);
    }

    public static /* synthetic */ void r(BaseTemplateComponent baseTemplateComponent, JSONObject jSONObject, JSONObject jSONObject2, boolean z, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17e876d", new Object[]{baseTemplateComponent, jSONObject, jSONObject2, new Boolean(z), new Integer(i), obj});
        } else if (obj == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            baseTemplateComponent.q(jSONObject, jSONObject2, z);
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderTemplate");
        }
    }

    public void A(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10819c63", new Object[]{this, jSONObject});
        } else if (this.e != null) {
            gop.d(h(), f(), jSONObject);
        }
    }

    public final void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49427e06", new Object[]{this, runnable});
            return;
        }
        ArrayList<Runnable> arrayList = this.g;
        if (runnable != null) {
            arrayList.add(runnable);
        }
    }

    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b1b105", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        t(view);
        g().addView(f());
        u1a<? super BaseTemplateComponent, ? super ViewGroup.LayoutParams, xhv> u1aVar = this.h;
        if (u1aVar != null) {
            u1aVar.invoke(this, j());
        }
        c();
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b73879", new Object[]{this});
            return;
        }
        Iterator<Runnable> it = this.g.iterator();
        while (it.hasNext()) {
            try {
                it.next().run();
                Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                Result.m1108constructorimpl(b.a(th));
            }
        }
        this.g.clear();
    }

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d47995", new Object[]{this});
        }
        return g();
    }

    public final Context e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        Context context = this.b;
        if (context != null) {
            return context;
        }
        ckf.y("context");
        throw null;
    }

    public final View f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bfd0299a", new Object[]{this});
        }
        View view = this.e;
        if (view != null) {
            return view;
        }
        ckf.y("dxRootView");
        throw null;
    }

    public final PerceptionSizeFrameLayout g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerceptionSizeFrameLayout) ipChange.ipc$dispatch("766d58f2", new Object[]{this});
        }
        PerceptionSizeFrameLayout perceptionSizeFrameLayout = this.d;
        if (perceptionSizeFrameLayout != null) {
            return perceptionSizeFrameLayout;
        }
        ckf.y("rootLayout");
        throw null;
    }

    public final ShopDXEngine h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDXEngine) ipChange.ipc$dispatch("3739581f", new Object[]{this});
        }
        ShopDXEngine shopDXEngine = this.c;
        if (shopDXEngine != null) {
            return shopDXEngine;
        }
        ckf.y("shopDXEngine");
        throw null;
    }

    public final ShopDataParser i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("16b01ba5", new Object[]{this});
        }
        ShopDataParser shopDataParser = this.f3250a;
        if (shopDataParser != null) {
            return shopDataParser;
        }
        ckf.y("shopData");
        throw null;
    }

    public final ViewGroup.LayoutParams j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("b0fe0ff4", new Object[]{this});
        }
        ViewGroup.LayoutParams layoutParams = f().getLayoutParams();
        ckf.f(layoutParams, "dxRootView.layoutParams");
        return layoutParams;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb2d0d5b", new Object[]{this})).booleanValue();
        }
        if (this.e == null) {
            return false;
        }
        return kew.I(g());
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("978118c0", new Object[]{this})).booleanValue();
        }
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0a588e5", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19e515e2", new Object[]{this});
        } else {
            h().j().t0((DXRootView) f());
        }
    }

    public final void p() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d7d36f", new Object[]{this});
        } else if (this.e != null) {
            try {
                h().j().j1((DXRootView) f(), (JSONObject) ((DXRootView) f()).getData().clone());
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                obj = Result.m1108constructorimpl(b.a(th));
            }
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
            }
        }
    }

    public void q(JSONObject jSONObject, JSONObject jSONObject2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6cf54bd", new Object[]{this, jSONObject, jSONObject2, new Boolean(z)});
            return;
        }
        ckf.g(jSONObject, "templateJSON");
        ckf.g(jSONObject2, "templateData");
        h().i(jSONObject, jSONObject2, hashCode(), z, new BaseTemplateComponent$renderTemplate$1(this), new BaseTemplateComponent$renderTemplate$2(this));
    }

    public final void s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
            return;
        }
        ckf.g(context, "<set-?>");
        this.b = context;
    }

    public final void t(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f95f6ee", new Object[]{this, view});
            return;
        }
        ckf.g(view, "<set-?>");
        this.e = view;
    }

    public final void u(PerceptionSizeFrameLayout perceptionSizeFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccefe904", new Object[]{this, perceptionSizeFrameLayout});
            return;
        }
        ckf.g(perceptionSizeFrameLayout, "<set-?>");
        this.d = perceptionSizeFrameLayout;
    }

    public final void v(ShopDXEngine shopDXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f190731", new Object[]{this, shopDXEngine});
            return;
        }
        ckf.g(shopDXEngine, "<set-?>");
        this.c = shopDXEngine;
    }

    public final void w(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37976b35", new Object[]{this, shopDataParser});
            return;
        }
        ckf.g(shopDataParser, "<set-?>");
        this.f3250a = shopDataParser;
    }

    public final void x(u1a<? super BaseTemplateComponent, ? super ViewGroup.LayoutParams, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcfeba1", new Object[]{this, u1aVar});
        } else {
            this.h = u1aVar;
        }
    }

    public void y(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaee4940", new Object[]{this, str, obj});
        } else if (this.e != null) {
            gop.c(h(), f(), str, obj);
        }
    }

    public final void z(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a7437f", new Object[]{this, jSONObject});
            return;
        }
        ckf.g(jSONObject, "newNativeData");
        if (l()) {
            JSONObject jSONObject2 = ShopExtKt.q(f()).getJSONObject("nativeData");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            JSONObject jSONObject3 = (JSONObject) jSONObject2.clone();
            jSONObject3.putAll(jSONObject);
            npp.Companion.a(ckf.p("updateNativeData : ", jSONObject.toJSONString()));
            y("nativeData", jSONObject3);
        }
    }

    public void k(Context context, ShopDataParser shopDataParser, ShopDXEngine shopDXEngine, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa62ff67", new Object[]{this, context, shopDataParser, shopDXEngine, jSONObject});
            return;
        }
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
        ckf.g(shopDXEngine, "shopDXEngine");
        w(shopDataParser);
        v(shopDXEngine);
        s(context);
        u(new PerceptionSizeFrameLayout(context));
        this.f = true;
    }
}
