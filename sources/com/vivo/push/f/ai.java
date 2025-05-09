package com.vivo.push.f;

import android.content.Context;
import com.vivo.push.b.e;
import com.vivo.push.b.w;
import com.vivo.push.cache.ClientConfigManagerImpl;
import com.vivo.push.m;
import com.vivo.push.model.b;
import com.vivo.push.restructure.a;
import com.vivo.push.s;
import com.vivo.push.util.aa;
import com.vivo.push.util.c;
import com.vivo.push.util.u;
import com.vivo.push.util.y;
import com.vivo.push.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ai extends s {
    public ai(v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    public final void a(v vVar) {
        Context context = this.f14645a;
        if (context == null) {
            u.d("SendCommandTask", "SendCommandTask " + vVar + " ; mContext is Null");
        } else if (vVar == null) {
            u.d("SendCommandTask", "SendCommandTask pushCommand is Null");
        } else {
            b a2 = aa.a(context, a.a().f());
            int b = vVar.b();
            if (b == 2009) {
                u.a(ClientConfigManagerImpl.getInstance(this.f14645a).isDebug());
                if (u.b()) {
                    m.a();
                    a.a().e().e();
                    c cVar = new c();
                    cVar.a(this.f14645a, "com.vivo.push_preferences.hybridapptoken_v1");
                    cVar.a();
                    c cVar2 = new c();
                    cVar2.a(this.f14645a, "com.vivo.push_preferences.appconfig_v1");
                    cVar2.a();
                    if (!m.a().f()) {
                        ClientConfigManagerImpl.getInstance(this.f14645a).clearPush();
                    }
                }
            } else if (b != 2011) {
                switch (b) {
                    case 2002:
                    case 2003:
                    case 2004:
                    case 2005:
                        if (a2 == null || a2.c()) {
                            m.a().a(((com.vivo.push.b.c) vVar).f(), 1005);
                            break;
                        } else {
                            com.vivo.push.b.c cVar3 = (com.vivo.push.b.c) vVar;
                            int a3 = y.a(cVar3);
                            if (a3 != 0) {
                                m.a().a(cVar3.f(), a3);
                                return;
                            }
                        }
                        break;
                }
            } else {
                u.a(ClientConfigManagerImpl.getInstance(this.f14645a).isDebug(((w) vVar).d()));
            }
            if (a2 == null) {
                u.d("SendCommandTask", "SendCommandTask " + vVar + " ; pushPkgInfo is Null");
                return;
            }
            String a4 = a2.a();
            if (a2.c()) {
                try {
                    m.a().a(((com.vivo.push.b.c) vVar).f(), 1004);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                vVar = new e();
                u.d("SendCommandTask", "SendCommandTask " + vVar + " ; pkgName is InBlackList ");
            }
            com.vivo.push.a.a.a(this.f14645a, a4, vVar);
        }
    }
}
