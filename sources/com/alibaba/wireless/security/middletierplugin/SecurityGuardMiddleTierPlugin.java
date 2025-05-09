package com.alibaba.wireless.security.middletierplugin;

import android.content.Context;
import android.util.Log;
import com.alibaba.wireless.security.framework.IRouterComponent;
import com.alibaba.wireless.security.framework.ISGPluginInfo;
import com.alibaba.wireless.security.middletierplugin.open.sensor.SensorUtil;
import com.alibaba.wireless.security.middletierplugin.г.а.C0149;
import com.alibaba.wireless.security.middletierplugin.г.а.C0153;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.open.middletier.MidBridge;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class SecurityGuardMiddleTierPlugin implements ISecurityGuardPlugin {
    public static ClassLoader sClassLoader;

    /* renamed from: а  reason: contains not printable characters */
    private ConcurrentHashMap<Class, Object> f59 = null;

    /* renamed from: б  reason: contains not printable characters */
    private Context f60 = null;

    /* renamed from: в  reason: contains not printable characters */
    private ISGPluginInfo f61 = null;

    /* renamed from: г  reason: contains not printable characters */
    private IRouterComponent f62 = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alibaba.wireless.security.middletierplugin.SecurityGuardMiddleTierPlugin$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public class RunnableC0118 implements Runnable {

        /* renamed from: а  reason: contains not printable characters */
        final /* synthetic */ boolean f63;

        /* renamed from: б  reason: contains not printable characters */
        final /* synthetic */ ExecutorService f64;

        RunnableC0118(boolean z, ExecutorService executorService) {
            this.f63 = z;
            this.f64 = executorService;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f63) {
                    C0153.m184(SecurityGuardMiddleTierPlugin.this);
                }
                C0149.m173(SecurityGuardMiddleTierPlugin.this, SecurityGuardMiddleTierPlugin.this.f60);
                SensorUtil.init(SecurityGuardMiddleTierPlugin.this);
                MidBridge.init(SecurityGuardMiddleTierPlugin.this);
                this.f64.shutdown();
            } catch (Throwable unused) {
            }
        }
    }

    public static ClassLoader getPluginClassLoader() {
        return sClassLoader;
    }

    public static Object getProxyInstance(Class cls, InvocationHandler invocationHandler) {
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler);
    }

    /* renamed from: б  reason: contains not printable characters */
    private void m72() {
        try {
            Class<?> cls = Class.forName("com.alibaba.wireless.security.sgxdatainit.SGXDataInit");
            cls.getMethod("initPlugin", Context.class).invoke(cls.newInstance(), this.f60);
        } catch (Exception e) {
            Log.i("SGB", "SGXDataPlugin not exist is OK in taobao, call SGXDataPlugin.onPluginLoaded failed, " + e.getMessage());
        }
    }

    @Override // com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin
    public Context getContext() {
        return this.f60;
    }

    @Override // com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin
    public <T> T getInterface(Class<T> cls) {
        T t;
        if (cls == null || (t = (T) this.f59.get(cls)) == null || !cls.isAssignableFrom(t.getClass())) {
            return null;
        }
        return t;
    }

    @Override // com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin
    public IRouterComponent getRouter() {
        return this.f62;
    }

    @Override // com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin
    public ISGPluginInfo getSGPluginInfo() {
        return this.f61;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:2|(2:4|(11:6|8|(1:10)|11|29|12|14|(2:31|16)(2:27|20)|21|(1:23)|24))|7|8|(0)|11|29|12|14|(0)(0)|21|(0)|24|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.wireless.security.framework.IRouterComponent onPluginLoaded(android.content.Context r5, com.alibaba.wireless.security.framework.IRouterComponent r6, com.alibaba.wireless.security.framework.ISGPluginInfo r7, java.lang.String r8, java.lang.Object... r9) throws com.alibaba.wireless.security.open.SecException {
        /*
            r4 = this;
            int r0 = r9.length
            r1 = 1
            r2 = 0
            if (r0 < r1) goto L_0x001e
            r0 = r9[r2]
            java.lang.Integer r0 = (java.lang.Integer) r0
            r0.intValue()
            int r0 = r9.length
            r3 = 3
            if (r0 < r3) goto L_0x001e
            r0 = r9[r1]
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 2
            r9 = r9[r3]
            java.util.concurrent.ConcurrentHashMap r9 = (java.util.concurrent.ConcurrentHashMap) r9
            goto L_0x0020
        L_0x001e:
            r9 = 0
            r0 = 0
        L_0x0020:
            r4.f62 = r6
            r4.f60 = r5
            r4.f61 = r7
            if (r9 != 0) goto L_0x002d
            java.util.concurrent.ConcurrentHashMap r9 = new java.util.concurrent.ConcurrentHashMap
            r9.<init>()
        L_0x002d:
            r4.f59 = r9
            com.alibaba.wireless.security.middletierplugin.C0146.m152()
            java.lang.Class r7 = r4.getClass()     // Catch: all -> 0x003d
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch: all -> 0x003d
            com.alibaba.wireless.security.middletierplugin.SecurityGuardMiddleTierPlugin.sClassLoader = r7     // Catch: all -> 0x003d
            goto L_0x003e
        L_0x003d:
        L_0x003e:
            com.alibaba.wireless.security.middletierplugin.в r7 = new com.alibaba.wireless.security.middletierplugin.в
            r7.<init>()
            java.util.concurrent.ConcurrentHashMap<java.lang.Class, java.lang.Object> r9 = r4.f59
            r7.m160(r9, r4, r5)
            if (r0 != 0) goto L_0x005a
            java.lang.System.loadLibrary(r8)     // Catch: all -> 0x004e
            goto L_0x0065
        L_0x004e:
            r5 = move-exception
            r5.toString()
            com.alibaba.wireless.security.open.SecException r5 = new com.alibaba.wireless.security.open.SecException
            r6 = 103(0x67, float:1.44E-43)
            r5.<init>(r6)
            throw r5
        L_0x005a:
            com.alibaba.wireless.security.framework.IRouterComponent r5 = r4.getRouter()     // Catch: all -> 0x0077
            r7 = 10104(0x2778, float:1.4159E-41)
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch: all -> 0x0077
            r5.doCommand(r7, r8)     // Catch: all -> 0x0077
        L_0x0065:
            java.util.concurrent.ExecutorService r5 = java.util.concurrent.Executors.newFixedThreadPool(r1)
            com.alibaba.wireless.security.middletierplugin.SecurityGuardMiddleTierPlugin$а r7 = new com.alibaba.wireless.security.middletierplugin.SecurityGuardMiddleTierPlugin$а
            r7.<init>(r0, r5)
            r5.execute(r7)
            if (r0 != 0) goto L_0x0076
            r4.m72()
        L_0x0076:
            return r6
        L_0x0077:
            com.alibaba.wireless.security.open.SecException r5 = new com.alibaba.wireless.security.open.SecException
            r6 = 142(0x8e, float:1.99E-43)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.middletierplugin.SecurityGuardMiddleTierPlugin.onPluginLoaded(android.content.Context, com.alibaba.wireless.security.framework.IRouterComponent, com.alibaba.wireless.security.framework.ISGPluginInfo, java.lang.String, java.lang.Object[]):com.alibaba.wireless.security.framework.IRouterComponent");
    }
}
