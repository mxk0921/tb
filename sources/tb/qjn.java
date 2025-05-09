package tb;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import java.io.IOException;
import java.nio.ByteBuffer;
import okio.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class qjn implements ym2 {

    /* renamed from: a  reason: collision with root package name */
    public final a f26788a = new a();
    public final c0q b;
    public boolean c;

    public qjn(c0q c0qVar) {
        if (c0qVar != null) {
            this.b = c0qVar;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    @Override // tb.c0q, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        Throwable th;
        c0q c0qVar = this.b;
        if (!this.c) {
            try {
                a aVar = this.f26788a;
                long j = aVar.b;
                if (j > 0) {
                    c0qVar.y0(aVar, j);
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                c0qVar.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                fwv.e(th);
                throw null;
            }
        }
    }

    public ym2 e() throws IOException {
        if (!this.c) {
            a aVar = this.f26788a;
            long w = aVar.w();
            if (w > 0) {
                this.b.y0(aVar, w);
            }
            return this;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // tb.c0q, java.io.Flushable
    public void flush() throws IOException {
        if (!this.c) {
            a aVar = this.f26788a;
            long j = aVar.b;
            c0q c0qVar = this.b;
            if (j > 0) {
                c0qVar.y0(aVar, j);
            }
            c0qVar.flush();
            return;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    public ym2 g(byte[] bArr) throws IOException {
        if (!this.c) {
            this.f26788a.B0(bArr);
            e();
            return this;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    @Override // tb.ym2
    public ym2 l(String str, int i, int i2) throws IOException {
        if (!this.c) {
            this.f26788a.M0(str, i, i2);
            e();
            return this;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    public String toString() {
        return "buffer(" + this.b + f7l.BRACKET_END_STR;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.c) {
            int write = this.f26788a.write(byteBuffer);
            e();
            return write;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // tb.ym2
    public ym2 writeByte(int i) throws IOException {
        if (!this.c) {
            this.f26788a.D0(i);
            e();
            return this;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // tb.ym2
    public ym2 writeUtf8(String str) throws IOException {
        if (!this.c) {
            this.f26788a.L0(str);
            e();
            return this;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }

    @Override // tb.c0q
    public void y0(a aVar, long j) throws IOException {
        if (!this.c) {
            this.f26788a.y0(aVar, j);
            e();
            return;
        }
        throw new IllegalStateException(IDecisionResult.STATE_CLOSED);
    }
}
