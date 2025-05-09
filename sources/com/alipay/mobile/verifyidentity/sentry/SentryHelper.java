package com.alipay.mobile.verifyidentity.sentry;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.alertsentry.Sentry;
import com.alipay.mobile.alertsentry.trace.TraceFactory;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SentryHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile long f4451a;

    static {
        new HashMap();
        new HashMap();
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        TraceFactory.a(str);
        long d = d("delay");
        if (d > 0) {
            long d2 = d(Constants.Name.INTERVAL);
            if (d2 > 0) {
                if (f4451a <= 0) {
                    f4451a = System.currentTimeMillis();
                } else if (System.currentTimeMillis() - f4451a < d2) {
                    return;
                }
                final Context context = MicroModuleContext.getInstance().getContext();
                if (context != null) {
                    AsyncTaskExecutor.getInstance().schedule(new Runnable() { // from class: com.alipay.mobile.verifyidentity.sentry.SentryHelper.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public final void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                Sentry.a(context);
                            }
                        }
                    }, "SentryMakeDecisionThread", d, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("VerifyIdentityConfig", "closeSentry", "");
            VerifyLogCat.d("Sentry", "VerifyIdentityConfig.closeSentry = " + config);
            if (!"Y".equalsIgnoreCase(config)) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            VerifyLogCat.e("Sentry", th);
            return false;
        }
    }

    public static String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        if (obj == null) {
            return "";
        }
        try {
            return JSON.toJSONString(obj);
        } catch (Throwable th) {
            VerifyLogCat.e("Sentry", th);
            return "";
        }
    }

    public static int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(ReportHelper.getReportFlag("sentry_" + str));
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "Y".equalsIgnoreCase(ReportHelper.getReportFlag("sentry_enable")) && c();
    }
}
