package com.alibaba.triver.triver_shop.preload;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wangxin.utils.WXConstantsOut;
import tb.aqp;
import tb.ckf;
import tb.npp;
import tb.pl4;
import tb.r54;
import tb.t2o;
import tb.tui;
import tb.wsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopRouterMiniDataPreload {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ShopRouterMiniDataPreload INSTANCE = new ShopRouterMiniDataPreload();

    /* renamed from: a  reason: collision with root package name */
    public static boolean f3278a;
    public static boolean b;
    public static tui c;

    static {
        t2o.a(766510158);
    }

    public static final /* synthetic */ void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60e4a5e", new Object[]{new Boolean(z)});
        } else {
            f3278a = z;
        }
    }

    public static final /* synthetic */ void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a78b68c", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static final /* synthetic */ void c(ShopRouterMiniDataPreload shopRouterMiniDataPreload, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73750ef5", new Object[]{shopRouterMiniDataPreload, str});
        } else {
            shopRouterMiniDataPreload.h(str);
        }
    }

    public final tui d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tui) ipChange.ipc$dispatch("5c4acefe", new Object[]{this});
        }
        return c;
    }

    public final void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6963a591", new Object[]{this, context});
            return;
        }
        ckf.g(context, "context");
        LocalBroadcastManager.getInstance(context.getApplicationContext()).registerReceiver(new BroadcastReceiver() { // from class: com.alibaba.triver.triver_shop.preload.ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1 shopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/preload/ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                String stringExtra;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else if (intent != null && (stringExtra = intent.getStringExtra("shopRouteUrl")) != null) {
                    ShopRouterMiniDataPreload.c(ShopRouterMiniDataPreload.INSTANCE, stringExtra);
                    r54.P("updateEnableMiniDataPreloadSwitch", ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1$onReceive$1.INSTANCE);
                }
            }
        }, new IntentFilter("SHOP_START_ROUTE"));
        LocalBroadcastManager.getInstance(context.getApplicationContext()).registerReceiver(new BroadcastReceiver() { // from class: com.alibaba.triver.triver_shop.preload.ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$2 shopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/preload/ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$2");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                npp.Companion.b("SHOP_ROUTE_HIT");
                if (aqp.Companion.a0() && context2 != null) {
                    ShopIndexWebViewPreload.INSTANCE.e(context2);
                }
            }
        }, new IntentFilter("SHOP_ROUTE_HIT"));
    }

    public final void g(tui tuiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f2e502", new Object[]{this, tuiVar});
        } else {
            c = tuiVar;
        }
    }

    public final void h(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d530f21", new Object[]{this, str});
        } else if (f3278a && e(str)) {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("shopId");
            if (queryParameter == null && (queryParameter = parse.getQueryParameter(WXConstantsOut.SHOPID)) == null) {
                queryParameter = parse.getQueryParameter("shop_id");
            }
            String queryParameter2 = parse.getQueryParameter("sellerId");
            if (queryParameter2 == null && (queryParameter2 = parse.getQueryParameter("seller_id")) == null) {
                queryParameter2 = parse.getQueryParameter("user_id");
            }
            String queryParameter3 = parse.getQueryParameter("inShopPageId");
            if (queryParameter3 == null) {
                queryParameter3 = "0";
            }
            if (queryParameter == null || queryParameter2 == null) {
                npp.a aVar = npp.Companion;
                aVar.b("stop miniData shopId : " + ((Object) queryParameter) + " , sellerId : " + ((Object) queryParameter2));
            } else if (!b) {
                b = true;
                if (aqp.Companion.P0()) {
                    str2 = "https://alisite.wapa.taobao.com/minidata/shop/index/downgrade.htm?pathInfo=shop/index2";
                } else {
                    str2 = "https://alisitecdn.m.taobao.com/minidata/shop/index/downgrade.htm?pathInfo=shop/index2";
                }
                String uri = Uri.parse(str2).buildUpon().appendQueryParameter("shopId", queryParameter).appendQueryParameter("userId", queryParameter2).appendQueryParameter(pl4.KEY_PAGE_ID, queryParameter3).build().toString();
                ckf.f(uri, "parse(baseUrl).buildUpon()\n                .appendQueryParameter(\"shopId\", shopId)\n                .appendQueryParameter(\"userId\", sellerId)\n                .appendQueryParameter(\"pageId\", inShopPageId)\n                .build().toString()");
                r54.P("shopRouteMiniDataPrefetch", new ShopRouterMiniDataPreload$startShopMiniDataPreload$1(uri, queryParameter));
            }
        }
    }

    public final boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("49b0364", new Object[]{this, str})).booleanValue();
        }
        if (wsq.O(str, "isDX=true", false, 2, null) || ShopExtKt.J(str).b()) {
            return true;
        }
        npp.a aVar = npp.Companion;
        aVar.b("route url is " + str + " , not matched mini data preload");
        return false;
    }
}
