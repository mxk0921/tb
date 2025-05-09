package kotlin;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.dyu;
import tb.h30;
import tb.njg;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0002\u0018\u0000 \u001a*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\u001bB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u0012\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001c"}, d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Ltb/njg;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "<init>", "(Ltb/d1a;)V", "", "writeReplace", "()Ljava/lang/Object;", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "Ltb/d1a;", "_value", "Ljava/lang/Object;", "final", "getFinal$annotations", "()V", "getValue", "value", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class SafePublicationLazyImpl<T> implements njg<T>, Serializable {
    public static final a Companion = new a(null);
    private static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> valueUpdater = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    private volatile Object _value;

    /* renamed from: final  reason: not valid java name */
    private final Object f1671final;
    private volatile d1a<? extends T> initializer;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public SafePublicationLazyImpl(d1a<? extends T> d1aVar) {
        ckf.g(d1aVar, "initializer");
        this.initializer = d1aVar;
        dyu dyuVar = dyu.INSTANCE;
        this._value = dyuVar;
        this.f1671final = dyuVar;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // tb.njg
    public T getValue() {
        T t = (T) this._value;
        dyu dyuVar = dyu.INSTANCE;
        if (t != dyuVar) {
            return t;
        }
        d1a<? extends T> d1aVar = this.initializer;
        if (d1aVar != null) {
            T t2 = (T) d1aVar.invoke();
            if (h30.a(valueUpdater, this, dyuVar, t2)) {
                this.initializer = null;
                return t2;
            }
        }
        return (T) this._value;
    }

    public boolean isInitialized() {
        if (this._value != dyu.INSTANCE) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    private static /* synthetic */ void getFinal$annotations() {
    }
}
