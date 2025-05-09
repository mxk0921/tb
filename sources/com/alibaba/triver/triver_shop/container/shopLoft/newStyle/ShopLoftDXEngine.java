package com.alibaba.triver.triver_shop.container.shopLoft.newStyle;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import java.util.HashMap;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.gop;
import tb.hop;
import tb.ic6;
import tb.iwb;
import tb.jht;
import tb.k66;
import tb.kew;
import tb.mop;
import tb.npp;
import tb.ob5;
import tb.r54;
import tb.t2o;
import tb.u1a;
import tb.xhv;
import tb.xz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLoftDXEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f3016a;
    public final DinamicXEngine b;
    public final jht c = new jht();
    public final HashMap<Integer, u1a<DXTemplateItem, Boolean, xhv>> d = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class a extends ob5 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopLoftDXEngine f3018a;

        static {
            t2o.a(766509242);
        }

        public a(ShopLoftDXEngine shopLoftDXEngine) {
            ckf.g(shopLoftDXEngine, "this$0");
            this.f3018a = shopLoftDXEngine;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftDXEngine$ShopTapEventHandler");
        }

        @Override // tb.ob5, tb.mvb
        public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
                return;
            }
            jht g = this.f3018a.g();
            if (dXRuntimeContext != null) {
                g.i(objArr, dXRuntimeContext);
            }
        }
    }

    static {
        t2o.a(766509238);
    }

    public ShopLoftDXEngine(Activity activity) {
        ckf.g(activity, "context");
        this.f3016a = activity;
        DinamicXEngine dinamicXEngine = new DinamicXEngine(new DXEngineConfig.b(FluidInstanceConfig.CONTAINER_NAME_SHOP_LOFT).Q(2).b0(true).F());
        this.b = dinamicXEngine;
        dinamicXEngine.e1(ic6.DXSHOPAUTOSCROLLTEXTVIEW_SHOPAUTOSCROLLTEXTVIEW, new ic6.a());
        dinamicXEngine.a1(new iwb() { // from class: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftDXEngine.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftDXEngine$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public static final class C00981 extends Lambda implements d1a<xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ DXTemplateItem $finishedTemplateItem;
                public final /* synthetic */ ShopLoftDXEngine this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00981(ShopLoftDXEngine shopLoftDXEngine, DXTemplateItem dXTemplateItem) {
                    super(0);
                    this.this$0 = shopLoftDXEngine;
                    this.$finishedTemplateItem = dXTemplateItem;
                }

                public static /* synthetic */ Object ipc$super(C00981 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftDXEngine$1$1");
                }

                @Override // tb.d1a
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                        return;
                    }
                    u1a u1aVar = (u1a) ShopLoftDXEngine.b(this.this$0).get(Integer.valueOf(((hop) this.$finishedTemplateItem).n()));
                    if (u1aVar != null) {
                        DXTemplateItem dXTemplateItem = this.$finishedTemplateItem;
                        ckf.f(dXTemplateItem, "finishedTemplateItem");
                        u1aVar.invoke(dXTemplateItem, Boolean.TRUE);
                    }
                }
            }

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.newStyle.ShopLoftDXEngine$1$2  reason: invalid class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public static final class AnonymousClass2 extends Lambda implements d1a<xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ DXTemplateItem $failedTemplateItem;
                public final /* synthetic */ ShopLoftDXEngine this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(ShopLoftDXEngine shopLoftDXEngine, DXTemplateItem dXTemplateItem) {
                    super(0);
                    this.this$0 = shopLoftDXEngine;
                    this.$failedTemplateItem = dXTemplateItem;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/newStyle/ShopLoftDXEngine$1$2");
                }

                @Override // tb.d1a
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                        return;
                    }
                    u1a u1aVar = (u1a) ShopLoftDXEngine.b(this.this$0).get(Integer.valueOf(((hop) this.$failedTemplateItem).n()));
                    if (u1aVar != null) {
                        DXTemplateItem dXTemplateItem = this.$failedTemplateItem;
                        ckf.f(dXTemplateItem, "failedTemplateItem");
                        u1aVar.invoke(dXTemplateItem, Boolean.FALSE);
                    }
                }
            }

            @Override // tb.iwb
            public final void onNotificationListener(k66 k66Var) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
                    return;
                }
                for (DXTemplateItem dXTemplateItem : k66Var.f22428a) {
                    if (dXTemplateItem instanceof hop) {
                        r54.C(new C00981(ShopLoftDXEngine.this, dXTemplateItem));
                    }
                }
                for (DXTemplateItem dXTemplateItem2 : k66Var.b) {
                    if (dXTemplateItem2 instanceof hop) {
                        r54.C(new AnonymousClass2(ShopLoftDXEngine.this, dXTemplateItem2));
                    }
                }
            }
        });
        dinamicXEngine.W0(mop.TB_SHOP_TAP_EVENT_CODE, new a(this));
    }

    public static final /* synthetic */ View a(ShopLoftDXEngine shopLoftDXEngine, DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("41b649cd", new Object[]{shopLoftDXEngine, dXTemplateItem, jSONObject});
        }
        return shopLoftDXEngine.c(dXTemplateItem, jSONObject);
    }

    public static final /* synthetic */ HashMap b(ShopLoftDXEngine shopLoftDXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("990a2323", new Object[]{shopLoftDXEngine});
        }
        return shopLoftDXEngine.d;
    }

    public final View c(DXTemplateItem dXTemplateItem, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("12d6610d", new Object[]{this, dXTemplateItem, jSONObject});
        }
        DXResult<DXRootView> o = this.b.o(this.f3016a, this.b.u(dXTemplateItem));
        this.b.j1(o.f7291a, jSONObject);
        DXRootView dXRootView = o.f7291a;
        ckf.f(dXRootView, "viewResult.result");
        kew.T(dXRootView);
        DXRootView dXRootView2 = o.f7291a;
        ckf.f(dXRootView2, "viewResult.result");
        return dXRootView2;
    }

    public final void d(JSONObject jSONObject, int i, u1a<? super DXTemplateItem, ? super Boolean, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88442e55", new Object[]{this, jSONObject, new Integer(i), u1aVar});
            return;
        }
        hop hopVar = (hop) gop.b(jSONObject);
        hopVar.o(i);
        this.d.put(Integer.valueOf(i), u1aVar);
        this.b.p(xz3.e(hopVar));
    }

    public final void e(JSONObject jSONObject, JSONObject jSONObject2, int i, g1a<? super View, xhv> g1aVar, d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0331b76", new Object[]{this, jSONObject, jSONObject2, new Integer(i), g1aVar, d1aVar});
            return;
        }
        ckf.g(jSONObject, "dxJsonConfig");
        ckf.g(jSONObject2, "data");
        ckf.g(g1aVar, "createViewCallback");
        DXTemplateItem u = this.b.u(gop.b(jSONObject));
        if (u == null || !TextUtils.equals(jSONObject.getString("version"), String.valueOf(u.b))) {
            d(jSONObject, i, new ShopLoftDXEngine$fetchAndDownloadDxTemplate$1(g1aVar, this, jSONObject2, d1aVar));
            return;
        }
        g1aVar.invoke(c(u, jSONObject2));
        npp.Companion.b(ckf.p("dx template fetch success : ", u.toString()));
    }

    public final DinamicXEngine f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("5bafc634", new Object[]{this});
        }
        return this.b;
    }

    public final jht g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jht) ipChange.ipc$dispatch("59636876", new Object[]{this});
        }
        return this.c;
    }
}
