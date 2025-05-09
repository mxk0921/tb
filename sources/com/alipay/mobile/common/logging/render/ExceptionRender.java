package com.alipay.mobile.common.logging.render;

import android.os.Build;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.CrashBridge;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.monitor.ExceptionID;
import com.alipay.mobile.common.logging.util.LoggingUtil;
import com.alipay.mobile.common.logging.util.NetUtil;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.alipay.tianyan.mobilesdk.TianyanLoggingStatus;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ExceptionRender extends BaseRender {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ExceptionRender(LogContext logContext) {
        super(logContext);
    }

    public static /* synthetic */ Object ipc$super(ExceptionRender exceptionRender, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/common/logging/render/ExceptionRender");
    }

    public final String a(ExceptionID exceptionID, Throwable th, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cbb57336", new Object[]{this, exceptionID, th, str}) : a(exceptionID, LoggingUtil.throwableToString(th), str, false, LoggerFactory.getProcessInfo().getProcessAlias(), Thread.currentThread().getName(), false);
    }

    public final String a(ExceptionID exceptionID, String str, String str2, boolean z, String str3, String str4, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("396f9d4b", new Object[]{this, exceptionID, str, str2, new Boolean(z), str3, str4, new Boolean(z2)}) : a(exceptionID, str, str2, z, str3, str4, z2, null, null);
    }

    public final String a(ExceptionID exceptionID, String str, String str2, boolean z, String str3, String str4, boolean z2, String str5, Map<String, String> map) {
        String str6 = str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8b6ce3a", new Object[]{this, exceptionID, str6, str2, new Boolean(z), str3, str4, new Boolean(z2), str5, map});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("$$e");
        String nowTime = LoggingUtil.getNowTime();
        if (z2) {
            try {
                String f = CrashBridge.f();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                simpleDateFormat.setTimeZone(TimeZone.getDefault());
                long time = simpleDateFormat.parse(f).getTime();
                if (time > 0) {
                    nowTime = LoggingUtil.getNowTime(time);
                }
            } catch (Throwable unused) {
            }
        }
        LoggingUtil.appendParam(sb, nowTime);
        LoggingUtil.appendParam(sb, this.b.getProductId());
        String productVersion = this.b.getProductVersion();
        if (z2) {
            String f2 = CrashBridge.f();
            if (!TextUtils.isEmpty(f2)) {
                productVersion = f2;
            }
        }
        LoggingUtil.appendParam(sb, productVersion);
        LoggingUtil.appendParam(sb, "4");
        LoggingUtil.appendParam(sb, this.b.getClientId());
        LoggingUtil.appendExtParam(sb, map);
        LoggingUtil.appendParam(sb, this.b.getUserId());
        LoggingUtil.appendParam(sb, "exception");
        if (z2) {
            str6 = a(str6);
        }
        LoggingUtil.appendParam(sb, this.b.getClientStatus(z, z2, str6));
        LoggingUtil.appendParam(sb, str5);
        String storageParam = this.b.getStorageParam(LogContext.STORAGE_APPID);
        if (z2) {
            storageParam = CrashBridge.f();
        }
        LoggingUtil.appendParam(sb, storageParam);
        String str7 = null;
        LoggingUtil.appendParam(sb, null);
        LoggingUtil.appendParam(sb, exceptionID.getDes());
        LoggingUtil.appendParam(sb, str6);
        String topActivity = LoggingUtil.getTopActivity();
        if (z2) {
            String f3 = CrashBridge.f();
            if (!TextUtils.isEmpty(f3)) {
                topActivity = f3;
            }
        }
        LoggingUtil.appendParam(sb, topActivity);
        LoggingUtil.appendParam(sb, this.b.getChannelId());
        LoggingUtil.appendParam(sb, null);
        String contextParam = this.b.getContextParam(LogContext.STORAGE_REFVIEWID);
        if (z2) {
            contextParam = CrashBridge.f();
        }
        LoggingUtil.appendParam(sb, contextParam);
        String contextParam2 = this.b.getContextParam(LogContext.STORAGE_VIEWID);
        if (z2) {
            contextParam2 = CrashBridge.f();
        }
        LoggingUtil.appendParam(sb, contextParam2);
        LoggingUtil.appendParam(sb, TianyanLoggingStatus.isMonitorBackground() ? "bg" : "fg");
        LoggingUtil.appendParam(sb, this.b.getStorageParam(LogContext.LOCAL_STORAGE_ACTIONID));
        LoggingUtil.appendParam(sb, this.b.getStorageParam(LogContext.LOCAL_STORAGE_ACTIONTOKEN));
        LoggingUtil.appendParam(sb, Build.MODEL);
        LoggingUtil.appendParam(sb, Build.VERSION.RELEASE);
        LoggingUtil.appendParam(sb, NetUtil.getNetworkTypeOptimized(this.b.getApplicationContext()));
        LoggingUtil.appendParam(sb, str2);
        LoggingUtil.appendParam(sb, this.b.getReleaseCode());
        LoggingUtil.appendParam(sb, this.b.getDeviceId());
        LoggingUtil.appendParam(sb, this.b.getLanguage());
        LoggingUtil.appendParam(sb, this.b.getHotpatchVersion());
        LoggingUtil.appendParam(sb, str3);
        LoggingUtil.appendParam(sb, str4);
        LoggingUtil.appendParam(sb, z2 ? "native" : "java");
        LoggingUtil.appendParam(sb, this.b.getApkUniqueId());
        try {
            str7 = LoggerFactory.getProcessInfo().getStartupReason().get("toString");
        } catch (Throwable unused2) {
        }
        if (z2) {
            String f4 = CrashBridge.f();
            if (!TextUtils.isEmpty(f4)) {
                str7 = f4;
            }
        }
        LoggingUtil.appendParam(sb, str7);
        LoggingUtil.appendExtParam(sb, this.b.getBizExternParams());
        LoggingUtil.appendParam(sb, BaseRender.a());
        return sb.toString();
    }
}
