package com.alibaba.triver.triver_shop.shop2023.nativeview;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.aqp;
import tb.d1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Shop2023BottomBarNativeComponent$changeTo$3 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Shop2023BottomBarNativeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023BottomBarNativeComponent$changeTo$3(Shop2023BottomBarNativeComponent shop2023BottomBarNativeComponent) {
        super(0);
        this.this$0 = shop2023BottomBarNativeComponent;
    }

    public static /* synthetic */ Object ipc$super(Shop2023BottomBarNativeComponent$changeTo$3 shop2023BottomBarNativeComponent$changeTo$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/nativeview/Shop2023BottomBarNativeComponent$changeTo$3");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (aqp.Companion.q() && this.this$0.q().P0().f()) {
            kew.i0(this.this$0.p());
        }
    }
}
