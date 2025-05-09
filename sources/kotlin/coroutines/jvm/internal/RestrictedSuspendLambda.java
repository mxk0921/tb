package kotlin.coroutines.jvm.internal;

import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import tb.ar4;
import tb.ckf;
import tb.dun;
import tb.m2a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Ltb/m2a;", "", "", "arity", "Ltb/ar4;", "completion", "<init>", "(ILtb/ar4;)V", "(I)V", "", "toString", "()Ljava/lang/String;", TLogTracker.LEVEL_INFO, "getArity", "()I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements m2a<Object> {
    private final int arity;

    public RestrictedSuspendLambda(int i, ar4<Object> ar4Var) {
        super(ar4Var);
        this.arity = i;
    }

    @Override // tb.m2a
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String l = dun.l(this);
        ckf.f(l, "renderLambdaToString(...)");
        return l;
    }

    public RestrictedSuspendLambda(int i) {
        this(i, null);
    }
}
