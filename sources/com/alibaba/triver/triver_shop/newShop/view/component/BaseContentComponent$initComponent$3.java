package com.alibaba.triver.triver_shop.newShop.view.component;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class BaseContentComponent$initComponent$3 extends FunctionReferenceImpl implements w1a<Boolean, Integer, Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BaseContentComponent$initComponent$3(BaseContentComponent baseContentComponent) {
        super(3, baseContentComponent, BaseContentComponent.class, "setAllItemCountIconVisibleFunction", "setAllItemCountIconVisibleFunction(ZII)V", 0);
    }

    public static /* synthetic */ Object ipc$super(BaseContentComponent$initComponent$3 baseContentComponent$initComponent$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/BaseContentComponent$initComponent$3");
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool, Integer num, Integer num2) {
        invoke(bool.booleanValue(), num.intValue(), num2.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e7d4cd5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
        } else {
            ((BaseContentComponent) this.receiver).h0(z, i, i2);
        }
    }
}
