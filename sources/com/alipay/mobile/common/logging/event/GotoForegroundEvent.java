package com.alipay.mobile.common.logging.event;

import com.alipay.mobile.common.logging.api.DeviceInfo;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.TimeZone;
import tb.r0k;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class GotoForegroundEvent implements ClientEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LogContext f3967a;

    @Override // com.alipay.mobile.common.logging.event.ClientEvent
    public final void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        LogContext logContext = LoggerFactory.getLogContext();
        this.f3967a = logContext;
        logContext.appendLogEvent(new LogEvent("refreshSession", null, LogEvent.Level.ERROR, null));
        ClientEventHelper.a().a(LogContext.CLIENT_ENVENT_GOTOFOREGROUND);
        DeviceInfo.getInstance(this.f3967a.getApplicationContext()).updateAccessibilityState();
        if (DeviceInfo.getInstance(this.f3967a.getApplicationContext()).getIsAccessibilityEnabled()) {
            this.f3967a.putBizExternParams(r0k.KEY_ASSISTANT, "1");
        } else {
            this.f3967a.putBizExternParams(r0k.KEY_ASSISTANT, "0");
        }
        try {
            this.f3967a.putBizExternParams("TimeZone", TimeZone.getDefault().getID());
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("GotoForegroundEvent", th);
        }
    }
}
