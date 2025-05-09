package com.vivo.push;

import android.os.Handler;
import android.os.Message;
import com.vivo.push.util.u;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class j implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f14611a;

    public j(i iVar) {
        this.f14611a = iVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        if (message == null) {
            u.a("AidlManager", "handleMessage error : msg is null");
            return false;
        }
        int i = message.what;
        if (i == 1) {
            u.a("AidlManager", "In connect, bind core service time out");
            atomicInteger = this.f14611a.f;
            if (atomicInteger.get() == 2) {
                this.f14611a.a(1);
            }
        } else if (i != 2) {
            u.b("AidlManager", "unknow msg what [" + message.what + "]");
        } else {
            atomicInteger2 = this.f14611a.f;
            if (atomicInteger2.get() == 4) {
                this.f14611a.f();
            }
            this.f14611a.a(1);
        }
        return true;
    }
}
