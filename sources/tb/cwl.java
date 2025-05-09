package tb;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import java.io.IOException;
import okio.BufferedSource;
import okio.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class cwl implements y9q {

    /* renamed from: a  reason: collision with root package name */
    public final BufferedSource f17368a;
    public final a b;
    public u8p c;
    public int d;
    public boolean e;
    public long f;

    public cwl(BufferedSource bufferedSource) {
        int i;
        this.f17368a = bufferedSource;
        a buffer = bufferedSource.buffer();
        this.b = buffer;
        u8p u8pVar = buffer.f15415a;
        this.c = u8pVar;
        if (u8pVar != null) {
            i = u8pVar.b;
        } else {
            i = -1;
        }
        this.d = i;
    }

    @Override // tb.y9q
    public long X(a aVar, long j) throws IOException {
        u8p u8pVar;
        u8p u8pVar2;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.e) {
            u8p u8pVar3 = this.c;
            a aVar2 = this.b;
            if (u8pVar3 != null && (u8pVar3 != (u8pVar2 = aVar2.f15415a) || this.d != u8pVar2.b)) {
                throw new IllegalStateException("Peek source is invalid because upstream source was used");
            } else if (i == 0) {
                return 0L;
            } else {
                if (!this.f17368a.request(this.f + 1)) {
                    return -1L;
                }
                if (this.c == null && (u8pVar = aVar2.f15415a) != null) {
                    this.c = u8pVar;
                    this.d = u8pVar.b;
                }
                long min = Math.min(j, aVar2.b - this.f);
                this.b.A(aVar, this.f, min);
                this.f += min;
                return min;
            }
        } else {
            throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.e = true;
    }
}
