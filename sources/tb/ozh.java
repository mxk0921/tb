package tb;

import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ozh {
    public static final vvi a(Throwable th, String str) {
        return new vvi(th, str);
    }

    public static /* synthetic */ vvi b(Throwable th, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(fzh fzhVar) {
        return fzhVar.N0() instanceof vvi;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final fzh e(lzh lzhVar, List<? extends lzh> list) {
        try {
            return lzhVar.a(list);
        } catch (Throwable th) {
            lzhVar.getClass();
            return a(th, "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used");
        }
    }
}
