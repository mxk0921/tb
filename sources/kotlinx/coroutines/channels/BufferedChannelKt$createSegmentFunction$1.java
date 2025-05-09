package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.u1a;
import tb.zi3;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public /* synthetic */ class BufferedChannelKt$createSegmentFunction$1 extends FunctionReferenceImpl implements u1a<Long, zi3<E>, zi3<E>> {
    public static final BufferedChannelKt$createSegmentFunction$1 INSTANCE = new BufferedChannelKt$createSegmentFunction$1();

    public BufferedChannelKt$createSegmentFunction$1() {
        super(2, BufferedChannelKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ Object invoke(Long l, Object obj) {
        return invoke(l.longValue(), (zi3) obj);
    }

    public final zi3<E> invoke(long j, zi3<E> zi3Var) {
        zi3<E> x;
        x = BufferedChannelKt.x(j, zi3Var);
        return x;
    }
}
