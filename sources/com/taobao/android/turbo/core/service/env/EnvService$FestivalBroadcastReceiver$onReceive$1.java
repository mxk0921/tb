package com.taobao.android.turbo.core.service.env;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.r2c;
import tb.r69;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/r2c;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ltb/r2c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class EnvService$FestivalBroadcastReceiver$onReceive$1 extends Lambda implements g1a<r2c, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ r69 $festival;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnvService$FestivalBroadcastReceiver$onReceive$1(r69 r69Var) {
        super(1);
        this.$festival = r69Var;
    }

    public static /* synthetic */ Object ipc$super(EnvService$FestivalBroadcastReceiver$onReceive$1 envService$FestivalBroadcastReceiver$onReceive$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/core/service/env/EnvService$FestivalBroadcastReceiver$onReceive$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(r2c r2cVar) {
        invoke2(r2cVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(r2c r2cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae5fd1e", new Object[]{this, r2cVar});
            return;
        }
        ckf.g(r2cVar, AdvanceSetting.NETWORK_TYPE);
        r2cVar.onFestivalChanged(this.$festival);
    }
}
