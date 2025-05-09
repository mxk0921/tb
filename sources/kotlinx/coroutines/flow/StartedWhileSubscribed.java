package kotlinx.coroutines.flow;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import java.util.List;
import kotlin.Metadata;
import tb.ajq;
import tb.en9;
import tb.i04;
import tb.qp9;
import tb.xz3;
import tb.yp9;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/flow/StartedWhileSubscribed;", "Lkotlinx/coroutines/flow/k;", "", "stopTimeout", "replayExpiration", "<init>", "(JJ)V", "Ltb/ajq;", "", "subscriptionCount", "Ltb/qp9;", "Lkotlinx/coroutines/flow/SharingCommand;", "a", "(Ltb/ajq;)Ltb/qp9;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "J", TplMsg.VALUE_T_NATIVE_RETURN, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class StartedWhileSubscribed implements k {

    /* renamed from: a  reason: collision with root package name */
    private final long f15354a;
    private final long b;

    public StartedWhileSubscribed(long j, long j2) {
        this.f15354a = j;
        this.b = j2;
        if (j < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
        } else if (j2 < 0) {
            throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
        }
    }

    @Override // kotlinx.coroutines.flow.k
    public qp9<SharingCommand> a(ajq<Integer> ajqVar) {
        return yp9.k(yp9.l(yp9.G(ajqVar, new StartedWhileSubscribed$command$1(this, null)), new StartedWhileSubscribed$command$2(null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof StartedWhileSubscribed) {
            StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
            if (this.f15354a == startedWhileSubscribed.f15354a && this.b == startedWhileSubscribed.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (en9.a(this.f15354a) * 31) + en9.a(this.b);
    }

    public String toString() {
        List d = xz3.d(2);
        if (this.f15354a > 0) {
            d.add("stopTimeout=" + this.f15354a + "ms");
        }
        if (this.b < Long.MAX_VALUE) {
            d.add("replayExpiration=" + this.b + "ms");
        }
        List a2 = xz3.a(d);
        return "SharingStarted.WhileSubscribed(" + i04.j0(a2, null, null, null, 0, null, null, 63, null) + ')';
    }
}
