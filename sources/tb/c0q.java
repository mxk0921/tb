package tb;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import okio.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface c0q extends Closeable, Flushable {
    @Override // java.lang.AutoCloseable, java.nio.channels.Channel, tb.c0q
    void close() throws IOException;

    void flush() throws IOException;

    void y0(a aVar, long j) throws IOException;
}
