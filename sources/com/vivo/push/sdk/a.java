package com.vivo.push.sdk;

import android.content.Intent;
import android.os.Message;
import com.vivo.push.ab;
import com.vivo.push.restructure.a.b;
import com.vivo.push.util.g;
import com.vivo.push.util.u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class a extends ab {
    private static a c;
    private String d = "";

    private a() {
    }

    public final String b() {
        return this.d;
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            try {
                if (c == null) {
                    c = new a();
                }
                aVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // com.vivo.push.ab
    public final void b(Message message) {
        Intent intent = (Intent) message.obj;
        if (intent == null || this.f14553a == null) {
            u.d("CommandWorker", " handleMessage error: intent : " + intent + ", mContext: " + this.f14553a);
            return;
        }
        b bVar = new b(intent);
        try {
            u.d("CommandWorker", "received msg : ".concat(String.valueOf(bVar.a())));
            g.a().execute(new b(this, bVar));
        } catch (Exception e) {
            u.a("CommandWorker", "handle message err : " + e.getMessage());
        }
    }

    public final void a(String str) {
        this.d = str;
    }

    public final void a(Intent intent) {
        if (intent == null || this.f14553a == null) {
            u.d("CommandWorker", " sendMessage error: intent : " + intent + ", mContext: " + this.f14553a);
            return;
        }
        Message obtain = Message.obtain();
        obtain.obj = intent;
        a(obtain);
    }
}
