package tb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
import okio.BufferedSource;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class kok {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements c0q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ovt f22801a;
        public final /* synthetic */ OutputStream b;

        public a(ovt ovtVar, OutputStream outputStream) {
            this.f22801a = ovtVar;
            this.b = outputStream;
        }

        @Override // tb.c0q, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() throws IOException {
            this.b.close();
        }

        @Override // tb.c0q, java.io.Flushable
        public void flush() throws IOException {
            this.b.flush();
        }

        public String toString() {
            return "sink(" + this.b + f7l.BRACKET_END_STR;
        }

        @Override // tb.c0q
        public void y0(okio.a aVar, long j) throws IOException {
            fwv.b(aVar.b, 0L, j);
            while (j > 0) {
                this.f22801a.a();
                u8p u8pVar = aVar.f15415a;
                int min = (int) Math.min(j, u8pVar.c - u8pVar.b);
                this.b.write(u8pVar.f29231a, u8pVar.b, min);
                int i = u8pVar.b + min;
                u8pVar.b = i;
                long j2 = min;
                j -= j2;
                aVar.b -= j2;
                if (i == u8pVar.c) {
                    aVar.f15415a = u8pVar.b();
                    y8p.a(u8pVar);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements y9q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ovt f22802a;
        public final /* synthetic */ InputStream b;

        public b(ovt ovtVar, InputStream inputStream) {
            this.f22802a = ovtVar;
            this.b = inputStream;
        }

        @Override // tb.y9q
        public long X(okio.a aVar, long j) throws IOException {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (i == 0) {
                return 0L;
            } else {
                try {
                    this.f22802a.a();
                    u8p u0 = aVar.u0(1);
                    int read = this.b.read(u0.f29231a, u0.c, (int) Math.min(j, 8192 - u0.c));
                    if (read == -1) {
                        return -1L;
                    }
                    u0.c += read;
                    long j2 = read;
                    aVar.b += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (kok.c(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.b.close();
        }

        public String toString() {
            return "source(" + this.b + f7l.BRACKET_END_STR;
        }
    }

    static {
        Logger.getLogger(kok.class.getName());
    }

    public static BufferedSource a(y9q y9qVar) {
        return new rjn(y9qVar);
    }

    public static ym2 b(c0q c0qVar) {
        return new qjn(c0qVar);
    }

    public static boolean c(AssertionError assertionError) {
        if (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) {
            return false;
        }
        return true;
    }

    public static c0q d(File file) throws FileNotFoundException {
        if (file != null) {
            return e(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static c0q e(OutputStream outputStream) {
        return f(outputStream, new ovt());
    }

    public static c0q f(OutputStream outputStream, ovt ovtVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (ovtVar != null) {
            return new a(ovtVar, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static y9q g(InputStream inputStream) {
        return h(inputStream, new ovt());
    }

    public static y9q h(InputStream inputStream, ovt ovtVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (ovtVar != null) {
            return new b(ovtVar, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }
}
