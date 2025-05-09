package com.alibaba.triver.triver_shop.newShop.ext;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.g1a;
import tb.r54;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt$startShopSubScribeDAITask$receiver$1$onReceive$1$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Map<String, String> $params;
    public final /* synthetic */ g1a<Map<String, String>, xhv> $showSubScribePopCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShopExtKt$startShopSubScribeDAITask$receiver$1$onReceive$1$1(Context context, g1a<? super Map<String, String>, xhv> g1aVar, Map<String, String> map) {
        super(0);
        this.$context = context;
        this.$showSubScribePopCallback = g1aVar;
        this.$params = map;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$startShopSubScribeDAITask$receiver$1$onReceive$1$1 shopExtKt$startShopSubScribeDAITask$receiver$1$onReceive$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$startShopSubScribeDAITask$receiver$1$onReceive$1$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        g1a<Map<String, String>, xhv> g1aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (!r54.r(this.$context) && (g1aVar = this.$showSubScribePopCallback) != null) {
            g1aVar.invoke(this.$params);
        }
    }
}
