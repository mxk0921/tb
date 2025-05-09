package tb;

import java.io.IOException;
import java.io.InterruptedIOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ovt {
    public static final ovt NONE = new a();

    public void a() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a extends ovt {
        @Override // tb.ovt
        public void a() throws IOException {
        }
    }
}
