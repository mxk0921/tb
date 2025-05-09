package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.d;
import tb.ckf;
import tb.u1a;
import tb.ytc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00012\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lkotlin/coroutines/EmptyCoroutineContext;", "Lkotlin/coroutines/d;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "Lkotlin/coroutines/d$b;", "E", "Lkotlin/coroutines/d$c;", "key", "get", "(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;", "R", "initial", "Lkotlin/Function2;", "operation", ytc.TYPE_FOLD, "(Ljava/lang/Object;Ltb/u1a;)Ljava/lang/Object;", "context", "plus", "(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "minusKey", "(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d;", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "serialVersionUID", "J", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class EmptyCoroutineContext implements d, Serializable {
    public static final EmptyCoroutineContext INSTANCE = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r, u1a<? super R, ? super d.b, ? extends R> u1aVar) {
        ckf.g(u1aVar, "operation");
        return r;
    }

    @Override // kotlin.coroutines.d
    public <E extends d.b> E get(d.c<E> cVar) {
        ckf.g(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.d
    public d minusKey(d.c<?> cVar) {
        ckf.g(cVar, "key");
        return this;
    }

    @Override // kotlin.coroutines.d
    public d plus(d dVar) {
        ckf.g(dVar, "context");
        return dVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
