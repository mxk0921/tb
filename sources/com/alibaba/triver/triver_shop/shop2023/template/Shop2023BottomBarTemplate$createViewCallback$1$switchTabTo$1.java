package com.alibaba.triver.triver_shop.shop2023.template;

import com.alibaba.triver.triver_shop.newShop.ext.ShopUTExposeEventKt;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;
import tb.ymp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2023BottomBarTemplate$createViewCallback$1$switchTabTo$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $tab;
    public final /* synthetic */ ymp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023BottomBarTemplate$createViewCallback$1$switchTabTo$1(ymp ympVar, int i) {
        super(0);
        this.$tab = i;
    }

    public static /* synthetic */ Object ipc$super(Shop2023BottomBarTemplate$createViewCallback$1$switchTabTo$1 shop2023BottomBarTemplate$createViewCallback$1$switchTabTo$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/template/Shop2023BottomBarTemplate$createViewCallback$1$switchTabTo$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            ShopUTExposeEventKt.e(ymp.i(null), this.$tab);
        }
    }
}
