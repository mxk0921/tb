package com.alipay.mobile.verifyidentity.log.crash;

import android.os.Looper;
import android.util.Base64;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Thread;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VerifyIdentityCrashHandler implements Thread.UncaughtExceptionHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile VerifyIdentityCrashHandler b;

    /* renamed from: a  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f4304a;

    public static String a(Throwable th) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th});
        }
        try {
            str = new String(Base64.encode(VerifyLogCat.getExceptionMsg(th).getBytes("UTF-8"), 2));
        } catch (Throwable th2) {
            VerifyLogCat.w("VerifyIdentityCrashHandler", "fail to build encodedExceptionMsg：", th2);
            str = "-";
        }
        return "170823-1;20000666;vicrashinfo;" + th.getClass().getName() + ";" + str + ")]";
    }

    public static VerifyIdentityCrashHandler getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyIdentityCrashHandler) ipChange.ipc$dispatch("ce60c0d4", new Object[0]);
        }
        if (b == null) {
            synchronized (VerifyIdentityCrashHandler.class) {
                try {
                    if (b == null) {
                        b = new VerifyIdentityCrashHandler();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (this.f4304a != null) {
            Looper.getMainLooper().getThread().setUncaughtExceptionHandler(this.f4304a);
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.CMStart))) {
            this.f4304a = Looper.getMainLooper().getThread().getUncaughtExceptionHandler();
            Looper.getMainLooper().getThread().setUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca89fd43", new Object[]{this, thread, th});
            return;
        }
        Looper.getMainLooper().getThread().setUncaughtExceptionHandler(this.f4304a);
        try {
            VerifyLogCat.e("VerifyIdentityCrashHandler", "VI uncaughtException", th);
            VerifyLogCat.e("VerifyIdentityCrashHandler", a(th));
            VerifyLogger.getInstance().writeCrashLog(a(th));
        } catch (Throwable th2) {
            VerifyLogCat.w("VerifyIdentityCrashHandler", th2);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f4304a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
