package com.alibaba.triver.triver_shop.newShop.view.component;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.kwj;
import tb.npp;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class FlagShipContentComponentV3$bottomBarComponent$1 extends Lambda implements g1a<Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ FlagShipContentComponentV3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlagShipContentComponentV3$bottomBarComponent$1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        super(1);
        this.this$0 = flagShipContentComponentV3;
    }

    public static /* synthetic */ Object ipc$super(FlagShipContentComponentV3$bottomBarComponent$1 flagShipContentComponentV3$bottomBarComponent$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV3$bottomBarComponent$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num) {
        invoke(num.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b945e4", new Object[]{this, new Integer(i)});
            return;
        }
        npp.Companion.b(ckf.p("flag ship , bottom bar changed : ", Integer.valueOf(i)));
        kwj m1 = FlagShipContentComponentV3.m1(this.this$0);
        if (m1 != null) {
            m1.b(i, false);
            FlagShipContentComponentV3.x1(this.this$0);
            return;
        }
        ckf.y("newBottomBarAndIndexNavManager");
        throw null;
    }
}
