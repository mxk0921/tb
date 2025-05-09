package tb;

import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class fzh extends CoroutineDispatcher {
    public abstract fzh N0();

    public final String O0() {
        fzh fzhVar;
        fzh c = zq7.c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            fzhVar = c.N0();
        } catch (UnsupportedOperationException unused) {
            fzhVar = null;
        }
        if (this == fzhVar) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i) {
        apg.a(i);
        return this;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String O0 = O0();
        if (O0 != null) {
            return O0;
        }
        return ov6.a(this) + '@' + ov6.b(this);
    }
}
