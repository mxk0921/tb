package com.meizu.cloud.pushsdk.e.h;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    private final b f5846a;
    private final l b;
    private boolean c;

    public h(l lVar) {
        this(lVar, new b());
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public long a(m mVar) throws IOException {
        if (mVar != null) {
            long j = 0;
            while (true) {
                long b = mVar.b(this.f5846a, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX);
                if (b == -1) {
                    return j;
                }
                j += b;
                e();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public b c() {
        return this.f5846a;
    }

    @Override // com.meizu.cloud.pushsdk.e.h.l, java.lang.AutoCloseable
    public void close() {
        Throwable th;
        if (!this.c) {
            try {
                b bVar = this.f5846a;
                long j = bVar.c;
                if (j > 0) {
                    this.b.a(bVar, j);
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                o.a(th);
            }
        }
    }

    public c e() throws IOException {
        if (!this.c) {
            long g = this.f5846a.g();
            if (g > 0) {
                this.b.a(this.f5846a, g);
            }
            return this;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.meizu.cloud.pushsdk.e.h.l, java.io.Flushable
    public void flush() throws IOException {
        if (!this.c) {
            b bVar = this.f5846a;
            long j = bVar.c;
            if (j > 0) {
                this.b.a(bVar, j);
            }
            this.b.flush();
            return;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    public String toString() {
        return "buffer(" + this.b + f7l.BRACKET_END_STR;
    }

    public h(l lVar, b bVar) {
        if (lVar != null) {
            this.f5846a = bVar;
            this.b = lVar;
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public c a(long j) throws IOException {
        if (!this.c) {
            this.f5846a.a(j);
            return e();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public c a(e eVar) throws IOException {
        if (!this.c) {
            this.f5846a.a(eVar);
            return e();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public c a(String str) throws IOException {
        if (!this.c) {
            this.f5846a.a(str);
            return e();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public c a(byte[] bArr) throws IOException {
        if (!this.c) {
            this.f5846a.a(bArr);
            return e();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.meizu.cloud.pushsdk.e.h.c
    public c a(byte[] bArr, int i, int i2) throws IOException {
        if (!this.c) {
            this.f5846a.a(bArr, i, i2);
            return e();
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // com.meizu.cloud.pushsdk.e.h.l
    public void a(b bVar, long j) throws IOException {
        if (!this.c) {
            this.f5846a.a(bVar, j);
            e();
            return;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }
}
