package com.taobao.wireless.security.adapter.datareport;

import com.alibaba.wireless.security.framework.IRouterComponent;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.taobao.wireless.security.adapter.datareport.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0819 {

    /* renamed from: а  reason: contains not printable characters */
    private static final boolean f619 = false;

    /* renamed from: б  reason: contains not printable characters */
    private static final String f620 = "[NE-JAVA]";

    /* renamed from: в  reason: contains not printable characters */
    private static IRouterComponent f621;

    /* renamed from: г  reason: contains not printable characters */
    private static Executor f622;

    /* renamed from: д  reason: contains not printable characters */
    private static Boolean f623;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.taobao.wireless.security.adapter.datareport.а$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public static class ThreadFactoryC0820 implements ThreadFactory {
        ThreadFactoryC0820() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "SGNE");
        }
    }

    /* renamed from: com.taobao.wireless.security.adapter.datareport.а$б  reason: contains not printable characters */
    /* loaded from: classes.dex */
    static class RunnableC0821 implements Runnable {

        /* renamed from: а  reason: contains not printable characters */
        final /* synthetic */ C0822 f624;

        RunnableC0821(C0822 r1) {
            this.f624 = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C0819.f621.doCommand(13701, this.f624.m400(), Integer.valueOf(this.f624.m395()), Integer.valueOf(this.f624.m396()), Integer.valueOf(this.f624.m397()), Long.valueOf(this.f624.m398()), Long.valueOf(this.f624.m399()));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.taobao.wireless.security.adapter.datareport.а$в  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public static class C0822 {

        /* renamed from: а  reason: contains not printable characters */
        String f625;

        /* renamed from: б  reason: contains not printable characters */
        int f626;

        /* renamed from: в  reason: contains not printable characters */
        int f627;

        /* renamed from: г  reason: contains not printable characters */
        int f628;

        /* renamed from: д  reason: contains not printable characters */
        long f629;

        /* renamed from: е  reason: contains not printable characters */
        long f630;

        /* renamed from: а  reason: contains not printable characters */
        public int m395() {
            return this.f626;
        }

        /* renamed from: б  reason: contains not printable characters */
        public int m396() {
            return this.f627;
        }

        /* renamed from: в  reason: contains not printable characters */
        public int m397() {
            return this.f628;
        }

        /* renamed from: г  reason: contains not printable characters */
        public long m398() {
            return this.f629;
        }

        /* renamed from: д  reason: contains not printable characters */
        public long m399() {
            return this.f630;
        }

        /* renamed from: е  reason: contains not printable characters */
        public String m400() {
            return this.f625;
        }

        /* renamed from: ж  reason: contains not printable characters */
        public void m401(int i) {
            this.f627 = i;
        }

        /* renamed from: з  reason: contains not printable characters */
        public void m402(int i) {
            this.f628 = i;
        }

        /* renamed from: и  reason: contains not printable characters */
        public void m403(long j) {
            this.f629 = j;
        }

        /* renamed from: й  reason: contains not printable characters */
        public void m404(long j) {
            this.f630 = j;
        }

        /* renamed from: к  reason: contains not printable characters */
        public void m405(String str) {
            this.f625 = str;
        }

        /* renamed from: ё  reason: contains not printable characters */
        public void m406(int i) {
            this.f626 = i;
        }
    }

    /* renamed from: а  reason: contains not printable characters */
    private static boolean m390() {
        IRouterComponent iRouterComponent = f621;
        if (iRouterComponent == null) {
            return false;
        }
        if (f623 == null) {
            try {
                Integer num = (Integer) iRouterComponent.doCommand(13702, new Object[0]);
                if (num != null) {
                    f623 = Boolean.valueOf(num.equals(1));
                }
            } catch (Throwable unused) {
            }
        }
        Boolean bool = f623;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: в  reason: contains not printable characters */
    public static void m392(C0822 r2) {
        if (f621 != null && f622 != null && r2 != null && m390()) {
            f622.execute(new RunnableC0821(r2));
        }
    }

    /* renamed from: г  reason: contains not printable characters */
    public static boolean m393() {
        return f621 != null && m390();
    }

    /* renamed from: д  reason: contains not printable characters */
    public static void m394(ISecurityGuardPlugin iSecurityGuardPlugin) {
        f621 = iSecurityGuardPlugin.getRouter();
        f622 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(30), new ThreadFactoryC0820(), new ThreadPoolExecutor.DiscardPolicy());
    }
}
