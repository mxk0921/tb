package com.alibaba.triver.triver_shop.newShop;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.nyj;
import tb.xhv;
import tb.y1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class ShopActivity$initComponent$2 extends FunctionReferenceImpl implements y1a<Integer, Integer, Integer, Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ShopActivity$initComponent$2(ShopActivity shopActivity) {
        super(4, shopActivity, ShopActivity.class, nyj.TYPE_ON_PAGE_CHANGED, "onPageChanged(IIII)V", 0);
    }

    public static /* synthetic */ Object ipc$super(ShopActivity$initComponent$2 shopActivity$initComponent$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ShopActivity$initComponent$2");
    }

    @Override // tb.y1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num, Integer num2, Integer num3, Integer num4) {
        invoke(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442a5e3f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            ShopActivity.s3((ShopActivity) this.receiver, i, i2, i3, i4);
        }
    }
}
