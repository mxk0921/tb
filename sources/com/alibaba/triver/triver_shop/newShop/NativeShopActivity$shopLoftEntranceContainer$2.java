package com.alibaba.triver.triver_shop.newShop;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class NativeShopActivity$shopLoftEntranceContainer$2 extends Lambda implements d1a<FrameLayout> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ NativeShopActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeShopActivity$shopLoftEntranceContainer$2(NativeShopActivity nativeShopActivity) {
        super(0);
        this.this$0 = nativeShopActivity;
    }

    public static /* synthetic */ Object ipc$super(NativeShopActivity$shopLoftEntranceContainer$2 nativeShopActivity$shopLoftEntranceContainer$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/NativeShopActivity$shopLoftEntranceContainer$2");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.d1a
    public final FrameLayout invoke() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("ec2e147a", new Object[]{this}) : new FrameLayout(this.this$0);
    }
}
