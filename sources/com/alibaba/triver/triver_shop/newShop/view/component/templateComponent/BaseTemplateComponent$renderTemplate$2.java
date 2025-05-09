package com.alibaba.triver.triver_shop.newShop.view.component.templateComponent;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BaseTemplateComponent$renderTemplate$2 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ BaseTemplateComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTemplateComponent$renderTemplate$2(BaseTemplateComponent baseTemplateComponent) {
        super(0);
        this.this$0 = baseTemplateComponent;
    }

    public static /* synthetic */ Object ipc$super(BaseTemplateComponent$renderTemplate$2 baseTemplateComponent$renderTemplate$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/templateComponent/BaseTemplateComponent$renderTemplate$2");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
        } else {
            this.this$0.h().g();
        }
    }
}
