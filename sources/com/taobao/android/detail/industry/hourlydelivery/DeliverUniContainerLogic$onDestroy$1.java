package com.taobao.android.detail.industry.hourlydelivery;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import tb.vb7;
import tb.zfr;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final /* synthetic */ class DeliverUniContainerLogic$onDestroy$1 extends MutablePropertyReference0Impl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DeliverUniContainerLogic$onDestroy$1(vb7 vb7Var) {
        super(vb7Var, vb7.class, "pageManager", "getPageManager()Lcom/taobao/tbicontext/TBIPageManager;", 0);
    }

    public static /* synthetic */ Object ipc$super(DeliverUniContainerLogic$onDestroy$1 deliverUniContainerLogic$onDestroy$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/industry/hourlydelivery/DeliverUniContainerLogic$onDestroy$1");
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
    public Object get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
        }
        return vb7.c((vb7) this.receiver);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
    public void set(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6236785", new Object[]{this, obj});
        } else {
            vb7.f((vb7) this.receiver, (zfr) obj);
        }
    }
}
