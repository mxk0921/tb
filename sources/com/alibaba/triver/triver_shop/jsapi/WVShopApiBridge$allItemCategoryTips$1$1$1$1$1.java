package com.alibaba.triver.triver_shop.jsapi;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.brf;
import tb.ckf;
import tb.d1a;
import tb.g1a;
import tb.jpu;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class WVShopApiBridge$allItemCategoryTips$1$1$1$1$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ WVCallBackContext $callback;
    public final /* synthetic */ g1a<Boolean, Boolean> $it;
    public final /* synthetic */ String $visibleData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WVShopApiBridge$allItemCategoryTips$1$1$1$1$1(g1a<? super Boolean, Boolean> g1aVar, String str, WVCallBackContext wVCallBackContext) {
        super(0);
        this.$it = g1aVar;
        this.$visibleData = str;
        this.$callback = wVCallBackContext;
    }

    public static /* synthetic */ Object ipc$super(WVShopApiBridge$allItemCategoryTips$1$1$1$1$1 wVShopApiBridge$allItemCategoryTips$1$1$1$1$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/jsapi/WVShopApiBridge$allItemCategoryTips$1$1$1$1$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        Boolean invoke = this.$it.invoke(Boolean.valueOf(ckf.b(this.$visibleData, "true")));
        invoke.booleanValue();
        WVCallBackContext wVCallBackContext = this.$callback;
        if (wVCallBackContext != null) {
            wVCallBackContext.success(brf.a(jpu.a("success", invoke)).toJSONString());
        }
    }
}
