package com.xiaomi.push;

import android.os.SystemClock;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.em;
import com.xiaomi.push.gq;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;
import com.xiaomi.push.service.bo;
import com.xiaomi.push.service.bu;
import com.xiaomi.push.service.bw;
import com.xiaomi.push.service.e;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gm extends gx {

    /* renamed from: a  reason: collision with root package name */
    private gh f14907a;

    /* renamed from: a  reason: collision with other field name */
    private gi f1054a;

    /* renamed from: a  reason: collision with other field name */
    private Thread f1055a;

    /* renamed from: a  reason: collision with other field name */
    private byte[] f1056a;

    public gm(XMPushService xMPushService, gr grVar) {
        super(xMPushService, grVar);
    }

    private gf a(boolean z) {
        gl glVar = new gl();
        if (z) {
            glVar.a("1");
        }
        byte[] a2 = gd.m716a();
        if (a2 != null) {
            em.j jVar = new em.j();
            jVar.a(a.a(a2));
            glVar.a(jVar.m601a(), (String) null);
        }
        return glVar;
    }

    private void h() {
        try {
            this.f14907a = new gh(((gx) this).f1084a.getInputStream(), this);
            this.f1054a = new gi(((gx) this).f1084a.getOutputStream(), this);
            gn gnVar = new gn(this, "Blob Reader (" + ((gq) this).b + f7l.BRACKET_END_STR);
            this.f1055a = gnVar;
            gnVar.start();
        } catch (Exception e) {
            throw new hb("Error to init reader and writer", e);
        }
    }

    @Override // com.xiaomi.push.gq
    public void b(gf gfVar) {
        gi giVar = this.f1054a;
        if (giVar != null) {
            try {
                int a2 = giVar.a(gfVar);
                ((gq) this).d = SystemClock.elapsedRealtime();
                String f = gfVar.f();
                if (!TextUtils.isEmpty(f)) {
                    hv.a(((gq) this).f1069a, f, a2, false, true, System.currentTimeMillis());
                }
                for (gq.a aVar : ((gq) this).f1076b.values()) {
                    aVar.a(gfVar);
                }
            } catch (Exception e) {
                throw new hb(e);
            }
        } else {
            throw new hb("the writer is null.");
        }
    }

    public void b(hh hhVar) {
        if (hhVar != null) {
            for (gq.a aVar : ((gq) this).f1073a.values()) {
                aVar.a(hhVar);
            }
        }
    }

    @Override // com.xiaomi.push.gx, com.xiaomi.push.gq
    /* renamed from: a */
    public synchronized void mo750a() {
        h();
        this.f1054a.a();
    }

    @Override // com.xiaomi.push.gx
    public synchronized void a(int i, Exception exc) {
        try {
            gh ghVar = this.f14907a;
            if (ghVar != null) {
                ghVar.b();
                this.f14907a = null;
            }
            gi giVar = this.f1054a;
            if (giVar != null) {
                try {
                    giVar.b();
                } catch (Exception e) {
                    b.d("SlimConnection shutdown cause exception: " + e);
                }
                this.f1054a = null;
            }
            this.f1056a = null;
            super.a(i, exc);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(gf gfVar) {
        if (gfVar != null) {
            if (e.a(gfVar)) {
                gf gfVar2 = new gf();
                gfVar2.a(gfVar.a());
                gfVar2.a("SYNC", "ACK_RTT");
                gfVar2.a(gfVar.e());
                gfVar2.b(gfVar.m724b());
                gfVar2.a(gfVar.m727c());
                XMPushService xMPushService = ((gq) this).f1069a;
                xMPushService.a(new bu(xMPushService, gfVar2));
            }
            if (gfVar.m721a()) {
                b.m410a("[Slim] RCV blob chid=" + gfVar.a() + "; id=" + gfVar.e() + "; errCode=" + gfVar.b() + "; err=" + gfVar.m728c());
            }
            if (gfVar.a() == 0) {
                if ("PING".equals(gfVar.m718a())) {
                    b.m410a("[Slim] RCV ping id=" + gfVar.e());
                    g();
                } else if ("CLOSE".equals(gfVar.m718a())) {
                    c(13, null);
                }
            }
            for (gq.a aVar : ((gq) this).f1073a.values()) {
                aVar.a(gfVar);
            }
        }
    }

    @Override // com.xiaomi.push.gq
    @Deprecated
    public void a(hh hhVar) {
        b(gf.a(hhVar, (String) null));
    }

    @Override // com.xiaomi.push.gq
    public synchronized void a(bf.b bVar) {
        ge.a(bVar, c(), this);
    }

    @Override // com.xiaomi.push.gq
    public synchronized void a(String str, String str2) {
        ge.a(str, str2, this);
    }

    @Override // com.xiaomi.push.gx
    /* renamed from: a  reason: collision with other method in class */
    public void mo732a(boolean z) {
        if (this.f1054a != null) {
            gf a2 = a(z);
            b.m410a("[Slim] SND ping id=" + a2.e());
            b(a2);
            f();
            return;
        }
        throw new hb("The BlobWriter is null.");
    }

    @Override // com.xiaomi.push.gx, com.xiaomi.push.gq
    public void a(gf[] gfVarArr) {
        for (gf gfVar : gfVarArr) {
            b(gfVar);
        }
    }

    @Override // com.xiaomi.push.gx, com.xiaomi.push.gq
    /* renamed from: a  reason: collision with other method in class */
    public boolean mo750a() {
        return true;
    }

    @Override // com.xiaomi.push.gx, com.xiaomi.push.gq
    /* renamed from: a */
    public synchronized byte[] mo750a() {
        try {
            if (this.f1056a == null && !TextUtils.isEmpty(((gq) this).f1070a)) {
                String a2 = bw.m1062a();
                StringBuilder sb = new StringBuilder();
                String str = ((gq) this).f1070a;
                sb.append(str.substring(str.length() / 2));
                sb.append(a2.substring(a2.length() / 2));
                this.f1056a = bo.a(((gq) this).f1070a.getBytes(), sb.toString().getBytes());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f1056a;
    }
}
