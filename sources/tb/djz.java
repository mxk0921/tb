package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.RowColumn.LayoutOrientation;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class djz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(598737092);
    }

    public static long a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c146e6ce", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).longValue();
        }
        return b(v2z.a(i, i2, i3, i4));
    }

    public static long b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7c3fede", new Object[]{new Long(j)})).longValue();
        }
        return j;
    }

    public static long c(long j, LayoutOrientation layoutOrientation) {
        int i;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af82cdf3", new Object[]{new Long(j), layoutOrientation})).longValue();
        }
        ckf.g(layoutOrientation, "orientation");
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        if (layoutOrientation == layoutOrientation2) {
            i = u2z.n(j);
        } else {
            i = u2z.m(j);
        }
        if (layoutOrientation == layoutOrientation2) {
            i2 = u2z.l(j);
        } else {
            i2 = u2z.k(j);
        }
        if (layoutOrientation == layoutOrientation2) {
            i3 = u2z.m(j);
        } else {
            i3 = u2z.n(j);
        }
        if (layoutOrientation == layoutOrientation2) {
            i4 = u2z.k(j);
        } else {
            i4 = u2z.l(j);
        }
        return a(i, i2, i3, i4);
    }

    public static final long d(long j, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17066b78", new Object[]{new Long(j), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).longValue();
        }
        return a(i, i2, i3, i4);
    }

    public static /* synthetic */ long e(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe1d452c", new Object[]{new Long(j), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), obj})).longValue();
        }
        if ((i5 & 1) != 0) {
            i = u2z.n(j);
        }
        if ((i5 & 2) != 0) {
            i2 = u2z.l(j);
        }
        if ((i5 & 4) != 0) {
            i3 = u2z.m(j);
        }
        if ((i5 & 8) != 0) {
            i4 = u2z.k(j);
        }
        return d(j, i, i2, i3, i4);
    }

    public static final long f(long j, LayoutOrientation layoutOrientation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ad648dc", new Object[]{new Long(j), layoutOrientation})).longValue();
        }
        ckf.g(layoutOrientation, "orientation");
        if (layoutOrientation == LayoutOrientation.Horizontal) {
            return v2z.a(u2z.n(j), u2z.l(j), u2z.m(j), u2z.k(j));
        }
        return v2z.a(u2z.m(j), u2z.k(j), u2z.n(j), u2z.l(j));
    }
}
