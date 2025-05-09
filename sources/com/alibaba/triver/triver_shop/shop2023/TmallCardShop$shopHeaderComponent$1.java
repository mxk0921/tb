package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.ShopHeaderComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TmallCardShop$shopHeaderComponent$1 extends Lambda implements g1a<ShopHeaderComponent, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TmallCardShop$shopHeaderComponent$1 INSTANCE = new TmallCardShop$shopHeaderComponent$1();

    public TmallCardShop$shopHeaderComponent$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(TmallCardShop$shopHeaderComponent$1 tmallCardShop$shopHeaderComponent$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/TmallCardShop$shopHeaderComponent$1");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ShopHeaderComponent shopHeaderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af4c628f", new Object[]{this, shopHeaderComponent});
        } else {
            ckf.g(shopHeaderComponent, "shopHeaderComponent");
        }
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(ShopHeaderComponent shopHeaderComponent) {
        invoke2(shopHeaderComponent);
        return xhv.INSTANCE;
    }
}
