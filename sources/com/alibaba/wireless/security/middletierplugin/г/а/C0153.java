package com.alibaba.wireless.security.middletierplugin.г.а;

import com.alibaba.wireless.security.framework.IRouterComponent;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.wireless.security.middletierplugin.г.а.б  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0153 {

    /* renamed from: а  reason: contains not printable characters */
    private static final boolean f281 = false;

    /* renamed from: б  reason: contains not printable characters */
    private static final String f282 = "[NE-JAVA]";

    /* renamed from: в  reason: contains not printable characters */
    private static IRouterComponent f283;

    /* renamed from: г  reason: contains not printable characters */
    private static Executor f284;

    /* renamed from: д  reason: contains not printable characters */
    private static Boolean f285;

    /* renamed from: com.alibaba.wireless.security.middletierplugin.г.а.б$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    static class ThreadFactoryC0154 implements ThreadFactory {
        ThreadFactoryC0154() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "SGNE");
        }
    }

    /* renamed from: com.alibaba.wireless.security.middletierplugin.г.а.б$б  reason: contains not printable characters */
    /* loaded from: classes.dex */
    static class RunnableC0155 implements Runnable {

        /* renamed from: а  reason: contains not printable characters */
        final /* synthetic */ C0156 f286;

        RunnableC0155(C0156 r1) {
            this.f286 = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C0153.f283.doCommand(13701, this.f286.m190(), Integer.valueOf(this.f286.m185()), Integer.valueOf(this.f286.m186()), Integer.valueOf(this.f286.m187()), Long.valueOf(this.f286.m188()), Long.valueOf(this.f286.m189()));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.alibaba.wireless.security.middletierplugin.г.а.б$в  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public static class C0156 {

        /* renamed from: а  reason: contains not printable characters */
        String f287;

        /* renamed from: б  reason: contains not printable characters */
        int f288;

        /* renamed from: в  reason: contains not printable characters */
        int f289;

        /* renamed from: г  reason: contains not printable characters */
        int f290;

        /* renamed from: д  reason: contains not printable characters */
        long f291;

        /* renamed from: е  reason: contains not printable characters */
        long f292;

        /* renamed from: а  reason: contains not printable characters */
        public int m185() {
            return this.f288;
        }

        /* renamed from: б  reason: contains not printable characters */
        public int m186() {
            return this.f289;
        }

        /* renamed from: в  reason: contains not printable characters */
        public int m187() {
            return this.f290;
        }

        /* renamed from: г  reason: contains not printable characters */
        public long m188() {
            return this.f291;
        }

        /* renamed from: д  reason: contains not printable characters */
        public long m189() {
            return this.f292;
        }

        /* renamed from: е  reason: contains not printable characters */
        public String m190() {
            return this.f287;
        }

        /* renamed from: ж  reason: contains not printable characters */
        public void m191(int i) {
            this.f289 = i;
        }

        /* renamed from: з  reason: contains not printable characters */
        public void m192(int i) {
            this.f290 = i;
        }

        /* renamed from: и  reason: contains not printable characters */
        public void m193(long j) {
            this.f291 = j;
        }

        /* renamed from: й  reason: contains not printable characters */
        public void m194(long j) {
            this.f292 = j;
        }

        /* renamed from: к  reason: contains not printable characters */
        public void m195(String str) {
            this.f287 = str;
        }

        /* renamed from: ё  reason: contains not printable characters */
        public void m196(int i) {
            this.f288 = i;
        }
    }

    /* renamed from: а  reason: contains not printable characters */
    private static boolean m180() {
        IRouterComponent iRouterComponent = f283;
        if (iRouterComponent == null) {
            return false;
        }
        if (f285 == null) {
            try {
                Integer num = (Integer) iRouterComponent.doCommand(13702, new Object[0]);
                if (num != null) {
                    f285 = Boolean.valueOf(num.equals(1));
                }
            } catch (Throwable unused) {
            }
        }
        Boolean bool = f285;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: в  reason: contains not printable characters */
    public static void m182(C0156 r2) {
        if (f283 != null && f284 != null && r2 != null && m180()) {
            f284.execute(new RunnableC0155(r2));
        }
    }

    /* renamed from: г  reason: contains not printable characters */
    public static boolean m183() {
        return f283 != null && m180();
    }

    /* renamed from: д  reason: contains not printable characters */
    public static void m184(ISecurityGuardPlugin iSecurityGuardPlugin) {
        f283 = iSecurityGuardPlugin.getRouter();
        f284 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(30), new ThreadFactoryC0154(), new ThreadPoolExecutor.DiscardPolicy());
    }
}
