package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ak;
import com.xiaomi.push.c;
import com.xiaomi.push.el;
import com.xiaomi.push.em;
import com.xiaomi.push.ht;
import com.xiaomi.push.i;
import com.xiaomi.push.r;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class bw {

    /* renamed from: a  reason: collision with root package name */
    private static bw f15086a = new bw();

    /* renamed from: a  reason: collision with other field name */
    private static String f1604a;

    /* renamed from: a  reason: collision with other field name */
    private ak.b f1605a;

    /* renamed from: a  reason: collision with other field name */
    private el.a f1606a;

    /* renamed from: a  reason: collision with other field name */
    private List<a> f1607a = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static abstract class a {
        public void a(el.a aVar) {
        }

        public void a(em.b bVar) {
        }
    }

    private bw() {
    }

    private void b() {
        if (this.f1606a == null) {
            d();
        }
    }

    private void c() {
        if (this.f1605a == null) {
            bx bxVar = new bx(this);
            this.f1605a = bxVar;
            ht.a(bxVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void d() {
        /*
            r4 = this;
            java.lang.String r0 = "load config failure: "
            r1 = 0
            android.content.Context r2 = com.xiaomi.push.r.m963a()     // Catch: all -> 0x0028, Exception -> 0x002a
            java.lang.String r3 = "XMCloudCfg"
            java.io.FileInputStream r2 = r2.openFileInput(r3)     // Catch: all -> 0x0028, Exception -> 0x002a
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: all -> 0x0028, Exception -> 0x002a
            r3.<init>(r2)     // Catch: all -> 0x0028, Exception -> 0x002a
            com.xiaomi.push.b r1 = com.xiaomi.push.b.a(r3)     // Catch: all -> 0x0023, Exception -> 0x0026
            com.xiaomi.push.el$a r1 = com.xiaomi.push.el.a.b(r1)     // Catch: all -> 0x0023, Exception -> 0x0026
            r4.f1606a = r1     // Catch: all -> 0x0023, Exception -> 0x0026
            r3.close()     // Catch: all -> 0x0023, Exception -> 0x0026
        L_0x001f:
            com.xiaomi.push.x.a(r3)
            goto L_0x0041
        L_0x0023:
            r0 = move-exception
            r1 = r3
            goto L_0x004d
        L_0x0026:
            r1 = move-exception
            goto L_0x002d
        L_0x0028:
            r0 = move-exception
            goto L_0x004d
        L_0x002a:
            r2 = move-exception
            r3 = r1
            r1 = r2
        L_0x002d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: all -> 0x0023
            r2.<init>(r0)     // Catch: all -> 0x0023
            java.lang.String r0 = r1.getMessage()     // Catch: all -> 0x0023
            r2.append(r0)     // Catch: all -> 0x0023
            java.lang.String r0 = r2.toString()     // Catch: all -> 0x0023
            com.xiaomi.channel.commonutils.logger.b.m410a(r0)     // Catch: all -> 0x0023
            goto L_0x001f
        L_0x0041:
            com.xiaomi.push.el$a r0 = r4.f1606a
            if (r0 != 0) goto L_0x004c
            com.xiaomi.push.el$a r0 = new com.xiaomi.push.el$a
            r0.<init>()
            r4.f1606a = r0
        L_0x004c:
            return
        L_0x004d:
            com.xiaomi.push.x.a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.bw.d():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            if (this.f1606a != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(r.m963a().openFileOutput("XMCloudCfg", 0));
                c a2 = c.a(bufferedOutputStream);
                this.f1606a.a(a2);
                a2.m527a();
                bufferedOutputStream.close();
            }
        } catch (Exception e) {
            b.m410a("save config failure: " + e.getMessage());
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public int m1063a() {
        b();
        el.a aVar = this.f1606a;
        if (aVar != null) {
            return aVar.c();
        }
        return 0;
    }

    /* renamed from: a  reason: collision with other method in class */
    public el.a m1064a() {
        b();
        return this.f1606a;
    }

    public static bw a() {
        return f15086a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static synchronized String m1062a() {
        String str;
        synchronized (bw.class) {
            try {
                if (f1604a == null) {
                    SharedPreferences sharedPreferences = r.m963a().getSharedPreferences("XMPushServiceConfig", 0);
                    String string = sharedPreferences.getString("DeviceUUID", null);
                    f1604a = string;
                    if (string == null) {
                        String a2 = i.a(r.m963a(), false);
                        f1604a = a2;
                        if (a2 != null) {
                            sharedPreferences.edit().putString("DeviceUUID", f1604a).commit();
                        }
                    }
                }
                str = f1604a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized void m1065a() {
        this.f1607a.clear();
    }

    public void a(em.b bVar) {
        a[] aVarArr;
        if (bVar.m630d() && bVar.d() > m1063a()) {
            c();
        }
        synchronized (this) {
            List<a> list = this.f1607a;
            aVarArr = (a[]) list.toArray(new a[list.size()]);
        }
        for (a aVar : aVarArr) {
            aVar.a(bVar);
        }
    }

    public synchronized void a(a aVar) {
        this.f1607a.add(aVar);
    }
}
