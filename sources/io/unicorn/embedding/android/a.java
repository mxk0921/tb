package io.unicorn.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class a {
    public static a c;

    /* renamed from: a  reason: collision with root package name */
    public final LongSparseArray<MotionEvent> f15190a = new LongSparseArray<>();
    public final PriorityQueue<Long> b = new PriorityQueue<>();

    /* compiled from: Taobao */
    /* renamed from: io.unicorn.embedding.android.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class C0856a {
        public static final AtomicLong b = new AtomicLong(0);

        /* renamed from: a  reason: collision with root package name */
        public final long f15191a;

        static {
            t2o.a(945815635);
        }

        public C0856a(long j) {
            this.f15191a = j;
        }

        public static C0856a b() {
            return c(b.incrementAndGet());
        }

        public static C0856a c(long j) {
            return new C0856a(j);
        }

        public long d() {
            return this.f15191a;
        }
    }

    static {
        t2o.a(945815634);
    }

    public static a a() {
        if (c == null) {
            c = new a();
        }
        return c;
    }

    public MotionEvent b(C0856a aVar) {
        PriorityQueue<Long> priorityQueue;
        LongSparseArray<MotionEvent> longSparseArray;
        while (true) {
            priorityQueue = this.b;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = this.f15190a;
            if (isEmpty || priorityQueue.peek().longValue() >= aVar.f15191a) {
                break;
            }
            longSparseArray.remove(priorityQueue.poll().longValue());
        }
        if (!priorityQueue.isEmpty() && priorityQueue.peek().longValue() == aVar.f15191a) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = longSparseArray.get(aVar.f15191a);
        longSparseArray.remove(aVar.f15191a);
        return motionEvent;
    }

    public C0856a c(MotionEvent motionEvent) {
        C0856a b = C0856a.b();
        this.f15190a.put(b.f15191a, MotionEvent.obtain(motionEvent));
        this.b.add(Long.valueOf(b.f15191a));
        return b;
    }
}
