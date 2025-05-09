package kotlinx.coroutines.selects;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.Volatile;
import kotlinx.coroutines.c;
import tb.ar4;
import tb.c9p;
import tb.ckf;
import tb.d9p;
import tb.dkf;
import tb.dv6;
import tb.f9p;
import tb.g1a;
import tb.g23;
import tb.h30;
import tb.i04;
import tb.jv6;
import tb.k9p;
import tb.l9p;
import tb.q23;
import tb.rr7;
import tb.u1a;
import tb.u1r;
import tb.v8p;
import tb.w1a;
import tb.xhv;
import tb.xz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class SelectImplementation<R> extends g23 implements c9p<R>, l9p<R> {
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, TplMsg.VALUE_T_NATIVE_RETURN);

    /* renamed from: a  reason: collision with root package name */
    public final d f15391a;
    @Volatile
    public volatile Object b;
    public Object d;
    public Object f;
    public List<SelectImplementation<R>.a> c = new ArrayList(2);
    public int e = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f15392a;
        public final w1a<Object, k9p<?>, Object, xhv> b;
        public final w1a<Object, Object, Object, Object> c;
        public final Object d;
        public final Object e;
        public final w1a<k9p<?>, Object, Object, g1a<Throwable, xhv>> f;
        public Object g;
        public int h = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, w1a<Object, ? super k9p<?>, Object, xhv> w1aVar, w1a<Object, Object, Object, ? extends Object> w1aVar2, Object obj2, Object obj3, w1a<? super k9p<?>, Object, Object, ? extends g1a<? super Throwable, xhv>> w1aVar3) {
            this.f15392a = obj;
            this.b = w1aVar;
            this.c = w1aVar2;
            this.d = obj2;
            this.e = obj3;
            this.f = w1aVar3;
        }

        public final g1a<Throwable, xhv> a(k9p<?> k9pVar, Object obj) {
            w1a<k9p<?>, Object, Object, g1a<Throwable, xhv>> w1aVar = this.f;
            if (w1aVar != null) {
                return w1aVar.invoke(k9pVar, this.d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.g;
            rr7 rr7Var = null;
            if (obj instanceof v8p) {
                ((v8p) obj).o(this.h, null, SelectImplementation.this.getContext());
                return;
            }
            if (obj instanceof rr7) {
                rr7Var = (rr7) obj;
            }
            if (rr7Var != null) {
                rr7Var.dispose();
            }
        }

        public final Object c(Object obj, ar4<? super R> ar4Var) {
            Object obj2 = this.d;
            u1r i = SelectKt.i();
            Object obj3 = this.e;
            if (obj2 == i) {
                ckf.e(obj3, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((g1a) obj3).invoke(ar4Var);
            }
            ckf.e(obj3, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((u1a) obj3).invoke(obj, ar4Var);
        }

        public final Object d(Object obj) {
            return this.c.invoke(this.f15392a, this.d, obj);
        }

        public final boolean e(SelectImplementation<R> selectImplementation) {
            u1r u1rVar;
            String str = dv6.DEBUG_PROPERTY_NAME;
            this.b.invoke(this.f15392a, selectImplementation, this.d);
            Object obj = selectImplementation.f;
            u1rVar = SelectKt.e;
            if (obj == u1rVar) {
                return true;
            }
            return false;
        }
    }

    public SelectImplementation(d dVar) {
        u1r u1rVar;
        u1r u1rVar2;
        this.f15391a = dVar;
        u1rVar = SelectKt.b;
        this.b = u1rVar;
        u1rVar2 = SelectKt.e;
        this.f = u1rVar2;
    }

    public static /* synthetic */ <R> Object p(SelectImplementation<R> selectImplementation, ar4<? super R> ar4Var) {
        if (selectImplementation.t()) {
            return selectImplementation.n(ar4Var);
        }
        return selectImplementation.q(ar4Var);
    }

    public static /* synthetic */ void w(SelectImplementation selectImplementation, a aVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            selectImplementation.v(aVar, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
    }

    public final Object A(ar4<? super xhv> ar4Var) {
        u1r u1rVar;
        u1r u1rVar2;
        c cVar = new c(IntrinsicsKt__IntrinsicsJvmKt.c(ar4Var), 1);
        cVar.E();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            u1rVar = SelectKt.b;
            if (obj == u1rVar) {
                if (h30.a(g, this, obj, cVar)) {
                    cVar.h(this);
                    break;
                }
            } else if (obj instanceof List) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g;
                u1rVar2 = SelectKt.b;
                if (h30.a(atomicReferenceFieldUpdater2, this, obj, u1rVar2)) {
                    for (Object obj2 : (Iterable) obj) {
                        x(obj2);
                    }
                }
            } else if (obj instanceof a) {
                cVar.l(xhv.INSTANCE, ((a) obj).a(this, this.f));
            } else {
                throw new IllegalStateException(("unexpected state: " + obj).toString());
            }
        }
        Object A = cVar.A();
        if (A == dkf.d()) {
            jv6.c(ar4Var);
        }
        if (A == dkf.d()) {
            return A;
        }
        return xhv.INSTANCE;
    }

    @Override // tb.c9p
    public void a(d9p d9pVar, g1a<? super ar4<? super R>, ? extends Object> g1aVar) {
        w(this, new a(d9pVar.c(), d9pVar.b(), d9pVar.d(), SelectKt.i(), g1aVar, d9pVar.a()), false, 1, null);
    }

    @Override // tb.k9p
    public void b(Object obj) {
        this.f = obj;
    }

    @Override // tb.qww
    public void c(v8p<?> v8pVar, int i) {
        this.d = v8pVar;
        this.e = i;
    }

    @Override // tb.k9p
    public void d(rr7 rr7Var) {
        this.d = rr7Var;
    }

    @Override // tb.k9p
    public boolean e(Object obj, Object obj2) {
        if (z(obj, obj2) == 0) {
            return true;
        }
        return false;
    }

    @Override // tb.h23
    public void f(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        u1r u1rVar;
        u1r u1rVar2;
        u1r u1rVar3;
        do {
            atomicReferenceFieldUpdater = g;
            obj = atomicReferenceFieldUpdater.get(this);
            u1rVar = SelectKt.c;
            if (obj != u1rVar) {
                u1rVar2 = SelectKt.d;
            } else {
                return;
            }
        } while (!h30.a(atomicReferenceFieldUpdater, this, obj, u1rVar2));
        List<SelectImplementation<R>.a> list = this.c;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((a) it.next()).b();
            }
            u1rVar3 = SelectKt.e;
            this.f = u1rVar3;
            this.c = null;
        }
    }

    @Override // tb.k9p
    public d getContext() {
        return this.f15391a;
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(Throwable th) {
        f(th);
        return xhv.INSTANCE;
    }

    public final void l(Object obj) {
        List<SelectImplementation<R>.a> list = this.c;
        ckf.d(list);
        List<SelectImplementation<R>.a> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).f15392a == obj) {
                    throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                }
            }
        }
    }

    public final void m(SelectImplementation<R>.a aVar) {
        u1r u1rVar;
        u1r u1rVar2;
        String str = dv6.DEBUG_PROPERTY_NAME;
        List<SelectImplementation<R>.a> list = this.c;
        if (list != null) {
            for (SelectImplementation<R>.a aVar2 : list) {
                if (aVar2 != aVar) {
                    aVar2.b();
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            u1rVar = SelectKt.c;
            atomicReferenceFieldUpdater.set(this, u1rVar);
            u1rVar2 = SelectKt.e;
            this.f = u1rVar2;
            this.c = null;
        }
    }

    public final Object n(ar4<? super R> ar4Var) {
        String str = dv6.DEBUG_PROPERTY_NAME;
        Object obj = g.get(this);
        ckf.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        SelectImplementation<R>.a aVar = (a) obj;
        Object obj2 = this.f;
        m(aVar);
        if (!dv6.c()) {
            return aVar.c(aVar.d(obj2), ar4Var);
        }
        return u(aVar, obj2, ar4Var);
    }

    public Object o(ar4<? super R> ar4Var) {
        return p(this, ar4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[PHI: r6 
      PHI: (r6v2 java.lang.Object) = (r6v4 java.lang.Object), (r6v1 java.lang.Object) binds: [B:21:0x0054, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(tb.ar4<? super R> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = (kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$doSelectSuspend$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.b.b(r6)
            goto L_0x0057
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.selects.SelectImplementation r2 = (kotlinx.coroutines.selects.SelectImplementation) r2
            kotlin.b.b(r6)
            goto L_0x004b
        L_0x003c:
            kotlin.b.b(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.A(r0)
            if (r6 != r1) goto L_0x004a
            return r1
        L_0x004a:
            r2 = r5
        L_0x004b:
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r6 = r2.n(r0)
            if (r6 != r1) goto L_0x0057
            return r1
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.q(tb.ar4):java.lang.Object");
    }

    public final SelectImplementation<R>.a r(Object obj) {
        List<SelectImplementation<R>.a> list = this.c;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).f15392a == obj) {
                obj2 = next;
                break;
            }
        }
        SelectImplementation<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public <Q> void s(f9p<? extends Q> f9pVar, u1a<? super Q, ? super ar4<? super R>, ? extends Object> u1aVar) {
        w(this, new a(f9pVar.c(), f9pVar.b(), f9pVar.d(), null, u1aVar, f9pVar.a()), false, 1, null);
    }

    public final boolean t() {
        return g.get(this) instanceof a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(kotlinx.coroutines.selects.SelectImplementation<R>.a r5, java.lang.Object r6, tb.ar4<? super R> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r0 = (kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 r0 = new kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = tb.dkf.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.b.b(r7)     // Catch: all -> 0x0029
            goto L_0x0043
        L_0x0029:
            r5 = move-exception
            goto L_0x0044
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            kotlin.b.b(r7)
            java.lang.Object r6 = r5.d(r6)     // Catch: all -> 0x0029
            r0.label = r3     // Catch: all -> 0x0029
            java.lang.Object r7 = r5.c(r6, r0)     // Catch: all -> 0x0029
            if (r7 != r1) goto L_0x0043
            return r1
        L_0x0043:
            return r7
        L_0x0044:
            boolean r6 = tb.dv6.c()
            if (r6 == 0) goto L_0x004f
            java.lang.Throwable r5 = tb.rgq.a(r5, r0)
            throw r5
        L_0x004f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.SelectImplementation.u(kotlinx.coroutines.selects.SelectImplementation$a, java.lang.Object, tb.ar4):java.lang.Object");
    }

    public final void v(SelectImplementation<R>.a aVar, boolean z) {
        String str = dv6.DEBUG_PROPERTY_NAME;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        if (!(atomicReferenceFieldUpdater.get(this) instanceof a)) {
            if (!z) {
                l(aVar.f15392a);
            }
            if (aVar.e(this)) {
                if (!z) {
                    List<SelectImplementation<R>.a> list = this.c;
                    ckf.d(list);
                    list.add(aVar);
                }
                aVar.g = this.d;
                aVar.h = this.e;
                this.d = null;
                this.e = -1;
                return;
            }
            atomicReferenceFieldUpdater.set(this, aVar);
        }
    }

    public final void x(Object obj) {
        SelectImplementation<R>.a r = r(obj);
        ckf.d(r);
        r.g = null;
        r.h = -1;
        v(r, true);
    }

    public final TrySelectDetailedResult y(Object obj, Object obj2) {
        TrySelectDetailedResult a2;
        a2 = SelectKt.a(z(obj, obj2));
        return a2;
    }

    public final int z(Object obj, Object obj2) {
        boolean j;
        u1r u1rVar;
        boolean z;
        u1r u1rVar2;
        u1r u1rVar3;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof q23) {
                SelectImplementation<R>.a r = r(obj);
                if (r == null) {
                    continue;
                } else {
                    g1a<Throwable, xhv> a2 = r.a(this, obj2);
                    if (h30.a(atomicReferenceFieldUpdater, this, obj3, r)) {
                        this.f = obj2;
                        j = SelectKt.j((q23) obj3, a2);
                        if (j) {
                            return 0;
                        }
                        this.f = null;
                        return 2;
                    }
                }
            } else {
                u1rVar = SelectKt.c;
                if (ckf.b(obj3, u1rVar)) {
                    z = true;
                } else {
                    z = obj3 instanceof a;
                }
                if (z) {
                    return 3;
                }
                u1rVar2 = SelectKt.d;
                if (ckf.b(obj3, u1rVar2)) {
                    return 2;
                }
                u1rVar3 = SelectKt.b;
                if (ckf.b(obj3, u1rVar3)) {
                    if (h30.a(atomicReferenceFieldUpdater, this, obj3, xz3.e(obj))) {
                        return 1;
                    }
                } else if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                } else if (h30.a(atomicReferenceFieldUpdater, this, obj3, i04.p0((Collection) obj3, obj))) {
                    return 1;
                }
            }
        }
    }
}
