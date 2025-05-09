package com.taobao.android.turbo.service.scheduler;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.nuo;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/nuo;", AdvanceSetting.NETWORK_TYPE, "", "invoke", "(Ltb/nuo;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class SchedulerService$containMessage$1 extends Lambda implements g1a<nuo, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ String $name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SchedulerService$containMessage$1(String str) {
        super(1);
        this.$name = str;
    }

    public static /* synthetic */ Object ipc$super(SchedulerService$containMessage$1 schedulerService$containMessage$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/scheduler/SchedulerService$containMessage$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ Boolean invoke(nuo nuoVar) {
        return Boolean.valueOf(invoke2(nuoVar));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final boolean invoke2(nuo nuoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5b6d8c", new Object[]{this, nuoVar})).booleanValue();
        }
        ckf.g(nuoVar, AdvanceSetting.NETWORK_TYPE);
        return ckf.b(nuoVar.c(), this.$name);
    }
}
