package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class eko {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DING_YUE = "30";
    public static final int MAX_RECURSIVE_DEPTH = 10;
    public static final int MIN_RECURSIVE_DEPTH = 2;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18648a = false;
    public static boolean b = true;
    public static boolean c;
    public static boolean d;
    public static ArrayList<String> e;
    public static String f;
    public static int g = 10;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        e = arrayList;
        arrayList.add("30");
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c5f58a4", new Object[]{new Boolean(z)});
        } else {
            c = z;
        }
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee67eba1", new Object[0])).intValue();
        }
        if (e.contains("*")) {
            return 2;
        }
        if (TextUtils.isEmpty(f)) {
            return 10;
        }
        return g;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ea2687e", new Object[0])).booleanValue();
        }
        return c;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87a294c4", new Object[0])).booleanValue();
        }
        return b;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c413f561", new Object[0])).booleanValue();
        }
        return f18648a;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b395441", new Object[0])).booleanValue();
        }
        return false;
    }

    public static void g(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aaded26", new Object[]{arrayList});
        } else if (arrayList != null && arrayList.size() > 0) {
            e = arrayList;
        }
    }

    public static void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270b0ec8", new Object[]{new Boolean(z)});
        }
    }

    public static void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("559f8dcd", new Object[]{new Boolean(z)});
        } else {
            d = z;
        }
    }

    public static void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90018bdc", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aade62df", new Object[]{new Boolean(z)});
        } else {
            f18648a = z;
        }
    }

    public static void l(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c3980c8", new Object[]{str, new Integer(i)});
        } else if (!TextUtils.isEmpty(str) && e.contains(str)) {
            f = str;
            g = Math.min(Math.max(i, 2), 10);
        }
    }

    public static void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a18f5fb", new Object[]{str});
        } else if (TextUtils.equals(str, f)) {
            f = null;
            g = 10;
        }
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8598c5ad", new Object[0])).booleanValue();
        }
        return d;
    }
}
