package com.taobao.alimama.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.i4g;
import tb.t2o;
import tb.vm2;
import tb.vu3;
import tb.vzo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UserTrackLogs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_PAGE_NAME = "Munion";
    private static final Queue<a> sCachedQueue = new ConcurrentLinkedQueue();
    private static AtomicBoolean allowDirectReport = new AtomicBoolean(false);
    private static Random randGenerator = new Random();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f6192a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        static {
            t2o.a(1017118847);
        }

        public a(int i, String str, String str2, String str3, String str4) {
            this.f6192a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }
    }

    static {
        t2o.a(1017118846);
    }

    public static void commitJavaUTEvent(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e6bb0b7", new Object[]{str, new Integer(i), str2, str3, str4, map});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, map).build());
        } catch (Throwable unused) {
        }
    }

    public static void emptyCacheAndAllowDirectReport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f187ab", new Object[0]);
            return;
        }
        StringBuilder sb = new StringBuilder("size=");
        Queue<a> queue = sCachedQueue;
        sb.append(queue.size());
        i4g.a("empty_ut_cache", sb.toString());
        if (allowDirectReport.compareAndSet(false, true)) {
            for (a poll = queue.poll(); poll != null; poll = sCachedQueue.poll()) {
                trackLogDirect(poll.f6192a, poll.b, poll.c, poll.d, poll.e);
            }
        }
    }

    public static void traceInvokeLog(double d, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f56060f", new Object[]{new Double(d), strArr});
        } else if (randGenerator.nextDouble() < Math.min(1.0d, Math.max((double) vu3.b.GEO_NOT_SUPPORT, d))) {
            traceInvokeLog(strArr);
        }
    }

    public static void trackAdLog(String str, String... strArr) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f813a18", new Object[]{str, strArr});
            return;
        }
        if (strArr == null || strArr.length <= 0) {
            str2 = "";
        } else {
            str2 = TextUtils.join(",", strArr);
        }
        trackLog(ConnectionResult.SERVICE_UPDATING, str, "", "", str2);
    }

    public static void trackClick(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8cfc13", new Object[]{new Integer(i), str, str2});
            return;
        }
        TBS.Ext.commitEvent(i, "", "", "", "sdkversion=5.15.27", "clickid=" + str2, "localinfo=", "bucket=" + TextUtils.join(";", vm2.i()), str);
    }

    public static void trackCustomLog(String str, String... strArr) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c56ee6", new Object[]{str, strArr});
            return;
        }
        if (strArr == null || strArr.length <= 0) {
            str2 = "";
        } else {
            str2 = TextUtils.join(",", strArr);
        }
        trackLog(19999, str, "", "", str2);
    }

    public static void trackDebugLog(String str, String... strArr) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2a2412", new Object[]{str, strArr});
            return;
        }
        if (strArr == null || strArr.length <= 0) {
            str2 = "";
        } else {
            str2 = TextUtils.join(",", strArr);
        }
        trackLog(ConnectionResult.SIGN_IN_FAILED, str, "", "", str2);
    }

    public static void trackLog(int i, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf46462b", new Object[]{new Integer(i), str, str2, str3, str4});
        } else if ((i == 9004 || i == 9005 || i == 19999) && !allowDirectReport.get()) {
            sCachedQueue.offer(new a(i, str, str2, str3, str4));
        } else {
            trackLogDirect(i, str, str2, str3, str4);
        }
    }

    private static void trackLogDirect(int i, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e613c382", new Object[]{new Integer(i), str, str2, str3, str4});
            return;
        }
        String join = TextUtils.join(";", vm2.i());
        TBS.Ext.commitEvent(UT_PAGE_NAME, i, str, str2, str3, "sdkversion=5.15.27,bucket=" + join, str4);
    }

    public static void trackExceptionLog(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b571aeff", new Object[]{exc});
            return;
        }
        trackLog(19999, "Munion_Exception_Trace", "", "", "message=" + exc.getMessage() + ",className=" + exc.getClass().getName() + "," + vzo.b(exc, 0, 4));
    }

    public static void trackClick(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df30671d", new Object[]{new Integer(i), str, str2, str3});
            return;
        }
        TBS.Ext.commitEvent(i, "", "", "", "sdkversion=5.15.27", "clickid=" + str2, "localinfo=", "bucket=" + TextUtils.join(";", vm2.i()), str, "epid=" + str3);
    }

    public static void traceInvokeLog(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6489971", new Object[]{strArr});
            return;
        }
        String b = vzo.b(new Throwable(), 1, 5);
        if (strArr != null && strArr.length > 0) {
            b = b + "," + TextUtils.join(",", strArr);
        }
        trackLog(19999, "Munion_Invoke_Trace", "", "", b);
    }

    public static void trackClick(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fff913b", new Object[]{new Integer(i), str, str2, str3, str4, str5, str6});
            return;
        }
        TBS.Ext.commitEvent(i, "", "", "", "sdkversion=5.15.27", "clickid=" + str2, "localinfo=", "bucket=" + TextUtils.join(";", vm2.i()), str, "epid=" + str3, "host=" + str4, "path=" + str5, "mmAdArgs=" + str6);
    }
}
