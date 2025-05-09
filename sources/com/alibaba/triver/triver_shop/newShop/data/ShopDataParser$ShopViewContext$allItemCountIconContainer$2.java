package com.alibaba.triver.triver_shop.newShop.data;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopDataParser$ShopViewContext$allItemCountIconContainer$2 extends Lambda implements d1a<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ShopDataParser this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopDataParser$ShopViewContext$allItemCountIconContainer$2(ShopDataParser shopDataParser) {
        super(0);
        this.this$0 = shopDataParser;
    }

    public static /* synthetic */ Object ipc$super(ShopDataParser$ShopViewContext$allItemCountIconContainer$2 shopDataParser$ShopViewContext$allItemCountIconContainer$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/data/ShopDataParser$ShopViewContext$allItemCountIconContainer$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final FrameLayout invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ec2e147a", new Object[]{this});
        }
        Context b = ShopDataParser.b(this.this$0);
        ckf.d(b);
        return new FrameLayout(b);
    }
}
