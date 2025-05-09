package com.meizu.cloud.pushsdk.f.b;

import com.meizu.cloud.pushsdk.f.g.e;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    private final String f5856a = c.class.getSimpleName();
    private final HashMap<String, Object> b = new HashMap<>();

    @Override // com.meizu.cloud.pushsdk.f.b.a
    public Map a() {
        return this.b;
    }

    @Override // com.meizu.cloud.pushsdk.f.b.a
    public long b() {
        return e.a(toString());
    }

    public String toString() {
        return e.a((Map) this.b).toString();
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            String str2 = this.f5856a;
            com.meizu.cloud.pushsdk.f.g.c.c(str2, "The keys value is empty, returning without adding key: " + str, new Object[0]);
            return;
        }
        this.b.put(str, obj);
    }

    @Override // com.meizu.cloud.pushsdk.f.b.a
    public void a(String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            String str3 = this.f5856a;
            com.meizu.cloud.pushsdk.f.g.c.c(str3, "The keys value is empty, returning without adding key: " + str, new Object[0]);
            return;
        }
        this.b.put(str, str2);
    }

    public void a(Map<String, Object> map) {
        if (map == null) {
            com.meizu.cloud.pushsdk.f.g.c.c(this.f5856a, "Map passed in is null, returning without adding map.", new Object[0]);
        } else {
            this.b.putAll(map);
        }
    }
}
