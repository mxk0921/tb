package kotlinx.coroutines.channels;

import kotlin.jvm.JvmInline;
import tb.a07;
import tb.ckf;

/* compiled from: Taobao */
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class e<T> {
    public static final b Companion = new b(null);
    public static final c b = new c();

    /* renamed from: a  reason: collision with root package name */
    public final Object f15257a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f15258a;

        public a(Throwable th) {
            this.f15258a = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                if (ckf.b(this.f15258a, ((a) obj).f15258a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Throwable th = this.f15258a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.e.c
        public String toString() {
            return "Closed(" + this.f15258a + ')';
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class b {
        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public final <E> Object a(Throwable th) {
            return new a(th);
        }

        public b() {
        }

        public final <E> Object b(E e) {
            return e;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ e(Object obj) {
        this.f15257a = obj;
    }

    public static final /* synthetic */ e a(Object obj) {
        return new e(obj);
    }

    public static boolean b(Object obj, Object obj2) {
        if ((obj2 instanceof e) && ckf.b(obj, ((e) obj2).j())) {
            return true;
        }
        return false;
    }

    public static final Throwable c(Object obj) {
        a aVar;
        if (obj instanceof a) {
            aVar = (a) obj;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar.f15258a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T d(Object obj) {
        if (!(obj instanceof c)) {
            return obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T e(Object obj) {
        Throwable th;
        if (!(obj instanceof c)) {
            return obj;
        }
        if (!(obj instanceof a) || (th = ((a) obj).f15258a) == null) {
            throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
        }
        throw th;
    }

    public static int f(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean g(Object obj) {
        return obj instanceof a;
    }

    public static final boolean h(Object obj) {
        return !(obj instanceof c);
    }

    public static String i(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return b(this.f15257a, obj);
    }

    public int hashCode() {
        return f(this.f15257a);
    }

    public final /* synthetic */ Object j() {
        return this.f15257a;
    }

    public String toString() {
        return i(this.f15257a);
    }
}
