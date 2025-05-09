package com.alipay.mobile.common.logging.http;

import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UploadUrlConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static UploadUrlConfig f;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3974a = false;
    public boolean b = false;
    public boolean e = false;
    public long c = 0;
    public long d = 0;

    public static synchronized UploadUrlConfig a() {
        synchronized (UploadUrlConfig.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UploadUrlConfig) ipChange.ipc$dispatch("b3aa6ad2", new Object[0]);
            }
            if (f == null) {
                f = new UploadUrlConfig();
            }
            return f;
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.f3974a) {
            return this.e;
        }
        this.f3974a = true;
        try {
            if (Constants.VAL_YES.equals(LoggerFactory.getLogContext().getApplicationContext().getSharedPreferences(LogContext.LOG_HOST_CONFIG_SP, 4).getString(LogContext.LOG_HOST_CONFIG_SP_DISABLE_HTTPS, "no"))) {
                LoggerFactory.getTraceLogger().info("UploadUrlConfig", "disable https, use http upload");
                this.e = true;
            } else {
                this.e = false;
            }
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("UploadUrlConfig", th);
        }
        return this.e;
    }
}
