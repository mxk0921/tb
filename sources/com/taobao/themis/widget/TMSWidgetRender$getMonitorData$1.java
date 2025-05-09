package com.taobao.themis.widget;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.rde;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSWidgetRender$getMonitorData$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ rde.a $callback;
    public final /* synthetic */ TMSWidgetRender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TMSWidgetRender$getMonitorData$1(rde.a aVar, TMSWidgetRender tMSWidgetRender) {
        super(0);
        this.$callback = aVar;
        this.this$0 = tMSWidgetRender;
    }

    public static /* synthetic */ Object ipc$super(TMSWidgetRender$getMonitorData$1 tMSWidgetRender$getMonitorData$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/TMSWidgetRender$getMonitorData$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        rde.a aVar = this.$callback;
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(TMSWidgetRender.q1(this.this$0).S().g());
        aVar.onSuccess(jSONObject);
    }
}
