package com.alibaba.triver.triver_shop.newShop.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.H5ShopContentRender$rootContainer$2;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alibaba.triver.triver_shop.web.ShopBaseWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.WebView;
import kotlin.Result;
import tb.a07;
import tb.aqp;
import tb.bqp;
import tb.ckf;
import tb.g1a;
import tb.kew;
import tb.lcf;
import tb.njg;
import tb.npp;
import tb.ote;
import tb.t2o;
import tb.ups;
import tb.x1x;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class H5ShopContentRender extends BaseShopContentRender implements ShopBaseWebView.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ups g;
    public final String h;
    public final Context i;
    public final boolean j;
    public ShopWrapWebView k;
    public final njg l;
    public final ote m;
    public final x1x n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 534767588) {
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/newShop/view/H5ShopContentRender$onViewSelectedByViewPager$5");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            ShopWrapWebView z = H5ShopContentRender.z(H5ShopContentRender.this);
            if (z != null) {
                z.doOnPageFinishAction();
            }
            H5ShopContentRender.this.r();
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                return;
            }
            super.onPageStarted(webView, str, bitmap);
            H5ShopContentRender.this.t();
        }
    }

    static {
        t2o.a(766509624);
        t2o.a(766510483);
    }

    public /* synthetic */ H5ShopContentRender(ups upsVar, String str, Context context, boolean z, int i, a07 a07Var) {
        this(upsVar, str, context, (i & 8) != 0 ? false : z);
    }

    public static /* synthetic */ Object ipc$super(H5ShopContentRender h5ShopContentRender, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -964503480:
                super.h(((Number) objArr[0]).floatValue());
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/H5ShopContentRender");
        }
    }

    public static final /* synthetic */ Context v(H5ShopContentRender h5ShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("572febaa", new Object[]{h5ShopContentRender});
        }
        return h5ShopContentRender.i;
    }

    public static final /* synthetic */ H5ShopContentRender$rootContainer$2.AnonymousClass1 w(H5ShopContentRender h5ShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (H5ShopContentRender$rootContainer$2.AnonymousClass1) ipChange.ipc$dispatch("bb7bda6", new Object[]{h5ShopContentRender});
        }
        return h5ShopContentRender.B();
    }

    public static final /* synthetic */ ote x(H5ShopContentRender h5ShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ote) ipChange.ipc$dispatch("8d9672ac", new Object[]{h5ShopContentRender});
        }
        return h5ShopContentRender.m;
    }

    public static final /* synthetic */ ups y(H5ShopContentRender h5ShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ups) ipChange.ipc$dispatch("e9185b7a", new Object[]{h5ShopContentRender});
        }
        return h5ShopContentRender.g;
    }

    public static final /* synthetic */ ShopWrapWebView z(H5ShopContentRender h5ShopContentRender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopWrapWebView) ipChange.ipc$dispatch("b671d8b0", new Object[]{h5ShopContentRender});
        }
        return h5ShopContentRender.k;
    }

    public final void A() {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af5e4e8", new Object[]{this});
        } else if (aqp.Companion.D0()) {
            try {
                ShopWrapWebView shopWrapWebView = this.k;
                if (shopWrapWebView == null) {
                    xhvVar = null;
                } else {
                    shopWrapWebView.setLongPressSaveImage(false);
                    xhvVar = xhv.INSTANCE;
                }
                Result.m1108constructorimpl(xhvVar);
            } catch (Throwable th) {
                Result.m1108constructorimpl(kotlin.b.a(th));
            }
        }
    }

    public final H5ShopContentRender$rootContainer$2.AnonymousClass1 B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (H5ShopContentRender$rootContainer$2.AnonymousClass1) ipChange.ipc$dispatch("ef767c08", new Object[]{this});
        }
        return (H5ShopContentRender$rootContainer$2.AnonymousClass1) this.l.getValue();
    }

    @Override // com.alibaba.triver.triver_shop.web.ShopBaseWebView.b
    public void coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8929bd6", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)});
        } else {
            this.n.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void destroyView() {
        bqp h1;
        lcf<H5ShopContentRender> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        super.destroyView();
        B().removeAllViews();
        ShopWrapWebView shopWrapWebView = this.k;
        if (shopWrapWebView != null) {
            shopWrapWebView.destroy();
        }
        this.k = null;
        ShopDataParser o = this.g.o();
        if (o != null && (h1 = o.h1()) != null && (a2 = h1.a()) != null) {
            a2.j(this);
        }
    }

    @Override // tb.wpd
    public View getContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ce219891", new Object[]{this});
        }
        kew.h(B());
        kew.Y(B());
        return B();
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void h(float f) {
        ShopWrapWebView shopWrapWebView;
        View coreView;
        ShopDataParser.e O0;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c682d848", new Object[]{this, new Float(f)});
            return;
        }
        super.h(f);
        if (this.g.B() && (shopWrapWebView = this.k) != null && (coreView = shopWrapWebView.getCoreView()) != null) {
            ote oteVar = this.m;
            int i2 = (int) f;
            ShopDataParser o = this.g.o();
            if (!(o == null || (O0 = o.O0()) == null)) {
                i = O0.h();
            }
            oteVar.c(i2, coreView, i);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void k() {
        ShopDataParser.ShopViewContext m1;
        g1a<Boolean, xhv> i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345056d6", new Object[]{this});
            return;
        }
        super.k();
        ShopDataParser o = this.g.o();
        if (o != null && (m1 = o.m1()) != null && (i = m1.i()) != null) {
            i.invoke(Boolean.TRUE);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender
    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbd89bae", new Object[]{this})).booleanValue();
        }
        if ((!aqp.Companion.c0() || !this.g.B()) && this.k != null) {
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
        ShopWrapWebView shopWrapWebView = this.k;
        if (shopWrapWebView != null) {
            shopWrapWebView.onPause();
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        ShopWrapWebView shopWrapWebView = this.k;
        if (shopWrapWebView != null) {
            shopWrapWebView.onResume();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H5ShopContentRender(ups upsVar, String str, Context context, boolean z) {
        super(context, upsVar);
        ckf.g(upsVar, "tabBarItemDataModel");
        ckf.g(context, "context");
        this.g = upsVar;
        this.h = str;
        this.i = context;
        this.j = z;
        this.l = kotlin.a.b(new H5ShopContentRender$rootContainer$2(this));
        this.m = new ote(context);
        this.n = new x1x(0, new H5ShopContentRender$webViewScrollUpDetector$1(this), new H5ShopContentRender$webViewScrollUpDetector$2(this), 1, null);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f3118a;

        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ViewGroup.LayoutParams layoutParams;
            int i9 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            this.f3118a++;
            ShopWrapWebView z = H5ShopContentRender.z(H5ShopContentRender.this);
            Integer num = null;
            if (!(z == null || (layoutParams = z.getLayoutParams()) == null)) {
                num = Integer.valueOf(layoutParams.height);
            }
            if (this.f3118a < 3 || (num != null && num.intValue() == -1)) {
                ShopDataParser o = H5ShopContentRender.y(H5ShopContentRender.this).o();
                if (o != null) {
                    i9 = o.r0();
                }
                if (i9 <= 0) {
                    return;
                }
                if (num == null || num.intValue() != i9) {
                    npp.Companion.b(ckf.p("h5 content render : get new max content height : ", Integer.valueOf(i9)));
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, i9);
                    ShopWrapWebView z2 = H5ShopContentRender.z(H5ShopContentRender.this);
                    if (z2 != null) {
                        z2.setLayoutParams(layoutParams2);
                        return;
                    }
                    return;
                }
                return;
            }
            npp.Companion.b(ckf.p("h5 content render : last height : ", num));
            H5ShopContentRender.w(H5ShopContentRender.this).removeOnLayoutChangeListener(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0202  */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [T, com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView] */
    /* JADX WARN: Type inference failed for: r6v57, types: [com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView] */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.alibaba.triver.triver_shop.newShop.view.BaseShopContentRender, tb.wpd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j() {
        /*
            Method dump skipped, instructions count: 892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.newShop.view.H5ShopContentRender.j():void");
    }
}
