package com.xiaomi.push;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ju;
import com.xiaomi.push.ke;
import com.xiaomi.push.service.aw;
import com.xiaomi.push.service.f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jm {
    public static int a(Context context, iy iyVar) {
        ip a2 = iyVar.m853a();
        return a(context, iyVar.f1295b, (a2 == null || a2.m820a() == null) ? null : a2.m820a().get(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID));
    }

    private static int b(Context context, String str, String str2) {
        aw a2;
        NotificationChannel a3;
        int importance;
        if (Build.VERSION.SDK_INT < 26 || context == null || TextUtils.isEmpty(str) || (a2 = aw.a(context, str)) == null || (a3 = a2.m1034a(a2.m1037a(str2))) == null) {
            return 0;
        }
        importance = a3.getImportance();
        if (importance != 0) {
            return 32;
        }
        return 64;
    }

    private static int a(Context context, String str, String str2) {
        aw a2;
        NotificationChannel a3;
        int importance;
        String id;
        String id2;
        if (Build.VERSION.SDK_INT < 26 || context == null || TextUtils.isEmpty(str) || (a2 = aw.a(context, str)) == null || (a3 = a2.m1034a(a2.m1037a(str2))) == null) {
            return 0;
        }
        importance = a3.getImportance();
        int i = importance != 0 ? 1 : 2;
        id = a3.getId();
        int a4 = f.a(str, id, 8);
        if (a4 == 1) {
            i += 4;
        } else if (a4 == 0) {
            i += 8;
        }
        id2 = a3.getId();
        int a5 = f.a(str, id2, 16);
        return a5 == 1 ? i + 16 : a5 == 0 ? i + 32 : i;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static short m930a(Context context, iy iyVar) {
        ip a2 = iyVar.m853a();
        return m931a(context, iyVar.f1295b, (a2 == null || a2.m820a() == null) ? null : a2.m820a().get(NotificationCompat.TvExtender.EXTRA_CHANNEL_ID));
    }

    public static short a(Context context, String str) {
        return m931a(context, str, (String) null);
    }

    /* renamed from: a  reason: collision with other method in class */
    public static short m931a(Context context, String str, String str2) {
        int i = 0;
        int a2 = g.a(context, str, false).a() + (ag.b(context) ? 4 : 0) + (ag.a(context) ? 8 : 0);
        if (aw.m1032a(context)) {
            i = 16;
        }
        return (short) (a2 + i + b(context, str, str2));
    }

    public static <T extends jn<T, ?>> void a(T t, byte[] bArr) {
        if (bArr != null) {
            new jr(new ke.a(true, true, bArr.length)).a(t, bArr);
            return;
        }
        throw new js("the message byte is empty.");
    }

    public static <T extends jn<T, ?>> byte[] a(T t) {
        if (t == null) {
            return null;
        }
        try {
            return new jt(new ju.a()).a(t);
        } catch (js e) {
            b.a("convertThriftObjectToBytes catch TException.", e);
            return null;
        }
    }
}
