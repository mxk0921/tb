package tb;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface ym2 extends c0q, WritableByteChannel {
    ym2 l(String str, int i, int i2) throws IOException;

    ym2 writeByte(int i) throws IOException;

    ym2 writeUtf8(String str) throws IOException;
}
