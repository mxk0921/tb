package com.meizu.cloud.pushsdk.f.b;

import com.meizu.cloud.pushsdk.f.g.c;
import com.meizu.cloud.pushsdk.f.g.d;
import com.meizu.cloud.pushsdk.f.g.e;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final String f5855a = b.class.getSimpleName();
    private final HashMap<String, Object> b = new HashMap<>();

    public b(String str, Object obj) {
        a(str);
        a(obj);
    }

    public b a(Object obj) {
        if (obj == null) {
            return this;
        }
        this.b.put("dt", obj);
        return this;
    }

    @Override // com.meizu.cloud.pushsdk.f.b.a
    public long b() {
        return e.a(toString());
    }

    public String toString() {
        return e.a((Map) this.b).toString();
    }

    public b a(String str) {
        d.a(str, "schema cannot be null");
        d.a(!str.isEmpty(), "schema cannot be empty.");
        this.b.put("sa", str);
        return this;
    }

    @Override // com.meizu.cloud.pushsdk.f.b.a
    public Map<String, Object> a() {
        return this.b;
    }

    @Override // com.meizu.cloud.pushsdk.f.b.a
    @Deprecated
    public void a(String str, String str2) {
        c.c(this.f5855a, "Payload: add(String, String) method called - Doing nothing.", new Object[0]);
    }
}
