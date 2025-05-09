package com.vivo.push.restructure.request;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.vivo.push.util.g;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class e extends Handler {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f14643a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, Looper looper) {
        super(looper);
        this.f14643a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Map map;
        Map map2;
        int i = message.what;
        map = this.f14643a.f14641a;
        if (map.containsKey(Integer.valueOf(i))) {
            map2 = this.f14643a.f14641a;
            g.a().execute(new f(this, (b) map2.remove(Integer.valueOf(i))));
        }
    }
}
