package com.xiaomi.push;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fr implements fp {

    /* renamed from: a  reason: collision with root package name */
    private fp f14883a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static fr f14884a = new fr();
    }

    private fr() {
    }

    public static fr a() {
        return a.f14884a;
    }

    @Override // com.xiaomi.push.fp
    public void a(fo foVar) {
        fp fpVar = this.f14883a;
        if (fpVar != null) {
            fpVar.a(foVar);
        }
    }

    @Override // com.xiaomi.push.fp
    public void a(String str, Map<String, Object> map) {
        fp fpVar = this.f14883a;
        if (fpVar != null) {
            fpVar.a(str, map);
        }
    }
}
