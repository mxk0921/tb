package com.alibaba.triver.triver_shop.jsapi;

import com.alibaba.triver.triver_shop.newShop.view.embed.SwipeBigCardComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WVShopApiBridge$updateBigCardModuleIndex$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $index;
    public final /* synthetic */ SwipeBigCardComponent $swipeBigCardComponent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WVShopApiBridge$updateBigCardModuleIndex$2(SwipeBigCardComponent swipeBigCardComponent, int i) {
        super(0);
        this.$swipeBigCardComponent = swipeBigCardComponent;
        this.$index = i;
    }

    public static /* synthetic */ Object ipc$super(WVShopApiBridge$updateBigCardModuleIndex$2 wVShopApiBridge$updateBigCardModuleIndex$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/jsapi/WVShopApiBridge$updateBigCardModuleIndex$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        SwipeBigCardComponent swipeBigCardComponent = this.$swipeBigCardComponent;
        if (swipeBigCardComponent != null) {
            swipeBigCardComponent.z(this.$index);
        }
    }
}
