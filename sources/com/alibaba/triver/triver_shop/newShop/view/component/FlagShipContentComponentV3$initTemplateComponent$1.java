package com.alibaba.triver.triver_shop.newShop.view.component;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final /* synthetic */ class FlagShipContentComponentV3$initTemplateComponent$1 extends FunctionReferenceImpl implements u1a<Integer, Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public FlagShipContentComponentV3$initTemplateComponent$1(FlagShipContentComponentV3 flagShipContentComponentV3) {
        super(2, flagShipContentComponentV3, FlagShipContentComponentV3.class, "switchTabToInViewPagerCallback", "switchTabToInViewPagerCallback(IZ)V", 0);
    }

    public static /* synthetic */ Object ipc$super(FlagShipContentComponentV3$initTemplateComponent$1 flagShipContentComponentV3$initTemplateComponent$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV3$initTemplateComponent$1");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(Integer num, Boolean bool) {
        invoke(num.intValue(), bool.booleanValue());
        return xhv.INSTANCE;
    }

    public final void invoke(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0702970", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            FlagShipContentComponentV3.F1((FlagShipContentComponentV3) this.receiver, i, z);
        }
    }
}
