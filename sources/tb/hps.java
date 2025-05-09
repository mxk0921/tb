package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.BizExtKt;
import com.alibaba.triver.triver_shop.newShop.view.Tab3ContentRenderV2$doWidgetRender$1;
import com.alibaba.triver.triver_shop.newShop.view.Tab3ContentRenderV2$doWidgetRender$2;
import com.alibaba.triver.triver_shop.newShop.view.Tab3ContentRenderV2$requestWidgetRenderInfo$1;
import com.alibaba.triver.triver_shop.newShop.view.Tab3ContentRenderV2$requestWidgetRenderInfo$2;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.themis.widget.event.GestureMode;
import com.taobao.themis.widget.event.NativeWidgetNestedRenderContainer;
import com.ut.mini.UTAnalytics;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.a;
import tb.npp;
import tb.wpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class hps extends TMSEmbed.a implements wpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f20806a;
    public final ShopDataParser b;
    public boolean c;
    public TMSEmbed d;
    public final JSONObject e;
    public String f;
    public final FrameLayout g;
    public final View h;
    public boolean i;
    public final boolean j = aqp.Companion.r0();

    static {
        t2o.a(766509748);
        t2o.a(766509633);
    }

    public hps(Context context, ShopDataParser shopDataParser) {
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
        this.f20806a = context;
        this.b = shopDataParser;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-1);
        xhv xhvVar = xhv.INSTANCE;
        this.g = frameLayout;
        View view = new View(context);
        kew.S(view, sk9.Companion.l());
        this.h = view;
        this.e = shopDataParser.s1();
    }

    public static /* synthetic */ Object ipc$super(hps hpsVar, String str, Object... objArr) {
        if (str.hashCode() == -302283915) {
            super.n();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/Tab3ContentRenderV2");
    }

    public static final /* synthetic */ Context o(hps hpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("50c806a9", new Object[]{hpsVar});
        }
        return hpsVar.f20806a;
    }

    public static final /* synthetic */ FrameLayout p(hps hpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f88e22ac", new Object[]{hpsVar});
        }
        return hpsVar.g;
    }

    public static final /* synthetic */ JSONObject q(hps hpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("27e811ee", new Object[]{hpsVar});
        }
        return hpsVar.e;
    }

    public static final /* synthetic */ View r(hps hpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("eb6fa311", new Object[]{hpsVar});
        }
        return hpsVar.h;
    }

    public static final /* synthetic */ ShopDataParser s(hps hpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("a1f8c12e", new Object[]{hpsVar});
        }
        return hpsVar.b;
    }

    public static final /* synthetic */ void t(hps hpsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28e07a33", new Object[]{hpsVar, str});
        } else {
            hpsVar.f = str;
        }
    }

    @Override // tb.wpd
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c090532a", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    @Override // tb.wpd
    public void destroyView() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        try {
            TMSEmbed tMSEmbed = this.d;
            if (tMSEmbed != null) {
                tMSEmbed.d();
            }
            this.d = null;
            this.g.removeAllViews();
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }

    @Override // tb.wpd
    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f577597a", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    @Override // tb.wpd
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return this.g;
    }

    @Override // tb.wpd
    public void h(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c682d848", new Object[]{this, new Float(f)});
        } else {
            wpd.a.f(this, f);
        }
    }

    @Override // tb.wpd
    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("975ab1a6", new Object[]{this})).booleanValue();
        }
        return wpd.a.e(this);
    }

    @Override // tb.wpd
    public void j() {
        TMSEmbed tMSEmbed;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8288af", new Object[]{this});
            return;
        }
        wpd.a.c(this);
        if (this.j && (tMSEmbed = this.d) != null) {
            tMSEmbed.p();
        }
        u();
        if (!this.i) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.f20806a);
        }
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this.f20806a);
    }

    @Override // com.taobao.themis.external.embed.TMSEmbed.a
    public void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "errorCode");
        ckf.g(str2, "errorMsg");
        npp.a aVar = npp.Companion;
        aVar.b("widgetContainer render Error : " + str + ' ' + str2);
    }

    @Override // com.taobao.themis.external.embed.TMSEmbed.a
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfb8375", new Object[]{this});
            return;
        }
        super.n();
        npp.Companion.b("widgetContainer render success");
    }

    @Override // tb.wpd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        wpd.a.a(this);
        TMSEmbed tMSEmbed = this.d;
        if (tMSEmbed != null) {
            tMSEmbed.k();
        }
    }

    @Override // tb.wpd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        wpd.a.b(this);
        TMSEmbed tMSEmbed = this.d;
        if (tMSEmbed != null) {
            tMSEmbed.m();
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b632172c", new Object[]{this});
        } else if (this.d == null && (this.f20806a instanceof FragmentActivity)) {
            TMSEmbed tMSEmbed = new TMSEmbed((Activity) this.f20806a, TMSEmbedSolutionType.WIDGET, new NativeWidgetNestedRenderContainer(this.f20806a, GestureMode.ALL), false);
            tMSEmbed.r(this);
            this.d = tMSEmbed;
            w(new Tab3ContentRenderV2$doWidgetRender$1(this, tMSEmbed), Tab3ContentRenderV2$doWidgetRender$2.INSTANCE);
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f60fc89", new Object[]{this});
        } else {
            kew.C(this.h);
        }
    }

    public final void x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2753944b", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    @Override // tb.wpd
    public void k() {
        TMSEmbed tMSEmbed;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345056d6", new Object[]{this});
            return;
        }
        wpd.a.d(this);
        TMSEmbed tMSEmbed2 = this.d;
        if (tMSEmbed2 != null) {
            tMSEmbed2.k();
        }
        if (this.j && (tMSEmbed = this.d) != null) {
            tMSEmbed.q();
        }
        String str = "a2141.b61969235." + ((Object) this.f) + ".0";
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this.f20806a, "Page_Shop_brandshop_tab3");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.f20806a, a.i(jpu.a("spm-cnt", str), jpu.a("seller_id", this.b.N0()), jpu.a("shop_id", this.b.W0())));
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(v3i.f(jpu.a("spm-url", str)));
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.f20806a);
    }

    public final void w(g1a<? super JSONObject, xhv> g1aVar, u1a<? super Integer, ? super String, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3204269", new Object[]{this, g1aVar, u1aVar});
        } else if (this.e != null) {
            Pair a2 = jpu.a("shopId", this.b.W0());
            Pair a3 = jpu.a("sellerId", this.b.N0());
            JSONObject jSONObject = this.e;
            String str = null;
            Pair a4 = jpu.a("moduleId", jSONObject == null ? null : jSONObject.getString("moduleId"));
            Pair a5 = jpu.a("scene", "shop_tab3");
            Pair a6 = jpu.a("renderType", "livecard");
            JSONObject jSONObject2 = this.e;
            if (jSONObject2 != null) {
                str = jSONObject2.getString("sceneId");
            }
            BizExtKt.h(this.f20806a, "mtop.taobao.wireless.module.render.v2", "1.0", a.i(a2, a3, a4, a5, a6, jpu.a("bizParams", brf.a(jpu.a("sceneId", str)).toString()), jpu.a("renderOptions", brf.a(jpu.a("sdkVersion", "1.1.9")).toString())), new Tab3ContentRenderV2$requestWidgetRenderInfo$1(g1aVar), new Tab3ContentRenderV2$requestWidgetRenderInfo$2(u1aVar), false, false, false, null, false, null, null, 8128, null);
        }
    }
}
