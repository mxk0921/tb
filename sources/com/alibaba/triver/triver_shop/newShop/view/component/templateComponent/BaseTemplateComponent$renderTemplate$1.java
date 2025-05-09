package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public /* synthetic */ class BaseTemplateComponent$renderTemplate$1 extends FunctionReferenceImpl implements g1a<View, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public BaseTemplateComponent$renderTemplate$1(BaseTemplateComponent baseTemplateComponent) {
        super(1, baseTemplateComponent, BaseTemplateComponent.class, "createViewCallback", "createViewCallback(Landroid/view/View;)V", 0);
    }

    public static /* synthetic */ Object ipc$super(BaseTemplateComponent$renderTemplate$1 baseTemplateComponent$renderTemplate$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/templateComponent/BaseTemplateComponent$renderTemplate$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(View view) {
        invoke2(view);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6966f573", new Object[]{this, view});
            return;
        }
        ckf.g(view, "p0");
        ((BaseTemplateComponent) this.receiver).b(view);
    }
}
