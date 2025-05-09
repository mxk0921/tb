package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ic;
import com.xiaomi.push.im;
import com.xiaomi.push.iy;
import com.xiaomi.push.j;
import com.xiaomi.push.jb;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private static volatile s f14740a;

    /* renamed from: a  reason: collision with other field name */
    private final Context f710a;

    private s(Context context) {
        this.f710a = context.getApplicationContext();
    }

    private static s a(Context context) {
        if (f14740a == null) {
            synchronized (s.class) {
                try {
                    if (f14740a == null) {
                        f14740a = new s(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14740a;
    }

    public static void b(Context context, iy iyVar, boolean z) {
        a(context).a(iyVar, 2, z);
    }

    public static void c(Context context, iy iyVar, boolean z) {
        a(context).a(iyVar, 3, z);
    }

    public static void d(Context context, iy iyVar, boolean z) {
        a(context).a(iyVar, 4, z);
    }

    public static void e(Context context, iy iyVar, boolean z) {
        s a2;
        int i;
        b a3 = b.m452a(context);
        if (TextUtils.isEmpty(a3.m460c()) || TextUtils.isEmpty(a3.d())) {
            a2 = a(context);
            i = 6;
        } else {
            boolean f = a3.m464f();
            a2 = a(context);
            if (f) {
                i = 7;
            } else {
                i = 5;
            }
        }
        a2.a(iyVar, i, z);
    }

    public static void a(Context context, iy iyVar) {
        a(context).a(iyVar, 0, true);
    }

    public static void a(Context context, iy iyVar, boolean z) {
        a(context).a(iyVar, 1, z);
    }

    private void a(iy iyVar, int i, boolean z) {
        if (!j.m869a(this.f710a) && j.m868a() && iyVar != null && iyVar.f1288a == ic.SendMessage && iyVar.m853a() != null && z) {
            b.m410a("click to start activity result:" + String.valueOf(i));
            jb jbVar = new jb(iyVar.m853a().m819a(), false);
            jbVar.c(im.SDK_START_ACTIVITY.f1168a);
            jbVar.b(iyVar.m854a());
            jbVar.d(iyVar.f1295b);
            HashMap hashMap = new HashMap();
            jbVar.f1308a = hashMap;
            hashMap.put("result", String.valueOf(i));
            ao.a(this.f710a).a(jbVar, ic.Notification, false, false, null, true, iyVar.f1295b, iyVar.f1291a, true, false);
        }
    }
}
