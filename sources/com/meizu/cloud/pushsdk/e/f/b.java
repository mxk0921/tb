package com.meizu.cloud.pushsdk.e.f;

import com.meizu.cloud.pushsdk.e.d.g;
import com.meizu.cloud.pushsdk.e.d.j;
import com.meizu.cloud.pushsdk.e.h.c;
import com.meizu.cloud.pushsdk.e.h.f;
import com.meizu.cloud.pushsdk.e.h.l;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b extends j {

    /* renamed from: a  reason: collision with root package name */
    private final j f5835a;
    private c b;
    private d c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends f {
        long b = 0;
        long c = 0;

        public a(l lVar) {
            super(lVar);
        }

        @Override // com.meizu.cloud.pushsdk.e.h.f, com.meizu.cloud.pushsdk.e.h.l
        public void a(com.meizu.cloud.pushsdk.e.h.b bVar, long j) throws IOException {
            super.a(bVar, j);
            if (this.c == 0) {
                this.c = b.this.a();
            }
            this.b += j;
            if (b.this.c != null) {
                b.this.c.obtainMessage(1, new com.meizu.cloud.pushsdk.e.g.a(this.b, this.c)).sendToTarget();
            }
        }
    }

    public b(j jVar, com.meizu.cloud.pushsdk.e.e.a aVar) {
        this.f5835a = jVar;
        if (aVar != null) {
            this.c = new d(aVar);
        }
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public long a() throws IOException {
        return this.f5835a.a();
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public g b() {
        return this.f5835a.b();
    }

    private l a(l lVar) {
        return new a(lVar);
    }

    @Override // com.meizu.cloud.pushsdk.e.d.j
    public void a(c cVar) throws IOException {
        if (this.b == null) {
            this.b = com.meizu.cloud.pushsdk.e.h.g.a(a((l) cVar));
        }
        this.f5835a.a(this.b);
        this.b.flush();
    }
}
