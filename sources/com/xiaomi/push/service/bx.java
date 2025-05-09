package com.xiaomi.push.service;

import android.util.Base64;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ak;
import com.xiaomi.push.bf;
import com.xiaomi.push.cw;
import com.xiaomi.push.el;
import com.xiaomi.push.r;
import com.xiaomi.push.service.bw;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class bx extends ak.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bw f15087a;

    /* renamed from: a  reason: collision with other field name */
    boolean f1608a = false;

    public bx(bw bwVar) {
        this.f15087a = bwVar;
    }

    @Override // com.xiaomi.push.ak.b
    /* renamed from: b */
    public void mo598b() {
        try {
            el.a a2 = el.a.a(Base64.decode(cw.a(r.m963a(), "https://resolver.msg.xiaomi.net/psc/?t=a", (List<bf>) null), 10));
            if (a2 != null) {
                this.f15087a.f1606a = a2;
                this.f1608a = true;
                this.f15087a.e();
            }
        } catch (Exception e) {
            b.m410a("fetch config failure: " + e.getMessage());
        }
    }

    @Override // com.xiaomi.push.ak.b
    /* renamed from: c */
    public void mo599c() {
        List list;
        List list2;
        bw.a[] aVarArr;
        el.a aVar;
        this.f15087a.f1605a = null;
        if (this.f1608a) {
            synchronized (this.f15087a) {
                list = this.f15087a.f1607a;
                list2 = this.f15087a.f1607a;
                aVarArr = (bw.a[]) list.toArray(new bw.a[list2.size()]);
            }
            for (bw.a aVar2 : aVarArr) {
                aVar = this.f15087a.f1606a;
                aVar2.a(aVar);
            }
        }
    }
}
