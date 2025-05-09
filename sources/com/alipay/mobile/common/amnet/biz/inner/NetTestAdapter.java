package com.alipay.mobile.common.amnet.biz.inner;

import com.alipay.mobile.common.amnet.api.AmnetNetworkDiagnoseListener;
import com.alipay.mobile.common.transportext.amnet.NetTest;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetTestAdapter implements NetTest {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AmnetNetworkDiagnoseListener f3901a;

    public NetTestAdapter(AmnetNetworkDiagnoseListener amnetNetworkDiagnoseListener) {
        this.f3901a = amnetNetworkDiagnoseListener;
    }

    @Override // com.alipay.mobile.common.transportext.amnet.NetTest
    public void report(boolean z, boolean z2, boolean z3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10057843", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), str});
        } else {
            this.f3901a.report(z, z2, z3, str);
        }
    }
}
