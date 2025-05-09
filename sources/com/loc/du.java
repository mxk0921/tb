package com.loc;

import android.os.SystemClock;
import android.util.LongSparseArray;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class du {
    private static volatile du g;
    private static Object h = new Object();
    private Object e = new Object();
    private Object f = new Object();

    /* renamed from: a  reason: collision with root package name */
    private LongSparseArray<a> f5655a = new LongSparseArray<>();
    private LongSparseArray<a> b = new LongSparseArray<>();
    private LongSparseArray<a> c = new LongSparseArray<>();
    private LongSparseArray<a> d = new LongSparseArray<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f5656a;
        long b;
        boolean c;

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    private du() {
    }

    public static du a() {
        if (g == null) {
            synchronized (h) {
                try {
                    if (g == null) {
                        g = new du();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    private static long b() {
        return SystemClock.elapsedRealtime();
    }

    public final short a(long j) {
        return a(this.f5655a, j);
    }

    public final short b(long j) {
        return a(this.c, j);
    }

    private static short a(LongSparseArray<a> longSparseArray, long j) {
        synchronized (longSparseArray) {
            try {
                a aVar = longSparseArray.get(j);
                if (aVar == null) {
                    return (short) 0;
                }
                short max = (short) Math.max(1L, Math.min(32767L, (b() - aVar.b) / 1000));
                if (!aVar.c) {
                    max = (short) (-max);
                }
                return max;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(List<dt> list) {
        if (!list.isEmpty()) {
            synchronized (this.f) {
                a(list, this.c, this.d);
                LongSparseArray<a> longSparseArray = this.c;
                this.c = this.d;
                this.d = longSparseArray;
                longSparseArray.clear();
            }
        }
    }

    public final void a(List<dt> list) {
        if (!list.isEmpty()) {
            synchronized (this.e) {
                a(list, this.f5655a, this.b);
                LongSparseArray<a> longSparseArray = this.f5655a;
                this.f5655a = this.b;
                this.b = longSparseArray;
                longSparseArray.clear();
            }
        }
    }

    private static void a(List<dt> list, LongSparseArray<a> longSparseArray, LongSparseArray<a> longSparseArray2) {
        long b = b();
        int size = longSparseArray.size();
        Iterator<dt> it = list.iterator();
        if (size == 0) {
            while (it.hasNext()) {
                dt next = it.next();
                a aVar = new a((byte) 0);
                aVar.f5656a = next.b();
                aVar.b = b;
                aVar.c = false;
                longSparseArray2.put(next.a(), aVar);
            }
            return;
        }
        while (it.hasNext()) {
            dt next2 = it.next();
            long a2 = next2.a();
            a aVar2 = longSparseArray.get(a2);
            if (aVar2 == null) {
                aVar2 = new a((byte) 0);
            } else if (aVar2.f5656a == next2.b()) {
                longSparseArray2.put(a2, aVar2);
            }
            aVar2.f5656a = next2.b();
            aVar2.b = b;
            aVar2.c = true;
            longSparseArray2.put(a2, aVar2);
        }
    }
}
