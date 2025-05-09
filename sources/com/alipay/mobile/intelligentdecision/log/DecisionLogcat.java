package com.alipay.mobile.intelligentdecision.log;

import com.alipay.mobile.intelligentdecision.CommonUtils;
import com.alipay.mobile.intelligentdecision.DecisionContext;
import com.alipay.mobile.verifyidentity.log.VITraceLogger;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DecisionLogcat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f4235a = "";
    public static boolean b;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        f4235a = str;
        b = CommonUtils.a(DecisionContext.getInstance().getContext());
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (b) {
            VITraceLogger instance = VITraceLogger.getInstance();
            instance.info(f4235a + "," + str, str2);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (b) {
            VITraceLogger instance = VITraceLogger.getInstance();
            instance.error(f4235a + "," + str, str2);
        }
    }
}
