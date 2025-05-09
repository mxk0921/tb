package com.alipay.mobile.common.logging.appender;

import android.content.Context;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LogEvent;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class Appender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LogContext f3958a;
    public String b;
    public Context c;
    public String d = LoggerFactory.getProcessInfo().getProcessTag();

    public Appender(LogContext logContext, String str) {
        this.f3958a = logContext;
        this.b = str;
        this.c = logContext.getApplicationContext();
    }

    public abstract void a();

    public abstract void a(LogEvent logEvent);

    public abstract void a(boolean z);

    public abstract boolean a(String str, boolean z);

    public abstract boolean a(byte[] bArr, int i);

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        return this.b;
    }
}
