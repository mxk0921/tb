package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.Cif;
import com.xiaomi.push.bm;
import com.xiaomi.push.ig;
import com.xiaomi.push.im;
import com.xiaomi.push.jb;
import com.xiaomi.push.jm;
import com.xiaomi.push.r;
import com.xiaomi.push.x;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ca {

    /* renamed from: a  reason: collision with root package name */
    private static String f15092a;

    /* renamed from: a  reason: collision with other field name */
    private static SimpleDateFormat f1616a;

    /* renamed from: a  reason: collision with other field name */
    private static AtomicLong f1617a = new AtomicLong(0);

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f1616a = simpleDateFormat;
        f15092a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    private static jb a(String str, String str2, Cif ifVar) {
        return new jb("-1", false).d(str).b(str2).a(x.a(jm.a(ifVar))).c(im.UploadTinyData.f1168a);
    }

    public static synchronized String a() {
        String str;
        synchronized (ca.class) {
            try {
                String format = f1616a.format(Long.valueOf(System.currentTimeMillis()));
                if (!TextUtils.equals(f15092a, format)) {
                    f1617a.set(0L);
                    f15092a = format;
                }
                str = format + "-" + f1617a.incrementAndGet();
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList<com.xiaomi.push.jb> a(java.util.List<com.xiaomi.push.ig> r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r0 = 0
            if (r11 != 0) goto L_0x000a
            java.lang.String r11 = "requests can not be null in TinyDataHelper.transToThriftObj()."
        L_0x0006:
            com.xiaomi.channel.commonutils.logger.b.d(r11)
            return r0
        L_0x000a:
            int r1 = r11.size()
            if (r1 != 0) goto L_0x0014
            java.lang.String r11 = "requests.length is 0 in TinyDataHelper.transToThriftObj()."
            goto L_0x0006
        L_0x0014:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.xiaomi.push.if r2 = new com.xiaomi.push.if
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0021:
            int r6 = r11.size()
            if (r4 >= r6) goto L_0x00aa
            java.lang.Object r6 = r11.get(r4)
            com.xiaomi.push.ig r6 = (com.xiaomi.push.ig) r6
            if (r6 != 0) goto L_0x0031
            goto L_0x00a6
        L_0x0031:
            java.util.Map r7 = r6.m788a()
            if (r7 == 0) goto L_0x0071
            java.util.Map r7 = r6.m788a()
            java.lang.String r8 = "item_size"
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto L_0x0071
            java.util.Map r7 = r6.m788a()
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x0059
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: Exception -> 0x0058
            goto L_0x005a
        L_0x0058:
        L_0x0059:
            r7 = 0
        L_0x005a:
            java.util.Map r9 = r6.m788a()
            int r9 = r9.size()
            r10 = 1
            if (r9 != r10) goto L_0x0069
            r6.a(r0)
            goto L_0x0072
        L_0x0069:
            java.util.Map r9 = r6.m788a()
            r9.remove(r8)
            goto L_0x0072
        L_0x0071:
            r7 = 0
        L_0x0072:
            if (r7 > 0) goto L_0x0079
            byte[] r7 = com.xiaomi.push.jm.a(r6)
            int r7 = r7.length
        L_0x0079:
            if (r7 <= r14) goto L_0x0091
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "TinyData is too big, ignore upload request item:"
            r7.<init>(r8)
            java.lang.String r6 = r6.d()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r6)
            goto L_0x00a6
        L_0x0091:
            int r8 = r5 + r7
            if (r8 <= r14) goto L_0x00a2
            com.xiaomi.push.jb r2 = a(r12, r13, r2)
            r1.add(r2)
            com.xiaomi.push.if r2 = new com.xiaomi.push.if
            r2.<init>()
            r5 = 0
        L_0x00a2:
            r2.a(r6)
            int r5 = r5 + r7
        L_0x00a6:
            int r4 = r4 + 1
            goto L_0x0021
        L_0x00aa:
            int r11 = r2.a()
            if (r11 == 0) goto L_0x00b7
            com.xiaomi.push.jb r11 = a(r12, r13, r2)
            r1.add(r11)
        L_0x00b7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.ca.a(java.util.List, java.lang.String, java.lang.String, int):java.util.ArrayList");
    }

    public static void a(Context context, String str, String str2, long j, String str3) {
        ig igVar = new ig();
        igVar.d(str);
        igVar.c(str2);
        igVar.a(j);
        igVar.b(str3);
        igVar.a("push_sdk_channel");
        igVar.g(context.getPackageName());
        igVar.e(context.getPackageName());
        igVar.a(true);
        igVar.b(System.currentTimeMillis());
        igVar.f(a());
        cb.a(context, igVar);
    }

    public static boolean a(ig igVar, boolean z) {
        String str;
        if (igVar == null) {
            str = "item is null, verfiy ClientUploadDataItem failed.";
        } else if (!z && TextUtils.isEmpty(igVar.f1140a)) {
            str = "item.channel is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (TextUtils.isEmpty(igVar.f1147d)) {
            str = "item.category is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (TextUtils.isEmpty(igVar.f1146c)) {
            str = "item.name is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (!bm.m518a(igVar.f1147d)) {
            str = "item.category can only contain ascii char, verfiy ClientUploadDataItem failed.";
        } else if (!bm.m518a(igVar.f1146c)) {
            str = "item.name can only contain ascii char, verfiy ClientUploadDataItem failed.";
        } else {
            String str2 = igVar.f1145b;
            if (str2 == null || str2.length() <= 10240) {
                return false;
            }
            str = "item.data is too large(" + igVar.f1145b.length() + "), max size for data is 10240 , verfiy ClientUploadDataItem failed.";
        }
        b.m410a(str);
        return true;
    }

    public static boolean a(String str) {
        return !r.m967b() || Constants.HYBRID_PACKAGE_NAME.equals(str);
    }
}
