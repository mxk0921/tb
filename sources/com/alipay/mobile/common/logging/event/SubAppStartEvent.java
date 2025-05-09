package com.alipay.mobile.common.logging.event;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.CrashBridge;
import com.alipay.mobile.common.logging.api.LogCategory;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.behavor.Behavor;
import com.alipay.mobile.common.logging.render.BehavorRender;
import com.alipay.mobile.common.logging.render.PendingRender;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SubAppStartEvent implements ClientEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.logging.event.ClientEvent
    public final void a(Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        LogContext logContext = LoggerFactory.getLogContext();
        String[] split = ((String) obj).split(",");
        String str2 = split[0];
        if (split.length > 1) {
            str = split[1];
        } else {
            str = "";
        }
        logContext.putContextParam(LogContext.STORAGE_APPID, str2);
        if (!TextUtils.isEmpty(str2)) {
            CrashBridge.d();
        }
        Behavor behavor = new Behavor();
        behavor.setSeedID("startApp");
        behavor.setParam1(str2);
        behavor.setParam3(str);
        logContext.appendLogEvent(new LogEvent(LogCategory.CATEGORY_ALIVEREPORT, null, LogEvent.Level.ERROR, null, PendingRender.a(new BehavorRender(logContext), "event", behavor)));
    }
}
