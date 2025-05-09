package com.alibaba.android.icart.core.ability.event;

import com.alibaba.android.icart.core.ability.event.CartOpenPopEventAbility;
import com.alibaba.android.icart.core.view.ViewManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.cb4;
import tb.f8e;
import tb.g1a;
import tb.g8e;
import tb.hav;
import tb.hmb;
import tb.kmb;
import tb.lcu;
import tb.sca;
import tb.xhv;
import tb.zxb;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "", "", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ljava/util/Map;)V", "com/alibaba/android/icart/core/ability/event/CartOpenPopEventAbility$onHandleEvent$1$6", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class CartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$2 extends Lambda implements g1a<Map<String, ? extends Object>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ lcu $event$inlined;
    public final /* synthetic */ boolean $hideCheckAll;
    public final /* synthetic */ kmb $presenter;
    public final /* synthetic */ CartOpenPopEventAbility this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$2(kmb kmbVar, boolean z, CartOpenPopEventAbility cartOpenPopEventAbility, lcu lcuVar) {
        super(1);
        this.$presenter = kmbVar;
        this.$hideCheckAll = z;
        this.this$0 = cartOpenPopEventAbility;
        this.$event$inlined = lcuVar;
    }

    public static /* synthetic */ Object ipc$super(CartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$2 cartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/ability/event/CartOpenPopEventAbility$onHandleEvent$$inlined$tryCatch$lambda$2");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Map<String, ? extends Object> map) {
        invoke2(map);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, ? extends Object> map) {
        hmb j;
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440b90a6", new Object[]{this, map});
            return;
        }
        hav.d(CartOpenPopEventAbility.r(this.this$0), "onHide");
        CartOpenPopEventAbility.a.a(CartOpenPopEventAbility.Companion, "");
        g8e T = this.$presenter.T();
        if ((T instanceof f8e) && (j = ((f8e) T).j()) != null) {
            j.a(false);
        }
        zxb q = CartOpenPopEventAbility.q(this.this$0);
        if (q != null) {
            String y = q.y();
            boolean z2 = (y == null || y.length() == 0 || !q.L()) ? false : true;
            q.V("");
            if (sca.x(q)) {
                cb4.X(q);
            }
            if (z2) {
                ViewManager Z = this.$presenter.e();
                if (Z != null) {
                    Z.D();
                }
            } else {
                z = false;
            }
        }
        if (this.$hideCheckAll && !z) {
            CartOpenPopEventAbility.s(this.this$0, this.$presenter);
        }
    }
}
