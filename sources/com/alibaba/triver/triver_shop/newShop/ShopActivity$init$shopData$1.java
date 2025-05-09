package com.alibaba.triver.triver_shop.newShop;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class ShopActivity$init$shopData$1 extends FunctionReferenceImpl implements u1a<String, Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ShopActivity$init$shopData$1(ShopActivity shopActivity) {
        super(2, shopActivity, ShopActivity.class, "parseDataErrorCallback", "parseDataErrorCallback(Ljava/lang/String;I)V", 0);
    }

    public static /* synthetic */ Object ipc$super(ShopActivity$init$shopData$1 shopActivity$init$shopData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ShopActivity$init$shopData$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(String str, Integer num) {
        invoke(str, num.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5588bf1a", new Object[]{this, str, new Integer(i)});
        } else {
            ShopActivity.t3((ShopActivity) this.receiver, str, i);
        }
    }
}
