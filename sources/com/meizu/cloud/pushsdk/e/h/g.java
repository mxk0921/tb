package com.meizu.cloud.pushsdk.e.h;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f5843a = Logger.getLogger(g.class.getName());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f5844a;
        final /* synthetic */ OutputStream b;

        public a(n nVar, OutputStream outputStream) {
            this.f5844a = nVar;
            this.b = outputStream;
        }

        @Override // com.meizu.cloud.pushsdk.e.h.l
        public void a(com.meizu.cloud.pushsdk.e.h.b bVar, long j) throws IOException {
            o.a(bVar.c, 0L, j);
            while (j > 0) {
                this.f5844a.a();
                j jVar = bVar.b;
                int min = (int) Math.min(j, jVar.c - jVar.b);
                this.b.write(jVar.f5849a, jVar.b, min);
                int i = jVar.b + min;
                jVar.b = i;
                long j2 = min;
                j -= j2;
                bVar.c -= j2;
                if (i == jVar.c) {
                    bVar.b = jVar.b();
                    k.a(jVar);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.e.h.l, java.lang.AutoCloseable
        public void close() throws IOException {
            this.b.close();
        }

        @Override // com.meizu.cloud.pushsdk.e.h.l, java.io.Flushable
        public void flush() throws IOException {
            this.b.flush();
        }

        public String toString() {
            return "sink(" + this.b + f7l.BRACKET_END_STR;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f5845a;
        final /* synthetic */ InputStream b;

        public b(n nVar, InputStream inputStream) {
            this.f5845a = nVar;
            this.b = inputStream;
        }

        @Override // com.meizu.cloud.pushsdk.e.h.m
        public long b(com.meizu.cloud.pushsdk.e.h.b bVar, long j) throws IOException {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (i == 0) {
                return 0L;
            } else {
                this.f5845a.a();
                j a2 = bVar.a(1);
                int read = this.b.read(a2.f5849a, a2.c, (int) Math.min(j, 2048 - a2.c));
                if (read == -1) {
                    return -1L;
                }
                a2.c += read;
                long j2 = read;
                bVar.c += j2;
                return j2;
            }
        }

        @Override // com.meizu.cloud.pushsdk.e.h.m, java.io.Closeable, java.lang.AutoCloseable, com.meizu.cloud.pushsdk.e.h.l
        public void close() throws IOException {
            this.b.close();
        }

        public String toString() {
            return "source(" + this.b + f7l.BRACKET_END_STR;
        }
    }

    private g() {
    }

    public static c a(l lVar) {
        if (lVar != null) {
            return new h(lVar);
        }
        throw new IllegalArgumentException("sink == null");
    }

    public static d a(m mVar) {
        if (mVar != null) {
            return new i(mVar);
        }
        throw new IllegalArgumentException("source == null");
    }

    public static l a(OutputStream outputStream) {
        return a(outputStream, new n());
    }

    private static l a(OutputStream outputStream, n nVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (nVar != null) {
            return new a(nVar, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    public static m a(File file) throws FileNotFoundException {
        if (file != null) {
            return a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static m a(InputStream inputStream) {
        return a(inputStream, new n());
    }

    private static m a(InputStream inputStream, n nVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (nVar != null) {
            return new b(nVar, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }
}
