package com.alipay.mobile.common.logging.event;

import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ClientEventManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ClientEventManager c;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, ClientEvent> f3963a = new HashMap<>();
    public final HashMap<Object, EventFilter> b = new HashMap<>();

    public ClientEventManager() {
        this.f3963a.put(LogContext.ENVENT_GOTOFOREGROUND, new GotoForegroundEvent());
        this.f3963a.put(LogContext.ENVENT_GOTOBACKGROUND, new GotoBackgroundEvent());
        this.f3963a.put(LogContext.CLIENT_ENVENT_PAGELAUNCH, new ClientPageLaunchEvent());
        this.f3963a.put(LogContext.CLIENT_ENVENT_CLIENTLAUNCH, new ClientClientLaunchEvent());
        this.f3963a.put(LogContext.CLIENT_ENVENT_CLIENTQUIT, new ClientQuitEvent());
        this.f3963a.put(LogContext.CLIENT_ENVENT_GOTOFOREGROUND, new ClientGotoForegroundEvent());
        this.f3963a.put(LogContext.CLIENT_ENVENT_PERIODCHECK, new PeriodCheckEvent());
        this.f3963a.put(LogContext.CLIENT_ENVENT_SWITCHPAGE, new SwitchPageEvent());
        this.f3963a.put(LogContext.ENVENT_USERLOGIN, new UserLoginEvent());
        this.f3963a.put(LogContext.ENVENT_BUGREPORT, new BugReportEvent());
        this.f3963a.put(LogContext.ENVENT_DUMPLOGTOSD, new DumpLogToSDEvent());
        this.f3963a.put(LogContext.ENVENT_VIEWSWITCH, new ViewSwitchEvent());
        this.f3963a.put(LogContext.ENVENT_SUBAPPSTART, new SubAppStartEvent());
        this.f3963a.put(LogContext.ENVENT_SUBAPPRESUME, new SubAppResumeEvent());
    }

    public static synchronized ClientEventManager a() {
        synchronized (ClientEventManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ClientEventManager) ipChange.ipc$dispatch("fe123828", new Object[0]);
            }
            if (c == null) {
                c = new ClientEventManager();
            }
            return c;
        }
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        for (Map.Entry<Object, EventFilter> entry : this.b.entrySet()) {
            EventFilter value = entry.getValue();
            if (value != null && value.a(str)) {
                entry.getKey();
            }
        }
    }
}
