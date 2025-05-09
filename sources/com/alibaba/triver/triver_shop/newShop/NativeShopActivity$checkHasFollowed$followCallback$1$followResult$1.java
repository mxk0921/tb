package com.alibaba.triver.triver_shop.newShop;

import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NativeShopActivity$checkHasFollowed$followCallback$1$followResult$1 extends Lambda implements g1a<Map<String, String>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$checkHasFollowed$followCallback$1$followResult$1(NativeShopActivity nativeShopActivity) {
        super(1);
        this.this$0 = nativeShopActivity;
    }

    public static /* synthetic */ Object ipc$super(NativeShopActivity$checkHasFollowed$followCallback$1$followResult$1 nativeShopActivity$checkHasFollowed$followCallback$1$followResult$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$checkHasFollowed$followCallback$1$followResult$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Map<String, String> map) {
        invoke2(map);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440b90a6", new Object[]{this, map});
            return;
        }
        NativeShopActivity nativeShopActivity = this.this$0;
        ShopDataParser I3 = NativeShopActivity.I3(nativeShopActivity);
        if (I3 != null) {
            ShopExtKt.k(nativeShopActivity, map, I3);
        } else {
            ckf.y("shopDataParser");
            throw null;
        }
    }
}
