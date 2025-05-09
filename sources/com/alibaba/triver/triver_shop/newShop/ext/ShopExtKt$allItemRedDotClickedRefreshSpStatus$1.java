package com.alibaba.triver.triver_shop.newShop.ext;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.shop.common.ShopConstants;
import kotlin.jvm.internal.Lambda;
import tb.aqp;
import tb.brf;
import tb.ckf;
import tb.d1a;
import tb.khu;
import tb.npp;
import tb.r54;
import tb.ssq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt$allItemRedDotClickedRefreshSpStatus$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $currentPageContext;
    public final /* synthetic */ ShopDataParser $shopDataParser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$allItemRedDotClickedRefreshSpStatus$1(ShopDataParser shopDataParser, Context context) {
        super(0);
        this.$shopDataParser = shopDataParser;
        this.$currentPageContext = context;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$allItemRedDotClickedRefreshSpStatus$1 shopExtKt$allItemRedDotClickedRefreshSpStatus$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$allItemRedDotClickedRefreshSpStatus$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Long o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        aqp.a aVar = aqp.Companion;
        long U0 = aVar.U0() * ((long) ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT) * 1000;
        int M0 = aVar.M0();
        long currentTimeMillis = System.currentTimeMillis();
        String W0 = this.$shopDataParser.W0();
        String p = ckf.p("new_shop_red_dot_list_by_", khu.c(this.$currentPageContext));
        JSONArray j = brf.j(r54.q(this.$currentPageContext, p, "shopIdList"));
        if (j == null) {
            j = new JSONArray();
        }
        String q = r54.q(this.$currentPageContext, p, "lastTime");
        long j2 = 0;
        if (!(q == null || (o = ssq.o(q)) == null)) {
            j2 = o.longValue();
        }
        if (currentTimeMillis - j2 > U0) {
            j.clear();
            j.add(W0);
            r54.O(this.$currentPageContext, p, "shopIdList", j.toString());
            r54.O(this.$currentPageContext, p, "lastTime", String.valueOf(currentTimeMillis));
            npp.Companion.b("red dot time not valid , clear all and add new");
        } else if (j.size() > M0) {
            npp.Companion.b("red dot time valid , but max size");
        } else {
            j.add(W0);
            r54.O(this.$currentPageContext, p, "shopIdList", j.toString());
            npp.Companion.b("red dot time valid , update id");
        }
    }
}
