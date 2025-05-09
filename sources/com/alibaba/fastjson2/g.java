package com.alibaba.fastjson2;

import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class g extends e {

    /* renamed from: a  reason: collision with root package name */
    public final String f2466a;
    public final long b;

    public g(String str, long j) {
        this.f2466a = str;
        this.b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // com.alibaba.fastjson2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.alibaba.fastjson2.c.a r10) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.g.a(com.alibaba.fastjson2.c$a):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        long j = this.b;
        long j2 = gVar.b;
        String str = this.f2466a;
        String str2 = gVar.f2466a;
        if (j == j2 && str == str2) {
            return true;
        }
        if (str == null || !str.equals(str2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2466a, Long.valueOf(this.b)});
    }

    public String toString() {
        return this.f2466a;
    }
}
