package com.alibaba.android.icart.core.ability.event;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.f8e;
import tb.g1a;
import tb.g8e;
import tb.hav;
import tb.hmb;
import tb.kmb;
import tb.lcu;
import tb.oc3;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltb/oc3;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ltb/oc3;)V", "com/alibaba/android/icart/core/ability/event/CartOpenPopEventAbility$onHandleEvent$1$5", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class CartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$1 extends Lambda implements g1a<oc3, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ lcu $event$inlined;
    public final /* synthetic */ boolean $hideCheckAll;
    public final /* synthetic */ kmb $presenter;
    public final /* synthetic */ CartOpenPopEventAbility this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$1(kmb kmbVar, boolean z, CartOpenPopEventAbility cartOpenPopEventAbility, lcu lcuVar) {
        super(1);
        this.$presenter = kmbVar;
        this.$hideCheckAll = z;
        this.this$0 = cartOpenPopEventAbility;
        this.$event$inlined = lcuVar;
    }

    public static /* synthetic */ Object ipc$super(CartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$1 cartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/ability/event/CartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(oc3 oc3Var) {
        invoke2(oc3Var);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(oc3 oc3Var) {
        hmb j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e3a3c30", new Object[]{this, oc3Var});
            return;
        }
        ckf.g(oc3Var, AdvanceSetting.NETWORK_TYPE);
        hav.d(CartOpenPopEventAbility.r(this.this$0), "onShow");
        g8e T = this.$presenter.T();
        if ((T instanceof f8e) && (j = ((f8e) T).j()) != null) {
            j.a(false);
        }
        if (this.$hideCheckAll) {
            CartOpenPopEventAbility.s(this.this$0, this.$presenter);
        }
    }
}
