package tb;

import android.os.Looper;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.android.HandlerContext;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltb/uv0;", "Ltb/lzh;", "<init>", "()V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class uv0 implements lzh {
    @Override // tb.lzh
    public fzh a(List<? extends lzh> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new HandlerContext(gsa.c(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
