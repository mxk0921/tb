package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.ax;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;
import com.xiaomi.push.service.by;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class aj extends by.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f15040a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ u f1546a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(String str, long j, XMPushService xMPushService, u uVar) {
        super(str, j);
        this.f15040a = xMPushService;
        this.f1546a = uVar;
    }

    @Override // com.xiaomi.push.service.by.a
    public void a(by byVar) {
        ax a2 = ax.a(this.f15040a);
        String a3 = byVar.a("MSAID", "msaid");
        String a4 = a2.mo506a();
        if (!TextUtils.isEmpty(a4) && !TextUtils.equals(a3, a4)) {
            byVar.a("MSAID", "msaid", a4);
            jb jbVar = new jb();
            jbVar.b(this.f1546a.d);
            jbVar.c(im.ClientInfoUpdate.f1168a);
            jbVar.a(bc.a());
            jbVar.a(new HashMap());
            a2.a(jbVar.m880a());
            byte[] a5 = jm.a(ai.a(this.f15040a.getPackageName(), this.f1546a.d, jbVar, ic.Notification));
            XMPushService xMPushService = this.f15040a;
            xMPushService.a(xMPushService.getPackageName(), a5, true);
        }
    }
}
