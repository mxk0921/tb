package kotlinx.coroutines;

import com.alipay.sdk.m.f.b;
import kotlin.Metadata;
import kotlin.coroutines.d;
import tb.ar4;
import tb.bmi;
import tb.fa4;
import tb.ia4;
import tb.lca;
import tb.ov6;
import tb.pg1;
import tb.suf;
import tb.tu4;
import tb.u1a;
import tb.uu4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0004¢\u0006\u0004\b\u001b\u0010\u0010J\u001e\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0010J\u0019\u0010\u001f\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001f\u0010\u0010J\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0011H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0010¢\u0006\u0004\b#\u0010\u0018JO\u0010*\u001a\u00020\u000e\"\u0004\b\u0001\u0010\u00172\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00028\u00012'\u0010)\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00190'¢\u0006\u0002\b(ø\u0001\u0000¢\u0006\u0004\b*\u0010+R\u001d\u00102\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00105\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lkotlinx/coroutines/a;", "T", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/m;", "Ltb/ar4;", "Ltb/uu4;", "Lkotlin/coroutines/d;", "parentContext", "", "initParentJob", "active", "<init>", "(Lkotlin/coroutines/d;ZZ)V", "value", "Ltb/xhv;", "u1", "(Ljava/lang/Object;)V", "", "cause", "handled", lca.STAGE_T1, "(Ljava/lang/Throwable;Z)V", "", "R", "()Ljava/lang/String;", "", "state", "Z0", "Lkotlin/Result;", "result", "resumeWith", "r1", "exception", "x0", "(Ljava/lang/Throwable;)V", "R0", "Lkotlinx/coroutines/CoroutineStart;", "start", bmi.KEY_RECEIVER, "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", pg1.ATOM_EXT_block, b.c, "(Lkotlinx/coroutines/CoroutineStart;Ljava/lang/Object;Ltb/u1a;)V", "e", "Lkotlin/coroutines/d;", "getContext", "()Lkotlin/coroutines/d;", "s1", "()V", "context", "getCoroutineContext", "coroutineContext", "isActive", "()Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class a<T> extends JobSupport implements ar4<T>, uu4 {
    private final d e;

    public a(d dVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            y0((m) dVar.get(m.Key));
        }
        this.e = dVar.plus(this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public String R() {
        return ov6.a(this).concat(" was cancelled");
    }

    @Override // kotlinx.coroutines.JobSupport
    public String R0() {
        String b = CoroutineContextKt.b(this.e);
        if (b == null) {
            return super.R0();
        }
        return "\"" + b + "\":" + super.R0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.JobSupport
    public final void Z0(Object obj) {
        if (obj instanceof fa4) {
            fa4 fa4Var = (fa4) obj;
            t1(fa4Var.f19137a, fa4Var.a());
            return;
        }
        u1(obj);
    }

    @Override // tb.ar4
    public final d getContext() {
        return this.e;
    }

    @Override // tb.uu4
    public d getCoroutineContext() {
        return this.e;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.m
    public boolean isActive() {
        return super.isActive();
    }

    public void r1(Object obj) {
        G(obj);
    }

    @Override // tb.ar4
    public final void resumeWith(Object obj) {
        Object P0 = P0(ia4.d(obj, null, 1, null));
        if (P0 != suf.COMPLETING_WAITING_CHILDREN) {
            r1(P0);
        }
    }

    public final <R> void v1(CoroutineStart coroutineStart, R r, u1a<? super R, ? super ar4<? super T>, ? extends Object> u1aVar) {
        coroutineStart.invoke(u1aVar, r, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void x0(Throwable th) {
        tu4.a(this.e, th);
    }

    public static /* synthetic */ void s1() {
    }

    public void u1(T t) {
    }

    public void t1(Throwable th, boolean z) {
    }
}
