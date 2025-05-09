package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Default2023Shop$initTemplateComponent$9$1 extends Lambda implements u1a<Integer, Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Default2023Shop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Default2023Shop$initTemplateComponent$9$1(Default2023Shop default2023Shop) {
        super(2);
        this.this$0 = default2023Shop;
    }

    public static /* synthetic */ Object ipc$super(Default2023Shop$initTemplateComponent$9$1 default2023Shop$initTemplateComponent$9$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$initTemplateComponent$9$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num, Integer num2) {
        invoke(num.intValue(), num2.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a06fe99f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int j = Default2023Shop.H1(this.this$0).j(i, i2);
        EnhancedViewPager n1 = Default2023Shop.n1(this.this$0);
        if (n1 != null) {
            n1.setCurrentItem(j, false);
        } else {
            ckf.y("contentViewPager");
            throw null;
        }
    }
}
