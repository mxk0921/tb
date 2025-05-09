package com.alibaba.triver.triver_shop;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.g1a;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopMoreUtils$requestShopStarInfo$2 extends Lambda implements u1a<Integer, String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g1a<JSONObject, xhv> $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShopMoreUtils$requestShopStarInfo$2(g1a<? super JSONObject, xhv> g1aVar) {
        super(2);
        this.$callback = g1aVar;
    }

    public static /* synthetic */ Object ipc$super(ShopMoreUtils$requestShopStarInfo$2 shopMoreUtils$requestShopStarInfo$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/ShopMoreUtils$requestShopStarInfo$2");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num, String str) {
        return invoke(num.intValue(), str);
    }

    public final xhv invoke(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("dbc7292d", new Object[]{this, new Integer(i), str});
        }
        g1a<JSONObject, xhv> g1aVar = this.$callback;
        if (g1aVar == null) {
            return null;
        }
        g1aVar.invoke(null);
        return xhv.INSTANCE;
    }
}
