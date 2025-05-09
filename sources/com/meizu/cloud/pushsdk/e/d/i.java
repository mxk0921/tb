package com.meizu.cloud.pushsdk.e.d;

import com.meizu.cloud.pushsdk.e.d.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final f f5827a;
    private final String b;
    private final c c;
    private final j d;
    private final Object e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private f f5828a;
        private String b = "GET";
        private c.b c = new c.b();
        private j d;
        private Object e;

        public b b() {
            return a("GET", (j) null);
        }

        public b d(j jVar) {
            return a("PUT", jVar);
        }

        public b a(c cVar) {
            this.c = cVar.b();
            return this;
        }

        public b b(j jVar) {
            return a("PATCH", jVar);
        }

        public b c() {
            return a("HEAD", (j) null);
        }

        public b a(f fVar) {
            if (fVar != null) {
                this.f5828a = fVar;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }

        public b c(j jVar) {
            return a("POST", jVar);
        }

        public b a(j jVar) {
            return a("DELETE", jVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.meizu.cloud.pushsdk.e.d.i.b a(java.lang.String r7) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x005b
                r4 = 0
                r5 = 3
                r1 = 1
                r2 = 0
                java.lang.String r3 = "ws:"
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L_0x0024
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "http:"
                r0.<init>(r1)
                r1 = 3
            L_0x0018:
                java.lang.String r7 = r7.substring(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                goto L_0x003b
            L_0x0024:
                r4 = 0
                r5 = 4
                r1 = 1
                r2 = 0
                java.lang.String r3 = "wss:"
                r0 = r7
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L_0x003b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "https:"
                r0.<init>(r1)
                r1 = 4
                goto L_0x0018
            L_0x003b:
                com.meizu.cloud.pushsdk.e.d.f r0 = com.meizu.cloud.pushsdk.e.d.f.b(r7)
                if (r0 == 0) goto L_0x0046
                com.meizu.cloud.pushsdk.e.d.i$b r7 = r6.a(r0)
                return r7
            L_0x0046:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "unexpected url: "
                r1.<init>(r2)
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
            L_0x005b:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "url == null"
                r7.<init>(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.e.d.i.b.a(java.lang.String):com.meizu.cloud.pushsdk.e.d.i$b");
        }

        public b a(String str, j jVar) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            } else if (jVar != null && !d.a(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (jVar != null || !d.b(str)) {
                this.b = str;
                this.d = jVar;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        public b a(String str, String str2) {
            this.c.a(str, str2);
            return this;
        }

        public i a() {
            if (this.f5828a != null) {
                return new i(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    private i(b bVar) {
        this.f5827a = bVar.f5828a;
        this.b = bVar.b;
        this.c = bVar.c.a();
        this.d = bVar.d;
        this.e = bVar.e != null ? bVar.e : this;
    }

    public j a() {
        return this.d;
    }

    public int b() {
        if ("POST".equals(d())) {
            return 1;
        }
        if ("PUT".equals(d())) {
            return 2;
        }
        if ("DELETE".equals(d())) {
            return 3;
        }
        if ("HEAD".equals(d())) {
            return 4;
        }
        if ("PATCH".equals(d())) {
            return 5;
        }
        return 0;
    }

    public c c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    public f e() {
        return this.f5827a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.f5827a);
        sb.append(", tag=");
        Object obj = this.e;
        if (obj == this) {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    public String a(String str) {
        return this.c.a(str);
    }
}
