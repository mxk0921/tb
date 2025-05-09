package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.vivo.push.model.a;
import com.vivo.push.util.j;
import com.vivo.push.util.u;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class e extends c<a> {
    public e(Context context) {
        super(context);
    }

    @Override // com.vivo.push.cache.c
    public final List<a> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.trim().split("@#")) {
            String trim = str2.trim();
            String[] split = trim.trim().split(",");
            if (split.length >= 2) {
                try {
                    String str3 = split[0];
                    arrayList.add(new a(str3, trim.substring(str3.length() + 1)));
                } catch (Exception e) {
                    u.d("PushConfigSettings", "str2Clients E: ".concat(String.valueOf(e)));
                }
            }
        }
        return arrayList;
    }

    @Override // com.vivo.push.cache.c
    public final String b(String str) throws Exception {
        return new String(j.a(j.a(e()), j.a(f()), Base64.decode(str, 2)), "utf-8");
    }

    public final String c(String str) {
        synchronized (c.f14581a) {
            try {
                for (T t : this.b) {
                    if (!TextUtils.isEmpty(t.a()) && t.a().equals(str)) {
                        return t.b();
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.vivo.push.cache.c
    public final String a() {
        return "com.vivo.pushservice.other";
    }
}
