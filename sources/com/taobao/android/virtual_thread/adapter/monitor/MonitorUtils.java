package com.taobao.android.virtual_thread.adapter.monitor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.adapter.monitor.MonitorUtils;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MonitorUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static MonitorListener f9888a = new MonitorListener() { // from class: tb.p0j
        @Override // com.taobao.android.virtual_thread.adapter.monitor.MonitorUtils.MonitorListener
        public final void onMonitor(boolean z, String str, String str2) {
            MonitorUtils.b(z, str, str2);
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface MonitorListener {
        void onMonitor(boolean z, String str, String str2);
    }

    static {
        t2o.a(970981389);
    }

    public static /* synthetic */ void b(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8a5f3ea", new Object[]{new Boolean(z), str, str2});
        }
    }

    public static void c(boolean z, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae831a7", new Object[]{new Boolean(z), str, str2});
        } else {
            f9888a.onMonitor(z, str, str2);
        }
    }

    public static void d(MonitorListener monitorListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de11c98", new Object[]{monitorListener});
        } else if (monitorListener != null) {
            f9888a = monitorListener;
        }
    }
}
