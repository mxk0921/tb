package com.alibaba.triver.triver_shop.newShop.view.extend;

import android.graphics.Bitmap;
import android.view.View;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.EmbedViewConfig;
import com.uc.webview.export.extension.IEmbedViewContainer;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.ckf;
import tb.npp;
import tb.spp;
import tb.ssq;
import tb.t2o;
import tb.xhv;
import tb.zxr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopWebUCClient extends zxr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ShopWrapWebView b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements IEmbedViewContainer.OnStateChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<IEmbedView> f3265a;

        public a(Ref$ObjectRef<IEmbedView> ref$ObjectRef) {
            this.f3265a = ref$ObjectRef;
        }

        @Override // com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
        public void onAttachedToWebView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
            } else {
                this.f3265a.element.onAttachedToWebView();
            }
        }

        @Override // com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            } else {
                this.f3265a.element.onDestroy();
            }
        }

        @Override // com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
        public void onDetachedFromWebView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f7ebb65", new Object[]{this});
            } else {
                this.f3265a.element.onDetachedToWebView();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements IEmbedViewContainer.OnParamChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<IEmbedView> f3266a;

        public b(Ref$ObjectRef<IEmbedView> ref$ObjectRef) {
            this.f3266a = ref$ObjectRef;
        }

        @Override // com.uc.webview.export.extension.IEmbedViewContainer.OnParamChangedListener
        public final void onParamChanged(String[] strArr, String[] strArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
            } else {
                this.f3266a.element.onParamChanged(strArr, strArr2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements IEmbedViewContainer.OnVisibilityChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<IEmbedView> f3267a;

        public c(Ref$ObjectRef<IEmbedView> ref$ObjectRef) {
            this.f3267a = ref$ObjectRef;
        }

        @Override // com.uc.webview.export.extension.IEmbedViewContainer.OnVisibilityChangedListener
        public final void onVisibilityChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7606d219", new Object[]{this, new Integer(i)});
            } else {
                this.f3267a.element.onEmbedViewVisibilityChanged(i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements com.uc.webview.export.extension.IEmbedView {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3268a;
        public final /* synthetic */ Ref$ObjectRef<IEmbedView> b;

        public d(View view, Ref$ObjectRef<IEmbedView> ref$ObjectRef) {
            this.f3268a = view;
            this.b = ref$ObjectRef;
        }

        @Override // com.uc.webview.export.extension.IEmbedView
        public Bitmap getSnapShot() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("48acabf", new Object[]{this});
            }
            Bitmap snapshot = this.b.element.getSnapshot();
            ckf.f(snapshot, "iEmbedView.snapshot");
            return snapshot;
        }

        @Override // com.uc.webview.export.extension.IEmbedView
        public View getView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
            }
            View view = this.f3268a;
            ckf.f(view, "realView");
            return view;
        }
    }

    static {
        t2o.a(766510095);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopWebUCClient(ShopWrapWebView shopWrapWebView) {
        super(shopWrapWebView);
        ckf.g(shopWrapWebView, "webView");
        this.b = shopWrapWebView;
    }

    public static /* synthetic */ Object ipc$super(ShopWebUCClient shopWebUCClient, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1410714603) {
            return super.getEmbedView((EmbedViewConfig) objArr[0], (IEmbedViewContainer) objArr[1]);
        }
        if (hashCode == 1507240588) {
            super.onWebViewEvent((WebView) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/newShop/view/extend/ShopWebUCClient");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.uc.webview.export.extension.IEmbedView a(com.uc.webview.export.extension.EmbedViewConfig r10, com.uc.webview.export.extension.IEmbedViewContainer r11) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "2e6f3a70"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r9
            r3 = 1
            r2[r3] = r10
            r10 = 2
            r2[r10] = r11
            java.lang.Object r10 = r0.ipc$dispatch(r1, r2)
            com.uc.webview.export.extension.IEmbedView r10 = (com.uc.webview.export.extension.IEmbedView) r10
            return r10
        L_0x001b:
            r0 = 0
            com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView r1 = r9.b()     // Catch: all -> 0x0038
            android.content.Context r1 = r1._getContext()     // Catch: all -> 0x0038
            boolean r2 = r1 instanceof android.app.Activity     // Catch: all -> 0x0038
            if (r2 == 0) goto L_0x0029
            goto L_0x003c
        L_0x0029:
            boolean r2 = r1 instanceof android.content.MutableContextWrapper     // Catch: all -> 0x0038
            if (r2 == 0) goto L_0x003b
            android.content.MutableContextWrapper r1 = (android.content.MutableContextWrapper) r1     // Catch: all -> 0x0038
            android.content.Context r1 = r1.getBaseContext()     // Catch: all -> 0x0038
            boolean r2 = r1 instanceof android.app.Activity     // Catch: all -> 0x0038
            if (r2 == 0) goto L_0x003b
            goto L_0x003c
        L_0x0038:
            r10 = move-exception
            goto L_0x00b4
        L_0x003b:
            r1 = r0
        L_0x003c:
            if (r1 != 0) goto L_0x0046
            tb.npp$a r10 = tb.npp.Companion     // Catch: all -> 0x0038
            java.lang.String r11 = "create shop loft web component failed : no activity context"
            r10.b(r11)     // Catch: all -> 0x0038
            goto L_0x00ad
        L_0x0046:
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: all -> 0x0038
            r2.<init>()     // Catch: all -> 0x0038
            com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView r3 = new com.alibaba.triver.triver_shop.container.shopLoft.EmbedSecondFloorView     // Catch: all -> 0x0038
            r3.<init>()     // Catch: all -> 0x0038
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: all -> 0x0038
            r3.w(r1)     // Catch: all -> 0x0038
            java.util.HashMap r1 = new java.util.HashMap     // Catch: all -> 0x0038
            r1.<init>()     // Catch: all -> 0x0038
            r3.onCreate(r1)     // Catch: all -> 0x0038
            r2.element = r3     // Catch: all -> 0x0038
            tb.aqp$a r1 = tb.aqp.Companion     // Catch: all -> 0x0038
            boolean r1 = r1.Q()     // Catch: all -> 0x0038
            if (r1 == 0) goto L_0x006f
            com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient$createShopLoft$1$1$1 r1 = new com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient$createShopLoft$1$1$1     // Catch: all -> 0x0038
            r1.<init>(r9)     // Catch: all -> 0x0038
            r3.s(r1)     // Catch: all -> 0x0038
        L_0x006f:
            T r1 = r2.element     // Catch: all -> 0x0038
            r3 = r1
            com.alibaba.ariver.engine.api.embedview.IEmbedView r3 = (com.alibaba.ariver.engine.api.embedview.IEmbedView) r3     // Catch: all -> 0x0038
            int r4 = r10.mWidth     // Catch: all -> 0x0038
            int r5 = r10.mHeight     // Catch: all -> 0x0038
            int r1 = r10.mEmbedViewID     // Catch: all -> 0x0038
            java.lang.String r6 = java.lang.String.valueOf(r1)     // Catch: all -> 0x0038
            java.lang.String r7 = r10.mType     // Catch: all -> 0x0038
            java.util.Map r10 = r10.mObjectParam     // Catch: all -> 0x0038
            if (r10 != 0) goto L_0x0086
            r8 = r0
            goto L_0x008b
        L_0x0086:
            java.util.Map r10 = tb.r54.T(r10)     // Catch: all -> 0x0038
            r8 = r10
        L_0x008b:
            android.view.View r10 = r3.getView(r4, r5, r6, r7, r8)     // Catch: all -> 0x0038
            com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient$a r1 = new com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient$a     // Catch: all -> 0x0038
            r1.<init>(r2)     // Catch: all -> 0x0038
            r11.setOnStateChangedListener(r1)     // Catch: all -> 0x0038
            com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient$b r1 = new com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient$b     // Catch: all -> 0x0038
            r1.<init>(r2)     // Catch: all -> 0x0038
            r11.setOnParamChangedListener(r1)     // Catch: all -> 0x0038
            com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient$c r1 = new com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient$c     // Catch: all -> 0x0038
            r1.<init>(r2)     // Catch: all -> 0x0038
            r11.setOnVisibilityChangedListener(r1)     // Catch: all -> 0x0038
            com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient$d r11 = new com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient$d     // Catch: all -> 0x0038
            r11.<init>(r10, r2)     // Catch: all -> 0x0038
            r0 = r11
        L_0x00ad:
            tb.xhv r10 = tb.xhv.INSTANCE     // Catch: all -> 0x0038
            java.lang.Object r10 = kotlin.Result.m1108constructorimpl(r10)     // Catch: all -> 0x0038
            goto L_0x00bc
        L_0x00b4:
            java.lang.Object r10 = kotlin.b.a(r10)
            java.lang.Object r10 = kotlin.Result.m1108constructorimpl(r10)
        L_0x00bc:
            java.lang.Throwable r10 = kotlin.Result.m1111exceptionOrNullimpl(r10)
            if (r10 != 0) goto L_0x00c3
            goto L_0x00ca
        L_0x00c3:
            tb.npp$a r11 = tb.npp.Companion
            java.lang.String r1 = "catching block has error"
            r11.c(r1, r10)
        L_0x00ca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.view.extend.ShopWebUCClient.a(com.uc.webview.export.extension.EmbedViewConfig, com.uc.webview.export.extension.IEmbedViewContainer):com.uc.webview.export.extension.IEmbedView");
    }

    public final ShopWrapWebView b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopWrapWebView) ipChange.ipc$dispatch("913f6b8e", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.zxr, android.taobao.windvane.extra.uc.WVUCClient, com.uc.webview.export.extension.UCClient
    public void onWebViewEvent(WebView webView, int i, Object obj) {
        Long o;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d6aa8c", new Object[]{this, webView, new Integer(i), obj});
            return;
        }
        super.onWebViewEvent(webView, i, obj);
        if (i == 13 || i == 14) {
            try {
                if ((obj instanceof Map) && ((Map) obj).containsKey("ts")) {
                    Object obj3 = ((Map) obj).get("ts");
                    String obj4 = obj3 == null ? null : obj3.toString();
                    if (!(!spp.b(b().getCurrentPageName()) || obj4 == null || (o = ssq.o(obj4)) == null)) {
                        long longValue = o.longValue();
                        ShopDataParser shopData = b().getShopData();
                        if (shopData != null) {
                            shopData.Y2("shopindex_real_uc_t2", Long.valueOf(longValue));
                        }
                    }
                }
            } catch (Throwable th) {
                obj2 = Result.m1108constructorimpl(kotlin.b.a(th));
            }
        }
        obj2 = Result.m1108constructorimpl(xhv.INSTANCE);
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj2);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }

    @Override // tb.zxr, android.taobao.windvane.extra.uc.WVUCClient, com.uc.webview.export.extension.UCClient
    public com.uc.webview.export.extension.IEmbedView getEmbedView(EmbedViewConfig embedViewConfig, IEmbedViewContainer iEmbedViewContainer) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.uc.webview.export.extension.IEmbedView) ipChange.ipc$dispatch("5415cbeb", new Object[]{this, embedViewConfig, iEmbedViewContainer});
        }
        if (embedViewConfig == null || iEmbedViewContainer == null) {
            npp.a aVar = npp.Companion;
            StringBuilder sb = new StringBuilder("create embed view failed config is null = ");
            sb.append(embedViewConfig == null);
            sb.append(" , container is null = ");
            if (iEmbedViewContainer != null) {
                z = false;
            }
            sb.append(z);
            aVar.b(sb.toString());
            return null;
        } else if (ckf.b((String) embedViewConfig.mObjectParam.get("type"), "shop-loft-web")) {
            return a(embedViewConfig, iEmbedViewContainer);
        } else {
            return super.getEmbedView(embedViewConfig, iEmbedViewContainer);
        }
    }
}
