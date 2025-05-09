package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.atools.StaticHook;
import java.lang.reflect.Field;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class p9n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f25965a = false;
    public static char[] b;
    public static int c;
    public static Field d;

    static {
        t2o.a(962593002);
    }

    public static char[] a(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("3c16b5d", new Object[]{sb});
        }
        char[] b2 = b(sb);
        if (b2 == null) {
            return null;
        }
        int length = sb.length();
        for (int i = 0; i < length; i++) {
            b2[i] = (char) (b2[i] ^ b[i % c]);
        }
        return b2;
    }

    public static synchronized void c() {
        synchronized (p9n.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f935005f", new Object[0]);
            } else if (!f25965a) {
                char[] charArray = "QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK".toCharArray();
                b = charArray;
                c = charArray.length;
                f25965a = true;
            }
        }
    }

    public static char[] d(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (char[]) ipChange.ipc$dispatch("fef7b2f2", new Object[]{sb});
        }
        if (sb == null) {
            return null;
        }
        c();
        return a(sb);
    }

    public static char[] b(StringBuilder sb) {
        if (sb == null) {
            return null;
        }
        try {
            if (d == null) {
                Field i = StaticHook.i(sb.getClass().getSuperclass(), "value");
                d = i;
                i.setAccessible(true);
            }
            return (char[]) d.get(sb);
        } catch (Exception unused) {
            ds3.c();
            return null;
        }
    }
}
