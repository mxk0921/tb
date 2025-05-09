package com.alibaba.triver.triver_shop.container.shopLoft;

import android.app.Activity;
import android.app.Application;
import android.graphics.Bitmap;
import android.view.View;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.Result;
import kotlin.b;
import kotlin.jvm.internal.Lambda;
import tb.brf;
import tb.ckf;
import tb.d1a;
import tb.fmi;
import tb.g1a;
import tb.mmi;
import tb.npp;
import tb.r54;
import tb.t2o;
import tb.u1a;
import tb.xhv;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class EmbedSecondFloorView extends BaseEmbedView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean d;
    public boolean e;
    public boolean f;
    public ShopDataParser g;
    public String h;
    public JSONObject i;
    public mmi j;
    public xpd k;
    public View l;
    public Activity m;
    public u1a<? super String, ? super JSONObject, xhv> n;
    public g1a<? super JSONObject, xhv> o;

    /* renamed from: a  reason: collision with root package name */
    public final xpd.a f2981a = new xpd.a();
    public boolean b = true;
    public boolean c = true;
    public final fmi p = new fmi() { // from class: com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView$messageCallback$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView$messageCallback$1$1  reason: invalid class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ JSONObject $msgDataObject;
            public final /* synthetic */ EmbedSecondFloorView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(EmbedSecondFloorView embedSecondFloorView, JSONObject jSONObject) {
                super(0);
                this.this$0 = embedSecondFloorView;
                this.$msgDataObject = jSONObject;
            }

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/EmbedSecondFloorView$messageCallback$1$1");
            }

            @Override // tb.d1a
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7560ccff", new Object[]{this});
                } else {
                    EmbedSecondFloorView.a(this.this$0, this.$msgDataObject.getString("event"), this.$msgDataObject);
                }
            }
        }

        @Override // tb.fmi
        public final void b(Object obj) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a88433cb", new Object[]{this, obj});
                return;
            }
            if (obj instanceof String) {
                jSONObject = brf.k((String) obj);
            } else {
                jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
            }
            if (jSONObject != null && ckf.b("shoploft.page2component.message", jSONObject.getString("_msg_type"))) {
                jSONObject.getString("_msg_name");
                JSONObject k = brf.k(jSONObject.getString("_msg_data"));
                if (k != null && EmbedSecondFloorView.this.g() != null) {
                    r54.C(new AnonymousClass1(EmbedSecondFloorView.this, k));
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements xpd.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
        @Override // tb.xpd.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void p(java.lang.String r5, com.alibaba.fastjson.JSONObject r6) {
            /*
                r4 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView.a.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L_0x0018
                java.lang.String r1 = "f4d37024"
                r2 = 3
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r4
                r3 = 1
                r2[r3] = r5
                r5 = 2
                r2[r5] = r6
                r0.ipc$dispatch(r1, r2)
                return
            L_0x0018:
                if (r5 == 0) goto L_0x0066
                int r0 = r5.hashCode()
                switch(r0) {
                    case -2003762904: goto L_0x0058;
                    case -1349867671: goto L_0x004b;
                    case -1340212393: goto L_0x003d;
                    case -1013054029: goto L_0x002f;
                    case 1123967826: goto L_0x0022;
                    default: goto L_0x0021;
                }
            L_0x0021:
                goto L_0x0066
            L_0x0022:
                java.lang.String r0 = "onFinish"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x002c
                goto L_0x0066
            L_0x002c:
                java.lang.String r0 = "finish"
                goto L_0x0067
            L_0x002f:
                java.lang.String r0 = "onPlay"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0039
                goto L_0x0066
            L_0x0039:
                java.lang.String r0 = "play"
                goto L_0x0067
            L_0x003d:
                java.lang.String r0 = "onPause"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0047
                goto L_0x0066
            L_0x0047:
                java.lang.String r0 = "pause"
                goto L_0x0067
            L_0x004b:
                java.lang.String r0 = "onError"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0055
                goto L_0x0066
            L_0x0055:
                java.lang.String r0 = "error"
                goto L_0x0067
            L_0x0058:
                java.lang.String r0 = "onMessage"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0062
                goto L_0x0066
            L_0x0062:
                java.lang.String r0 = "message"
                goto L_0x0067
            L_0x0066:
                r0 = r5
            L_0x0067:
                java.lang.String r1 = "utPageAppear"
                boolean r1 = tb.ckf.b(r5, r1)
                if (r1 == 0) goto L_0x0082
                com.ut.mini.UTAnalytics r1 = com.ut.mini.UTAnalytics.getInstance()
                com.ut.mini.UTTracker r1 = r1.getDefaultTracker()
                com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView r2 = com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView.this
                android.app.Activity r2 = r2.d()
                r1.pageAppear(r2)
                goto L_0x009c
            L_0x0082:
                java.lang.String r1 = "utPageDisappear"
                boolean r1 = tb.ckf.b(r5, r1)
                if (r1 == 0) goto L_0x009c
                com.ut.mini.UTAnalytics r1 = com.ut.mini.UTAnalytics.getInstance()
                com.ut.mini.UTTracker r1 = r1.getDefaultTracker()
                com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView r2 = com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView.this
                android.app.Activity r2 = r2.d()
                r1.pageDisAppear(r2)
            L_0x009c:
                com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView r1 = com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView.this
                r2 = 0
                r1.sendEvent(r0, r6, r2)
                tb.npp$a r0 = tb.npp.Companion
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "embedSecondFloor onEvent : "
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r5 = ", data : "
                r1.append(r5)
                r1.append(r6)
                java.lang.String r5 = r1.toString()
                r0.a(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView.a.p(java.lang.String, com.alibaba.fastjson.JSONObject):void");
        }
    }

    static {
        t2o.a(766509117);
    }

    public static final /* synthetic */ void a(EmbedSecondFloorView embedSecondFloorView, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b91814e", new Object[]{embedSecondFloorView, str, jSONObject});
        } else {
            embedSecondFloorView.p(str, jSONObject);
        }
    }

    public static /* synthetic */ Object ipc$super(EmbedSecondFloorView embedSecondFloorView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -759742441) {
            super.sendEvent((String) objArr[0], (JSONObject) objArr[1], (IEmbedCallback) objArr[2]);
            return null;
        } else if (hashCode == 1664325763) {
            super.onCreate((Map) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/container/shopLoft/EmbedSecondFloorView");
        }
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85af8ed0", new Object[]{this});
            return;
        }
        xpd xpdVar = this.k;
        if (xpdVar != null) {
            xpdVar.startAnimation();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8d2837", new Object[]{this});
            return;
        }
        xpd xpdVar = this.k;
        if (xpdVar != null) {
            xpdVar.endAnimation();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96de09c3", new Object[]{this});
            return;
        }
        xpd xpdVar = this.k;
        if (xpdVar != null) {
            xpdVar.endAnimation();
        }
    }

    public final Activity d() {
        PageContext pageContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        Activity activity = this.m;
        if (activity != null) {
            return activity;
        }
        Page outerPage = getOuterPage();
        if (outerPage == null || (pageContext = outerPage.getPageContext()) == null) {
            return null;
        }
        return pageContext.getActivity();
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8c49ea8", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final xpd.a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpd.a) ipChange.ipc$dispatch("ab88fcc3", new Object[]{this});
        }
        return this.f2981a;
    }

    public final xpd g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpd) ipChange.ipc$dispatch("f1a41806", new Object[]{this});
        }
        return this.k;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public Bitmap getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a92c69f", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return "shop-loft";
    }

    public final g1a<JSONObject, xhv> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("c09f1d62", new Object[]{this});
        }
        return this.o;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cca9e7c0", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeb16e", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74a41a53", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        xpd xpdVar = this.k;
        if (xpdVar != null) {
            xpdVar.mute(z);
        }
    }

    public final void m(Map<String, String> map) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79431965", new Object[]{this, map});
        } else if (map != null) {
            npp.Companion.b(ckf.p("shopLoftEmbed getView1 : ", r54.X(map)));
            map.get("weexShopToken");
            map.get("weexShopTabId");
            map.get("sellerId");
            if (map.containsKey("mute")) {
                this.c = ckf.b("true", map.get("mute"));
            }
            if (map.containsKey("visible")) {
                ckf.b("true", map.get("visible"));
            }
            if (map.containsKey("contentData")) {
                JSONObject k = brf.k(map.get("contentData"));
                this.i = k;
                if (k != null) {
                    k.put("inBigCard", (Object) "true");
                }
            }
            map.get("contentId");
            this.h = ShopLoftViewManager.getTypeFromSceneId(map.get("contentType"));
            String str = map.get("paddingBottom");
            if (!(str == null || (jSONObject2 = this.i) == null)) {
                jSONObject2.put("paddingBottom", (Object) str);
            }
            String str2 = map.get("aspectRatio");
            if (str2 != null && (jSONObject = this.i) != null) {
                jSONObject.put("aspectRatio", (Object) str2);
            }
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        xpd xpdVar = this.k;
        if (xpdVar != null) {
            xpdVar.pause();
        }
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        xpd xpdVar = this.k;
        if (xpdVar != null) {
            xpdVar.play();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63339883", new Object[]{this, map});
            return;
        }
        try {
            super.onCreate(map);
            Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            Result.m1108constructorimpl(b.a(th));
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        xpd xpdVar = this.k;
        if (xpdVar != null) {
            xpdVar.onDestroyed();
        }
        mmi mmiVar = this.j;
        if (mmiVar != null) {
            mmiVar.a();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDetachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850d0fb4", new Object[]{this});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onEmbedViewVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c81239", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedMessage(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231420a4", new Object[]{this, str, jSONObject, bridgeCallback});
            return;
        }
        npp.Companion.b(ckf.p("shopLoftEmbed onReceivedMessage : ", jSONObject == null ? null : jSONObject.toJSONString()));
        r54.C(new EmbedSecondFloorView$onReceivedMessage$1(this, str, jSONObject));
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa2a2d", new Object[]{this, new Integer(i), strArr, iArr});
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457ef63", new Object[]{this});
            return;
        }
        xpd xpdVar = this.k;
        if (xpdVar != null) {
            xpdVar.pause();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
            return;
        }
        xpd xpdVar = this.k;
        if (xpdVar != null) {
            xpdVar.play();
        }
    }

    public final void p(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd8a9ce7", new Object[]{this, str, jSONObject});
            return;
        }
        npp.a aVar = npp.Companion;
        aVar.b("shopLoftEmbed processMessage : " + ((Object) str) + " , " + jSONObject);
        if (str != null) {
            switch (str.hashCode()) {
                case -1601273667:
                    if (str.equals("willSizing2FullScreen")) {
                        z();
                        return;
                    }
                    return;
                case -1313014864:
                    if (str.equals("didSizing2FullScreen")) {
                        b();
                        return;
                    }
                    return;
                case -934641255:
                    if (str.equals("reload")) {
                        q();
                        return;
                    }
                    return;
                case 3363353:
                    if (str.equals("mute") && jSONObject != null) {
                        Object obj = jSONObject.get("value");
                        if (!(obj instanceof String)) {
                            obj = "false";
                        }
                        u(ckf.b(obj, "true"));
                        return;
                    }
                    return;
                case 3443508:
                    if (str.equals("play")) {
                        o();
                        return;
                    }
                    return;
                case 106440182:
                    if (str.equals("pause")) {
                        n();
                        return;
                    }
                    return;
                case 930382652:
                    if (str.equals("didSizing2Normal")) {
                        c();
                        return;
                    }
                    return;
                case 985962185:
                    if (str.equals("willSizing2Normal")) {
                        A();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        }
    }

    public final void r(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("978a8e60", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public final void s(u1a<? super String, ? super JSONObject, xhv> u1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e2c8d8", new Object[]{this, u1aVar});
        } else {
            this.n = u1aVar;
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void sendEvent(String str, JSONObject jSONObject, IEmbedCallback iEmbedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b74017", new Object[]{this, str, jSONObject, iEmbedCallback});
            return;
        }
        u1a<? super String, ? super JSONObject, xhv> u1aVar = this.n;
        if (u1aVar != null) {
            u1aVar.invoke(str, jSONObject);
        }
        if (getOuterPage() != null) {
            super.sendEvent(str, jSONObject, iEmbedCallback);
        }
    }

    public final void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6fb6abc", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public final void u(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z)});
            return;
        }
        xpd xpdVar = this.k;
        if (xpdVar != null) {
            xpdVar.mute(z);
        }
    }

    public final void v(g1a<? super JSONObject, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba48d2f4", new Object[]{this, g1aVar});
        } else {
            this.o = g1aVar;
        }
    }

    public final void w(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d5ca01", new Object[]{this, activity});
        } else {
            this.m = activity;
        }
    }

    public final void x(ShopDataParser shopDataParser) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37976b35", new Object[]{this, shopDataParser});
        } else {
            this.g = shopDataParser;
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44869ab2", new Object[]{this});
            return;
        }
        Activity d = d();
        if (d != null && !r54.x(d)) {
            r54.F(new EmbedSecondFloorView$showNoWifiTips$1$1(d));
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfcb5ec4", new Object[]{this});
            return;
        }
        xpd xpdVar = this.k;
        if (xpdVar != null) {
            xpdVar.startAnimation();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public View getView(int i, int i2, String str, String str2, Map<String, String> map) {
        Object obj;
        ShopDataParser shopDataParser;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        m(map);
        Activity activity = this.m;
        View view = null;
        Application applicationContext = activity == null ? null : activity.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
        }
        this.j = new mmi(applicationContext, "mashop_broadcast", this.p);
        String str3 = this.h;
        if (!this.f) {
            if (ckf.b(str3, ShopLoftViewManager.TYPE_VIDEO)) {
                str3 = ShopLoftViewManager.TYPE_MINI_CARD_VIDEO;
                this.d = true;
            }
            if (ckf.b(str3, ShopLoftViewManager.TYPE_MARKET)) {
                JSONObject jSONObject2 = this.i;
                if (ckf.b("video", jSONObject2 == null ? null : jSONObject2.getString("marketType"))) {
                    str3 = ShopLoftViewManager.TYPE_MARKET_VIDEO;
                    this.d = true;
                }
            }
            if (ckf.b(str3, ShopLoftViewManager.TYPE_LIVE)) {
                npp.Companion.b("直播老架构已经不再被支持 type == MINI_LIVE");
                str3 = ShopLoftViewManager.TYPE_MINI_CARD_LIVE;
                this.e = true;
            }
        } else {
            str3 = ShopLoftViewManager.TYPE_SHOP_2023_LIVE;
            ShopDataParser shopDataParser2 = this.g;
            if (shopDataParser2 != null && shopDataParser2.T1()) {
                str3 = ShopLoftViewManager.TYPE_SHOP_2023_LIVE_NEW;
            }
            this.e = true;
        }
        ShopDataParser shopDataParser3 = this.g;
        if (shopDataParser3 != null && shopDataParser3.a3() && (shopDataParser = this.g) != null && shopDataParser.Y1()) {
            str3 = ShopLoftViewManager.TYPE_SHOP_2023_LIVE_NEW;
            this.e = true;
            JSONObject jSONObject3 = this.i;
            if (!(jSONObject3 == null || (jSONObject = jSONObject3.getJSONObject("data")) == null)) {
                this.i = jSONObject;
            }
        }
        xpd createShopLoftViewByType = ShopLoftViewManager.createShopLoftViewByType(str3);
        this.k = createShopLoftViewByType;
        if (createShopLoftViewByType == null) {
            return null;
        }
        try {
            npp.a aVar = npp.Companion;
            JSONObject jSONObject4 = this.i;
            aVar.b(ckf.p("shop loft view init with data : ", jSONObject4 == null ? null : jSONObject4.toString()));
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
        xpd xpdVar = this.k;
        ShopLiveOpenCardView shopLiveOpenCardView = xpdVar instanceof ShopLiveOpenCardView ? (ShopLiveOpenCardView) xpdVar : null;
        if (shopLiveOpenCardView != null) {
            shopLiveOpenCardView.l(new EmbedSecondFloorView$getView$3$1(this));
        }
        xpd xpdVar2 = this.k;
        if (xpdVar2 != null) {
            xpdVar2.initWithData(d(), this.i, new a(), this.f2981a);
        }
        xpd xpdVar3 = this.k;
        if (xpdVar3 != null) {
            view = xpdVar3.getView();
        }
        this.l = view;
        xpd xpdVar4 = this.k;
        if (xpdVar4 != null) {
            xpdVar4.mute(this.c);
        }
        r54.C(new EmbedSecondFloorView$getView$5(this));
        if (!ckf.b(str3, ShopLoftViewManager.TYPE_MARKET)) {
            y();
        }
        return this.l;
    }
}
