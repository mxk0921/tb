package kotlinx.coroutines;

import com.loc.at;
import kotlin.Metadata;
import tb.ar4;
import tb.wuo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002 \u0000*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/p;", "U", "T", "Ltb/wuo;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "time", "Ltb/ar4;", "uCont", "<init>", "(JLtb/ar4;)V", "Ltb/xhv;", "run", "()V", "", "R0", "()Ljava/lang/String;", at.f, "J", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class p<U, T extends U> extends wuo<T> implements Runnable {
    public final long g;

    public p(long j, ar4<? super U> ar4Var) {
        super(ar4Var.getContext(), ar4Var);
        this.g = j;
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.JobSupport
    public String R0() {
        return super.R0() + "(timeMillis=" + this.g + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        M(TimeoutKt.a(this.g, DelayKt.c(getContext()), this));
    }
}
