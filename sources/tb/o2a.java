package tb;

import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J3\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ltb/o2a;", "T", "Ltb/qp9;", "Lkotlin/coroutines/d;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "f", "(Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)Ltb/qp9;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface o2a<T> extends qp9<T> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public static /* synthetic */ qp9 a(o2a o2aVar, d dVar, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    dVar = EmptyCoroutineContext.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    bufferOverflow = BufferOverflow.SUSPEND;
                }
                return o2aVar.f(dVar, i, bufferOverflow);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    @Override // tb.qp9, tb.t23
    /* synthetic */ Object a(sp9 sp9Var, ar4 ar4Var);

    qp9<T> f(d dVar, int i, BufferOverflow bufferOverflow);
}
