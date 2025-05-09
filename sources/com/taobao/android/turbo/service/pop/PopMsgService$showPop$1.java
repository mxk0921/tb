package com.taobao.android.turbo.service.pop;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.base.service.pop.PopType;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.cgm;
import tb.d1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class PopMsgService$showPop$1 extends Lambda implements d1a<xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ cgm $popMsg;
    public final /* synthetic */ PopMsgService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopMsgService$showPop$1(PopMsgService popMsgService, cgm cgmVar) {
        super(0);
        this.this$0 = popMsgService;
        this.$popMsg = cgmVar;
    }

    public static /* synthetic */ Object ipc$super(PopMsgService$showPop$1 popMsgService$showPop$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/pop/PopMsgService$showPop$1");
    }

    @Override // tb.d1a
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        LiveMsgBoxManager x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7560ccff", new Object[]{this});
            return;
        }
        PopMsgService.T0(this.this$0, null);
        this.this$0.M1();
        if (this.$popMsg.c() == PopType.POP_LIVE && PopMsgService.M(this.this$0) && (x = PopMsgService.x(this.this$0)) != null) {
            x.m(20000L);
        }
    }
}
