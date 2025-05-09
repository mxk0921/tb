package com.xiaomi.push.service;

import android.text.TextUtils;
import com.ali.user.mobile.rpc.ApiConstants;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.co;
import com.xiaomi.push.cs;
import com.xiaomi.push.du;
import com.xiaomi.push.em;
import com.xiaomi.push.ft;
import com.xiaomi.push.gd;
import com.xiaomi.push.gf;
import com.xiaomi.push.gr;
import com.xiaomi.push.he;
import com.xiaomi.push.hf;
import com.xiaomi.push.hg;
import com.xiaomi.push.hh;
import com.xiaomi.push.hv;
import com.xiaomi.push.service.bf;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class bd {

    /* renamed from: a  reason: collision with root package name */
    private XMPushService f15064a;

    public bd(XMPushService xMPushService) {
        this.f15064a = xMPushService;
    }

    private void c(gf gfVar) {
        bf.b a2;
        String g = gfVar.g();
        String num = Integer.toString(gfVar.a());
        if (!TextUtils.isEmpty(g) && !TextUtils.isEmpty(num) && (a2 = bf.a().a(num, g)) != null) {
            hv.a(this.f15064a, a2.f1587a, gfVar.c(), true, true, System.currentTimeMillis());
        }
    }

    public void a(gf gfVar) {
        if (5 != gfVar.a()) {
            c(gfVar);
        }
        try {
            b(gfVar);
        } catch (Exception e) {
            b.a("handle Blob chid = " + gfVar.a() + " cmd = " + gfVar.m718a() + " packetid = " + gfVar.e() + " failure ", e);
        }
    }

    public void b(gf gfVar) {
        StringBuilder sb;
        String a2;
        String str;
        bf.c cVar;
        int i;
        String a3 = gfVar.m718a();
        if (gfVar.a() != 0) {
            String num = Integer.toString(gfVar.a());
            if ("SECMSG".equals(gfVar.m718a())) {
                if (!gfVar.m721a()) {
                    this.f15064a.m985b().a(this.f15064a, num, gfVar);
                    return;
                }
                sb = new StringBuilder("Recv SECMSG errCode = ");
                sb.append(gfVar.b());
                sb.append(" errStr = ");
                a2 = gfVar.m728c();
            } else if ("BIND".equals(a3)) {
                em.d a4 = em.d.a(gfVar.m722a());
                String g = gfVar.g();
                bf.b a5 = bf.a().a(num, g);
                if (a5 != null) {
                    if (a4.mo666a()) {
                        b.m410a("SMACK: channel bind succeeded, chid=" + gfVar.a());
                        a5.a(bf.c.binded, 1, 0, (String) null, (String) null);
                        return;
                    }
                    String a6 = a4.mo666a();
                    if ("auth".equals(a6)) {
                        if ("invalid-sig".equals(a4.mo668b())) {
                            b.m410a("SMACK: bind error invalid-sig token = " + a5.c + " sec = " + a5.h);
                            gd.a(0, ft.BIND_INVALID_SIG.a(), 1, null, 0);
                        }
                        cVar = bf.c.unbind;
                        i = 5;
                    } else if ("cancel".equals(a6)) {
                        cVar = bf.c.unbind;
                        i = 7;
                    } else {
                        if ("wait".equals(a6)) {
                            this.f15064a.a(a5);
                            a5.a(bf.c.unbind, 1, 7, a4.mo668b(), a6);
                        }
                        str = "SMACK: channel bind failed, chid=" + num + " reason=" + a4.mo668b();
                        b.m410a(str);
                    }
                    a5.a(cVar, 1, i, a4.mo668b(), a6);
                    bf.a().m1050a(num, g);
                    str = "SMACK: channel bind failed, chid=" + num + " reason=" + a4.mo668b();
                    b.m410a(str);
                }
                return;
            } else if ("KICK".equals(a3)) {
                em.g a7 = em.g.a(gfVar.m722a());
                String g2 = gfVar.g();
                String a8 = a7.mo666a();
                String b = a7.mo668b();
                b.m410a("kicked by server, chid=" + num + " res= " + bf.b.a(g2) + " type=" + a8 + " reason=" + b);
                if ("wait".equals(a8)) {
                    bf.b a9 = bf.a().a(num, g2);
                    if (a9 != null) {
                        this.f15064a.a(a9);
                        a9.a(bf.c.unbind, 3, 0, b, a8);
                        return;
                    }
                    return;
                }
                this.f15064a.a(num, g2, 3, b, a8);
                bf.a().m1050a(num, g2);
                return;
            } else {
                return;
            }
        } else if ("PING".equals(a3)) {
            byte[] a10 = gfVar.m722a();
            if (a10 != null && a10.length > 0) {
                em.j a11 = em.j.a(a10);
                if (a11.mo668b()) {
                    bw.a().a(a11.mo666a());
                }
            }
            if (!"com.xiaomi.xmsf".equals(this.f15064a.getPackageName())) {
                this.f15064a.m982a();
            }
            if ("1".equals(gfVar.e())) {
                b.m410a("received a server ping");
            } else {
                gd.b();
            }
            this.f15064a.m986b();
            return;
        } else if ("SYNC".equals(a3)) {
            if ("CONF".equals(gfVar.m725b())) {
                bw.a().a(em.b.a(gfVar.m722a()));
                return;
            } else if (TextUtils.equals("U", gfVar.m725b())) {
                em.k a12 = em.k.a(gfVar.m722a());
                du.a(this.f15064a).a(a12.mo666a(), a12.mo668b(), new Date(a12.mo666a()), new Date(a12.mo668b()), a12.c() * 1024, a12.e());
                gf gfVar2 = new gf();
                gfVar2.a(0);
                gfVar2.a(gfVar.m718a(), "UCA");
                gfVar2.a(gfVar.e());
                XMPushService xMPushService = this.f15064a;
                xMPushService.a(new bu(xMPushService, gfVar2));
                return;
            } else if (TextUtils.equals("P", gfVar.m725b())) {
                em.i a13 = em.i.a(gfVar.m722a());
                gf gfVar3 = new gf();
                gfVar3.a(0);
                gfVar3.a(gfVar.m718a(), "PCA");
                gfVar3.a(gfVar.e());
                em.i iVar = new em.i();
                if (a13.mo666a()) {
                    iVar.a(a13.mo666a());
                }
                gfVar3.a(iVar.m601a(), (String) null);
                XMPushService xMPushService2 = this.f15064a;
                xMPushService2.a(new bu(xMPushService2, gfVar3));
                sb = new StringBuilder("ACK msgP: id = ");
                a2 = gfVar.e();
            } else {
                return;
            }
        } else if (ApiConstants.ResultActionType.NOTIFY.equals(gfVar.m718a())) {
            em.h a14 = em.h.a(gfVar.m722a());
            sb = new StringBuilder("notify by server err = ");
            sb.append(a14.c());
            sb.append(" desc = ");
            a2 = a14.mo666a();
        } else {
            return;
        }
        sb.append(a2);
        str = sb.toString();
        b.m410a(str);
    }

    private void a(he heVar) {
        String c = heVar.c();
        if (!TextUtils.isEmpty(c)) {
            String[] split = c.split(";");
            co a2 = cs.a().a(gr.a(), false);
            if (a2 != null && split.length > 0) {
                a2.a(split);
                this.f15064a.a(20, (Exception) null);
                this.f15064a.a(true);
            }
        }
    }

    private void b(hh hhVar) {
        bf.b a2;
        String l = hhVar.l();
        String k = hhVar.k();
        if (!TextUtils.isEmpty(l) && !TextUtils.isEmpty(k) && (a2 = bf.a().a(k, l)) != null) {
            hv.a(this.f15064a, a2.f1587a, hv.a(hhVar.m759a()), true, true, System.currentTimeMillis());
        }
    }

    public void a(hh hhVar) {
        if (!"5".equals(hhVar.k())) {
            b(hhVar);
        }
        String k = hhVar.k();
        if (TextUtils.isEmpty(k)) {
            k = "1";
            hhVar.l(k);
        }
        if (k.equals("0")) {
            b.m410a("Received wrong packet with chid = 0 : " + hhVar.m759a());
        }
        if (hhVar instanceof hf) {
            he a2 = hhVar.a("kick");
            if (a2 != null) {
                String l = hhVar.l();
                String a3 = a2.a("type");
                String a4 = a2.a("reason");
                b.m410a("kicked by server, chid=" + k + " res=" + bf.b.a(l) + " type=" + a3 + " reason=" + a4);
                if ("wait".equals(a3)) {
                    bf.b a5 = bf.a().a(k, l);
                    if (a5 != null) {
                        this.f15064a.a(a5);
                        a5.a(bf.c.unbind, 3, 0, a4, a3);
                        return;
                    }
                    return;
                }
                this.f15064a.a(k, l, 3, a4, a3);
                bf.a().m1050a(k, l);
                return;
            }
        } else if (hhVar instanceof hg) {
            hg hgVar = (hg) hhVar;
            if ("redir".equals(hgVar.b())) {
                he a6 = hgVar.a("hosts");
                if (a6 != null) {
                    a(a6);
                    return;
                }
                return;
            }
        }
        this.f15064a.m985b().a(this.f15064a, k, hhVar);
    }
}
