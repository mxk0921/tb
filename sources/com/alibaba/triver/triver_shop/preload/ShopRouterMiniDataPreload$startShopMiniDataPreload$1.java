package com.alibaba.triver.triver_shop.preload;

import android.util.Log;
import com.alibaba.triver.triver_shop.newShop.ext.BizExtKt;
import com.alibaba.triver.triver_shop.newShop.view.ShopView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.brf;
import tb.ckf;
import tb.d1a;
import tb.jpu;
import tb.npp;
import tb.tui;
import tb.uj3;
import tb.xhv;
import tb.z7b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopRouterMiniDataPreload$startShopMiniDataPreload$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $shopId;
    public final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopRouterMiniDataPreload$startShopMiniDataPreload$1(String str, String str2) {
        super(0);
        this.$url = str;
        this.$shopId = str2;
    }

    public static /* synthetic */ Object ipc$super(ShopRouterMiniDataPreload$startShopMiniDataPreload$1 shopRouterMiniDataPreload$startShopMiniDataPreload$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/preload/ShopRouterMiniDataPreload$startShopMiniDataPreload$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        npp.a aVar = npp.Companion;
        aVar.b(ckf.p("shop route mini data url : ", this.$url));
        z7b f = BizExtKt.f(this.$url, null, 2, null);
        String str = f.a() == null ? "" : new String(f.a(), uj3.UTF_8);
        if (f.b() != 200 || str.length() <= 0) {
            aVar.b(ckf.p("shop route request miniData failed : ", str));
        } else {
            ShopRouterMiniDataPreload.INSTANCE.g(new tui(this.$shopId, System.currentTimeMillis(), brf.a(jpu.a("status", 200), jpu.a("data", str)).toJSONString()));
            aVar.b("shop route request miniData success");
            Log.e(ShopView.SP_NAMESPACE, "shop route request miniData success");
        }
        ShopRouterMiniDataPreload.b(false);
    }
}
