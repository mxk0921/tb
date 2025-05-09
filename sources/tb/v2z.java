package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class v2z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598737512);
    }

    public static /* synthetic */ long b(int i, int i2, int i3, int i4, int i5, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60a9c559", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), obj})).longValue();
        }
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return a(i, i2, i3, i4);
    }

    public static final int c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e0dbebf", new Object[]{new Integer(i), new Integer(i2)})).intValue();
        }
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        return hfn.c(i + i2, 0);
    }

    public static final long d(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5574cecf", new Object[]{new Long(j), new Long(j2)})).longValue();
        }
        return a(hfn.h(u2z.n(j2), u2z.n(j), u2z.l(j)), hfn.h(u2z.l(j2), u2z.n(j), u2z.l(j)), hfn.h(u2z.m(j2), u2z.m(j), u2z.k(j)), hfn.h(u2z.k(j2), u2z.m(j), u2z.k(j)));
    }

    public static final int e(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d628991", new Object[]{new Long(j), new Integer(i)})).intValue();
        }
        return hfn.h(i, u2z.m(j), u2z.k(j));
    }

    public static final int f(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d4faece2", new Object[]{new Long(j), new Integer(i)})).intValue();
        }
        return hfn.h(i, u2z.n(j), u2z.l(j));
    }

    public static final long g(long j, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a8269da", new Object[]{new Long(j), new Integer(i), new Integer(i2)})).longValue();
        }
        return a(hfn.c(u2z.n(j) + i, 0), c(u2z.l(j), i), hfn.c(u2z.m(j) + i2, 0), c(u2z.k(j), i2));
    }

    public static final Pair<Integer, Integer> h(long j) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("6fe9b3ff", new Object[]{new Long(j)});
        }
        if (u2z.n(j) == u2z.l(j)) {
            i = View.MeasureSpec.makeMeasureSpec(u2z.n(j), 1073741824);
        } else if (u2z.l(j) < Integer.MAX_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(u2z.l(j), Integer.MIN_VALUE);
        } else {
            i = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        if (u2z.m(j) == u2z.k(j)) {
            i2 = View.MeasureSpec.makeMeasureSpec(u2z.m(j), 1073741824);
        } else if (u2z.k(j) < Integer.MAX_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(u2z.k(j), Integer.MIN_VALUE);
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static final long a(int i, int i2, int i3, int i4) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9580e9d1", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).longValue();
        }
        if (i2 >= i) {
            if (i4 >= i3) {
                if (i < 0 || i3 < 0) {
                    z = false;
                }
                if (z) {
                    return u2z.Companion.c(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
    }
}
