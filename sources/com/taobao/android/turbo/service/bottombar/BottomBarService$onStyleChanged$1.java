package com.taobao.android.turbo.service.bottombar;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.rjb;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/rjb;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ltb/rjb;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class BottomBarService$onStyleChanged$1 extends Lambda implements g1a<rjb, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BottomBarService$onStyleChanged$1 INSTANCE = new BottomBarService$onStyleChanged$1();

    public BottomBarService$onStyleChanged$1() {
        super(1);
    }

    public static /* synthetic */ Object ipc$super(BottomBarService$onStyleChanged$1 bottomBarService$onStyleChanged$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/bottombar/BottomBarService$onStyleChanged$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(rjb rjbVar) {
        invoke2(rjbVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(rjb rjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d790290", new Object[]{this, rjbVar});
            return;
        }
        ckf.g(rjbVar, AdvanceSetting.NETWORK_TYPE);
        rjbVar.M();
    }
}
