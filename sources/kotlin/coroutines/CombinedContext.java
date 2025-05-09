package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref$IntRef;
import tb.a07;
import tb.ckf;
import tb.tep;
import tb.u1a;
import tb.xhv;
import tb.ytc;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001+B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0015*\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u00028\u00002\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\tH\u0016¢\u0006\u0004\b%\u0010\u000bJ\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*¨\u0006,"}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/d;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "Lkotlin/coroutines/d$b;", "element", "<init>", "(Lkotlin/coroutines/d;Lkotlin/coroutines/d$b;)V", "", "size", "()I", "", "contains", "(Lkotlin/coroutines/d$b;)Z", "context", "containsAll", "(Lkotlin/coroutines/CombinedContext;)Z", "", "writeReplace", "()Ljava/lang/Object;", "E", "Lkotlin/coroutines/d$c;", "key", "get", "(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;", "R", "initial", "Lkotlin/Function2;", "operation", ytc.TYPE_FOLD, "(Ljava/lang/Object;Ltb/u1a;)Ljava/lang/Object;", "minusKey", "(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/d$b;", "Serialized", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class CombinedContext implements d, Serializable {
    private final d.b element;
    private final d left;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000fB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "Lkotlin/coroutines/d;", tep.KEY_UNIFORM_RESULT, "<init>", "([Lkotlin/coroutines/d;)V", "", "readResolve", "()Ljava/lang/Object;", "[Lkotlin/coroutines/d;", "getElements", "()[Lkotlin/coroutines/d;", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class Serialized implements Serializable {
        public static final a Companion = new a(null);
        private static final long serialVersionUID = 0;
        private final d[] elements;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public static final class a {
            public /* synthetic */ a(a07 a07Var) {
                this();
            }

            public a() {
            }
        }

        public Serialized(d[] dVarArr) {
            ckf.g(dVarArr, tep.KEY_UNIFORM_RESULT);
            this.elements = dVarArr;
        }

        private final Object readResolve() {
            d[] dVarArr = this.elements;
            d dVar = EmptyCoroutineContext.INSTANCE;
            for (d dVar2 : dVarArr) {
                dVar = dVar.plus(dVar2);
            }
            return dVar;
        }

        public final d[] getElements() {
            return this.elements;
        }
    }

    public CombinedContext(d dVar, d.b bVar) {
        ckf.g(dVar, "left");
        ckf.g(bVar, "element");
        this.left = dVar;
        this.element = bVar;
    }

    private final boolean contains(d.b bVar) {
        return ckf.b(get(bVar.getKey()), bVar);
    }

    private final boolean containsAll(CombinedContext combinedContext) {
        while (contains(combinedContext.element)) {
            d dVar = combinedContext.left;
            if (dVar instanceof CombinedContext) {
                combinedContext = (CombinedContext) dVar;
            } else {
                ckf.e(dVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return contains((d.b) dVar);
            }
        }
        return false;
    }

    private final int size() {
        int i = 2;
        CombinedContext combinedContext = this;
        while (true) {
            d dVar = combinedContext.left;
            if (dVar instanceof CombinedContext) {
                combinedContext = (CombinedContext) dVar;
            } else {
                combinedContext = null;
            }
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toString$lambda$2(String str, d.b bVar) {
        ckf.g(str, "acc");
        ckf.g(bVar, "element");
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + ", " + bVar;
    }

    private final Object writeReplace() {
        int size = size();
        final d[] dVarArr = new d[size];
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        fold(xhv.INSTANCE, new u1a() { // from class: tb.k24
            @Override // tb.u1a
            public final Object invoke(Object obj, Object obj2) {
                xhv writeReplace$lambda$3;
                writeReplace$lambda$3 = CombinedContext.writeReplace$lambda$3(dVarArr, ref$IntRef, (xhv) obj, (d.b) obj2);
                return writeReplace$lambda$3;
            }
        });
        if (ref$IntRef.element == size) {
            return new Serialized(dVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv writeReplace$lambda$3(d[] dVarArr, Ref$IntRef ref$IntRef, xhv xhvVar, d.b bVar) {
        ckf.g(xhvVar, "<unused var>");
        ckf.g(bVar, "element");
        int i = ref$IntRef.element;
        ref$IntRef.element = i + 1;
        dVarArr[i] = bVar;
        return xhv.INSTANCE;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CombinedContext) {
                CombinedContext combinedContext = (CombinedContext) obj;
                if (combinedContext.size() != size() || !combinedContext.containsAll(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r, u1a<? super R, ? super d.b, ? extends R> u1aVar) {
        ckf.g(u1aVar, "operation");
        return (R) u1aVar.invoke((Object) this.left.fold(r, u1aVar), this.element);
    }

    @Override // kotlin.coroutines.d
    public <E extends d.b> E get(d.c<E> cVar) {
        ckf.g(cVar, "key");
        CombinedContext combinedContext = this;
        while (true) {
            E e = (E) combinedContext.element.get(cVar);
            if (e != null) {
                return e;
            }
            d dVar = combinedContext.left;
            if (!(dVar instanceof CombinedContext)) {
                return (E) dVar.get(cVar);
            }
            combinedContext = (CombinedContext) dVar;
        }
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    @Override // kotlin.coroutines.d
    public d minusKey(d.c<?> cVar) {
        ckf.g(cVar, "key");
        if (this.element.get(cVar) != null) {
            return this.left;
        }
        d minusKey = this.left.minusKey(cVar);
        if (minusKey == this.left) {
            return this;
        }
        if (minusKey == EmptyCoroutineContext.INSTANCE) {
            return this.element;
        }
        return new CombinedContext(minusKey, this.element);
    }

    @Override // kotlin.coroutines.d
    public d plus(d dVar) {
        return d.a.b(this, dVar);
    }

    public String toString() {
        return "[" + ((String) fold("", new u1a() { // from class: tb.l24
            @Override // tb.u1a
            public final Object invoke(Object obj, Object obj2) {
                String string$lambda$2;
                string$lambda$2 = CombinedContext.toString$lambda$2((String) obj, (d.b) obj2);
                return string$lambda$2;
            }
        })) + ']';
    }
}
