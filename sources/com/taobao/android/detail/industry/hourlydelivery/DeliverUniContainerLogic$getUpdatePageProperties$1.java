package com.taobao.android.detail.industry.hourlydelivery;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import tb.nfr;
import tb.vb7;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final /* synthetic */ class DeliverUniContainerLogic$getUpdatePageProperties$1 extends MutablePropertyReference0Impl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DeliverUniContainerLogic$getUpdatePageProperties$1(vb7 vb7Var) {
        super(vb7Var, vb7.class, "context", "getContext()Lcom/taobao/android/detail/industry/hourlydelivery/TBIDeliveryContext;", 0);
    }

    public static /* synthetic */ Object ipc$super(DeliverUniContainerLogic$getUpdatePageProperties$1 deliverUniContainerLogic$getUpdatePageProperties$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/industry/hourlydelivery/DeliverUniContainerLogic$getUpdatePageProperties$1");
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
    public Object get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
        }
        return vb7.b((vb7) this.receiver);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
    public void set(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6236785", new Object[]{this, obj});
        } else {
            vb7.e((vb7) this.receiver, (nfr) obj);
        }
    }
}
