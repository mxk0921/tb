package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ex implements ev {
    private void b(Context context, er erVar) {
        String b = erVar.b();
        String d = erVar.d();
        int a2 = erVar.a();
        if (context == null || TextUtils.isEmpty(b) || TextUtils.isEmpty(d)) {
            if (TextUtils.isEmpty(d)) {
                eo.a(context, "provider", 1008, "argument error");
            } else {
                eo.a(context, d, 1008, "argument error");
            }
        } else if (!m.b(context, b)) {
            eo.a(context, d, 1003, "B is not ready");
        } else {
            eo.a(context, d, 1002, "B is ready");
            eo.a(context, d, 1004, "A is ready");
            String a3 = en.a(d);
            try {
                if (TextUtils.isEmpty(a3)) {
                    eo.a(context, d, 1008, "info is empty");
                } else if (a2 != 1 || es.m671a(context)) {
                    String type = context.getContentResolver().getType(en.a(b, a3));
                    if (TextUtils.isEmpty(type) || !"success".equals(type)) {
                        eo.a(context, d, 1008, "A is fail to help B's provider");
                        return;
                    }
                    eo.a(context, d, 1005, "A is successful");
                    eo.a(context, d, 1006, "The job is finished");
                } else {
                    eo.a(context, d, 1008, "A not in foreground");
                }
            } catch (Exception e) {
                b.a(e);
                eo.a(context, d, 1008, "A meet a exception when help B's provider");
            }
        }
    }

    @Override // com.xiaomi.push.ev
    public void a(Context context, Intent intent, String str) {
        a(context, str);
    }

    @Override // com.xiaomi.push.ev
    public void a(Context context, er erVar) {
        if (erVar != null) {
            b(context, erVar);
        } else {
            eo.a(context, "provider", 1008, "A receive incorrect message");
        }
    }

    private void a(Context context, String str) {
        try {
            if (!TextUtils.isEmpty(str) && context != null) {
                String[] split = str.split("/");
                if (split.length > 0 && !TextUtils.isEmpty(split[split.length - 1])) {
                    String str2 = split[split.length - 1];
                    if (TextUtils.isEmpty(str2)) {
                        eo.a(context, "provider", 1008, "B get a incorrect message");
                        return;
                    }
                    String decode = Uri.decode(str2);
                    if (TextUtils.isEmpty(decode)) {
                        eo.a(context, "provider", 1008, "B get a incorrect message");
                        return;
                    }
                    String b = en.b(decode);
                    if (!TextUtils.isEmpty(b)) {
                        eo.a(context, b, 1007, "play with provider successfully");
                        return;
                    }
                }
            }
            eo.a(context, "provider", 1008, "B get a incorrect message");
        } catch (Exception e) {
            eo.a(context, "provider", 1008, "B meet a exception" + e.getMessage());
        }
    }
}
