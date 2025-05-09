package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class bpm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544377);
    }

    public static void c(boolean z, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("806ec44", new Object[]{new Boolean(z), obj});
        } else if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void d(boolean z, String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd403bf", new Object[]{new Boolean(z), str, objArr});
        } else if (!z) {
            throw new IllegalArgumentException(h(str, objArr));
        }
    }

    public static <T> T e(T t, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("370afac1", new Object[]{t, obj});
        }
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void f(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d8c546d", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException(b(i, i2, i3));
        }
    }

    public static void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("375b4464", new Object[]{new Boolean(z)});
        } else if (!z) {
            throw new IllegalStateException();
        }
    }

    public static String h(String str, Object... objArr) {
        int indexOf;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c19a5cd7", new Object[]{str, objArr});
        }
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append(valueOf.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String b(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f03a1e36", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (i < 0 || i > i3) {
            return a(i, i3, "start index");
        }
        if (i2 < 0 || i2 > i3) {
            return a(i2, i3, "end index");
        }
        return h("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static String a(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92d7b2eb", new Object[]{new Integer(i), new Integer(i2), str});
        }
        if (i < 0) {
            return h("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return h("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
