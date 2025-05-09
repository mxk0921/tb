package com.alibaba.triver.triver_shop.shop2023.template;

import android.content.Context;
import android.view.View;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopDXEngine;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.Result;
import tb.a07;
import tb.brf;
import tb.ckf;
import tb.d1a;
import tb.jpu;
import tb.l77;
import tb.npp;
import tb.t2o;
import tb.ups;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2023HeaderInfoTemplate extends Shop2023BaseTemplateComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String STYLE_KEY = "currentStyle";
    public final d1a<Boolean> l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class HeaderStyle extends Enum<HeaderStyle> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String styleName;
        public static final HeaderStyle DEFAULT = new HeaderStyle("DEFAULT", 0, "default");
        public static final HeaderStyle INDEX_PAGE_FOLDED = new HeaderStyle("INDEX_PAGE_FOLDED", 1, "indexPageFoldedStyle");
        public static final HeaderStyle OTHER_PAGE = new HeaderStyle("OTHER_PAGE", 2, "otherPageStyle");
        private static final /* synthetic */ HeaderStyle[] $VALUES = $values();

        private static final /* synthetic */ HeaderStyle[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (HeaderStyle[]) ipChange.ipc$dispatch("a98a13c8", new Object[0]) : new HeaderStyle[]{DEFAULT, INDEX_PAGE_FOLDED, OTHER_PAGE};
        }

        private HeaderStyle(String str, int i, String str2) {
            this.styleName = str2;
        }

        public static /* synthetic */ Object ipc$super(HeaderStyle headerStyle, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/template/Shop2023HeaderInfoTemplate$HeaderStyle");
        }

        public static HeaderStyle valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("e2b6f5bd", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(HeaderStyle.class, str);
            }
            return (HeaderStyle) valueOf;
        }

        public static HeaderStyle[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("b5bf066c", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (HeaderStyle[]) clone;
        }

        public final String getStyleName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a6b7c593", new Object[]{this});
            }
            return this.styleName;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(766510443);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b extends l77 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(Context context) {
            super(context, Shop2023HeaderInfoTemplate.this);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 1329866066) {
                super.b(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/template/Shop2023HeaderInfoTemplate$createViewCallback$1");
        }

        @Override // tb.l77, tb.kht.b
        public void b(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f442552", new Object[]{this, obj});
            } else if (Shop2023HeaderInfoTemplate.this.J().invoke().booleanValue()) {
                super.b(obj);
            }
        }
    }

    static {
        t2o.a(766510442);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023HeaderInfoTemplate(ShopComponentModel shopComponentModel, d1a<Boolean> d1aVar) {
        super(shopComponentModel);
        ckf.g(shopComponentModel, "shopComponentModel");
        ckf.g(d1aVar, "canGoBackChecker");
        this.l = d1aVar;
    }

    public static /* synthetic */ Object ipc$super(Shop2023HeaderInfoTemplate shop2023HeaderInfoTemplate, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1548635899) {
            super.b((View) objArr[0]);
            return null;
        } else if (hashCode == -1436352665) {
            super.k((Context) objArr[0], (ShopDataParser) objArr[1], (ShopDXEngine) objArr[2], (JSONObject) objArr[3]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/shop2023/template/Shop2023HeaderInfoTemplate");
        }
    }

    public final void I(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5a57fd", new Object[]{this, new Boolean(z)});
        } else if (z) {
            z(brf.a(jpu.a("forceRenderStyle", ThemeUtils.COLOR_SCHEME_DARK)));
        } else {
            F("forceRenderStyle");
        }
    }

    public final d1a<Boolean> J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("5300e10a", new Object[]{this});
        }
        return this.l;
    }

    public final void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd8c47cb", new Object[]{this, new Boolean(z)});
        } else {
            z(brf.a(jpu.a("clearScreenStatus", Boolean.valueOf(z))));
        }
    }

    public final void L(boolean z, JSONObject jSONObject) {
        Object obj;
        DXRootView dXRootView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7611facf", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        try {
            View f = f();
            if (f instanceof DXRootView) {
                dXRootView = (DXRootView) f;
            } else {
                dXRootView = null;
            }
            ShopExtKt.T(dXRootView, jSONObject);
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }

    public final void M(HeaderStyle headerStyle) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852bd372", new Object[]{this, headerStyle});
            return;
        }
        ckf.g(headerStyle, "headerStyle");
        if (l() && (jSONObject = ShopExtKt.q(f()).getJSONObject("nativeData")) != null) {
            JSONObject jSONObject2 = (JSONObject) jSONObject.clone();
            jSONObject2.put((JSONObject) "currentStyle", headerStyle.getStyleName());
            y("nativeData", jSONObject2);
        }
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b1b105", new Object[]{this, view});
            return;
        }
        ckf.g(view, "view");
        h().k().b((DXRootView) view, new b(e()));
        super.b(view);
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.Shop2023BaseTemplateComponent, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent
    public void k(Context context, ShopDataParser shopDataParser, ShopDXEngine shopDXEngine, JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa62ff67", new Object[]{this, context, shopDataParser, shopDXEngine, jSONObject});
            return;
        }
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
        ckf.g(shopDXEngine, "shopDXEngine");
        super.k(context, shopDataParser, shopDXEngine, jSONObject);
        if (D().canRenderDXTemplate()) {
            JSONObject t = new ShopDataParser.e(shopDataParser).t(D().getData());
            JSONObject jSONObject2 = t.getJSONObject("nativeData");
            if (jSONObject2 != null) {
                jSONObject2.put((JSONObject) "isLivingStatus", (String) Boolean.valueOf(shopDataParser.V1()));
                jSONObject2.put((JSONObject) "hideMenuBtn", (String) Boolean.TRUE);
                ups t1 = shopDataParser.t1(shopDataParser.d0(), shopDataParser.f0());
                if (t1 != null) {
                    jSONObject2.put((JSONObject) "utArg1", t1.t());
                }
                if (shopDataParser.d0() == 0 && shopDataParser.O0().q()) {
                    jSONObject2.put((JSONObject) "forceRenderStyle", ThemeUtils.COLOR_SCHEME_DARK);
                }
                if (shopDataParser.O0().q()) {
                    str = HeaderStyle.INDEX_PAGE_FOLDED.getStyleName();
                } else {
                    str = HeaderStyle.DEFAULT.getStyleName();
                }
                jSONObject2.put((JSONObject) "currentStyle", str);
            }
            BaseTemplateComponent.r(this, D().getDXJSONConfig(), t, false, 4, null);
        }
    }

    public final void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fb09c29", new Object[]{this, new Boolean(z)});
        } else {
            z(brf.a(jpu.a("isLivePage", Boolean.valueOf(z))));
        }
    }

    public final void O(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec1c35e6", new Object[]{this, new Boolean(z)});
        } else {
            z(brf.a(jpu.a("isLivingStatus", Boolean.valueOf(z))));
        }
    }

    public final void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a841c54", new Object[]{this, str});
        } else {
            z(brf.a(jpu.a("utArg1", str)));
        }
    }
}
