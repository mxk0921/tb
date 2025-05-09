package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.em;
import com.xiaomi.push.gq;
import com.xiaomi.push.service.bc;
import com.xiaomi.push.service.bf;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class go implements hc {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f14909a;

    /* renamed from: a  reason: collision with other field name */
    private gq f1058a;

    /* renamed from: a  reason: collision with other field name */
    private SimpleDateFormat f1061a = new SimpleDateFormat("hh:mm:ss aaa");

    /* renamed from: a  reason: collision with other field name */
    private a f1057a = null;
    private a b = null;

    /* renamed from: a  reason: collision with other field name */
    private gt f1059a = null;

    /* renamed from: a  reason: collision with other field name */
    private final String f1060a = "[Slim] ";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements gv, hd {

        /* renamed from: a  reason: collision with other field name */
        String f1062a;

        /* renamed from: a  reason: collision with other field name */
        private boolean f1063a;

        public a(boolean z) {
            String str;
            this.f1063a = z;
            if (z) {
                str = " RCV ";
            } else {
                str = " Sent ";
            }
            this.f1062a = str;
        }

        @Override // com.xiaomi.push.gv
        public void a(gf gfVar) {
            StringBuilder sb;
            String str;
            if (go.f14909a) {
                sb = new StringBuilder("[Slim] ");
                sb.append(go.this.f1061a.format(new Date()));
                sb.append(this.f1062a);
                str = gfVar.toString();
            } else {
                sb = new StringBuilder("[Slim] ");
                sb.append(go.this.f1061a.format(new Date()));
                sb.append(this.f1062a);
                sb.append(" Blob [");
                sb.append(gfVar.m718a());
                sb.append(",");
                sb.append(gfVar.a());
                sb.append(",");
                sb.append(bc.a(gfVar.e()));
                str = "]";
            }
            sb.append(str);
            b.c(sb.toString());
            if (gfVar != null && gfVar.a() == 99999) {
                String a2 = gfVar.m718a();
                gf gfVar2 = null;
                if (!this.f1063a) {
                    if ("BIND".equals(a2)) {
                        b.m410a("build binded result for loopback.");
                        em.d dVar = new em.d();
                        dVar.a(true);
                        dVar.c("login success.");
                        dVar.b("success");
                        dVar.a("success");
                        gf gfVar3 = new gf();
                        gfVar3.a(dVar.m601a(), (String) null);
                        gfVar3.a((short) 2);
                        gfVar3.a(99999);
                        gfVar3.a("BIND", (String) null);
                        gfVar3.a(gfVar.e());
                        gfVar3.b((String) null);
                        gfVar3.c(gfVar.g());
                        gfVar2 = gfVar3;
                    } else if (!"UBND".equals(a2) && "SECMSG".equals(a2)) {
                        gf gfVar4 = new gf();
                        gfVar4.a(99999);
                        gfVar4.a("SECMSG", (String) null);
                        gfVar4.c(gfVar.g());
                        gfVar4.a(gfVar.e());
                        gfVar4.a(gfVar.m720a());
                        gfVar4.b(gfVar.f());
                        gfVar4.a(gfVar.m723a(bf.a().a(String.valueOf(99999), gfVar.g()).h), (String) null);
                        gfVar2 = gfVar4;
                    }
                }
                if (gfVar2 != null) {
                    for (Map.Entry<gv, gq.a> entry : go.this.f1058a.m738a().entrySet()) {
                        if (go.this.f1057a != entry.getKey()) {
                            entry.getValue().a(gfVar2);
                        }
                    }
                }
            }
        }

        @Override // com.xiaomi.push.gv, com.xiaomi.push.hd
        /* renamed from: a */
        public void mo734a(hh hhVar) {
            StringBuilder sb;
            String str;
            if (go.f14909a) {
                sb = new StringBuilder("[Slim] ");
                sb.append(go.this.f1061a.format(new Date()));
                sb.append(this.f1062a);
                sb.append(" PKT ");
                str = hhVar.m759a();
            } else {
                sb = new StringBuilder("[Slim] ");
                sb.append(go.this.f1061a.format(new Date()));
                sb.append(this.f1062a);
                sb.append(" PKT [");
                sb.append(hhVar.k());
                sb.append(",");
                sb.append(hhVar.j());
                str = "]";
            }
            sb.append(str);
            b.c(sb.toString());
        }

        @Override // com.xiaomi.push.gv, com.xiaomi.push.hd
        /* renamed from: a  reason: collision with other method in class */
        public boolean mo734a(hh hhVar) {
            return true;
        }
    }

    public go(gq gqVar) {
        this.f1058a = gqVar;
        a();
    }

    private void a() {
        this.f1057a = new a(true);
        this.b = new a(false);
        gq gqVar = this.f1058a;
        a aVar = this.f1057a;
        gqVar.a(aVar, aVar);
        gq gqVar2 = this.f1058a;
        a aVar2 = this.b;
        gqVar2.b(aVar2, aVar2);
        this.f1059a = new gp(this);
    }
}
