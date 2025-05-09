package com.xiaomi.push;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ey implements ev {
    private void a(Service service, Intent intent) {
        String stringExtra = intent.getStringExtra("awake_info");
        if (!TextUtils.isEmpty(stringExtra)) {
            String b = en.b(stringExtra);
            if (!TextUtils.isEmpty(b)) {
                eo.a(service.getApplicationContext(), b, 1007, "play with service successfully");
                return;
            }
        }
        eo.a(service.getApplicationContext(), "service", 1008, "B get a incorrect message");
    }

    private void b(Context context, er erVar) {
        String a2 = erVar.m670a();
        String b = erVar.b();
        String d = erVar.d();
        int a3 = erVar.a();
        if (context == null || TextUtils.isEmpty(a2) || TextUtils.isEmpty(b) || TextUtils.isEmpty(d)) {
            if (TextUtils.isEmpty(d)) {
                eo.a(context, "service", 1008, "argument error");
            } else {
                eo.a(context, d, 1008, "argument error");
            }
        } else if (!m.a(context, a2, b)) {
            eo.a(context, d, 1003, "B is not ready");
        } else {
            eo.a(context, d, 1002, "B is ready");
            eo.a(context, d, 1004, "A is ready");
            try {
                Intent intent = new Intent();
                intent.setAction(b);
                intent.setPackage(a2);
                intent.putExtra("awake_info", en.a(d));
                if (a3 == 1 && !es.m671a(context)) {
                    eo.a(context, d, 1008, "A not in foreground");
                } else if (context.startService(intent) != null) {
                    eo.a(context, d, 1005, "A is successful");
                    eo.a(context, d, 1006, "The job is finished");
                } else {
                    eo.a(context, d, 1008, "A is fail to help B's service");
                }
            } catch (Exception e) {
                b.a(e);
                eo.a(context, d, 1008, "A meet a exception when help B's service");
            }
        }
    }

    @Override // com.xiaomi.push.ev
    public void a(Context context, Intent intent, String str) {
        if (context == null || !(context instanceof Service)) {
            eo.a(context, "service", 1008, "A receive incorrect message");
        } else {
            a((Service) context, intent);
        }
    }

    @Override // com.xiaomi.push.ev
    public void a(Context context, er erVar) {
        if (erVar != null) {
            b(context, erVar);
        } else {
            eo.a(context, "service", 1008, "A receive incorrect message");
        }
    }
}
