package com.alibaba.triver.triver_shop.shop2023;

import com.alibaba.triver.triver_shop.newShop.view.PerceptionSizeFrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.d1a;
import tb.kew;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipV25$changeFirstTabToOtherTab$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FlagShipV25 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipV25$changeFirstTabToOtherTab$1(FlagShipV25 flagShipV25) {
        super(0);
        this.this$0 = flagShipV25;
    }

    public static /* synthetic */ Object ipc$super(FlagShipV25$changeFirstTabToOtherTab$1 flagShipV25$changeFirstTabToOtherTab$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/FlagShipV25$changeFirstTabToOtherTab$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        PerceptionSizeFrameLayout r1 = FlagShipV25.r1(this.this$0);
        if (r1 != null) {
            kew.d0(r1, 0);
        } else {
            ckf.y("navViewContainer");
            throw null;
        }
    }
}
