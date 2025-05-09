package tb;

import kotlin.coroutines.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ea4 implements ar4<Object> {
    public static final ea4 INSTANCE = new ea4();

    @Override // tb.ar4
    public d getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // tb.ar4
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
