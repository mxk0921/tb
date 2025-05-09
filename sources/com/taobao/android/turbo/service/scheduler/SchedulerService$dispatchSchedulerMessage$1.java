package com.taobao.android.turbo.service.scheduler;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import tb.ckf;
import tb.g1a;
import tb.nuo;
import tb.umd;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/umd;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ltb/umd;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class SchedulerService$dispatchSchedulerMessage$1 extends Lambda implements g1a<umd, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref$BooleanRef $consumed;
    public final /* synthetic */ nuo $message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SchedulerService$dispatchSchedulerMessage$1(nuo nuoVar, Ref$BooleanRef ref$BooleanRef) {
        super(1);
        this.$message = nuoVar;
        this.$consumed = ref$BooleanRef;
    }

    public static /* synthetic */ Object ipc$super(SchedulerService$dispatchSchedulerMessage$1 schedulerService$dispatchSchedulerMessage$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/scheduler/SchedulerService$dispatchSchedulerMessage$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(umd umdVar) {
        invoke2(umdVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(umd umdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e863173", new Object[]{this, umdVar});
            return;
        }
        ckf.g(umdVar, AdvanceSetting.NETWORK_TYPE);
        if (umdVar.x(this.$message)) {
            this.$consumed.element = true;
        }
    }
}
