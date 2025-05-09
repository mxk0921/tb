package com.vivo.push.restructure.c;

import android.text.TextUtils;
import com.vivo.push.b.x;
import com.vivo.push.m;
import com.vivo.push.restructure.b.a;
import com.vivo.push.util.u;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private a f14635a;

    public b(a aVar) {
        this.f14635a = aVar;
    }

    @Override // com.vivo.push.restructure.c.a
    public final void a(int i, String str) {
        u.d("ReportImpl", "reportIntercepted() , msgID = " + str + ", code = " + i);
        if (i > 0 && !TextUtils.isEmpty(str)) {
            x xVar = new x(i);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("messageID", str);
            a aVar = this.f14635a;
            if (aVar != null) {
                String a2 = aVar.a();
                if (!TextUtils.isEmpty(a2)) {
                    hashMap.put("remoteAppId", a2);
                }
            }
            xVar.a(hashMap);
            m.a().a(xVar);
        }
    }
}
