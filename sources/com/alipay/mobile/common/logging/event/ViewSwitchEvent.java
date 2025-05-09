package com.alipay.mobile.common.logging.event;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.CrashBridge;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ViewSwitchEvent implements ClientEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.logging.event.ClientEvent
    public final void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        String str = (String) obj;
        LogContext logContext = LoggerFactory.getLogContext();
        if (str != null && !str.equals(logContext.getContextParam(LogContext.STORAGE_VIEWID))) {
            String contextParam = logContext.getContextParam(LogContext.STORAGE_VIEWID);
            logContext.putContextParam(LogContext.STORAGE_REFVIEWID, contextParam);
            if (!TextUtils.isEmpty(contextParam)) {
                CrashBridge.d();
            }
            logContext.putContextParam(LogContext.STORAGE_VIEWID, str);
            if (!TextUtils.isEmpty(str)) {
                CrashBridge.d();
            }
            logContext.putContextParam(LogContext.STORAGE_PAGESERIAL, logContext.getSessionId() + '_' + System.currentTimeMillis());
        }
    }
}
