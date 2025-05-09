package com.taobao.android;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AliMonitorImp implements AliMonitorInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AliMonitorImp f6242a = new AliMonitorImp();

    public static AliMonitorImp getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliMonitorImp) ipChange.ipc$dispatch("7def4396", new Object[0]);
        }
        return f6242a;
    }

    @Override // com.taobao.android.AliMonitorInterface
    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db371a1c", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            AppMonitor.Alarm.commitFail(str, str2, str3, str4, str5);
        }
    }

    @Override // com.taobao.android.AliMonitorInterface
    public void b(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c9adc9f", new Object[]{this, str, str2, str3, new Double(d)});
        } else {
            AppMonitor.Counter.commit(str, str2, str3, d);
        }
    }

    @Override // com.taobao.android.AliMonitorInterface
    public void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4250c703", new Object[]{this, str, str2, str3});
        } else {
            AppMonitor.Alarm.commitSuccess(str, str2, str3);
        }
    }

    @Override // com.taobao.android.AliMonitorInterface
    public void d(String str, String str2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d21c1e9", new Object[]{this, str, str2, new Double(d)});
        } else {
            AppMonitor.Counter.commit(str, str2, d);
        }
    }
}
