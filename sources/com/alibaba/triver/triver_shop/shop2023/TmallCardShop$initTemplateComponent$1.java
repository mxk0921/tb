package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TmallCardShop$initTemplateComponent$1 extends Lambda implements w1a<Integer, Integer, Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TmallCardShop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TmallCardShop$initTemplateComponent$1(TmallCardShop tmallCardShop) {
        super(3);
        this.this$0 = tmallCardShop;
    }

    public static /* synthetic */ Object ipc$super(TmallCardShop$initTemplateComponent$1 tmallCardShop$initTemplateComponent$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/TmallCardShop$initTemplateComponent$1");
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num, Integer num2, Integer num3) {
        invoke(num.intValue(), num2.intValue(), num3.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8dbd44", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        EnhancedViewPager i1 = TmallCardShop.i1(this.this$0);
        if (i1 != null) {
            i1.setCurrentItem(i3, false);
        } else {
            ckf.y("contentViewPager");
            throw null;
        }
    }
}
