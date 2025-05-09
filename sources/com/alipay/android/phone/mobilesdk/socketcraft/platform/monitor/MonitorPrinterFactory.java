package com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor;

import com.alipay.android.phone.mobilesdk.socketcraft.platform.PlatformUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MonitorPrinterFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static MonitorPrinter f3761a;

    public static final MonitorPrinter getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MonitorPrinter) ipChange.ipc$dispatch("16b2fa73", new Object[0]);
        }
        MonitorPrinter monitorPrinter = f3761a;
        if (monitorPrinter != null) {
            return monitorPrinter;
        }
        synchronized (MonitorPrinterFactory.class) {
            try {
                MonitorPrinter monitorPrinter2 = f3761a;
                if (monitorPrinter2 != null) {
                    return monitorPrinter2;
                }
                if (PlatformUtil.isAndroidMPaaSPlatform()) {
                    f3761a = PlatformUtil.createMPaaSMonitorPrinter();
                } else {
                    f3761a = new DefaultMonitorPrinter();
                }
                return f3761a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setMonitorPrinter(MonitorPrinter monitorPrinter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f047cd8", new Object[]{monitorPrinter});
        } else {
            f3761a = monitorPrinter;
        }
    }
}
