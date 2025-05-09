package com.alibaba.triver.triver_shop.shop2023.nativeview;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.t2o;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopFarmTopNavBarNativeComponent extends Shop2023TopNavBarNativeComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766510396);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopFarmTopNavBarNativeComponent(Context context, ShopDataParser shopDataParser, int i) {
        super(context, shopDataParser, i);
        ckf.g(context, "context");
        ckf.g(shopDataParser, "shopData");
    }

    public static /* synthetic */ Object ipc$super(ShopFarmTopNavBarNativeComponent shopFarmTopNavBarNativeComponent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/ShopFarmTopNavBarNativeComponent");
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023TopNavBarNativeComponent
    public JSONArray i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("b731ee42", new Object[]{this});
        }
        return h().O0().e();
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023TopNavBarNativeComponent
    public void o(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f09b73", new Object[]{this, new Float(f)});
        }
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023TopNavBarNativeComponent
    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a487206", new Object[]{this, new Integer(i)});
            return;
        }
        int k = h().k(i);
        int i2 = h().i(i);
        u1a<Integer, Integer, xhv> j = j();
        if (j != null) {
            j.invoke(Integer.valueOf(k), Integer.valueOf(i2));
        }
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.nativeview.Shop2023TopNavBarNativeComponent
    public void w(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335dd7c9", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        e(h().j(i, i2));
        q(i);
    }
}
