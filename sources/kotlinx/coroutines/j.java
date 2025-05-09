package kotlinx.coroutines;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.loc.at;
import com.taobao.search.sf.util.tlog.TLogTracker;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.d;
import kotlinx.coroutines.internal.ThreadContextKt;
import tb.ar4;
import tb.bmv;
import tb.ckf;
import tb.dv6;
import tb.fa4;
import tb.gdt;
import tb.ogv;
import tb.rgq;
import tb.sct;
import tb.sm8;
import tb.tu4;
import tb.uq7;
import tb.vu4;
import tb.wq7;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lkotlinx/coroutines/j;", "T", "Ltb/sct;", "Lkotlinx/coroutines/SchedulerTask;", "", "resumeMode", "<init>", "(I)V", "", bmv.MSGTYPE_INTERVAL, "()Ljava/lang/Object;", "takenState", "", "cause", "Ltb/xhv;", TplMsg.VALUE_T_NATIVE_RETURN, "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "()V", "exception", "finallyException", at.f, "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "c", TLogTracker.LEVEL_INFO, "Ltb/ar4;", "d", "()Ltb/ar4;", "delegate", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class j<T> extends sct {
    public int c;

    public j(int i) {
        this.c = i;
    }

    public abstract ar4<T> d();

    public Throwable e(Object obj) {
        fa4 fa4Var;
        if (obj instanceof fa4) {
            fa4Var = (fa4) obj;
        } else {
            fa4Var = null;
        }
        if (fa4Var != null) {
            return fa4Var.f19137a;
        }
        return null;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                sm8.a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            ckf.d(th);
            tu4.a(d().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ogv<?> ogvVar;
        m mVar;
        Object obj2;
        String str = dv6.DEBUG_PROPERTY_NAME;
        gdt gdtVar = this.b;
        try {
            ar4<T> d = d();
            ckf.e(d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            uq7 uq7Var = (uq7) d;
            ar4<T> ar4Var = uq7Var.e;
            Object obj3 = uq7Var.g;
            d context = ar4Var.getContext();
            Object c = ThreadContextKt.c(context, obj3);
            if (c != ThreadContextKt.NO_THREAD_ELEMENTS) {
                ogvVar = CoroutineContextKt.g(ar4Var, context, c);
            } else {
                ogvVar = null;
            }
            d context2 = ar4Var.getContext();
            Object i = i();
            Throwable e = e(i);
            if (e != null || !wq7.b(this.c)) {
                mVar = null;
            } else {
                mVar = (m) context2.get(m.Key);
            }
            if (mVar != null && !mVar.isActive()) {
                Throwable u0 = mVar.u0();
                b(i, u0);
                if (dv6.c() && (ar4Var instanceof vu4)) {
                    u0 = rgq.i(u0, (vu4) ar4Var);
                }
                ar4Var.resumeWith(Result.m1108constructorimpl(b.a(u0)));
            } else if (e != null) {
                ar4Var.resumeWith(Result.m1108constructorimpl(b.a(e)));
            } else {
                ar4Var.resumeWith(Result.m1108constructorimpl(f(i)));
            }
            xhv xhvVar = xhv.INSTANCE;
            if (ogvVar == null || ogvVar.w1()) {
                ThreadContextKt.a(context, c);
            }
            try {
                gdtVar.a();
                obj2 = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th) {
                obj2 = Result.m1108constructorimpl(b.a(th));
            }
            g(null, Result.m1111exceptionOrNullimpl(obj2));
        } catch (Throwable th2) {
            try {
                gdtVar.a();
                obj = Result.m1108constructorimpl(xhv.INSTANCE);
            } catch (Throwable th3) {
                obj = Result.m1108constructorimpl(b.a(th3));
            }
            g(th2, Result.m1111exceptionOrNullimpl(obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(Object obj) {
        return obj;
    }

    public void b(Object obj, Throwable th) {
    }
}
