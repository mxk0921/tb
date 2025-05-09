package tb;

import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0014\u0010\u0013R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0019\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Ltb/wuo;", "T", "Lkotlinx/coroutines/a;", "Ltb/vu4;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/d;", "context", "Ltb/ar4;", "uCont", "<init>", "(Lkotlin/coroutines/d;Ltb/ar4;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "state", "Ltb/xhv;", "G", "(Ljava/lang/Object;)V", "r1", "f", "Ltb/ar4;", "getCallerFrame", "()Ltb/vu4;", "callerFrame", "", "G0", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class wuo<T> extends a<T> implements vu4 {
    public final ar4<T> f;

    /* JADX WARN: Multi-variable type inference failed */
    public wuo(d dVar, ar4<? super T> ar4Var) {
        super(dVar, true, true);
        this.f = ar4Var;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void G(Object obj) {
        vq7.b(IntrinsicsKt__IntrinsicsJvmKt.c(this.f), ia4.a(obj, this.f), null, 2, null);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean G0() {
        return true;
    }

    @Override // tb.vu4
    public final vu4 getCallerFrame() {
        ar4<T> ar4Var = this.f;
        if (ar4Var instanceof vu4) {
            return (vu4) ar4Var;
        }
        return null;
    }

    @Override // tb.vu4
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.a
    public void r1(Object obj) {
        ar4<T> ar4Var = this.f;
        ar4Var.resumeWith(ia4.a(obj, ar4Var));
    }
}
