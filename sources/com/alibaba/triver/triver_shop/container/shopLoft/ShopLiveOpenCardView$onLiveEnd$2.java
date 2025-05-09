package com.alibaba.triver.triver_shop.container.shopLoft;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.npp;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopLiveOpenCardView$onLiveEnd$2 extends Lambda implements u1a<Integer, String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ShopLiveOpenCardView$onLiveEnd$2 INSTANCE = new ShopLiveOpenCardView$onLiveEnd$2();

    public ShopLiveOpenCardView$onLiveEnd$2() {
        super(2);
    }

    public static /* synthetic */ Object ipc$super(ShopLiveOpenCardView$onLiveEnd$2 shopLiveOpenCardView$onLiveEnd$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/shopLoft/ShopLiveOpenCardView$onLiveEnd$2");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num, String str) {
        invoke(num.intValue(), str);
        return xhv.INSTANCE;
    }

    public final void invoke(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5563eae", new Object[]{this, new Integer(i), str});
            return;
        }
        npp.a aVar = npp.Companion;
        aVar.b("onLiveRoomStatusOnEnd failed : " + i + ' ' + ((Object) str));
    }
}
