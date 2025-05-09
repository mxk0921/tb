package com.alibaba.triver.triver_shop.newShop.view.component.nativeview;

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
public final class ShopIndexNavNativeComponent$onScrollListener$1$onScrollStateChanged$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $firstPosition;
    public final /* synthetic */ int $lastPosition;
    public final /* synthetic */ ShopIndexNavNativeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopIndexNavNativeComponent$onScrollListener$1$onScrollStateChanged$1(ShopIndexNavNativeComponent shopIndexNavNativeComponent, int i, int i2) {
        super(0);
        this.this$0 = shopIndexNavNativeComponent;
        this.$firstPosition = i;
        this.$lastPosition = i2;
    }

    public static /* synthetic */ Object ipc$super(ShopIndexNavNativeComponent$onScrollListener$1$onScrollStateChanged$1 shopIndexNavNativeComponent$onScrollListener$1$onScrollStateChanged$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/nativeview/ShopIndexNavNativeComponent$onScrollListener$1$onScrollStateChanged$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        ShopDataParser c = ShopIndexNavNativeComponent.c(this.this$0);
        if (c != null) {
            JSONArray W = c.W();
            int i = this.$firstPosition;
            if (i <= this.$lastPosition) {
                while (true) {
                    i++;
                    JSONObject g = brf.g(W, i);
                    String string = g == null ? null : g.getString("utArg1");
                    if (string != null) {
                        ShopDataParser c2 = ShopIndexNavNativeComponent.c(this.this$0);
                        if (c2 != null) {
                            a1v.d(c2, string, a.i(jpu.a("actionType", "swipe")));
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
