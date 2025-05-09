package com.taobao.android.turbo.adapter.impl;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.foc;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/foc$a;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ltb/foc$a;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class LoginAdapter$notifyUserChange$1 extends Lambda implements g1a<foc.a, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ LoginAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginAdapter$notifyUserChange$1(LoginAdapter loginAdapter) {
        super(1);
        this.this$0 = loginAdapter;
    }

    public static /* synthetic */ Object ipc$super(LoginAdapter$notifyUserChange$1 loginAdapter$notifyUserChange$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/adapter/impl/LoginAdapter$notifyUserChange$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(foc.a aVar) {
        invoke2(aVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(foc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf2ad2f", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, AdvanceSetting.NETWORK_TYPE);
        foc.b d = LoginAdapter.d(this.this$0);
        ckf.d(d);
        aVar.a(d);
    }
}
