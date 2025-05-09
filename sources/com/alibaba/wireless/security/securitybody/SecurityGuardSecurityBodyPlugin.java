package com.alibaba.wireless.security.securitybody;

import android.content.Context;
import com.alibaba.wireless.security.framework.IRouterComponent;
import com.alibaba.wireless.security.framework.ISGPluginInfo;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class SecurityGuardSecurityBodyPlugin implements ISecurityGuardPlugin {
    public static final int FLAG_ENABLE_NETWORK = 1;
    public static ClassLoader sClassLoader = null;

    /* renamed from: д  reason: contains not printable characters */
    private static final String f415 = "SecurityBodyPlugin";

    /* renamed from: е  reason: contains not printable characters */
    private static final boolean f416 = false;

    /* renamed from: а  reason: contains not printable characters */
    private ConcurrentHashMap<Class, Object> f417 = null;

    /* renamed from: б  reason: contains not printable characters */
    private Context f418 = null;

    /* renamed from: в  reason: contains not printable characters */
    private ISGPluginInfo f419 = null;

    /* renamed from: г  reason: contains not printable characters */
    private IRouterComponent f420 = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alibaba.wireless.security.securitybody.SecurityGuardSecurityBodyPlugin$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public class RunnableC0175 implements Runnable {

        /* renamed from: а  reason: contains not printable characters */
        final /* synthetic */ ScheduledExecutorService f421;

        RunnableC0175(ScheduledExecutorService scheduledExecutorService) {
            this.f421 = scheduledExecutorService;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C0186.m292(SecurityGuardSecurityBodyPlugin.this.getRouter(), SecurityGuardSecurityBodyPlugin.this.getContext());
                this.f421.shutdown();
            } catch (Throwable unused) {
            }
        }
    }

    public static ClassLoader getPluginClassLoader() {
        return sClassLoader;
    }

    /* renamed from: а  reason: contains not printable characters */
    private void m249(ConcurrentHashMap<Class, Object> concurrentHashMap) {
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        }
        this.f417 = concurrentHashMap;
        new C0190().m302(this.f417, this);
    }

    @Override // com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin
    public Context getContext() {
        return this.f418;
    }

    @Override // com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin
    public <T> T getInterface(Class<T> cls) {
        T t;
        if (cls == null || (t = (T) this.f417.get(cls)) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    @Override // com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin
    public IRouterComponent getRouter() {
        return this.f420;
    }

    @Override // com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin
    public ISGPluginInfo getSGPluginInfo() {
        return this.f419;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:2|(2:4|(10:6|10|30|11|13|(2:26|15)(2:28|18)|19|(1:21)|22|23)(1:7))(1:8)|9|10|30|11|13|(0)(0)|19|(0)|22|23) */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.wireless.security.framework.IRouterComponent onPluginLoaded(android.content.Context r7, com.alibaba.wireless.security.framework.IRouterComponent r8, com.alibaba.wireless.security.framework.ISGPluginInfo r9, java.lang.String r10, java.lang.Object... r11) throws com.alibaba.wireless.security.open.SecException {
        /*
            r6 = this;
            int r0 = r11.length
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 < r1) goto L_0x0022
            r0 = r11[r2]
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r4 = r11.length
            r5 = 3
            if (r4 < r5) goto L_0x0020
            r3 = r11[r1]
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 2
            r11 = r11[r4]
            java.util.concurrent.ConcurrentHashMap r11 = (java.util.concurrent.ConcurrentHashMap) r11
            goto L_0x0025
        L_0x0020:
            r11 = r3
            goto L_0x0024
        L_0x0022:
            r11 = r3
            r0 = 0
        L_0x0024:
            r3 = 0
        L_0x0025:
            r6.f418 = r7
            r6.f420 = r8
            r6.f419 = r9
            com.alibaba.wireless.security.securitybody.ApmSecurityBodyPluginAdapter.init()
            java.lang.Class r9 = r6.getClass()     // Catch: all -> 0x0039
            java.lang.ClassLoader r9 = r9.getClassLoader()     // Catch: all -> 0x0039
            com.alibaba.wireless.security.securitybody.SecurityGuardSecurityBodyPlugin.sClassLoader = r9     // Catch: all -> 0x0039
            goto L_0x003a
        L_0x0039:
        L_0x003a:
            r6.m249(r11)
            com.alibaba.wireless.security.open.umid.UMIDComponent.m228(r6)
            if (r3 != 0) goto L_0x004e
            java.lang.System.loadLibrary(r10)     // Catch: all -> 0x0046
            goto L_0x0059
        L_0x0046:
            com.alibaba.wireless.security.open.SecException r7 = new com.alibaba.wireless.security.open.SecException
            r8 = 103(0x67, float:1.44E-43)
            r7.<init>(r8)
            throw r7
        L_0x004e:
            com.alibaba.wireless.security.framework.IRouterComponent r9 = r6.getRouter()     // Catch: all -> 0x0088
            r10 = 10103(0x2777, float:1.4157E-41)
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch: all -> 0x0088
            r9.doCommand(r10, r11)     // Catch: all -> 0x0088
        L_0x0059:
            r9 = r0 & 1
            if (r9 == 0) goto L_0x006a
            java.util.concurrent.ConcurrentHashMap<java.lang.Class, java.lang.Object> r9 = r6.f417
            java.lang.Class<com.alibaba.wireless.security.open.umid.IUMIDComponent> r10 = com.alibaba.wireless.security.open.umid.IUMIDComponent.class
            java.lang.Object r9 = r9.get(r10)
            com.alibaba.wireless.security.open.umid.UMIDComponent r9 = (com.alibaba.wireless.security.open.umid.UMIDComponent) r9
            r9.m229()
        L_0x006a:
            com.alibaba.wireless.security.securitybody.LifeCycle.init(r7, r8)
            android.content.Context r9 = r6.getContext()
            com.alibaba.wireless.security.securitybody.SecurityBodyAdapter.initialize(r9)
            com.alibaba.wireless.security.securitybody.InvocationHandlerAdapter.init(r7, r8)
            java.util.concurrent.ScheduledExecutorService r7 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()
            com.alibaba.wireless.security.securitybody.SecurityGuardSecurityBodyPlugin$а r9 = new com.alibaba.wireless.security.securitybody.SecurityGuardSecurityBodyPlugin$а
            r9.<init>(r7)
            r10 = 2
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r7.schedule(r9, r10, r0)
            return r8
        L_0x0088:
            com.alibaba.wireless.security.open.SecException r7 = new com.alibaba.wireless.security.open.SecException
            r8 = 141(0x8d, float:1.98E-43)
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.securitybody.SecurityGuardSecurityBodyPlugin.onPluginLoaded(android.content.Context, com.alibaba.wireless.security.framework.IRouterComponent, com.alibaba.wireless.security.framework.ISGPluginInfo, java.lang.String, java.lang.Object[]):com.alibaba.wireless.security.framework.IRouterComponent");
    }
}
