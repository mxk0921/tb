package okio;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import tb.a8l;
import tb.c0q;
import tb.y9q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface BufferedSource extends y9q, ReadableByteChannel {
    long S(c0q c0qVar) throws IOException;

    @Deprecated
    a buffer();

    boolean exhausted() throws IOException;

    long i(ByteString byteString) throws IOException;

    BufferedSource peek();

    byte readByte() throws IOException;

    ByteString readByteString(long j) throws IOException;

    int readIntLe() throws IOException;

    long readLongLe() throws IOException;

    String readString(long j, Charset charset) throws IOException;

    boolean request(long j) throws IOException;

    void require(long j) throws IOException;

    int s0(a8l a8lVar) throws IOException;

    void skip(long j) throws IOException;
}
