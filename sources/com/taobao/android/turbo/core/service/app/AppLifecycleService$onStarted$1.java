package com.taobao.android.turbo.core.service.app;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.qgb;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/qgb;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ltb/qgb;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class AppLifecycleService$onStarted$1 extends Lambda implements g1a<qgb, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AppLifecycleService$onStarted$1 INSTANCE = new AppLifecycleService$onStarted$1();

    public AppLifecycleService$onStarted$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(AppLifecycleService$onStarted$1 appLifecycleService$onStarted$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/core/service/app/AppLifecycleService$onStarted$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(qgb qgbVar) {
        invoke2(qgbVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(qgb qgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("985ff1e0", new Object[]{this, qgbVar});
            return;
        }
        ckf.g(qgbVar, AdvanceSetting.NETWORK_TYPE);
        qgbVar.B();
    }
}
