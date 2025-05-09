package com.alibaba.wireless.security.open.umid;

import android.content.Intent;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.securitybody.ApmSecurityBodyPluginAdapter;
import com.alibaba.wireless.security.securitybody.SecurityGuardSecurityBodyPlugin;
import com.taobao.dp.DeviceSecuritySDKImpl;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class UMIDComponent implements IUMIDComponent, IUMIDInitListenerEx {

    /* renamed from: д  reason: contains not printable characters */
    private static final short f356 = -1;

    /* renamed from: е  reason: contains not printable characters */
    private static final short f357 = 0;

    /* renamed from: ж  reason: contains not printable characters */
    private static final Object f358 = new Object();

    /* renamed from: з  reason: contains not printable characters */
    private static SecurityGuardSecurityBodyPlugin f359 = null;

    /* renamed from: ё  reason: contains not printable characters */
    private static final short f360 = 1;

    /* renamed from: а  reason: contains not printable characters */
    private volatile boolean f361;

    /* renamed from: б  reason: contains not printable characters */
    private short f362;

    /* renamed from: в  reason: contains not printable characters */
    private ArrayList<IUMIDInitListener> f363;

    /* renamed from: г  reason: contains not printable characters */
    private DeviceSecuritySDKImpl f364;

    public UMIDComponent(SecurityGuardSecurityBodyPlugin securityGuardSecurityBodyPlugin) {
        init(securityGuardSecurityBodyPlugin, new Object[0]);
    }

    public static void sendUmidChangedNotification(String str, int i) {
        Intent intent = new Intent(IUMIDComponent.NOTIFICATION_UMID_DID_CHANGED);
        intent.setPackage(f359.getContext().getPackageName());
        intent.putExtra("token", str);
        intent.putExtra("env", i);
        f359.getContext().sendBroadcast(intent);
    }

    /* renamed from: а  reason: contains not printable characters */
    public static SecurityGuardSecurityBodyPlugin m227() {
        return f359;
    }

    /* renamed from: в  reason: contains not printable characters */
    public static void m228(SecurityGuardSecurityBodyPlugin securityGuardSecurityBodyPlugin) {
        f359 = securityGuardSecurityBodyPlugin;
    }

    @Override // com.alibaba.wireless.security.open.umid.IUMIDComponent
    public String getSecurityToken() throws SecException {
        return this.f364.getSecurityToken(0, false);
    }

    @Override // com.alibaba.wireless.security.open.umid.IUMIDComponent
    public String getSecurityToken(int i) throws SecException {
        ApmSecurityBodyPluginAdapter.monitorStart("getSecurityToken");
        if (i < 0 || i > 2) {
            throw new SecException(901);
        }
        String securityToken = this.f364.getSecurityToken(i, true);
        ApmSecurityBodyPluginAdapter.monitorEnd("getSecurityToken");
        return securityToken;
    }

    @Override // com.alibaba.wireless.security.open.IComponent
    public int init(ISecurityGuardPlugin iSecurityGuardPlugin, Object... objArr) {
        this.f361 = false;
        this.f362 = (short) -1;
        this.f363 = new ArrayList<>();
        this.f364 = new DeviceSecuritySDKImpl(iSecurityGuardPlugin);
        return 0;
    }

    @Override // com.alibaba.wireless.security.open.umid.IUMIDComponent
    public void initUMID() throws SecException {
        this.f364.init(null);
    }

    @Override // com.alibaba.wireless.security.open.umid.IUMIDComponent
    public void initUMID(int i, IUMIDInitListenerEx iUMIDInitListenerEx) throws SecException {
        this.f364.initAsync(i, iUMIDInitListenerEx);
    }

    @Override // com.alibaba.wireless.security.open.umid.IUMIDComponent
    public void initUMID(String str, int i, String str2, IUMIDInitListenerEx iUMIDInitListenerEx) throws SecException {
        initUMID(i, iUMIDInitListenerEx);
    }

    @Override // com.alibaba.wireless.security.open.umid.IUMIDComponent
    public int initUMIDSync(int i) throws SecException {
        return this.f364.initSync(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0007, B:8:0x000d, B:17:0x001e, B:18:0x0026, B:20:0x002c, B:22:0x0034, B:23:0x0038), top: B:27:0x0007 }] */
    @Override // com.alibaba.wireless.security.open.umid.IUMIDInitListenerEx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onUMIDInitFinishedEx(java.lang.String r4, int r5) {
        /*
            r3 = this;
            java.lang.Object r5 = com.alibaba.wireless.security.open.umid.UMIDComponent.f358
            monitor-enter(r5)
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x0019
            int r2 = r4.length()     // Catch: all -> 0x0017
            if (r2 <= 0) goto L_0x0019
            java.lang.String r2 = "000000000000000000000000"
            boolean r4 = r2.equals(r4)     // Catch: all -> 0x0017
            if (r4 != 0) goto L_0x0019
            r4 = 1
            goto L_0x001a
        L_0x0017:
            r4 = move-exception
            goto L_0x003a
        L_0x0019:
            r4 = 0
        L_0x001a:
            if (r4 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r3.f362 = r0     // Catch: all -> 0x0017
            java.util.ArrayList<com.alibaba.wireless.security.open.umid.IUMIDInitListener> r0 = r3.f363     // Catch: all -> 0x0017
            java.util.Iterator r0 = r0.iterator()     // Catch: all -> 0x0017
        L_0x0026:
            boolean r1 = r0.hasNext()     // Catch: all -> 0x0017
            if (r1 == 0) goto L_0x0038
            java.lang.Object r1 = r0.next()     // Catch: all -> 0x0017
            com.alibaba.wireless.security.open.umid.IUMIDInitListener r1 = (com.alibaba.wireless.security.open.umid.IUMIDInitListener) r1     // Catch: all -> 0x0017
            if (r1 == 0) goto L_0x0026
            r1.onUMIDInitFinished(r4)     // Catch: all -> 0x0017
            goto L_0x0026
        L_0x0038:
            monitor-exit(r5)     // Catch: all -> 0x0017
            return
        L_0x003a:
            monitor-exit(r5)     // Catch: all -> 0x0017
            goto L_0x003d
        L_0x003c:
            throw r4
        L_0x003d:
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.open.umid.UMIDComponent.onUMIDInitFinishedEx(java.lang.String, int):void");
    }

    @Override // com.alibaba.wireless.security.open.umid.IUMIDComponent
    public void registerInitListener(IUMIDInitListener iUMIDInitListener) throws SecException {
        if (this.f361) {
            synchronized (f358) {
                if (this.f362 == -1) {
                    if (iUMIDInitListener != null) {
                        this.f363.add(iUMIDInitListener);
                    }
                } else if (iUMIDInitListener != null) {
                    boolean z = true;
                    if (this.f362 != 1) {
                        z = false;
                    }
                    iUMIDInitListener.onUMIDInitFinished(z);
                }
            }
        } else {
            throw new SecException(907);
        }
    }

    @Override // com.alibaba.wireless.security.open.umid.IUMIDComponent
    public void setEnvironment(int i) throws SecException {
        this.f364.setEnvironment(i);
    }

    @Override // com.alibaba.wireless.security.open.umid.IUMIDComponent
    public void setOnlineHost(String str) throws SecException {
        try {
            this.f364.setOnlineHost(str);
        } catch (IllegalArgumentException unused) {
            throw new SecException(901);
        }
    }

    /* renamed from: б  reason: contains not printable characters */
    public void m229() throws SecException {
        this.f361 = true;
        this.f364.registerListener(this);
    }
}
