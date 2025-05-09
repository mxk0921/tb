package com.alibaba.triver.triver_shop.newShop.ext;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.HashMap;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.cvb;
import tb.d1a;
import tb.g1a;
import tb.gop;
import tb.hop;
import tb.ic6;
import tb.iwb;
import tb.jc6;
import tb.k66;
import tb.kew;
import tb.kht;
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
public final class ShopDXEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f3095a;
    public ShopDataParser b;
    public final DinamicXEngine c;
    public final kht d = new kht();
    public final HashMap<Integer, u1a<DXTemplateItem, Boolean, xhv>> e = new HashMap<>();
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class a extends ob5 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopDXEngine f3097a;

        static {
            t2o.a(766509499);
        }

        public a(ShopDXEngine shopDXEngine) {
            ckf.g(shopDXEngine, "this$0");
            this.f3097a = shopDXEngine;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopDXEngine$ShopTapEventHandler");
        }

        @Override // tb.ob5, tb.mvb
        public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            } else {
                this.f3097a.k().o(this.f3097a.l(), objArr, dXRuntimeContext);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b extends cvb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopDXEngine$build$1$1");
        }

        @Override // tb.cvb
        public int ap2Px(DinamicXEngine dinamicXEngine, Context context, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("207edfae", new Object[]{this, dinamicXEngine, context, new Float(f)})).intValue();
            }
            return kew.d(Float.valueOf(f));
        }

        @Override // tb.cvb
        public int px2Ap(DinamicXEngine dinamicXEngine, Context context, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d721afdc", new Object[]{this, dinamicXEngine, context, new Float(f)})).intValue();
            }
            return kew.M(Float.valueOf(f));
        }
    }

    static {
        t2o.a(766509495);
    }

    public ShopDXEngine(Activity activity) {
        ckf.g(activity, "context");
        this.f3095a = activity;
        DXEngineConfig.b bVar = new DXEngineConfig.b("shop");
        bVar.Q(2);
        bVar.Z(DXEngineConfig.ImageQuality.q90);
        bVar.b0(true);
        if (!r54.v(activity)) {
            bVar.H(true, true);
            bVar.M(new b());
        }
        DinamicXEngine dinamicXEngine = new DinamicXEngine(bVar.F());
        this.c = dinamicXEngine;
        dinamicXEngine.e1(ic6.DXSHOPAUTOSCROLLTEXTVIEW_SHOPAUTOSCROLLTEXTVIEW, new ic6.a());
        dinamicXEngine.e1(jc6.DXSHOPBOTTOMBARDYNAMICICON_SHOPBOTTOMBARDYNAMICICON, new jc6.a());
        dinamicXEngine.a1(new iwb() { // from class: com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public static final class C01011 extends Lambda implements d1a<xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ DXTemplateItem $finishedTemplateItem;
                public final /* synthetic */ ShopDXEngine this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01011(ShopDXEngine shopDXEngine, DXTemplateItem dXTemplateItem) {
                    super(0);
                    this.this$0 = shopDXEngine;
                    this.$finishedTemplateItem = dXTemplateItem;
                }

                public static /* synthetic */ Object ipc$super(C01011 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopDXEngine$1$1");
                }

                @Override // tb.d1a
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                        return;
                    }
                    u1a u1aVar = (u1a) ShopDXEngine.c(this.this$0).get(Integer.valueOf(((hop) this.$finishedTemplateItem).n()));
                    if (u1aVar != null) {
                        DXTemplateItem dXTemplateItem = this.$finishedTemplateItem;
                        ckf.f(dXTemplateItem, "finishedTemplateItem");
                        u1aVar.invoke(dXTemplateItem, Boolean.TRUE);
                    }
                }
            }

            /* compiled from: Taobao */
            /* renamed from: com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine$1$2  reason: invalid class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
            public static final class AnonymousClass2 extends Lambda implements d1a<xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ DXTemplateItem $failedTemplateItem;
                public final /* synthetic */ ShopDXEngine this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(ShopDXEngine shopDXEngine, DXTemplateItem dXTemplateItem) {
                    super(0);
                    this.this$0 = shopDXEngine;
                    this.$failedTemplateItem = dXTemplateItem;
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopDXEngine$1$2");
                }

                @Override // tb.d1a
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                        return;
                    }
                    u1a u1aVar = (u1a) ShopDXEngine.c(this.this$0).get(Integer.valueOf(((hop) this.$failedTemplateItem).n()));
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
                        r54.C(new C01011(ShopDXEngine.this, dXTemplateItem));
                    }
                }
                for (DXTemplateItem dXTemplateItem2 : k66Var.b) {
                    if (dXTemplateItem2 instanceof hop) {
                        r54.C(new AnonymousClass2(ShopDXEngine.this, dXTemplateItem2));
                    }
                }
            }
        });
        dinamicXEngine.W0(mop.TB_SHOP_TAP_EVENT_CODE, new a(this));
    }

    public static final /* synthetic */ View a(ShopDXEngine shopDXEngine, DXTemplateItem dXTemplateItem, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b87d1e39", new Object[]{shopDXEngine, dXTemplateItem, jSONObject, new Boolean(z)});
        }
        return shopDXEngine.f(dXTemplateItem, jSONObject, z);
    }

    public static final /* synthetic */ Activity b(ShopDXEngine shopDXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("92c29d2e", new Object[]{shopDXEngine});
        }
        return shopDXEngine.f3095a;
    }

    public static final /* synthetic */ HashMap c(ShopDXEngine shopDXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("794ea571", new Object[]{shopDXEngine});
        }
        return shopDXEngine.e;
    }

    public static final /* synthetic */ boolean d(ShopDXEngine shopDXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66e04146", new Object[]{shopDXEngine})).booleanValue();
        }
        return shopDXEngine.f;
    }

    public static final /* synthetic */ void e(ShopDXEngine shopDXEngine, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb1334de", new Object[]{shopDXEngine, new Boolean(z)});
        } else {
            shopDXEngine.f = z;
        }
    }

    public final View f(DXTemplateItem dXTemplateItem, JSONObject jSONObject, boolean z) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("52310eab", new Object[]{this, dXTemplateItem, jSONObject, new Boolean(z)});
        }
        DXTemplateItem u = this.c.u(dXTemplateItem);
        DXResult<DXRootView> o = this.c.o(this.f3095a, u);
        if (z) {
            this.c.i1(this.f3095a, o.f7291a, u, jSONObject, -1, new DXRenderOptions.b().G(-2).q());
        } else {
            this.c.j1(o.f7291a, jSONObject);
        }
        DXRootView dXRootView = o.f7291a;
        ckf.f(dXRootView, "viewResult.result");
        kew.T(dXRootView);
        try {
            if (o.d()) {
                npp.Companion.b(ckf.p("template render Error : ", dXTemplateItem));
                for (f.a aVar : o.a().c) {
                    npp.Companion.b(aVar.toString());
                }
            }
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
        DXRootView dXRootView2 = o.f7291a;
        ckf.f(dXRootView2, "viewResult.result");
        return dXRootView2;
    }

    public final void g() {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84ac44f7", new Object[]{this});
            return;
        }
        try {
            ShopDataParser l = l();
            if (l == null) {
                xhvVar = null;
            } else {
                l.Z2("downgradeToMiniAppShop", 1);
                xhvVar = xhv.INSTANCE;
            }
            Result.m1108constructorimpl(xhvVar);
        } catch (Throwable th) {
            Result.m1108constructorimpl(kotlin.b.a(th));
        }
        ShopDXEngine$downgradeToMiniAppShop$block$1 shopDXEngine$downgradeToMiniAppShop$block$1 = new ShopDXEngine$downgradeToMiniAppShop$block$1(this);
        if (r54.h()) {
            r54.C(new ShopDXEngine$downgradeToMiniAppShop$2(shopDXEngine$downgradeToMiniAppShop$block$1));
        } else {
            shopDXEngine$downgradeToMiniAppShop$block$1.invoke();
        }
    }

    public final void h(JSONObject jSONObject, int i, u1a<? super DXTemplateItem, ? super Boolean, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88442e55", new Object[]{this, jSONObject, new Integer(i), u1aVar});
            return;
        }
        hop hopVar = (hop) gop.b(jSONObject);
        hopVar.o(i);
        this.e.put(Integer.valueOf(i), u1aVar);
        this.c.p(xz3.e(hopVar));
    }

    public final void i(JSONObject jSONObject, JSONObject jSONObject2, int i, boolean z, g1a<? super View, xhv> g1aVar, d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2c39ed8", new Object[]{this, jSONObject, jSONObject2, new Integer(i), new Boolean(z), g1aVar, d1aVar});
            return;
        }
        ckf.g(jSONObject, "dxJsonConfig");
        ckf.g(jSONObject2, "data");
        ckf.g(g1aVar, "createViewCallback");
        DXTemplateItem u = this.c.u(gop.b(jSONObject));
        if (u == null || !TextUtils.equals(jSONObject.getString("version"), String.valueOf(u.b))) {
            h(jSONObject, i, new ShopDXEngine$fetchAndDownloadDxTemplate$1(g1aVar, this, jSONObject2, z, jSONObject, d1aVar));
            return;
        }
        g1aVar.invoke(f(u, jSONObject2, z));
        npp.Companion.b(ckf.p("dx template fetch success : ", u.toString()));
    }

    public final DinamicXEngine j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("5bafc634", new Object[]{this});
        }
        return this.c;
    }

    public final kht k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kht) ipChange.ipc$dispatch("627ea113", new Object[]{this});
        }
        return this.d;
    }

    public final ShopDataParser l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("16b01ba5", new Object[]{this});
        }
        return this.b;
    }

    public final void m(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37976b35", new Object[]{this, shopDataParser});
        } else {
            this.b = shopDataParser;
        }
    }
}
