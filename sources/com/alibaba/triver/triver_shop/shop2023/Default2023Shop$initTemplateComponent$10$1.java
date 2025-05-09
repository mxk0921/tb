package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import tb.aqp;
import tb.brf;
import tb.ckf;
import tb.g1a;
import tb.mop;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Default2023Shop$initTemplateComponent$10$1 extends Lambda implements g1a<Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Default2023Shop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Default2023Shop$initTemplateComponent$10$1(Default2023Shop default2023Shop) {
        super(1);
        this.this$0 = default2023Shop;
    }

    public static /* synthetic */ Object ipc$super(Default2023Shop$initTemplateComponent$10$1 default2023Shop$initTemplateComponent$10$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Default2023Shop$initTemplateComponent$10$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num) {
        invoke(num.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(int i) {
        Pair<Integer, Integer> v1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b945e4", new Object[]{this, new Integer(i)});
            return;
        }
        if (aqp.Companion.b()) {
            JSONObject g = brf.g(Default2023Shop.H1(this.this$0).A(), i);
            if (ckf.b(g == null ? null : g.getString("name"), mop.KEY_ALL_ITEMS) && (v1 = Default2023Shop.H1(this.this$0).v1("allitems")) != null) {
                EnhancedViewPager n1 = Default2023Shop.n1(this.this$0);
                if (n1 != null) {
                    n1.setCurrentItem(Default2023Shop.H1(this.this$0).j(v1.getFirst().intValue(), v1.getSecond().intValue()), false);
                    return;
                } else {
                    ckf.y("contentViewPager");
                    throw null;
                }
            }
        }
        int j = Default2023Shop.H1(this.this$0).j(i, 0);
        EnhancedViewPager n12 = Default2023Shop.n1(this.this$0);
        if (n12 != null) {
            n12.setCurrentItem(j, false);
        } else {
            ckf.y("contentViewPager");
            throw null;
        }
    }
}
