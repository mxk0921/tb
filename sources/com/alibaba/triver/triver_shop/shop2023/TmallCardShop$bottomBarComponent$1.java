package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.triver.triver_shop.newShop.view.extend.EnhancedViewPager;
import com.alibaba.triver.triver_shop.shop2023.nativeview.CarShopTopNavBarNativeComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.npp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TmallCardShop$bottomBarComponent$1 extends Lambda implements g1a<Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ TmallCardShop this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TmallCardShop$bottomBarComponent$1(TmallCardShop tmallCardShop) {
        super(1);
        this.this$0 = tmallCardShop;
    }

    public static /* synthetic */ Object ipc$super(TmallCardShop$bottomBarComponent$1 tmallCardShop$bottomBarComponent$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/TmallCardShop$bottomBarComponent$1");
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
        npp.Companion.b(ckf.p("flag ship , bottom bar changed : ", Integer.valueOf(i)));
        if (i == 0) {
            EnhancedViewPager i1 = TmallCardShop.i1(this.this$0);
            if (i1 != null) {
                CarShopTopNavBarNativeComponent h1 = TmallCardShop.h1(this.this$0);
                i1.setCurrentItem(h1 == null ? 0 : h1.k(), false);
                return;
            }
            ckf.y("contentViewPager");
            throw null;
        }
        EnhancedViewPager i12 = TmallCardShop.i1(this.this$0);
        if (i12 != null) {
            i12.setCurrentItem(TmallCardShop.o1(this.this$0).j(i, 0), false);
        } else {
            ckf.y("contentViewPager");
            throw null;
        }
    }
}
