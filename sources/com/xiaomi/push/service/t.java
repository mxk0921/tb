package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ic;
import com.xiaomi.push.ip;
import com.xiaomi.push.iy;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;
import com.xiaomi.push.service.XMPushService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class t extends XMPushService.j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s f15129a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f1656a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ List f1657a;
    final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, int i, String str, List list, String str2) {
        super(i);
        this.f15129a = sVar;
        this.f1656a = str;
        this.f1657a = list;
        this.b = str2;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public String mo1104a() {
        return "Send tiny data.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a  reason: collision with other method in class */
    public void mo1104a() {
        String a2;
        XMPushService xMPushService;
        a2 = this.f15129a.a(this.f1656a);
        ArrayList<jb> a3 = ca.a(this.f1657a, this.f1656a, a2, 32768);
        if (a3 != null) {
            Iterator<jb> it = a3.iterator();
            while (it.hasNext()) {
                jb next = it.next();
                next.a("uploadWay", "longXMPushService");
                iy a4 = ai.a(this.f1656a, a2, next, ic.Notification);
                if (!TextUtils.isEmpty(this.b) && !TextUtils.equals(this.f1656a, this.b)) {
                    if (a4.m853a() == null) {
                        ip ipVar = new ip();
                        ipVar.a("-1");
                        a4.a(ipVar);
                    }
                    a4.m853a().b("ext_traffic_source_pkg", this.b);
                }
                byte[] a5 = jm.a(a4);
                xMPushService = this.f15129a.f15128a;
                xMPushService.a(this.f1656a, a5, true);
            }
            return;
        }
        b.d("TinyData LongConnUploader.upload Get a null XmPushActionNotification list when TinyDataHelper.pack() in XMPushService.");
    }
}
