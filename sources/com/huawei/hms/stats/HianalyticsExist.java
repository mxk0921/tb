package com.huawei.hms.stats;

import com.huawei.hms.support.log.HMSLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class HianalyticsExist {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f5466a = new Object();
    private static boolean b;
    private static boolean c;

    public static boolean isHianalyticsExist() {
        synchronized (f5466a) {
            if (!b) {
                try {
                    Class.forName("com.huawei.hianalytics.process.HiAnalyticsInstance");
                } catch (ClassNotFoundException unused) {
                    HMSLog.i("HianalyticsExist", "In isHianalyticsExist, Failed to find class HiAnalyticsConfig.");
                }
                b = true;
                HMSLog.i("HianalyticsExist", "hianalytics exist: " + c);
            }
        }
        return c;
    }
}
