package com.alipay.sdk.auth.manager;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AFReportManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static IReportProvider f4512a = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements IReportProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.sdk.auth.manager.IReportProvider
        public void report(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb4f1a72", new Object[]{this, new Integer(i), str});
            }
        }
    }

    public static IReportProvider getProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IReportProvider) ipChange.ipc$dispatch("6315e44e", new Object[0]);
        }
        return f4512a;
    }

    public static void setProvider(IReportProvider iReportProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d8c2ef6", new Object[]{iReportProvider});
        } else {
            f4512a = iReportProvider;
        }
    }
}
