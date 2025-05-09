package tb;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class qb7 implements sbp<aef> {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f26647a;
    public final int b;
    public final int c;
    public final u1a<CharSequence, Integer, Pair<Integer, Integer>> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a implements Iterator<aef>, rzf {

        /* renamed from: a  reason: collision with root package name */
        public int f26648a = -1;
        public int b;
        public int c;
        public aef d;
        public int e;

        public a() {
            int h = hfn.h(qb7.this.b, 0, qb7.this.f26647a.length());
            this.b = h;
            this.c = h;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
            if (r2 < r0.c) goto L_0x0021;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.c
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r7.f26648a = r1
                r0 = 0
                r7.d = r0
                goto L_0x0092
            L_0x000c:
                tb.qb7 r0 = tb.qb7.this
                int r2 = tb.qb7.c(r0)
                r3 = -1
                r4 = 1
                if (r2 <= 0) goto L_0x0021
                int r2 = r7.e
                int r2 = r2 + r4
                r7.e = r2
                int r5 = tb.qb7.c(r0)
                if (r2 >= r5) goto L_0x002d
            L_0x0021:
                int r2 = r7.c
                java.lang.CharSequence r5 = tb.qb7.b(r0)
                int r5 = r5.length()
                if (r2 <= r5) goto L_0x0041
            L_0x002d:
                tb.aef r1 = new tb.aef
                int r2 = r7.b
                java.lang.CharSequence r0 = tb.qb7.b(r0)
                int r0 = tb.wsq.S(r0)
                r1.<init>(r2, r0)
                r7.d = r1
                r7.c = r3
                goto L_0x0090
            L_0x0041:
                tb.u1a r2 = tb.qb7.a(r0)
                java.lang.CharSequence r5 = tb.qb7.b(r0)
                int r6 = r7.c
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r2 = r2.invoke(r5, r6)
                kotlin.Pair r2 = (kotlin.Pair) r2
                if (r2 != 0) goto L_0x006b
                tb.aef r1 = new tb.aef
                int r2 = r7.b
                java.lang.CharSequence r0 = tb.qb7.b(r0)
                int r0 = tb.wsq.S(r0)
                r1.<init>(r2, r0)
                r7.d = r1
                r7.c = r3
                goto L_0x0090
            L_0x006b:
                java.lang.Object r0 = r2.component1()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                java.lang.Object r2 = r2.component2()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                int r3 = r7.b
                tb.aef r3 = tb.hfn.n(r3, r0)
                r7.d = r3
                int r0 = r0 + r2
                r7.b = r0
                if (r2 != 0) goto L_0x008d
                r1 = 1
            L_0x008d:
                int r0 = r0 + r1
                r7.c = r0
            L_0x0090:
                r7.f26648a = r4
            L_0x0092:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.qb7.a.a():void");
        }

        /* renamed from: c */
        public aef next() {
            if (this.f26648a == -1) {
                a();
            }
            if (this.f26648a != 0) {
                aef aefVar = this.d;
                ckf.e(aefVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.d = null;
                this.f26648a = -1;
                return aefVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f26648a == -1) {
                a();
            }
            if (this.f26648a == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qb7(CharSequence charSequence, int i, int i2, u1a<? super CharSequence, ? super Integer, Pair<Integer, Integer>> u1aVar) {
        ckf.g(charSequence, "input");
        ckf.g(u1aVar, "getNextMatch");
        this.f26647a = charSequence;
        this.b = i;
        this.c = i2;
        this.d = u1aVar;
    }

    @Override // tb.sbp
    public Iterator<aef> iterator() {
        return new a();
    }
}
