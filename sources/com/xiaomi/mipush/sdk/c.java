package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.en;
import com.xiaomi.push.es;
import com.xiaomi.push.ew;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.ip;
import com.xiaomi.push.jb;
import com.xiaomi.push.service.bc;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c implements ew {
    @Override // com.xiaomi.push.ew
    public void a(Context context, HashMap<String, String> hashMap) {
        jb jbVar = new jb();
        jbVar.b(es.a(context).m673a());
        jbVar.d(es.a(context).b());
        jbVar.c(im.AwakeAppResponse.f1168a);
        jbVar.a(bc.a());
        jbVar.f1308a = hashMap;
        ao.a(context).a((ao) jbVar, ic.Notification, true, (ip) null, true);
        b.m410a("MoleInfo：\u3000send data in app layer");
    }

    @Override // com.xiaomi.push.ew
    public void c(Context context, HashMap<String, String> hashMap) {
        b.m410a("MoleInfo：\u3000" + en.b(hashMap));
        String str = hashMap.get("awake_info");
        if (String.valueOf(1007).equals(hashMap.get("event_type"))) {
            o.a(context, str);
        }
    }

    @Override // com.xiaomi.push.ew
    public void b(Context context, HashMap<String, String> hashMap) {
        MiTinyDataClient.upload("category_awake_app", "wake_up_app", 1L, en.a(hashMap));
        b.m410a("MoleInfo：\u3000send data in app layer");
    }
}
