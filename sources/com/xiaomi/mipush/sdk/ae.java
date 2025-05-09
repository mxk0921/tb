package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ah;
import com.xiaomi.push.ic;
import com.xiaomi.push.ii;
import com.xiaomi.push.im;
import com.xiaomi.push.ip;
import com.xiaomi.push.iu;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;
import com.xiaomi.push.service.az;
import com.xiaomi.push.service.ba;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ae extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f14709a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f670a = false;

    public ae(Context context) {
        this.f14709a = context;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo607a() {
        return "2";
    }

    @Override // java.lang.Runnable
    public void run() {
        az a2 = az.a(this.f14709a);
        iu iuVar = new iu();
        if (this.f670a) {
            iuVar.a(0);
            iuVar.b(0);
        } else {
            iuVar.a(ba.a(a2, ii.MISC_CONFIG));
            iuVar.b(ba.a(a2, ii.PLUGIN_CONFIG));
        }
        jb jbVar = new jb("-1", false);
        jbVar.c(im.DailyCheckClientConfig.f1168a);
        jbVar.a(jm.a(iuVar));
        b.b("OcVersionCheckJob", "-->check version: checkMessage=", iuVar);
        ao.a(this.f14709a).a((ao) jbVar, ic.Notification, (ip) null);
    }
}
