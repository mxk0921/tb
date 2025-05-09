package com.alipay.mobile.common.logging.event;

import com.alipay.mobile.common.logging.CrashBridge;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.trace.TraceLogger;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ClientGotoForegroundEvent implements ClientEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LogContext f3964a;

    @Override // com.alipay.mobile.common.logging.event.ClientEvent
    public final void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        this.f3964a = LoggerFactory.getLogContext();
        ClientEventHelper.a().c = 0L;
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        traceLogger.info("ClientGotoForegroundEvent", "notifyClientEvent: ClientEvent_GotoForeground, update gotoBackgroundTimestamp to: " + ClientEventHelper.a().c);
        this.f3964a.appendLogEvent(new LogEvent(LogContext.ENVENT_GOTOBACKGROUND, null, LogEvent.Level.ERROR, Long.toString(ClientEventHelper.a().c)));
        String.valueOf(ClientEventHelper.a().c);
        CrashBridge.d();
        LogStrategyManager.getInstance().queryStrategy("timeout", false);
        LogStrategyManager.getInstance().refreshHitState();
        ClientEventHelper.a().a(LogContext.CLIENT_ENVENT_GOTOFOREGROUND);
    }
}
