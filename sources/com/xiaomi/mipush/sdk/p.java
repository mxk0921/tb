package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.ah;
import com.xiaomi.push.ic;
import com.xiaomi.push.ip;
import com.xiaomi.push.jb;
import com.xiaomi.push.service.bc;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
class p extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f14737a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ jb f709a;

    public p(jb jbVar, Context context) {
        this.f709a = jbVar;
        this.f14737a = context;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo607a() {
        return AgooConstants.REPORT_ENCRYPT_FAIL;
    }

    @Override // java.lang.Runnable
    public void run() {
        jb jbVar = this.f709a;
        if (jbVar != null) {
            jbVar.a(bc.a());
            ao.a(this.f14737a.getApplicationContext()).a((ao) this.f709a, ic.Notification, true, (ip) null, true);
        }
    }
}
