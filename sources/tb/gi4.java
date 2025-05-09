package tb;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.loc.at;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlinx.coroutines.channels.BroadcastChannelImpl;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.i;

/* compiled from: Taobao */
@Deprecated(level = DeprecationLevel.WARNING, message = "ConflatedBroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\tJ\u001c\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0097\u0001¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ5\u0010\u0019\u001a\u00020\u00112#\u0010\u0018\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00110\u0015H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b!\u0010\"J'\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110#2\u0006\u0010\u001b\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010&R\u0014\u0010)\u001a\u00020\f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R&\u0010.\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000+0*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0011\u0010\b\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00102\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b1\u00100\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Ltb/gi4;", "E", "Ltb/hl2;", "Lkotlinx/coroutines/channels/BroadcastChannelImpl;", "broadcast", "<init>", "(Lkotlinx/coroutines/channels/BroadcastChannelImpl;)V", "()V", "value", "(Ljava/lang/Object;)V", "", "cause", "", "e", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Ltb/xhv;", "a", "(Ljava/util/concurrent/CancellationException;)V", "s", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "handler", at.k, "(Ltb/g1a;)V", "element", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/ReceiveChannel;", "c", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "d", "(Ljava/lang/Object;Ltb/ar4;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/e;", "m", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/BroadcastChannelImpl;", "f", "()Z", "isClosedForSend", "Ltb/h9p;", "Lkotlinx/coroutines/channels/i;", TplMsg.VALUE_T_NATIVE_RETURN, "()Ltb/h9p;", "onSend", at.f, "()Ljava/lang/Object;", "h", "valueOrNull", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class gi4<E> implements hl2<E> {

    /* renamed from: a  reason: collision with root package name */
    private final BroadcastChannelImpl<E> f20016a;

    private gi4(BroadcastChannelImpl<E> broadcastChannelImpl) {
        this.f20016a = broadcastChannelImpl;
    }

    @Override // tb.hl2
    public void a(CancellationException cancellationException) {
        this.f20016a.a(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.i
    public h9p<E, i<E>> b() {
        return this.f20016a.b();
    }

    @Override // tb.hl2
    public ReceiveChannel<E> c() {
        return this.f20016a.c();
    }

    @Override // kotlinx.coroutines.channels.i
    public Object d(E e, ar4<? super xhv> ar4Var) {
        return this.f20016a.d(e, ar4Var);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Binary compatibility only")
    public /* synthetic */ boolean e(Throwable th) {
        return this.f20016a.N(th);
    }

    @Override // kotlinx.coroutines.channels.i
    public boolean f() {
        return this.f20016a.f();
    }

    public final E g() {
        return this.f20016a.P1();
    }

    public final E h() {
        return this.f20016a.R1();
    }

    @Override // kotlinx.coroutines.channels.i
    public void k(g1a<? super Throwable, xhv> g1aVar) {
        this.f20016a.k(g1aVar);
    }

    @Override // kotlinx.coroutines.channels.i
    public Object m(E e) {
        return this.f20016a.m(e);
    }

    @Override // kotlinx.coroutines.channels.i
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return this.f20016a.offer(e);
    }

    @Override // kotlinx.coroutines.channels.i
    public boolean s(Throwable th) {
        return this.f20016a.s(th);
    }

    public gi4() {
        this(new BroadcastChannelImpl(-1));
    }

    public gi4(E e) {
        this();
        m(e);
    }
}
