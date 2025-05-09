package com.vivo.push.util;

import android.text.TextUtils;
import com.vivo.push.b.x;
import com.vivo.push.m;
import com.vivo.push.restructure.a;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class f {
    public static boolean a(long j, long j2) {
        u.d("ClientReportUtil", "report message: " + j + ", reportType: " + j2);
        x xVar = new x(j2);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("messageID", String.valueOf(j));
        String a2 = a.a().e().a();
        if (!TextUtils.isEmpty(a2)) {
            hashMap.put("remoteAppId", a2);
        }
        xVar.a(hashMap);
        m.a().a(xVar);
        return true;
    }

    public static boolean a(long j, HashMap<String, String> hashMap) {
        x xVar = new x(j);
        xVar.a(hashMap);
        xVar.d();
        m.a().a(xVar);
        return true;
    }
}
