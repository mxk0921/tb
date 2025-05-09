package com.alibaba.triver.triver_shop.newShop.view.component;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.BaseTemplateComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BaseContentComponent$updateDXTemplateData$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ JSONObject $templateData;
    public final /* synthetic */ String $templateName;
    public final /* synthetic */ BaseContentComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentComponent$updateDXTemplateData$1(BaseContentComponent baseContentComponent, String str, JSONObject jSONObject) {
        super(0);
        this.this$0 = baseContentComponent;
        this.$templateName = str;
        this.$templateData = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(BaseContentComponent$updateDXTemplateData$1 baseContentComponent$updateDXTemplateData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/component/BaseContentComponent$updateDXTemplateData$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        BaseTemplateComponent baseTemplateComponent = (BaseTemplateComponent) BaseContentComponent.b(this.this$0).get(this.$templateName);
        if (baseTemplateComponent != null) {
            baseTemplateComponent.z(this.$templateData);
        }
    }
}
