package tb;

import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ltb/jwq;", "Ltb/ajq;", "", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "initialValue", "<init>", "(I)V", "delta", "", "e0", "(I)Z", "d0", "()Ljava/lang/Integer;", "value", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class jwq extends SharedFlowImpl<Integer> implements ajq<Integer> {
    public jwq(int i) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        d(Integer.valueOf(i));
    }

    /* renamed from: d0 */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(P().intValue());
        }
        return valueOf;
    }

    public final boolean e0(int i) {
        boolean d;
        synchronized (this) {
            d = d(Integer.valueOf(P().intValue() + i));
        }
        return d;
    }
}
