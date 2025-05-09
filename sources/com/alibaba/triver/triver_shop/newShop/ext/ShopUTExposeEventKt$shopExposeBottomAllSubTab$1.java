package com.alibaba.triver.triver_shop.newShop.ext;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopUTExposeEventKt$shopExposeBottomAllSubTab$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $bottomIndex;
    public final /* synthetic */ ShopDataParser $shopDataParser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopUTExposeEventKt$shopExposeBottomAllSubTab$1(ShopDataParser shopDataParser, int i) {
        super(0);
        this.$shopDataParser = shopDataParser;
        this.$bottomIndex = i;
    }

    public static /* synthetic */ Object ipc$super(ShopUTExposeEventKt$shopExposeBottomAllSubTab$1 shopUTExposeEventKt$shopExposeBottomAllSubTab$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopUTExposeEventKt$shopExposeBottomAllSubTab$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        JSONArray t0 = this.$shopDataParser.t0(this.$bottomIndex);
        if (t0 != null) {
            ShopDataParser shopDataParser = this.$shopDataParser;
            int i2 = this.$bottomIndex;
            Iterator<Object> it = t0.iterator();
            while (it.hasNext()) {
                it.next();
                i++;
                if (i >= 0) {
                    ShopUTExposeEventKt.o(shopDataParser, i2, i);
                } else {
                    yz3.p();
                    throw null;
                }
            }
        }
    }
}
