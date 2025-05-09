package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class a9y<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f15619a;
    public int b;
    public int c;
    public T[] d;

    static {
        t2o.a(628097497);
    }

    public a9y() {
        this(16, 0.75f);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    public void b() {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        T[] tArr = this.d;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = (T[]) new Object[i];
        int i3 = this.b;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                    t = tArr[length];
                } while (t == null);
                int a2 = a(t.hashCode()) & i2;
                if (tArr2[a2] != null) {
                    do {
                        a2 = (a2 + 1) & i2;
                    } while (tArr2[a2] != null);
                }
                tArr2[a2] = tArr[length];
                i3 = i4;
            } else {
                this.f15619a = i2;
                this.c = (int) (i * 0.75f);
                this.d = tArr2;
                return;
            }
        }
    }

    public boolean c(int i, T[] tArr, int i2) {
        int i3;
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("160a8611", new Object[]{this, new Integer(i), tArr, new Integer(i2)})).booleanValue();
        }
        this.b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int a2 = a(t.hashCode()) & i2;
                if (i > i3) {
                    if (i >= a2 && a2 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else if (i < a2 && a2 <= i3) {
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public boolean d(T t) {
        T t2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, t})).booleanValue();
        }
        T[] tArr = this.d;
        int i = this.f15619a;
        int a2 = a(t.hashCode()) & i;
        T t3 = tArr[a2];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                a2 = (a2 + 1) & i;
                t2 = tArr[a2];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[a2] = t;
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 >= this.c) {
            b();
        }
        return true;
    }

    public boolean e(T t) {
        T t2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f056ab89", new Object[]{this, t})).booleanValue();
        }
        T[] tArr = this.d;
        int i = this.f15619a;
        int a2 = a(t.hashCode()) & i;
        T t3 = tArr[a2];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return c(a2, tArr, i);
        }
        do {
            a2 = (a2 + 1) & i;
            t2 = tArr[a2];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return c(a2, tArr, i);
    }

    public Object[] f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("1edfb20a", new Object[]{this});
        }
        return this.d;
    }

    public a9y(int i, float f) {
        int a2 = t9y.a(i);
        this.f15619a = a2 - 1;
        this.c = (int) (f * a2);
        this.d = (T[]) new Object[a2];
    }
}
