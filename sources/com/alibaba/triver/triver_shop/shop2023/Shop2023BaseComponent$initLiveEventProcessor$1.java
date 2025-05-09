package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class Shop2023BaseComponent$initLiveEventProcessor$1 extends FunctionReferenceImpl implements g1a<Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public Shop2023BaseComponent$initLiveEventProcessor$1(Shop2023BaseComponent shop2023BaseComponent) {
        super(1, shop2023BaseComponent, Shop2023BaseComponent.class, "updateClearScreenStatus", "updateClearScreenStatus(Z)V", 0);
    }

    public static /* synthetic */ Object ipc$super(Shop2023BaseComponent$initLiveEventProcessor$1 shop2023BaseComponent$initLiveEventProcessor$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/Shop2023BaseComponent$initLiveEventProcessor$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b985b5", new Object[]{this, new Boolean(z)});
        } else {
            ((Shop2023BaseComponent) this.receiver).Q0(z);
        }
    }
}
