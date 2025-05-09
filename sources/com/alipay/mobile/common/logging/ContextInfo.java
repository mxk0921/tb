package com.alipay.mobile.common.logging;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.api.ProcessInfo;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ContextInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Map<String, String> y;

    /* renamed from: a  reason: collision with root package name */
    public Bundle f3934a = new Bundle();
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public final Context v;
    public String w;
    public long x;

    static {
        HashMap hashMap = new HashMap();
        y = hashMap;
        hashMap.put("com.eg.android.AlipayGphone", "Android-container");
        hashMap.put("com.eg.android.AlipayGphoneRC", "Android-container-RC");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[Catch: all -> 0x01ca, TryCatch #2 {all -> 0x01ca, blocks: (B:3:0x0019, B:5:0x0028, B:6:0x0031, B:13:0x004c, B:15:0x0050, B:17:0x0065, B:23:0x0077, B:25:0x007b, B:27:0x0081, B:31:0x008a, B:32:0x00a5, B:33:0x00bb, B:35:0x00bf, B:36:0x00d1, B:41:0x00ea, B:42:0x00ee), top: B:49:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ContextInfo(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.ContextInfo.<init>(android.content.Context):void");
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (LoggerFactory.getProcessInfo().isExtProcess() && this.g == null) {
            this.g = b(LoggingSPCache.STORAGE_USERID, "");
        }
        return this.g;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (LoggerFactory.getProcessInfo().isExtProcess() && this.i == null) {
            this.i = b("utdid", "");
        }
        return this.i;
    }

    public final synchronized String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        return this.w;
    }

    public final synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (TextUtils.isEmpty(this.w) || Math.abs(System.currentTimeMillis() - this.x) > TimeUnit.MINUTES.toMillis(30L)) {
            this.x = System.currentTimeMillis();
            this.w = UUID.randomUUID().toString();
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            this.f3934a.clear();
        } catch (Throwable unused) {
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (TextUtils.isEmpty(this.p)) {
            this.q = this.p;
        } else {
            int lastIndexOf = this.p.lastIndexOf(45);
            if (lastIndexOf < 0) {
                this.q = null;
            } else {
                this.q = this.p.substring(lastIndexOf + 1);
            }
        }
    }

    public final void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
            return;
        }
        try {
            this.v.getSharedPreferences("SharedInfoForMultiProc", 4).edit().putString("key_".concat(String.valueOf(str)), str2).apply();
        } catch (Throwable unused) {
        }
    }

    public final void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        if (!TextUtils.isEmpty(str2) && str3 != null) {
            try {
                Context context = this.v;
                context.getSharedPreferences((this.v.getPackageName() + "-" + str) + ".LoggingCache", 0).edit().putString(str2, str3).apply();
            } catch (Throwable unused) {
            }
        }
    }

    public final void e(Bundle bundle, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76c3153e", new Object[]{this, bundle, str, str2});
            return;
        }
        try {
            if (!LoggerFactory.getProcessInfo().isExtProcessExist()) {
                if (bundle == null) {
                    c("ext", str, str2);
                    return;
                }
                for (String str3 : bundle.keySet()) {
                    c("ext", str3, bundle.getString(str3));
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && str2 != null) {
            this.f3934a.putString(str, str2);
            f(str, str2);
            if (LoggerFactory.getProcessInfo().isPushProcess()) {
                d(null, str, str2);
                e(null, str, str2);
            }
        }
    }

    public final void b(String str, Bundle bundle, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77702376", new Object[]{this, str, bundle, str2, str3});
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(this.v, str);
        if (bundle == null) {
            intent.setAction(this.v.getPackageName() + LogContext.ACTION_UPDATE_LOG_CONTEXT);
            intent.putExtra("type", str2);
            intent.putExtra("value", str3);
        } else {
            intent.setAction(this.v.getPackageName() + LogContext.ACTION_UPDATE_LOG_CONTEXT_BATCH);
            try {
                intent.putExtras(bundle);
            } catch (Throwable unused) {
            }
        }
        try {
            intent.setPackage(this.v.getPackageName());
        } catch (Throwable unused2) {
        }
        try {
            this.v.startService(intent);
        } catch (Throwable th) {
            th.toString();
        }
    }

    public final void d(Bundle bundle, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70bf49df", new Object[]{this, bundle, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.v.getSystemService("activity")).getRunningAppProcesses()) {
                String str3 = runningAppProcessInfo.processName;
                hashMap.put(str3, str3);
            }
        } catch (Throwable th) {
            th.toString();
        }
        for (int i = 1; i <= 5; i++) {
            String concat = "com.alipay.mobile.common.logging.process.LogServiceInlite".concat(String.valueOf(i));
            if (hashMap.containsKey(concat)) {
                Intent intent = new Intent();
                intent.setClassName(this.v, concat);
                if (bundle == null) {
                    intent.setAction(this.v.getPackageName() + LogContext.ACTION_UPDATE_LOG_CONTEXT);
                    intent.putExtra("type", str);
                    intent.putExtra("value", str2);
                } else {
                    intent.setAction(this.v.getPackageName() + LogContext.ACTION_UPDATE_LOG_CONTEXT_BATCH);
                    try {
                        intent.putExtras(bundle);
                    } catch (Throwable th2) {
                        th2.toString();
                    }
                }
                try {
                    intent.setPackage(this.v.getPackageName());
                } catch (Throwable unused) {
                }
                try {
                    this.v.startService(intent);
                } catch (Throwable th3) {
                    th3.toString();
                }
            } else if (bundle == null) {
                c("lite".concat(String.valueOf(i)), str, str2);
            } else {
                try {
                    for (String str4 : bundle.keySet()) {
                        c("lite".concat(String.valueOf(i)), str4, bundle.getString(str4));
                    }
                } catch (Throwable th4) {
                    th4.toString();
                }
            }
        }
    }

    public final void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, str, str2});
        } else if (!LoggerFactory.getProcessInfo().isPushProcess() || TextUtils.isEmpty(str) || str2 == null) {
        } else {
            if (LoggingSPCache.STORAGE_USERID.equals(str) || LoggingSPCache.STORAGE_CLIENTID.equals(str) || "utdid".equals(str)) {
                g(str, str2);
            }
        }
    }

    public final void a(Bundle bundle, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6abb7e80", new Object[]{this, bundle, str, str2});
        } else if (LoggerFactory.getProcessInfo().isMainProcess()) {
            b(LogContext.PUSH_LOG_SERVICE_CLASS_NAME, bundle, str, str2);
            if (LoggerFactory.getLogContext().isDisableToolsProcess()) {
                return;
            }
            if (LoggerFactory.getLogContext().getToolsUploadInterceptor() == null || LoggerFactory.getLogContext().getToolsUploadInterceptor().isUplaod() != 2) {
                b(LogContext.TOOLS_SERVICE_CLASS_NAME, bundle, str, str2);
            }
        } else if (LoggerFactory.getProcessInfo().isPushProcess()) {
            if (!LoggerFactory.getLogContext().isDisableToolsProcess()) {
                if (LoggerFactory.getLogContext().getToolsUploadInterceptor() == null || LoggerFactory.getLogContext().getToolsUploadInterceptor().isUplaod() != 2) {
                    b(LogContext.TOOLS_SERVICE_CLASS_NAME, bundle, str, str2);
                } else {
                    HashMap hashMap = new HashMap();
                    try {
                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.v.getSystemService("activity")).getRunningAppProcesses()) {
                            String str3 = runningAppProcessInfo.processName;
                            hashMap.put(str3, str3);
                        }
                    } catch (Throwable th) {
                        th.toString();
                    }
                    if (hashMap.containsKey(LogContext.TOOLS_SERVICE_CLASS_NAME)) {
                        Intent intent = new Intent();
                        intent.setClassName(this.v, LogContext.TOOLS_SERVICE_CLASS_NAME);
                        if (bundle == null) {
                            intent.setAction(this.v.getPackageName() + LogContext.ACTION_UPDATE_LOG_CONTEXT);
                            intent.putExtra("type", str);
                            intent.putExtra("value", str2);
                        } else {
                            intent.setAction(this.v.getPackageName() + LogContext.ACTION_UPDATE_LOG_CONTEXT_BATCH);
                            try {
                                intent.putExtras(bundle);
                            } catch (Throwable th2) {
                                th2.toString();
                            }
                        }
                        try {
                            intent.setPackage(this.v.getPackageName());
                        } catch (Throwable unused) {
                        }
                        try {
                            this.v.startService(intent);
                        } catch (Throwable th3) {
                            th3.toString();
                        }
                    } else if (bundle == null) {
                        c(ProcessInfo.ALIAS_TOOLS, str, str2);
                    } else {
                        try {
                            for (String str4 : bundle.keySet()) {
                                c(ProcessInfo.ALIAS_TOOLS, str4, bundle.getString(str4));
                            }
                        } catch (Throwable th4) {
                            th4.toString();
                        }
                    }
                }
            }
            f(str, str2);
            d(bundle, str, str2);
            e(bundle, str, str2);
        } else if (!LoggerFactory.getProcessInfo().isToolsProcess() && !LoggerFactory.getProcessInfo().isExtProcess()) {
            LoggerFactory.getProcessInfo().getProcessAlias();
        }
    }

    public final String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{this, str, str2});
        }
        try {
            return this.v.getSharedPreferences("SharedInfoForMultiProc", 4).getString("key_".concat(String.valueOf(str)), str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
