package kotlin;

import com.taobao.orange.OConstant;
import java.io.Serializable;
import tb.a07;
import tb.ckf;
import tb.d1a;
import tb.dyu;
import tb.njg;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\u0017\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\f¨\u0006\u0018"}, d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Ltb/njg;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/Function0;", "initializer", "", OConstant.DIMEN_FILE_LOCK, "<init>", "(Ltb/d1a;Ljava/lang/Object;)V", "writeReplace", "()Ljava/lang/Object;", "", "isInitialized", "()Z", "", "toString", "()Ljava/lang/String;", "Ltb/d1a;", "_value", "Ljava/lang/Object;", "getValue", "value", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SynchronizedLazyImpl<T> implements njg<T>, Serializable {
    private volatile Object _value;
    private d1a<? extends T> initializer;
    private final Object lock;

    public SynchronizedLazyImpl(d1a<? extends T> d1aVar, Object obj) {
        ckf.g(d1aVar, "initializer");
        this.initializer = d1aVar;
        this._value = dyu.INSTANCE;
        this.lock = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // tb.njg
    public T getValue() {
        T t;
        T t2 = (T) this._value;
        dyu dyuVar = dyu.INSTANCE;
        if (t2 != dyuVar) {
            return t2;
        }
        synchronized (this.lock) {
            t = (T) this._value;
            if (t == dyuVar) {
                d1a<? extends T> d1aVar = this.initializer;
                ckf.d(d1aVar);
                t = (T) d1aVar.invoke();
                this._value = t;
                this.initializer = null;
            }
        }
        return t;
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

    public /* synthetic */ SynchronizedLazyImpl(d1a d1aVar, Object obj, int i, a07 a07Var) {
        this(d1aVar, (i & 2) != 0 ? null : obj);
    }
}
