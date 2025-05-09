package kotlinx.coroutines.channels;

import com.loc.at;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import tb.ar4;
import tb.hl2;
import tb.ozm;
import tb.pg1;
import tb.u1a;
import tb.u23;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012-\u0010\r\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007¢\u0006\u0002\b\fø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/channels/g;", "E", "Lkotlinx/coroutines/channels/b;", "Lkotlin/coroutines/d;", "parentContext", "Ltb/hl2;", "channel", "Lkotlin/Function2;", "Ltb/ozm;", "Ltb/ar4;", "Ltb/xhv;", "", "Lkotlin/ExtensionFunctionType;", pg1.ATOM_EXT_block, "<init>", "(Lkotlin/coroutines/d;Ltb/hl2;Ltb/u1a;)V", "Lkotlinx/coroutines/channels/ReceiveChannel;", "c", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "a1", "()V", at.f, "Ltb/ar4;", "continuation", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
final class g<E> extends b<E> {
    private final ar4<xhv> g;

    public g(d dVar, hl2<E> hl2Var, u1a<? super ozm<? super E>, ? super ar4<? super xhv>, ? extends Object> u1aVar) {
        super(dVar, hl2Var, false);
        this.g = IntrinsicsKt__IntrinsicsJvmKt.b(u1aVar, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public void a1() {
        u23.b(this.g, this);
    }

    @Override // kotlinx.coroutines.channels.b, tb.hl2
    public ReceiveChannel<E> c() {
        ReceiveChannel<E> c = w1().c();
        start();
        return c;
    }
}
