package com.vivo.push.restructure.a.a;

import android.text.TextUtils;
import com.vivo.push.restructure.a.a;
import com.vivo.push.util.u;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, m> f14630a = new ConcurrentHashMap();

    @Override // com.vivo.push.restructure.a.a.n
    public final void a(a aVar, a aVar2) {
        if (aVar == null) {
            u.a("addToCache error. msg is null");
        } else if (TextUtils.isEmpty(aVar.a())) {
            u.a("addToCache error. messageID is null");
        } else if (aVar2 == null) {
            u.a("addToCache error. firstNode is null");
        }
    }
}
