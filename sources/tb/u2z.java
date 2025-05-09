package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.JvmInline;

/* compiled from: Taobao */
@JvmInline
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class u2z {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int Infinity = Integer.MAX_VALUE;

    /* renamed from: a  reason: collision with root package name */
    public final long f29099a;
    public static final a Companion = new a(null);
    public static final int[] b = {18, 20, 17, 15};
    public static final int[] c = {65535, 262143, 32767, 8191};
    public static final int[] d = {32767, 8191, 65535, 262143};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737511);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cf9aa601", new Object[]{this, new Integer(i)})).intValue();
            }
            if (i < 8191) {
                return 13;
            }
            if (i < 32767) {
                return 15;
            }
            if (i < 65535) {
                return 16;
            }
            if (i < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i + " in Constraints");
        }

        public final long b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7e67ac6a", new Object[]{this, new Integer(i)})).longValue();
            }
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return f(0, size);
            }
            if (mode == 0) {
                return f(0, Integer.MAX_VALUE);
            }
            if (mode == 1073741824) {
                return f(size, size);
            }
            throw new IllegalStateException();
        }

        public final long c(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            long j;
            int i7;
            int i8 = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("410fae5c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).longValue();
            }
            if (i4 == Integer.MAX_VALUE) {
                i5 = i3;
            } else {
                i5 = i4;
            }
            int a2 = a(i5);
            if (i2 == Integer.MAX_VALUE) {
                i6 = i;
            } else {
                i6 = i2;
            }
            int a3 = a(i6);
            if (a2 + a3 <= 31) {
                if (a3 == 13) {
                    j = 3;
                } else if (a3 == 18) {
                    j = 1;
                } else if (a3 == 15) {
                    j = 2;
                } else if (a3 == 16) {
                    j = 0;
                } else {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                if (i2 == Integer.MAX_VALUE) {
                    i7 = 0;
                } else {
                    i7 = i2 + 1;
                }
                if (i4 != Integer.MAX_VALUE) {
                    i8 = i4 + 1;
                }
                int i9 = u2z.a()[(int) j];
                return u2z.c((i7 << 33) | (i << 2) | j | (i3 << i9) | (i8 << (31 + i9)));
            }
            throw new IllegalArgumentException("Can't represent a width of " + i6 + " and height of " + i5 + " in Constraints");
        }

        public final long d(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("76dd0be7", new Object[]{this, new Integer(i), new Integer(i2)})).longValue();
            }
            long b = b(i);
            long b2 = b(i2);
            return v2z.a((int) (b >>> 32), (int) (b & tiv.INT_MASK), (int) (b2 >>> 32), (int) (tiv.INT_MASK & b2));
        }

        public final long f(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c076864d", new Object[]{this, new Integer(i), new Integer(i2)})).longValue();
            }
            return i2 | (i << 32);
        }

        public a() {
        }

        public final long e(int i, int i2) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3dab6208", new Object[]{this, new Integer(i), new Integer(i2)})).longValue();
            }
            if (i < 0 || i2 < 0) {
                z = false;
            }
            if (z) {
                return c(i, i, i2, i2);
            }
            throw new IllegalArgumentException(("width(" + i + ") and height(" + i2 + ") must be >= 0").toString());
        }
    }

    static {
        t2o.a(598737510);
    }

    public /* synthetic */ u2z(long j) {
        this.f29099a = j;
    }

    public static final /* synthetic */ int[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("9da51169", new Object[0]);
        }
        return b;
    }

    public static final /* synthetic */ u2z b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u2z) ipChange.ipc$dispatch("856dbc26", new Object[]{new Long(j)});
        }
        return new u2z(j);
    }

    public static long c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7c3fede", new Object[]{new Long(j)})).longValue();
        }
        return j;
    }

    public static /* synthetic */ long e(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e7ad5aa", new Object[]{new Long(j), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), obj})).longValue();
        }
        if ((i5 & 1) != 0) {
            i = n(j);
        }
        if ((i5 & 2) != 0) {
            i2 = l(j);
        }
        if ((i5 & 4) != 0) {
            i3 = m(j);
        }
        if ((i5 & 8) != 0) {
            i4 = k(j);
        }
        return d(j, i, i2, i3, i4);
    }

    public static boolean f(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d581c68f", new Object[]{new Long(j), obj})).booleanValue();
        }
        if ((obj instanceof u2z) && j == ((u2z) obj).q()) {
            return true;
        }
        return false;
    }

    public static final boolean g(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1700584d", new Object[]{new Long(j), new Long(j2)})).booleanValue();
        }
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final int h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e38cf633", new Object[]{new Long(j)})).intValue();
        }
        return (int) (j & 3);
    }

    public static final boolean i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81b53094", new Object[]{new Long(j)})).booleanValue();
        }
        int h = h(j);
        if ((((int) (j >> (b[h] + 31))) & d[h]) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d933de1", new Object[]{new Long(j)})).booleanValue();
        }
        if ((((int) (j >> 33)) & c[h(j)]) != 0) {
            return true;
        }
        return false;
    }

    public static final int k(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("27306218", new Object[]{new Long(j)})).intValue();
        }
        int h = h(j);
        int i = ((int) (j >> (b[h] + 31))) & d[h];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    public static final int l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3fd1059b", new Object[]{new Long(j)})).intValue();
        }
        int i = ((int) (j >> 33)) & c[h(j)];
        if (i == 0) {
            return Integer.MAX_VALUE;
        }
        return i - 1;
    }

    public static final int m(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("251cc706", new Object[]{new Long(j)})).intValue();
        }
        int h = h(j);
        return ((int) (j >> b[h])) & d[h];
    }

    public static final int n(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f56d4aed", new Object[]{new Long(j)})).intValue();
        }
        return ((int) (j >> 2)) & c[h(j)];
    }

    public static int o(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6440ddbe", new Object[]{new Long(j)})).intValue();
        }
        return en9.a(j);
    }

    public static String p(long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df7ff544", new Object[]{new Long(j)});
        }
        int l = l(j);
        String str2 = pg1.ATOM_EXT_Infinity;
        if (l == Integer.MAX_VALUE) {
            str = str2;
        } else {
            str = String.valueOf(l);
        }
        int k = k(j);
        if (k != Integer.MAX_VALUE) {
            str2 = String.valueOf(k);
        }
        return "Constraints(minWidth = " + n(j) + ", maxWidth = " + str + ", minHeight = " + m(j) + ", maxHeight = " + str2 + ')';
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        return f(q(), obj);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return o(q());
    }

    public final /* synthetic */ long q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0d22176", new Object[]{this})).longValue();
        }
        return this.f29099a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return p(q());
    }

    public static final long d(long j, int i, int i2, int i3, int i4) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fdf01ba", new Object[]{new Long(j), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).longValue();
        }
        if (i3 >= 0 && i >= 0) {
            if (i2 >= i || i2 == Integer.MAX_VALUE) {
                if (i4 < i3 && i4 != Integer.MAX_VALUE) {
                    z = false;
                }
                if (z) {
                    return Companion.c(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= minHeight(" + i3 + ')').toString());
            }
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= minWidth(" + i + ')').toString());
        }
        throw new IllegalArgumentException(("minHeight(" + i3 + ") and minWidth(" + i + ") must be >= 0").toString());
    }
}
