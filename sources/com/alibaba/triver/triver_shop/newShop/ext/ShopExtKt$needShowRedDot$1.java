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
public final class ShopExtKt$needShowRedDot$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $currentPageContext;
    public final /* synthetic */ ShopDataParser $shopDataParser;
    public final /* synthetic */ d1a<xhv> $showRedDotCallback;

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt$needShowRedDot$1$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ d1a<xhv> $showRedDotCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d1a<xhv> d1aVar) {
            super(0);
            this.$showRedDotCallback = d1aVar;
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$needShowRedDot$1$1");
        }

        @Override // tb.d1a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            } else {
                this.$showRedDotCallback.invoke();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$needShowRedDot$1(ShopDataParser shopDataParser, Context context, d1a<xhv> d1aVar) {
        super(0);
        this.$shopDataParser = shopDataParser;
        this.$currentPageContext = context;
        this.$showRedDotCallback = d1aVar;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$needShowRedDot$1 shopExtKt$needShowRedDot$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$needShowRedDot$1");
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
        String q = r54.q(this.$currentPageContext, p, "shopIdList");
        String q2 = r54.q(this.$currentPageContext, p, "lastTime");
        long j = 0;
        if (!(q2 == null || (o = ssq.o(q2)) == null)) {
            j = o.longValue();
        }
        JSONArray j2 = brf.j(q);
        if (j2 == null) {
            j2 = new JSONArray();
        }
        if (currentTimeMillis - j <= U0) {
            if (j2.size() > M0) {
                npp.Companion.b("red dot time valid , but max size , not show");
                return;
            } else if (j2.contains(W0)) {
                npp.Companion.b("red dot time valid , but already show");
                return;
            }
        }
        r54.C(new AnonymousClass1(this.$showRedDotCallback));
    }
}
