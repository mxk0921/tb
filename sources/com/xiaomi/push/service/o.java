package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.bj;
import com.xiaomi.push.h;
import com.xiaomi.push.iy;
import com.xiaomi.push.jd;
import com.xiaomi.push.jm;
import com.xiaomi.push.js;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class o {
    public static jd a(iy iyVar) {
        byte[] a2 = iyVar.m859a();
        jd jdVar = new jd();
        try {
            jm.a(jdVar, a2);
            return jdVar;
        } catch (js unused) {
            return null;
        }
    }

    public static byte[] b(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            b.m410a("secret is empty, return null");
            return null;
        }
        try {
            return h.a(bj.m516a(str), bArr);
        } catch (Exception e) {
            b.a("dencryption error. ", e);
            return null;
        }
    }

    public static void a(Context context, Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("ext_fcm_container_buffer");
            String stringExtra2 = intent.getStringExtra("mipush_app_package");
            if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2)) {
                try {
                    byte[] b = b(Base64.decode(stringExtra, 2), context.getSharedPreferences("mipush_apps_scrt", 0).getString(stringExtra2, null));
                    if (b != null) {
                        al.m1015a(context, z.a(b), b);
                    } else {
                        b.m410a("notify fcm notification error ：dencrypt failed");
                    }
                } catch (Throwable th) {
                    b.a("notify fcm notification error ", th);
                }
            }
        }
    }

    public static void a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            context.getSharedPreferences("mipush_apps_scrt", 0).edit().putString(str, str2).apply();
        }
    }

    public static byte[] a(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            b.m410a("secret is empty, return null");
            return null;
        }
        try {
            return h.b(bj.m516a(str), bArr);
        } catch (Exception e) {
            b.a("encryption error. ", e);
            return null;
        }
    }
}
