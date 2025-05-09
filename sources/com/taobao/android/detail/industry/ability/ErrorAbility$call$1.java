package com.taobao.android.detail.industry.ability;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import tb.e6z;
import tb.wb7;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final /* synthetic */ class ErrorAbility$call$1 extends MutablePropertyReference0Impl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ErrorAbility$call$1(e6z e6zVar) {
        super(e6zVar, e6z.class, "errorComponent", "getErrorComponent()Lcom/taobao/android/detail/industry/hourlydelivery/DeliveryErrorComponent;", 0);
    }

    public static /* synthetic */ Object ipc$super(ErrorAbility$call$1 errorAbility$call$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/industry/ability/ErrorAbility$call$1");
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
    public Object get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
        }
        return e6z.b((e6z) this.receiver);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
    public void set(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6236785", new Object[]{this, obj});
        } else {
            e6z.d((e6z) this.receiver, (wb7) obj);
        }
    }
}
