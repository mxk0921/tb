package tb;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.coroutines.d;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.a;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.c;
import kotlinx.coroutines.channels.e;
import kotlinx.coroutines.channels.i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ni3<E> extends a<xhv> implements c<E> {
    public final c<E> f;

    public ni3(d dVar, c<E> cVar, boolean z, boolean z2) {
        super(dVar, z, z2);
        this.f = cVar;
    }

    @Override // kotlinx.coroutines.JobSupport
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void J() {
        O(new JobCancellationException(R(), null, this));
    }

    @Override // kotlinx.coroutines.JobSupport
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean K(Throwable th) {
        O(new JobCancellationException(R(), null, this));
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
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new JobCancellationException(R(), null, this);
            }
            O(cancellationException);
        }
    }

    public h9p<E, i<E>> b() {
        return this.f.b();
    }

    public Object d(E e, ar4<? super xhv> ar4Var) {
        return this.f.d(e, ar4Var);
    }

    @Override // kotlinx.coroutines.channels.i
    public boolean f() {
        return this.f.f();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object i(ar4<? super e<? extends E>> ar4Var) {
        Object i = this.f.i(ar4Var);
        dkf.d();
        return i;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator<E> iterator() {
        return this.f.iterator();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public f9p<E> j() {
        return this.f.j();
    }

    @Override // kotlinx.coroutines.channels.i
    public void k(g1a<? super Throwable, xhv> g1aVar) {
        this.f.k(g1aVar);
    }

    public Object m(E e) {
        return this.f.m(e);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public f9p<e<E>> n() {
        return this.f.n();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object o() {
        return this.f.o();
    }

    public boolean s(Throwable th) {
        return this.f.s(th);
    }

    public final c<E> w1() {
        return this.f;
    }
}
