package com.alibaba.triver.triver_shop.preload;

import android.content.Context;
import android.os.Looper;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Result;
import kotlin.b;
import tb.aqp;
import tb.ckf;
import tb.npp;
import tb.r54;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopIndexWebViewPreload {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ShopIndexWebViewPreload INSTANCE = new ShopIndexWebViewPreload();

    /* renamed from: a  reason: collision with root package name */
    public static ShopWrapWebView f3277a;

    static {
        t2o.a(766510151);
    }

    public static final /* synthetic */ ShopWrapWebView a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopWrapWebView) ipChange.ipc$dispatch("aa51cb9e", new Object[0]);
        }
        return f3277a;
    }

    public static final /* synthetic */ void b(ShopWrapWebView shopWrapWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd72a88", new Object[]{shopWrapWebView});
        } else {
            f3277a = shopWrapWebView;
        }
    }

    public final ShopWrapWebView c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopWrapWebView) ipChange.ipc$dispatch("ab4bac46", new Object[]{this});
        }
        ShopWrapWebView shopWrapWebView = f3277a;
        f3277a = null;
        return shopWrapWebView;
    }

    public final void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbcd673a", new Object[]{this, context});
            return;
        }
        ckf.g(context, "context");
        if (aqp.Companion.e0()) {
            d(context);
        }
    }

    public final void d(Context context) {
        Object obj;
        ShopWrapWebView shopWrapWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76bf19bb", new Object[]{this, context});
            return;
        }
        ShopWrapWebView shopWrapWebView2 = f3277a;
        if ((shopWrapWebView2 == null ? null : shopWrapWebView2.getShopData()) != null || ((shopWrapWebView = f3277a) != null && shopWrapWebView.getAlreadyInjectOnNShopPreloadResume())) {
            ShopWrapWebView shopWrapWebView3 = f3277a;
            f3277a = null;
            if (shopWrapWebView3 != null) {
                try {
                    shopWrapWebView3.destroyWebView();
                } catch (Throwable th) {
                    obj = Result.m1108constructorimpl(b.a(th));
                }
            }
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
            Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
            if (th2 != null) {
                npp.Companion.c("catching block has error", th2);
            }
            npp.Companion.b("release used preload shop index webView");
        }
        if (f3277a != null) {
            npp.Companion.b("already have preload shop index webView");
            return;
        }
        ShopIndexWebViewPreload$preloadShopIndexWebView$preloadBlock$1 shopIndexWebViewPreload$preloadShopIndexWebView$preloadBlock$1 = new ShopIndexWebViewPreload$preloadShopIndexWebView$preloadBlock$1(context);
        if (ckf.b(Looper.getMainLooper(), Looper.myLooper())) {
            shopIndexWebViewPreload$preloadShopIndexWebView$preloadBlock$1.invoke();
        } else {
            r54.C(shopIndexWebViewPreload$preloadShopIndexWebView$preloadBlock$1);
        }
    }
}
