package com.vivo.push;

import android.content.Intent;
import com.vivo.push.b.i;
import com.vivo.push.b.j;
import com.vivo.push.b.k;
import com.vivo.push.b.m;
import com.vivo.push.b.n;
import com.vivo.push.b.o;
import com.vivo.push.b.p;
import com.vivo.push.b.q;
import com.vivo.push.b.r;
import com.vivo.push.b.t;
import com.vivo.push.b.u;
import com.vivo.push.f.aa;
import com.vivo.push.f.ah;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class l implements IPushClientFactory {

    /* renamed from: a  reason: collision with root package name */
    private ah f14612a = new ah();

    @Override // com.vivo.push.IPushClientFactory
    public final aa createReceiveTask(v vVar) {
        return ah.b(vVar);
    }

    @Override // com.vivo.push.IPushClientFactory
    public final v createReceiverCommand(Intent intent) {
        v vVar;
        int intExtra = intent.getIntExtra("command", -1);
        if (intExtra < 0) {
            intExtra = intent.getIntExtra("method", -1);
        }
        if (intExtra == 20) {
            vVar = new u();
        } else if (intExtra != 2016) {
            switch (intExtra) {
                case 1:
                case 2:
                    vVar = new t(intExtra);
                    break;
                case 3:
                    vVar = new o();
                    break;
                case 4:
                    vVar = new q();
                    break;
                case 5:
                    vVar = new p();
                    break;
                case 6:
                    vVar = new r();
                    break;
                case 7:
                    vVar = new n();
                    break;
                case 8:
                    vVar = new m();
                    break;
                case 9:
                    vVar = new k();
                    break;
                case 10:
                case 11:
                    vVar = new i(intExtra);
                    break;
                case 12:
                    vVar = new j();
                    break;
                default:
                    vVar = null;
                    break;
            }
        } else {
            vVar = new com.vivo.push.b.l();
        }
        if (vVar != null) {
            d a2 = d.a(intent);
            if (a2 == null) {
                com.vivo.push.util.u.b("PushCommand", "bundleWapper is null");
            } else {
                vVar.b(a2);
            }
        }
        return vVar;
    }

    @Override // com.vivo.push.IPushClientFactory
    public final s createTask(v vVar) {
        return ah.a(vVar);
    }
}
