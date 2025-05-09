package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.gf;
import com.xiaomi.push.hf;
import com.xiaomi.push.hg;
import com.xiaomi.push.hh;
import com.xiaomi.push.hj;
import com.xiaomi.push.j;
import com.xiaomi.push.service.bf;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private z f15117a = new z();

    public bf.b a(gf gfVar) {
        Collection<bf.b> a2 = bf.a().m1046a(Integer.toString(gfVar.a()));
        if (a2.isEmpty()) {
            return null;
        }
        Iterator<bf.b> it = a2.iterator();
        if (a2.size() == 1) {
            return it.next();
        }
        String g = gfVar.g();
        while (it.hasNext()) {
            bf.b next = it.next();
            if (TextUtils.equals(g, next.f1590b)) {
                return next;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.xiaomi.push.service.bf.b a(com.xiaomi.push.hh r6) {
        /*
            r5 = this;
            com.xiaomi.push.service.bf r0 = com.xiaomi.push.service.bf.a()
            java.lang.String r1 = r6.k()
            java.util.Collection r0 = r0.m1046a(r1)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L_0x0014
            return r2
        L_0x0014:
            java.util.Iterator r1 = r0.iterator()
            int r0 = r0.size()
            r3 = 1
            if (r0 != r3) goto L_0x0026
            java.lang.Object r6 = r1.next()
            com.xiaomi.push.service.bf$b r6 = (com.xiaomi.push.service.bf.b) r6
            return r6
        L_0x0026:
            java.lang.String r0 = r6.m()
            java.lang.String r6 = r6.l()
        L_0x002e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x004b
            java.lang.Object r3 = r1.next()
            com.xiaomi.push.service.bf$b r3 = (com.xiaomi.push.service.bf.b) r3
            java.lang.String r4 = r3.f1590b
            boolean r4 = android.text.TextUtils.equals(r0, r4)
            if (r4 != 0) goto L_0x004a
            java.lang.String r4 = r3.f1590b
            boolean r4 = android.text.TextUtils.equals(r6, r4)
            if (r4 == 0) goto L_0x002e
        L_0x004a:
            return r3
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.k.a(com.xiaomi.push.hh):com.xiaomi.push.service.bf$b");
    }

    public static String a(bf.b bVar) {
        StringBuilder sb;
        String str;
        if (!"9".equals(bVar.g)) {
            sb = new StringBuilder();
            sb.append(bVar.f1587a);
            str = ".permission.MIPUSH_RECEIVE";
        } else {
            sb = new StringBuilder();
            sb.append(bVar.f1587a);
            str = ".permission.MIMC_RECEIVE";
        }
        sb.append(str);
        return sb.toString();
    }

    public void a(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.service_started");
        if (j.m873c()) {
            intent.addFlags(16777216);
        }
        b.m410a("[Bcst] send ***.push.service_started broadcast to inform push service has started.");
        context.sendBroadcast(intent);
    }

    private static void a(Context context, Intent intent, bf.b bVar) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, a(bVar));
        }
    }

    public void a(Context context, bf.b bVar, int i) {
        if (!"5".equalsIgnoreCase(bVar.g)) {
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.channel_closed");
            intent.setPackage(bVar.f1587a);
            intent.putExtra(bj.u, bVar.g);
            intent.putExtra("ext_reason", i);
            intent.putExtra(bj.r, bVar.f1590b);
            intent.putExtra(bj.I, bVar.i);
            if (bVar.f1581a == null || !"9".equals(bVar.g)) {
                b.m410a(String.format("[Bcst] notify channel closed. %s,%s,%d", bVar.g, bVar.f1587a, Integer.valueOf(i)));
                a(context, intent, bVar);
                return;
            }
            try {
                bVar.f1581a.send(Message.obtain(null, 17, intent));
            } catch (RemoteException unused) {
                bVar.f1581a = null;
                StringBuilder sb = new StringBuilder("peer may died: ");
                String str = bVar.f1590b;
                sb.append(str.substring(str.lastIndexOf(64)));
                b.m410a(sb.toString());
            }
        }
    }

    public void a(Context context, bf.b bVar, String str, String str2) {
        if (bVar == null) {
            b.d("error while notify kick by server!");
        } else if ("5".equalsIgnoreCase(bVar.g)) {
            b.d("mipush kicked by server");
        } else {
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.kicked");
            intent.setPackage(bVar.f1587a);
            intent.putExtra("ext_kick_type", str);
            intent.putExtra("ext_kick_reason", str2);
            intent.putExtra("ext_chid", bVar.g);
            intent.putExtra(bj.r, bVar.f1590b);
            intent.putExtra(bj.I, bVar.i);
            String str3 = bVar.g;
            String str4 = bVar.f1587a;
            b.m410a("[Bcst] notify packet(blob) arrival. " + str3 + "," + str4 + "," + str2);
            a(context, intent, bVar);
        }
    }

    public void a(Context context, bf.b bVar, boolean z, int i, String str) {
        if ("5".equalsIgnoreCase(bVar.g)) {
            this.f15117a.a(context, bVar, z, i, str);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_opened");
        intent.setPackage(bVar.f1587a);
        intent.putExtra("ext_succeeded", z);
        if (!z) {
            intent.putExtra("ext_reason", i);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ext_reason_msg", str);
        }
        intent.putExtra("ext_chid", bVar.g);
        intent.putExtra(bj.r, bVar.f1590b);
        intent.putExtra(bj.I, bVar.i);
        b.m410a(String.format("[Bcst] notify channel open result. %s,%s,%b,%d", bVar.g, bVar.f1587a, Boolean.valueOf(z), Integer.valueOf(i)));
        a(context, intent, bVar);
    }

    public void a(XMPushService xMPushService, String str, gf gfVar) {
        bf.b a2 = a(gfVar);
        if (a2 == null) {
            b.d("error while notify channel closed! channel " + str + " not registered");
        } else if ("5".equalsIgnoreCase(str)) {
            this.f15117a.a(xMPushService, gfVar, a2);
        } else {
            String str2 = a2.f1587a;
            Intent intent = new Intent();
            intent.setAction("com.xiaomi.push.new_msg");
            intent.setPackage(str2);
            intent.putExtra("ext_rcv_timestamp", SystemClock.elapsedRealtime());
            intent.putExtra("ext_chid", str);
            intent.putExtra("ext_raw_packet", gfVar.m723a(a2.h));
            intent.putExtra(bj.I, a2.i);
            intent.putExtra(bj.A, a2.h);
            if (e.a(gfVar)) {
                intent.putExtra("ext_downward_pkt_id", gfVar.e());
            }
            if (a2.f1581a != null) {
                try {
                    a2.f1581a.send(Message.obtain(null, 17, intent));
                    b.m410a("message was sent by messenger for chid=" + str);
                    return;
                } catch (RemoteException unused) {
                    a2.f1581a = null;
                    StringBuilder sb = new StringBuilder("peer may died: ");
                    String str3 = a2.f1590b;
                    sb.append(str3.substring(str3.lastIndexOf(64)));
                    b.m410a(sb.toString());
                }
            }
            if (!"com.xiaomi.xmsf".equals(str2)) {
                String str4 = a2.g;
                String str5 = a2.f1587a;
                String e = gfVar.e();
                b.m410a("[Bcst] notify packet(blob) arrival. " + str4 + "," + str5 + "," + e);
                if (e.a(gfVar)) {
                    bq.a().a(gfVar.e(), SystemClock.elapsedRealtime());
                }
                a(xMPushService, intent, a2);
            }
        }
    }

    public void a(XMPushService xMPushService, String str, hh hhVar) {
        String str2;
        String str3;
        bf.b a2 = a(hhVar);
        if (a2 == null) {
            str3 = "error while notify channel closed! channel " + str + " not registered";
        } else if ("5".equalsIgnoreCase(str)) {
            this.f15117a.a(xMPushService, hhVar, a2);
            return;
        } else {
            String str4 = a2.f1587a;
            if (hhVar instanceof hg) {
                str2 = "com.xiaomi.push.new_msg";
            } else if (hhVar instanceof hf) {
                str2 = "com.xiaomi.push.new_iq";
            } else if (hhVar instanceof hj) {
                str2 = "com.xiaomi.push.new_pres";
            } else {
                str3 = "unknown packet type, drop it";
            }
            Intent intent = new Intent();
            intent.setAction(str2);
            intent.setPackage(str4);
            intent.putExtra("ext_chid", str);
            intent.putExtra("ext_packet", hhVar.mo761a());
            intent.putExtra(bj.I, a2.i);
            intent.putExtra(bj.A, a2.h);
            b.m410a("[Bcst] notify packet arrival. " + a2.g + "," + a2.f1587a + "," + hhVar.j());
            if ("3".equalsIgnoreCase(str)) {
                intent.putExtra(bj.v, hhVar.f1099a);
                intent.putExtra(bj.w, System.currentTimeMillis());
            }
            a(xMPushService, intent, a2);
            return;
        }
        b.d(str3);
    }
}
