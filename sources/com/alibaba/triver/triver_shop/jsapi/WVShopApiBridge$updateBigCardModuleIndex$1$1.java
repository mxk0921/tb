package com.alibaba.triver.triver_shop.jsapi;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WVShopApiBridge$updateBigCardModuleIndex$1$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ int $index;
    public final /* synthetic */ g1a<Integer, xhv> $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WVShopApiBridge$updateBigCardModuleIndex$1$1(g1a<? super Integer, xhv> g1aVar, int i) {
        super(0);
        this.$it = g1aVar;
        this.$index = i;
    }

    public static /* synthetic */ Object ipc$super(WVShopApiBridge$updateBigCardModuleIndex$1$1 wVShopApiBridge$updateBigCardModuleIndex$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/jsapi/WVShopApiBridge$updateBigCardModuleIndex$1$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            this.$it.invoke(Integer.valueOf(this.$index));
        }
    }
}
