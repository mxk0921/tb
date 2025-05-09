package kotlinx.coroutines.channels;

import tb.ar4;
import tb.ckf;
import tb.dkf;
import tb.h9p;
import tb.i9p;
import tb.k9p;
import tb.kqu;
import tb.sc0;
import tb.u23;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class LazyActorCoroutine<E> extends sc0<E> {
    @Override // kotlinx.coroutines.JobSupport
    public void a1() {
        u23.b(null, this);
    }

    @Override // tb.ni3, kotlinx.coroutines.channels.i
    public h9p<E, i<E>> b() {
        LazyActorCoroutine$onSend$1 lazyActorCoroutine$onSend$1 = LazyActorCoroutine$onSend$1.INSTANCE;
        ckf.e(lazyActorCoroutine$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kqu.e(lazyActorCoroutine$onSend$1, 3);
        return new i9p(this, lazyActorCoroutine$onSend$1, super.b().d(), null, 8, null);
    }

    @Override // tb.ni3, kotlinx.coroutines.channels.i
    public Object d(E e, ar4<? super xhv> ar4Var) {
        start();
        Object d = super.d(e, ar4Var);
        if (d == dkf.d()) {
            return d;
        }
        return xhv.INSTANCE;
    }

    @Override // tb.ni3, kotlinx.coroutines.channels.i
    public Object m(E e) {
        start();
        return super.m(e);
    }

    @Override // tb.ni3, kotlinx.coroutines.channels.i
    public boolean s(Throwable th) {
        boolean s = super.s(th);
        start();
        return s;
    }

    public final void y1(k9p<?> k9pVar, Object obj) {
        a1();
        super.b().b().invoke(this, k9pVar, obj);
    }
}
