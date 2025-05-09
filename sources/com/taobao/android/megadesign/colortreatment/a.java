package com.taobao.android.megadesign.colortreatment;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.megadesign.colortreatment.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COMPONENT_BLUE = -1;
    public static final int COMPONENT_GREEN = -2;
    public static final int COMPONENT_RED = -3;
    public static final Comparator<b> d = new C0463a();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f8916a;
    public final int[] b;
    public final List<b.c> c;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.megadesign.colortreatment.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0463a implements Comparator<b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("761f715f", new Object[]{this, bVar, bVar2})).intValue();
            }
            return bVar2.g() - bVar.g();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f8917a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public b(int i, int i2) {
            this.f8917a = i;
            this.b = i2;
            c();
        }

        public final boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("eb62ecb5", new Object[]{this})).booleanValue();
            }
            if (e() > 1) {
                return true;
            }
            return false;
        }

        public final int b() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d9113e29", new Object[]{this})).intValue();
            }
            int f = f();
            a aVar = a.this;
            int[] iArr = aVar.f8916a;
            int[] iArr2 = aVar.b;
            a.e(iArr, f, this.f8917a, this.b);
            Arrays.sort(iArr, this.f8917a, this.b + 1);
            a.e(iArr, f, this.f8917a, this.b);
            int i2 = this.c / 2;
            int i3 = this.f8917a;
            while (true) {
                int i4 = this.b;
                if (i3 > i4) {
                    return this.f8917a;
                }
                i += iArr2[iArr[i3]];
                if (i >= i2) {
                    return Math.min(i4 - 1, i3);
                }
                i3++;
            }
        }

        public final void c() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ed2ab81", new Object[]{this});
                return;
            }
            a aVar = a.this;
            int[] iArr = aVar.f8916a;
            int[] iArr2 = aVar.b;
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MIN_VALUE;
            for (int i8 = this.f8917a; i8 <= this.b; i8++) {
                int i9 = iArr[i8];
                i += iArr2[i9];
                int k = a.k(i9);
                int j = a.j(i9);
                int i10 = a.i(i9);
                if (k > i5) {
                    i5 = k;
                }
                if (k < i2) {
                    i2 = k;
                }
                if (j > i6) {
                    i6 = j;
                }
                if (j < i3) {
                    i3 = j;
                }
                if (i10 > i7) {
                    i7 = i10;
                }
                if (i10 < i4) {
                    i4 = i10;
                }
            }
            this.d = i2;
            this.e = i5;
            this.f = i3;
            this.g = i6;
            this.h = i4;
            this.i = i7;
            this.c = i;
        }

        public final b.c d() {
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b.c) ipChange.ipc$dispatch("6712d101", new Object[]{this});
            }
            a aVar = a.this;
            int[] iArr = aVar.f8916a;
            int[] iArr2 = aVar.b;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.f8917a; i5 <= this.b; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i2 += i7;
                i += a.k(i6) * i7;
                i3 += a.j(i6) * i7;
                i4 += i7 * a.i(i6);
            }
            float f = i2;
            return new b.c(a.b(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
        }

        public final int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("10ee12dc", new Object[]{this})).intValue();
            }
            return (this.b + 1) - this.f8917a;
        }

        public final int f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("51c654b1", new Object[]{this})).intValue();
            }
            int i = this.e - this.d;
            int i2 = this.g - this.f;
            int i3 = this.i - this.h;
            if (i >= i2 && i >= i3) {
                return -3;
            }
            if (i2 < i || i2 < i3) {
                return -1;
            }
            return -2;
        }

        public final int g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("91a4068a", new Object[]{this})).intValue();
            }
            return ((this.e - this.d) + 1) * ((this.g - this.f) + 1) * ((this.i - this.h) + 1);
        }

        public final b h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("11c84fa4", new Object[]{this});
            }
            if (a()) {
                int b = b();
                b bVar = new b(1 + b, this.b);
                this.b = b;
                c();
                return bVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    public a(int[] iArr, int i) {
        int[] iArr2 = new int[32768];
        this.b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int g = g(iArr[i2]);
            iArr[i2] = g;
            iArr2[g] = iArr2[g] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.f8916a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 <= i) {
            this.c = new ArrayList();
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = iArr3[i7];
                this.c.add(new b.c(a(i8), iArr2[i8]));
            }
            return;
        }
        this.c = h(i);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("881cb8b5", new Object[]{new Integer(i)})).intValue();
        }
        return b(k(i), j(i), i(i));
    }

    public static int b(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3dff095", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        return Color.rgb(f(i, 5, 8), f(i2, 5, 8), f(i3, 5, 8));
    }

    public static void e(int[] iArr, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ccce38", new Object[]{iArr, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = i(i4) | (j(i4) << 10) | (k(i4) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = k(i5) | (i(i5) << 10) | (j(i5) << 5);
                i2++;
            }
        }
    }

    public static int f(int i, int i2, int i3) {
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac8f452d", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        if (i3 > i2) {
            i4 = i << (i3 - i2);
        } else {
            i4 = i >> (i2 - i3);
        }
        return i4 & ((1 << i3) - 1);
    }

    public static int g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0c7169", new Object[]{new Integer(i)})).intValue();
        }
        return f(Color.blue(i), 8, 5) | (f(Color.red(i), 8, 5) << 10) | (f(Color.green(i), 8, 5) << 5);
    }

    public static int i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1362322", new Object[]{new Integer(i)})).intValue();
        }
        return i & 31;
    }

    public static int j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4016bdf", new Object[]{new Integer(i)})).intValue();
        }
        return (i >> 5) & 31;
    }

    public static int k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1a391bd1", new Object[]{new Integer(i)})).intValue();
        }
        return (i >> 10) & 31;
    }

    public final List<b.c> c(Collection<b> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1a14e8d7", new Object[]{this, collection});
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (b bVar : collection) {
            arrayList.add(bVar.d());
        }
        return arrayList;
    }

    public List<b.c> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f050a353", new Object[]{this});
        }
        return this.c;
    }

    public final List<b.c> h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("12b78ba9", new Object[]{this, new Integer(i)});
        }
        PriorityQueue<b> priorityQueue = new PriorityQueue<>(i, d);
        priorityQueue.offer(new b(0, this.f8916a.length - 1));
        l(priorityQueue, i);
        return c(priorityQueue);
    }

    public final void l(PriorityQueue<b> priorityQueue, int i) {
        b poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64f83595", new Object[]{this, priorityQueue, new Integer(i)});
            return;
        }
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.a()) {
            priorityQueue.offer(poll.h());
            priorityQueue.offer(poll);
        }
    }
}
