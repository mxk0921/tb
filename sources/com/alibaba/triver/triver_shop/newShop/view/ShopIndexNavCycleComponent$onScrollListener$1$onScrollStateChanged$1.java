package com.alibaba.triver.triver_shop.newShop.view;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.collections.a;
import kotlin.jvm.internal.Lambda;
import tb.a1v;
import tb.brf;
import tb.ckf;
import tb.d1a;
import tb.jpu;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopIndexNavCycleComponent$onScrollListener$1$onScrollStateChanged$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $firstPosition;
    public final /* synthetic */ int $lastPosition;
    public final /* synthetic */ ShopIndexNavCycleComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopIndexNavCycleComponent$onScrollListener$1$onScrollStateChanged$1(ShopIndexNavCycleComponent shopIndexNavCycleComponent, int i, int i2) {
        super(0);
        this.this$0 = shopIndexNavCycleComponent;
        this.$firstPosition = i;
        this.$lastPosition = i2;
    }

    public static /* synthetic */ Object ipc$super(ShopIndexNavCycleComponent$onScrollListener$1$onScrollStateChanged$1 shopIndexNavCycleComponent$onScrollListener$1$onScrollStateChanged$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/ShopIndexNavCycleComponent$onScrollListener$1$onScrollStateChanged$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ShopDataParser d = ShopIndexNavCycleComponent.d(this.this$0);
        if (d != null) {
            JSONArray W = d.W();
            int i = this.$firstPosition;
            if (i <= this.$lastPosition) {
                while (true) {
                    i++;
                    JSONObject g = brf.g(W, i);
                    String string = g == null ? null : g.getString("utArg1");
                    if (string != null) {
                        ShopDataParser d2 = ShopIndexNavCycleComponent.d(this.this$0);
                        if (d2 != null) {
                            a1v.d(d2, string, a.i(jpu.a("actionType", "swipe")));
                        } else {
                            ckf.y("shopData");
                            throw null;
                        }
                    }
                    if (i == this.$lastPosition) {
                        return;
                    }
                }
            }
        } else {
            ckf.y("shopData");
            throw null;
        }
    }
}
