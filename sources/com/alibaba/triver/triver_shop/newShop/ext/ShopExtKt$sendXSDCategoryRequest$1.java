package com.alibaba.triver.triver_shop.newShop.ext;

import com.alibaba.triver.triver_shop.preload.CommonPrefetchDataManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.brf;
import tb.d1a;
import tb.jpu;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopExtKt$sendXSDCategoryRequest$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ long $startToken;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopExtKt$sendXSDCategoryRequest$1(long j) {
        super(0);
        this.$startToken = j;
    }

    public static /* synthetic */ Object ipc$super(ShopExtKt$sendXSDCategoryRequest$1 shopExtKt$sendXSDCategoryRequest$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/ext/ShopExtKt$sendXSDCategoryRequest$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            CommonPrefetchDataManager.INSTANCE.c(this.$startToken, brf.a(jpu.a("success", Boolean.FALSE)));
        }
    }
}
