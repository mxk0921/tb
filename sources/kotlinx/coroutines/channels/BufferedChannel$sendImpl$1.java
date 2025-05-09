package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.y1a;
import tb.zi3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u0010\f\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\b\u001a\u00020\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"R", "E", "Ltb/zi3;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "<anonymous parameter 3>", "", "invoke", "(Ltb/zi3;ILjava/lang/Object;J)Ljava/lang/Void;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class BufferedChannel$sendImpl$1 extends Lambda implements y1a {
    public static final BufferedChannel$sendImpl$1 INSTANCE = new BufferedChannel$sendImpl$1();

    public BufferedChannel$sendImpl$1() {
        super(4);
    }

    @Override // tb.y1a
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((zi3<int>) obj, ((Number) obj2).intValue(), (int) obj3, ((Number) obj4).longValue());
    }

    public final Void invoke(zi3<E> zi3Var, int i, E e, long j) {
        throw new IllegalStateException("unexpected");
    }
}
