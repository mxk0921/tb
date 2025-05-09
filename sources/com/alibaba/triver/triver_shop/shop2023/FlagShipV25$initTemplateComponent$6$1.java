package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipV25$initTemplateComponent$6$1 extends Lambda implements g1a<Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FlagShipV25 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipV25$initTemplateComponent$6$1(FlagShipV25 flagShipV25) {
        super(1);
        this.this$0 = flagShipV25;
    }

    public static /* synthetic */ Object ipc$super(FlagShipV25$initTemplateComponent$6$1 flagShipV25$initTemplateComponent$6$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FlagShipV25$initTemplateComponent$6$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num) {
        invoke(num.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b945e4", new Object[]{this, new Integer(i)});
            return;
        }
        EnhancedViewPager h1 = FlagShipV25.h1(this.this$0);
        if (h1 != null) {
            h1.setCurrentItem(FlagShipV25.v1(this.this$0).j(1, i), false);
        } else {
            ckf.y("contentViewPager");
            throw null;
        }
    }
}
