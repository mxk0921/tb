package com.meizu.cloud.pushsdk.e.d;

import com.meizu.cloud.pushsdk.e.h.c;
import com.meizu.cloud.pushsdk.e.h.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class h extends j {

    /* renamed from: a  reason: collision with root package name */
    public static final g f5824a = g.a("multipart/mixed");
    public static final g b = g.a("multipart/alternative");
    public static final g c = g.a("multipart/digest");
    public static final g d = g.a("multipart/parallel");
    public static final g e = g.a("multipart/form-data");
    private static final byte[] f = {58, 32};
    private static final byte[] g = {13, 10};
    private static final byte[] h = {45, 45};
    private final e i;
    private final g j;
    private final g k;
    private final List<b> l;
    private long m = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final e f5825a;
        private g b;
        private final List<b> c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        public a a(c cVar, j jVar) {
            return a(b.a(cVar, jVar));
        }

        public a(String str) {
            this.b = h.f5824a;
            this.c = new ArrayList();
            this.f5825a = e.b(str);
        }

        public a a(g gVar) {
            if (gVar == null) {
                throw new NullPointerException("type == null");
            } else if ("multipart".equals(gVar.b())) {
                this.b = gVar;
                return this;
            } else {
                throw new IllegalArgumentException("multipart != " + gVar);
            }
        }

        public a a(b bVar) {
            if (bVar != null) {
                this.c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        public h a() {
            if (!this.c.isEmpty()) {
                return new h(this.f5825a, this.b, this.c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final c f5826a;
        private final j b;

        private b(c cVar, j jVar) {
            this.f5826a = cVar;
            this.b = jVar;
        }

        public static b a(c cVar, j jVar) {
            if (jVar == null) {
                throw new NullPointerException("body == null");
            } else if (cVar != null && cVar.a("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (cVar == null || cVar.a("Content-Length") == null) {
                return new b(cVar, jVar);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }
    }

    public h(e eVar, g gVar, List<b> list) {
        this.i = eVar;
        this.j = gVar;
        this.k = g.a(gVar + "; boundary=" + eVar.d());
        this.l = m.a(list);
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public long a() throws IOException {
        long j = this.m;
        if (j != -1) {
            return j;
        }
        long a2 = a((c) null, true);
        this.m = a2;
        return a2;
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public g b() {
        return this.k;
    }

    private long a(c cVar, boolean z) throws IOException {
        com.meizu.cloud.pushsdk.e.h.b bVar;
        com.meizu.cloud.pushsdk.e.h.b bVar2;
        if (z) {
            bVar = new com.meizu.cloud.pushsdk.e.h.b();
            bVar2 = bVar;
        } else {
            bVar = null;
            bVar2 = cVar;
        }
        int size = this.l.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            b bVar3 = this.l.get(i);
            c cVar2 = bVar3.f5826a;
            j jVar = bVar3.b;
            bVar2.a(h);
            bVar2.a(this.i);
            bVar2.a(g);
            if (cVar2 != null) {
                int c2 = cVar2.c();
                for (int i2 = 0; i2 < c2; i2++) {
                    bVar2.a(cVar2.a(i2)).a(f).a(cVar2.b(i2)).a(g);
                }
            }
            g b2 = jVar.b();
            if (b2 != null) {
                bVar2.a("Content-Type: ").a(b2.toString()).a(g);
            }
            long a2 = jVar.a();
            if (a2 != -1) {
                bVar2.a("Content-Length: ").a(a2).a(g);
            } else if (z) {
                bVar.e();
                return -1L;
            }
            byte[] bArr = g;
            bVar2.a(bArr);
            if (z) {
                j += a2;
            } else {
                jVar.a(bVar2);
            }
            bVar2.a(bArr);
        }
        byte[] bArr2 = h;
        bVar2.a(bArr2);
        bVar2.a(this.i);
        bVar2.a(bArr2);
        bVar2.a(g);
        if (!z) {
            return j;
        }
        long k = j + bVar.k();
        bVar.e();
        return k;
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public void a(c cVar) throws IOException {
        a(cVar, false);
    }
}
