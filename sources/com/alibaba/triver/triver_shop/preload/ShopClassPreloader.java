package com.alibaba.triver.triver_shop.preload;

import com.alibaba.triver.triver_shop.newShop.ShopActivity;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.view.component.FlagShipContentComponentV2;
import com.alibaba.triver.triver_shop.newShop.view.extend.ShopWrapWebView;
import com.alibaba.triver.triver_shop.shop2023.Default2023Shop;
import com.alibaba.triver.triver_shop.web.ShopBaseWebView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.a07;
import tb.cqp;
import tb.eop;
import tb.r54;
import tb.t2o;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopClassPreloader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion = new Companion(null);

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList<Class<? extends Object>> f3276a = yz3.g(ShopActivity.class, eop.class, FlagShipContentComponentV2.class, Default2023Shop.class, cqp.class, ShopDataParser.class, ShopIndexWebViewPreload.class, ShopWrapWebView.class, ShopBaseWebView.class);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766510148);
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7edf7f17", new Object[]{this});
            } else {
                r54.P("preloadAllItemsClass", ShopClassPreloader$Companion$preloadAllItemsClass$1.INSTANCE);
            }
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1a78420", new Object[]{this});
            } else {
                r54.P("preloadShopSelfClass", ShopClassPreloader$Companion$preloadShopClass$1.INSTANCE);
            }
        }

        public Companion() {
        }
    }

    static {
        t2o.a(766510147);
    }

    public static final /* synthetic */ ArrayList a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("dad47cb2", new Object[0]);
        }
        return f3276a;
    }
}
