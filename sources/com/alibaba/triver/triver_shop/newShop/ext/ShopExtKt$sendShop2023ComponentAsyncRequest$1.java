package com.alibaba.triver.triver_shop.newShop.ext;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt$sendShop2023ComponentAsyncRequest$1 extends Lambda implements u1a<Integer, String, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ d1a<xhv> $failed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$sendShop2023ComponentAsyncRequest$1(d1a<xhv> d1aVar) {
        super(2);
        this.$failed = d1aVar;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$sendShop2023ComponentAsyncRequest$1 shopExtKt$sendShop2023ComponentAsyncRequest$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$sendShop2023ComponentAsyncRequest$1");
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
        d1a<xhv> d1aVar = this.$failed;
        if (d1aVar == null) {
            return null;
        }
        d1aVar.invoke();
        return xhv.INSTANCE;
    }
}
