package tb;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.cannal_engine.TRWidgetInstance;
import com.alibaba.triver.cannal_engine.event.WidgetRenderContainer;
import com.alibaba.triver.cannal_engine.event.nativeembed.NativeWidgetNestedRenderContainer;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.BizExtKt;
import com.alibaba.triver.triver_shop.newShop.view.Tab3ContentRender$doWidgetRender$1;
import com.alibaba.triver.triver_shop.newShop.view.Tab3ContentRender$doWidgetRender$2;
import com.alibaba.triver.triver_shop.newShop.view.Tab3ContentRender$requestWidgetRenderInfo$1;
import com.alibaba.triver.triver_shop.newShop.view.Tab3ContentRender$requestWidgetRenderInfo$2;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.a;
import tb.aqp;
import tb.npp;
import tb.wpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class gps implements wpd, TRWidgetInstance.i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f20155a;
    public final ShopDataParser b;
    public boolean c;
    public TRWidgetInstance d;
    public final JSONObject e;
    public String f;
    public final FrameLayout g;
    public final View h;
    public boolean i;
    public final boolean j;
    public final boolean k;

    static {
        t2o.a(766509742);
        t2o.a(766509633);
    }

    public gps(Context context, ShopDataParser shopDataParser) {
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
        this.f20155a = context;
        this.b = shopDataParser;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(-1);
        xhv xhvVar = xhv.INSTANCE;
        this.g = frameLayout;
        View view = new View(context);
        kew.S(view, sk9.Companion.l());
        this.h = view;
        aqp.a aVar = aqp.Companion;
        this.j = aVar.t0();
        this.k = aVar.r0();
        this.e = shopDataParser.s1();
    }

    public static final /* synthetic */ Context b(gps gpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9a3e5005", new Object[]{gpsVar});
        }
        return gpsVar.f20155a;
    }

    public static final /* synthetic */ FrameLayout c(gps gpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("c3e984d0", new Object[]{gpsVar});
        }
        return gpsVar.g;
    }

    public static final /* synthetic */ JSONObject d(gps gpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("89e8a28a", new Object[]{gpsVar});
        }
        return gpsVar.e;
    }

    public static final /* synthetic */ View f(gps gpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("23a20ed", new Object[]{gpsVar});
        }
        return gpsVar.h;
    }

    public static final /* synthetic */ ShopDataParser l(gps gpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("cae37592", new Object[]{gpsVar});
        }
        return gpsVar.b;
    }

    public static final /* synthetic */ boolean m(gps gpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("116f027b", new Object[]{gpsVar})).booleanValue();
        }
        return gpsVar.j;
    }

    public static final /* synthetic */ void n(gps gpsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d3968f", new Object[]{gpsVar, str});
        } else {
            gpsVar.f = str;
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
            TRWidgetInstance tRWidgetInstance = this.d;
            if (tRWidgetInstance != null) {
                tRWidgetInstance.destroy();
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

    @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.i
    public void e(fks fksVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3608db", new Object[]{this, fksVar, map});
            return;
        }
        npp.a aVar = npp.Companion;
        StringBuilder sb = new StringBuilder("widgetContainer render Error : ");
        String str = null;
        sb.append((Object) (fksVar == null ? null : fksVar.f19372a));
        sb.append(' ');
        if (fksVar != null) {
            str = fksVar.b;
        }
        sb.append((Object) str);
        aVar.b(sb.toString());
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
        TRWidgetInstance tRWidgetInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8288af", new Object[]{this});
            return;
        }
        wpd.a.c(this);
        if (this.k && (tRWidgetInstance = this.d) != null) {
            tRWidgetInstance.onAttach(null);
        }
        o();
        if (!this.i) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.f20155a);
        }
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this.f20155a);
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b632172c", new Object[]{this});
        } else if (this.d == null) {
            Context context = this.f20155a;
            if (context instanceof FragmentActivity) {
                TRWidgetInstance tRWidgetInstance = new TRWidgetInstance((FragmentActivity) context);
                tRWidgetInstance.registerWidgetRenderListener(this);
                tRWidgetInstance.setRootContainer(new NativeWidgetNestedRenderContainer(this.f20155a, WidgetRenderContainer.GestureMode.ALL));
                this.d = tRWidgetInstance;
                q(new Tab3ContentRender$doWidgetRender$1(this, tRWidgetInstance), Tab3ContentRender$doWidgetRender$2.INSTANCE);
            }
        }
    }

    @Override // tb.wpd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        wpd.a.a(this);
        TRWidgetInstance tRWidgetInstance = this.d;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.pause();
        }
    }

    @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.i
    public void onRenderSuccess(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98d4f3d", new Object[]{this, view});
        } else {
            npp.Companion.b("widgetContainer render success");
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
        TRWidgetInstance tRWidgetInstance = this.d;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.resume();
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f60fc89", new Object[]{this});
        } else {
            kew.C(this.h);
        }
    }

    public final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2753944b", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    @Override // tb.wpd
    public void k() {
        TRWidgetInstance tRWidgetInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345056d6", new Object[]{this});
            return;
        }
        wpd.a.d(this);
        TRWidgetInstance tRWidgetInstance2 = this.d;
        if (tRWidgetInstance2 != null) {
            tRWidgetInstance2.pause();
        }
        if (this.k && (tRWidgetInstance = this.d) != null) {
            tRWidgetInstance.onDetach(null);
        }
        String str = "a2141.b61969235." + ((Object) this.f) + ".0";
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this.f20155a, "Page_Shop_brandshop_tab3");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this.f20155a, a.i(jpu.a("spm-cnt", str), jpu.a("seller_id", this.b.N0()), jpu.a("shop_id", this.b.W0())));
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(v3i.f(jpu.a("spm-url", str)));
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.f20155a);
    }

    public final void q(g1a<? super JSONObject, xhv> g1aVar, u1a<? super Integer, ? super String, xhv> u1aVar) {
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
            BizExtKt.h(this.f20155a, "mtop.taobao.wireless.module.render.v2", "1.0", a.i(a2, a3, a4, a5, a6, jpu.a("bizParams", brf.a(jpu.a("sceneId", str)).toString()), jpu.a("renderOptions", brf.a(jpu.a("sdkVersion", "1.1.9")).toString())), new Tab3ContentRender$requestWidgetRenderInfo$1(g1aVar), new Tab3ContentRender$requestWidgetRenderInfo$2(u1aVar), false, false, false, null, false, null, null, 8128, null);
        }
    }
}
