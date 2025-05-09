package kotlinx.coroutines.channels;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.loc.at;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.d;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.a;
import kotlinx.coroutines.channels.i;
import kotlinx.coroutines.m;
import tb.ar4;
import tb.g1a;
import tb.h9p;
import tb.hl2;
import tb.lca;
import tb.ozm;
import tb.tu4;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B%\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\u0013\u001a\u00020\u00032#\u0010\u0012\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00030\rH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u00032\u000e\u0010\u0011\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003H\u0014¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\tH\u0014¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b.\u0010!R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00104\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b/\u00103R&\u00109\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000006058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00103R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00028\u0000068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Lkotlinx/coroutines/channels/b;", "E", "Lkotlinx/coroutines/a;", "Ltb/xhv;", "Ltb/ozm;", "Ltb/hl2;", "Lkotlin/coroutines/d;", "parentContext", "_channel", "", "active", "<init>", "(Lkotlin/coroutines/d;Ltb/hl2;Z)V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "handler", at.k, "(Ltb/g1a;)V", "element", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/ReceiveChannel;", "c", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "d", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/e;", "m", "(Ljava/lang/Object;)Ljava/lang/Object;", "K", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "a", "(Ljava/util/concurrent/CancellationException;)V", "O", "(Ljava/lang/Throwable;)V", "value", "x1", "(Ltb/xhv;)V", "handled", lca.STAGE_T1, "(Ljava/lang/Throwable;Z)V", "s", "f", "Ltb/hl2;", "w1", "()Ltb/hl2;", "()Z", "isClosedForSend", "Ltb/h9p;", "Lkotlinx/coroutines/channels/i;", TplMsg.VALUE_T_NATIVE_RETURN, "()Ltb/h9p;", "onSend", "isActive", "w", "()Lkotlinx/coroutines/channels/i;", "channel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
class b<E> extends a<xhv> implements ozm<E>, hl2<E> {
    private final hl2<E> f;

    public b(d dVar, hl2<E> hl2Var, boolean z) {
        super(dVar, false, z);
        this.f = hl2Var;
        y0((m) dVar.get(m.Key));
    }

    @Override // kotlinx.coroutines.JobSupport
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean K(Throwable th) {
        if (th == null) {
            th = new JobCancellationException(R(), null, this);
        }
        O(th);
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void O(Throwable th) {
        CancellationException k1 = JobSupport.k1(this, th, null, 1, null);
        this.f.a(k1);
        M(k1);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.m
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(R(), null, this);
        }
        O(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.i
    public h9p<E, i<E>> b() {
        return this.f.b();
    }

    @Override // tb.hl2
    public ReceiveChannel<E> c() {
        return this.f.c();
    }

    @Override // kotlinx.coroutines.channels.i
    public Object d(E e, ar4<? super xhv> ar4Var) {
        return this.f.d(e, ar4Var);
    }

    @Override // kotlinx.coroutines.channels.i
    public boolean f() {
        return this.f.f();
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.JobSupport, kotlinx.coroutines.m
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.channels.i
    public void k(g1a<? super Throwable, xhv> g1aVar) {
        this.f.k(g1aVar);
    }

    @Override // kotlinx.coroutines.channels.i
    public Object m(E e) {
        return this.f.m(e);
    }

    @Override // kotlinx.coroutines.channels.i
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return this.f.offer(e);
    }

    @Override // kotlinx.coroutines.channels.i
    public boolean s(Throwable th) {
        boolean s = this.f.s(th);
        start();
        return s;
    }

    @Override // kotlinx.coroutines.a
    public void t1(Throwable th, boolean z) {
        if (!this.f.s(th) && !z) {
            tu4.a(getContext(), th);
        }
    }

    public final hl2<E> w1() {
        return this.f;
    }

    /* renamed from: x1 */
    public void u1(xhv xhvVar) {
        i.a.a(this.f, null, 1, null);
    }

    @Override // tb.ozm
    public i<E> w() {
        return this;
    }
}
