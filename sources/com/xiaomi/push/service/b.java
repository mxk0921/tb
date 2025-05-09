package com.xiaomi.push.service;

import com.xiaomi.push.ah;
import com.xiaomi.push.ic;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;
import java.lang.ref.WeakReference;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class b extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    private jb f15061a;

    /* renamed from: a  reason: collision with other field name */
    private WeakReference<XMPushService> f1574a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f1575a;

    public b(jb jbVar, WeakReference<XMPushService> weakReference, boolean z) {
        this.f15061a = jbVar;
        this.f1574a = weakReference;
        this.f1575a = z;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo607a() {
        return AgooConstants.REPORT_ENCRYPT_FAIL;
    }

    @Override // java.lang.Runnable
    public void run() {
        XMPushService xMPushService;
        WeakReference<XMPushService> weakReference = this.f1574a;
        if (weakReference != null && this.f15061a != null && (xMPushService = weakReference.get()) != null) {
            this.f15061a.a(bc.a());
            this.f15061a.a(false);
            com.xiaomi.channel.commonutils.logger.b.c("MoleInfo aw_ping : send aw_Ping msg " + this.f15061a.m879a());
            try {
                String c = this.f15061a.c();
                xMPushService.a(c, jm.a(ai.a(c, this.f15061a.b(), this.f15061a, ic.Notification)), this.f1575a);
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.d("MoleInfo aw_ping : send help app ping error" + e.toString());
            }
        }
    }
}
