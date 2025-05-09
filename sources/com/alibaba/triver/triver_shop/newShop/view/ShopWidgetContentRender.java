package com.alibaba.triver.triver_shop.newShop.view;

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
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.a;
import kotlin.b;
import tb.aqp;
import tb.brf;
import tb.ckf;
import tb.fks;
import tb.g1a;
import tb.jpu;
import tb.njg;
import tb.npp;
import tb.r54;
import tb.t2o;
import tb.u1a;
import tb.ups;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopWidgetContentRender extends BaseShopContentRender implements TRWidgetInstance.i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context g;
    public final ups h;
    public TRWidgetInstance i;
    public final JSONObject j;
    public String k;
    public final njg l = a.b(new ShopWidgetContentRender$rootView$2(this));
    public final boolean m;
    public final boolean n;

    static {
        t2o.a(766509728);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopWidgetContentRender(Context context, ups upsVar) {
        super(context, upsVar);
        ckf.g(context, "context");
        ckf.g(upsVar, "tabBarItemDataModel");
        this.g = context;
        this.h = upsVar;
        aqp.a aVar = aqp.Companion;
        this.m = aVar.t0();
        this.n = aVar.r0();
        this.j = upsVar.u();
    }

    public static final /* synthetic */ String A(ShopWidgetContentRender shopWidgetContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("291a9493", new Object[]{shopWidgetContentRender});
        }
        return shopWidgetContentRender.k;
    }

    public static final /* synthetic */ void B(ShopWidgetContentRender shopWidgetContentRender, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd232ab", new Object[]{shopWidgetContentRender, str});
        } else {
            shopWidgetContentRender.k = str;
        }
    }

    public static /* synthetic */ Object ipc$super(ShopWidgetContentRender shopWidgetContentRender, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 877680342:
                super.k();
                return null;
            case 1065519279:
                super.j();
                return null;
            case 1890078406:
                super.destroyView();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopWidgetContentRender");
        }
    }

    public static final /* synthetic */ Context v(ShopWidgetContentRender shopWidgetContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("2bd74121", new Object[]{shopWidgetContentRender});
        }
        return shopWidgetContentRender.g;
    }

    public static final /* synthetic */ FrameLayout w(ShopWidgetContentRender shopWidgetContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b61ff7a8", new Object[]{shopWidgetContentRender});
        }
        return shopWidgetContentRender.D();
    }

    public static final /* synthetic */ JSONObject x(ShopWidgetContentRender shopWidgetContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4cc9fde6", new Object[]{shopWidgetContentRender});
        }
        return shopWidgetContentRender.j;
    }

    public static final /* synthetic */ ups y(ShopWidgetContentRender shopWidgetContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ups) ipChange.ipc$dispatch("67cdf571", new Object[]{shopWidgetContentRender});
        }
        return shopWidgetContentRender.h;
    }

    public static final /* synthetic */ boolean z(ShopWidgetContentRender shopWidgetContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1def9017", new Object[]{shopWidgetContentRender})).booleanValue();
        }
        return shopWidgetContentRender.m;
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b632172c", new Object[]{this});
        } else if (this.i == null && (this.g instanceof FragmentActivity)) {
            t();
            TRWidgetInstance tRWidgetInstance = new TRWidgetInstance((FragmentActivity) this.g);
            tRWidgetInstance.registerWidgetRenderListener(this);
            tRWidgetInstance.setRootContainer(new NativeWidgetNestedRenderContainer(this.g, WidgetRenderContainer.GestureMode.ALL));
            this.i = tRWidgetInstance;
            E(new ShopWidgetContentRender$doWidgetRender$1(this, tRWidgetInstance), ShopWidgetContentRender$doWidgetRender$2.INSTANCE);
        }
    }

    public final FrameLayout D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f5b37835", new Object[]{this});
        }
        return (FrameLayout) this.l.getValue();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void destroyView() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        super.destroyView();
        try {
            TRWidgetInstance tRWidgetInstance = this.i;
            if (tRWidgetInstance != null) {
                tRWidgetInstance.destroy();
            }
            this.i = null;
            D().removeAllViews();
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
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        return D();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void j() {
        TRWidgetInstance tRWidgetInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f8288af", new Object[]{this});
            return;
        }
        super.j();
        if (this.n && (tRWidgetInstance = this.i) != null) {
            tRWidgetInstance.onAttach(null);
        }
        C();
        r54.E(new ShopWidgetContentRender$onViewSelectedByViewPager$1(this), 200L);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void k() {
        TRWidgetInstance tRWidgetInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345056d6", new Object[]{this});
            return;
        }
        super.k();
        TRWidgetInstance tRWidgetInstance2 = this.i;
        if (tRWidgetInstance2 != null) {
            tRWidgetInstance2.pause();
        }
        if (this.n && (tRWidgetInstance = this.i) != null) {
            tRWidgetInstance.onDetach(null);
        }
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.g);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbd89bae", new Object[]{this})).booleanValue();
        }
        if (this.i != null) {
            return true;
        }
        return false;
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        TRWidgetInstance tRWidgetInstance = this.i;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.pause();
        }
    }

    @Override // com.alibaba.triver.cannal_engine.TRWidgetInstance.i
    public void onRenderSuccess(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98d4f3d", new Object[]{this, view});
            return;
        }
        npp.Companion.b("widgetContainer render success");
        r();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        TRWidgetInstance tRWidgetInstance = this.i;
        if (tRWidgetInstance != null) {
            tRWidgetInstance.resume();
        }
    }

    public final void E(g1a<? super JSONObject, xhv> g1aVar, u1a<? super Integer, ? super String, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3204269", new Object[]{this, g1aVar, u1aVar});
        } else if (this.j != null) {
            ShopDataParser o = this.h.o();
            String str = null;
            Pair a2 = jpu.a("shopId", o == null ? null : o.W0());
            ShopDataParser o2 = this.h.o();
            Pair a3 = jpu.a("sellerId", o2 == null ? null : o2.N0());
            JSONObject jSONObject = this.j;
            Pair a4 = jpu.a("moduleId", jSONObject == null ? null : jSONObject.getString("moduleId"));
            Pair a5 = jpu.a("scene", "shop_tab3");
            Pair a6 = jpu.a("renderType", "livecard");
            JSONObject jSONObject2 = this.j;
            if (jSONObject2 != null) {
                str = jSONObject2.getString("sceneId");
            }
            BizExtKt.h(this.g, "mtop.taobao.wireless.module.render.v2", "1.0", kotlin.collections.a.i(a2, a3, a4, a5, a6, jpu.a("bizParams", brf.a(jpu.a("sceneId", str)).toString()), jpu.a("renderOptions", brf.a(jpu.a("sdkVersion", "1.1.9")).toString())), new ShopWidgetContentRender$requestWidgetRenderInfo$1(g1aVar), new ShopWidgetContentRender$requestWidgetRenderInfo$2(u1aVar), false, false, false, null, false, null, null, 8128, null);
        }
    }
}
