package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import tb.w1a;

/* compiled from: Taobao */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public /* synthetic */ class BufferedChannel$onReceive$2 extends FunctionReferenceImpl implements w1a<BufferedChannel<?>, Object, Object, Object> {
    public static final BufferedChannel$onReceive$2 INSTANCE = new BufferedChannel$onReceive$2();

    public BufferedChannel$onReceive$2() {
        super(3, BufferedChannel.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(BufferedChannel<?> bufferedChannel, Object obj, Object obj2) {
        bufferedChannel.W0(obj, obj2);
        return obj2;
    }
}
