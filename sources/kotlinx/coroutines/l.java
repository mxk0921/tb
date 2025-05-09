package kotlinx.coroutines;

import com.alibaba.security.realidentity.b1;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlinx.coroutines.k;
import tb.pg1;
import tb.sk8;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/l;", "Ltb/sk8;", "<init>", "()V", "Ltb/xhv;", "c1", "", pg1.ATOM_EXT_now, "Lkotlinx/coroutines/k$c;", "delayedTask", b1.f2663a, "(JLkotlinx/coroutines/k$c;)V", "Ljava/lang/Thread;", "a1", "()Ljava/lang/Thread;", "thread", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class l extends sk8 {
    public abstract Thread a1();

    public void b1(long j, k.c cVar) {
        g.INSTANCE.n1(j, cVar);
    }

    public final void c1() {
        Thread a1 = a1();
        if (Thread.currentThread() != a1) {
            LockSupport.unpark(a1);
        }
    }
}
