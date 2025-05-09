package tb;

import kotlin.jvm.JvmInline;
import tb.v8p;

/* compiled from: Taobao */
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class x8p<S extends v8p<S>> {
    public static final S a(Object obj) {
        if (obj != se4.f27989a) {
            ckf.e(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (S) ((v8p) obj);
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final boolean b(Object obj) {
        if (obj == se4.f27989a) {
            return true;
        }
        return false;
    }
}
