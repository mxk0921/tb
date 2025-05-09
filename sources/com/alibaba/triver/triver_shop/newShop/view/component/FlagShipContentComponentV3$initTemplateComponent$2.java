package com.alibaba.triver.triver_shop.newShop.view.component;

import android.view.ViewGroup;
import com.alibaba.security.realidentity.p1;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ckf;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final /* synthetic */ class FlagShipContentComponentV3$initTemplateComponent$2 extends FunctionReferenceImpl implements u1a<BaseTemplateComponent, ViewGroup.LayoutParams, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public FlagShipContentComponentV3$initTemplateComponent$2(FlagShipContentComponentV3 flagShipContentComponentV3) {
        super(2, flagShipContentComponentV3, FlagShipContentComponentV3.class, "templateCreateViewCallback", "templateCreateViewCallback(Lcom/alibaba/triver/triver_shop/newShop/view/component/templateComponent/BaseTemplateComponent;Landroid/view/ViewGroup$LayoutParams;)V", 0);
    }

    public static /* synthetic */ Object ipc$super(FlagShipContentComponentV3$initTemplateComponent$2 flagShipContentComponentV3$initTemplateComponent$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/FlagShipContentComponentV3$initTemplateComponent$2");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        invoke2(baseTemplateComponent, layoutParams);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BaseTemplateComponent baseTemplateComponent, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45cbd566", new Object[]{this, baseTemplateComponent, layoutParams});
            return;
        }
        ckf.g(baseTemplateComponent, "p0");
        ckf.g(layoutParams, p1.d);
        FlagShipContentComponentV3.G1((FlagShipContentComponentV3) this.receiver, baseTemplateComponent, layoutParams);
    }
}
