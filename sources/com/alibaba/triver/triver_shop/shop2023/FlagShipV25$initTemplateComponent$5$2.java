package com.alibaba.triver.triver_shop.shop2023;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipV25$initTemplateComponent$5$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FlagShipV25 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipV25$initTemplateComponent$5$2(FlagShipV25 flagShipV25) {
        super(0);
        this.this$0 = flagShipV25;
    }

    public static /* synthetic */ Object ipc$super(FlagShipV25$initTemplateComponent$5$2 flagShipV25$initTemplateComponent$5$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FlagShipV25$initTemplateComponent$5$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else if (!FlagShipV25.R1(this.this$0)) {
            FlagShipV25.T1(this.this$0);
        } else {
            FlagShipV25.Q1(this.this$0);
        }
    }
}
