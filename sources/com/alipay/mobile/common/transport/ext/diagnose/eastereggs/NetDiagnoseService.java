package com.alipay.mobile.common.transport.ext.diagnose.eastereggs;

import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NetDiagnoseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static NetDiagnoseService f4065a;

    public static NetDiagnoseService getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetDiagnoseService) ipChange.ipc$dispatch("f6637b61", new Object[0]);
        }
        NetDiagnoseService netDiagnoseService = f4065a;
        if (netDiagnoseService != null) {
            return netDiagnoseService;
        }
        synchronized (NetDiagnoseService.class) {
            try {
                NetDiagnoseService netDiagnoseService2 = f4065a;
                if (netDiagnoseService2 != null) {
                    return netDiagnoseService2;
                }
                NetDiagnoseService netDiagnoseService3 = new NetDiagnoseService();
                f4065a = netDiagnoseService3;
                return netDiagnoseService3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void launch(DiagnoseResult diagnoseResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f166bec4", new Object[]{this, diagnoseResult});
        } else {
            ExtTransportOffice.getInstance().diagnoseForEasterEggs(diagnoseResult);
        }
    }
}
