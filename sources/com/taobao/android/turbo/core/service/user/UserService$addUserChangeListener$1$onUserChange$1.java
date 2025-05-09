package com.taobao.android.turbo.core.service.user;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.foc;
import tb.g1a;
import tb.g7e;
import tb.prv;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/g7e;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ltb/g7e;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class UserService$addUserChangeListener$1$onUserChange$1 extends Lambda implements g1a<g7e, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ foc.b $user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserService$addUserChangeListener$1$onUserChange$1(foc.b bVar) {
        super(1);
        this.$user = bVar;
    }

    public static /* synthetic */ Object ipc$super(UserService$addUserChangeListener$1$onUserChange$1 userService$addUserChangeListener$1$onUserChange$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/core/service/user/UserService$addUserChangeListener$1$onUserChange$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(g7e g7eVar) {
        invoke2(g7eVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(g7e g7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6c99b4", new Object[]{this, g7eVar});
            return;
        }
        ckf.g(g7eVar, AdvanceSetting.NETWORK_TYPE);
        g7eVar.z0(new prv(this.$user.c(), this.$user.b(), this.$user.a()));
    }
}
