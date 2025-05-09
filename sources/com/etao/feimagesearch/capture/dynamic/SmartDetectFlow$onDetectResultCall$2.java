package com.etao.feimagesearch.capture.dynamic;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class SmartDetectFlow$onDetectResultCall$2 extends Lambda implements g1a<Boolean, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ g1a<Boolean, xhv> $processEnd;
    public final /* synthetic */ SmartDetectFlow this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SmartDetectFlow$onDetectResultCall$2(g1a<? super Boolean, xhv> g1aVar, SmartDetectFlow smartDetectFlow) {
        super(1);
        this.$processEnd = g1aVar;
        this.this$0 = smartDetectFlow;
    }

    public static /* synthetic */ Object ipc$super(SmartDetectFlow$onDetectResultCall$2 smartDetectFlow$onDetectResultCall$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/SmartDetectFlow$onDetectResultCall$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Boolean bool) {
        invoke2(bool);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ec80bee", new Object[]{this, bool});
            return;
        }
        g1a<Boolean, xhv> g1aVar = this.$processEnd;
        ckf.f(bool, AdvanceSetting.NETWORK_TYPE);
        g1aVar.invoke(bool);
        if (!bool.booleanValue()) {
            this.this$0.o().m().m().l0();
        }
        this.this$0.f();
    }
}
