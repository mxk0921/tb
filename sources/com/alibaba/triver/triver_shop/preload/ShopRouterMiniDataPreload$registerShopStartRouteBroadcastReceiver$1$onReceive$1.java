package com.alibaba.triver.triver_shop.preload;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.aqp;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1$onReceive$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1$onReceive$1 INSTANCE = new ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1$onReceive$1();

    public ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1$onReceive$1() {
        super(0);
    }

    public static /* synthetic */ Object ipc$super(ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1$onReceive$1 shopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1$onReceive$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/preload/ShopRouterMiniDataPreload$registerShopStartRouteBroadcastReceiver$1$onReceive$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        IpChange ipChange2 = ShopRouterMiniDataPreload.$ipChange;
        ShopRouterMiniDataPreload.a(aqp.Companion.G());
    }
}
