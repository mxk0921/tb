package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bf;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fw implements bf.b.a {

    /* renamed from: a  reason: collision with root package name */
    private int f14888a;

    /* renamed from: a  reason: collision with other field name */
    private gq f1012a;

    /* renamed from: a  reason: collision with other field name */
    private XMPushService f1013a;

    /* renamed from: a  reason: collision with other field name */
    private bf.b f1014a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f1016a = false;

    /* renamed from: a  reason: collision with other field name */
    private bf.c f1015a = bf.c.binding;

    public fw(XMPushService xMPushService, bf.b bVar) {
        this.f1013a = xMPushService;
        this.f1014a = bVar;
    }

    private void b() {
        this.f1014a.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            r4 = this;
            r4.b()
            boolean r0 = r4.f1016a
            if (r0 != 0) goto L_0x0008
            return
        L_0x0008:
            int r0 = r4.f14888a
            r1 = 11
            if (r0 != r1) goto L_0x000f
            return
        L_0x000f:
            com.xiaomi.push.gb r0 = com.xiaomi.push.gb.m710a()
            com.xiaomi.push.fu r0 = r0.m712a()
            int[] r1 = com.xiaomi.push.fy.f14890a
            com.xiaomi.push.service.bf$c r2 = r4.f1015a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L_0x0031
            r3 = 3
            if (r1 == r3) goto L_0x0028
            goto L_0x005c
        L_0x0028:
            com.xiaomi.push.ft r1 = com.xiaomi.push.ft.BIND_SUCCESS
        L_0x002a:
            int r1 = r1.a()
            r0.f998a = r1
            goto L_0x005c
        L_0x0031:
            int r1 = r4.f14888a
            r3 = 17
            if (r1 != r3) goto L_0x003a
            com.xiaomi.push.ft r1 = com.xiaomi.push.ft.BIND_TCP_READ_TIMEOUT
            goto L_0x002a
        L_0x003a:
            r3 = 21
            if (r1 != r3) goto L_0x0041
            com.xiaomi.push.ft r1 = com.xiaomi.push.ft.BIND_TIMEOUT
            goto L_0x002a
        L_0x0041:
            com.xiaomi.push.ga r1 = com.xiaomi.push.gb.a()     // Catch: NullPointerException -> 0x005b
            java.lang.Exception r1 = r1.a()     // Catch: NullPointerException -> 0x005b
            com.xiaomi.push.fz$a r1 = com.xiaomi.push.fz.c(r1)     // Catch: NullPointerException -> 0x005b
            com.xiaomi.push.ft r3 = r1.f14891a     // Catch: NullPointerException -> 0x005b
            int r3 = r3.a()     // Catch: NullPointerException -> 0x005b
            r0.f998a = r3     // Catch: NullPointerException -> 0x005b
            java.lang.String r1 = r1.f1017a     // Catch: NullPointerException -> 0x005b
            r0.c(r1)     // Catch: NullPointerException -> 0x005b
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            if (r0 == 0) goto L_0x0083
            com.xiaomi.push.gq r1 = r4.f1012a
            java.lang.String r1 = r1.m737a()
            r0.b(r1)
            com.xiaomi.push.service.bf$b r1 = r4.f1014a
            java.lang.String r1 = r1.f1590b
            r0.d(r1)
            r0.f1001b = r2
            com.xiaomi.push.service.bf$b r1 = r4.f1014a     // Catch: NumberFormatException -> 0x007c
            java.lang.String r1 = r1.g     // Catch: NumberFormatException -> 0x007c
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: NumberFormatException -> 0x007c
            byte r1 = (byte) r1     // Catch: NumberFormatException -> 0x007c
            r0.a(r1)     // Catch: NumberFormatException -> 0x007c
        L_0x007c:
            com.xiaomi.push.gb r1 = com.xiaomi.push.gb.m710a()
            r1.a(r0)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.fw.c():void");
    }

    public void a() {
        this.f1014a.a(this);
        this.f1012a = this.f1013a.m980a();
    }

    @Override // com.xiaomi.push.service.bf.b.a
    public void a(bf.c cVar, bf.c cVar2, int i) {
        if (!this.f1016a && cVar == bf.c.binding) {
            this.f1015a = cVar2;
            this.f14888a = i;
            this.f1016a = true;
        }
        this.f1013a.a(new fx(this, 4));
    }
}
