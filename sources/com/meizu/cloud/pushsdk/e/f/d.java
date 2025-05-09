package com.meizu.cloud.pushsdk.e.f;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meizu.cloud.pushsdk.e.e.a;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<a> f5836a;

    public d(a aVar) {
        super(Looper.getMainLooper());
        this.f5836a = new WeakReference<>(aVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar = this.f5836a.get();
        if (message.what != 1) {
            super.handleMessage(message);
        } else if (aVar != null) {
            com.meizu.cloud.pushsdk.e.g.a aVar2 = (com.meizu.cloud.pushsdk.e.g.a) message.obj;
            aVar.a(aVar2.f5837a, aVar2.b);
        }
    }
}
