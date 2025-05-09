package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String b = ".";
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;

    /* renamed from: a  reason: collision with root package name */
    public final String f31137a;

    static {
        t2o.a(475004956);
    }

    public x4a() {
    }

    public static String[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("5d696ce5", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return str.split("\\" + b, 4);
    }

    public static String b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3d6357d", new Object[]{str, str2, str3, str4});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(str3);
        arrayList.add(str4);
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (((String) arrayList.get(size)) != null) {
                break;
            } else {
                size--;
            }
        }
        if (size == -1) {
            return null;
        }
        List subList = arrayList.subList(0, size + 1);
        for (int size2 = subList.size() - 1; size2 >= 0; size2--) {
            if (subList.get(size2) == null) {
                subList.set(size2, "");
            }
        }
        return TextUtils.join(".", subList);
    }

    public static String d(String[] strArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("48560ef7", new Object[]{strArr, new Integer(i)});
        }
        if (strArr != null && i < strArr.length) {
            return strArr[i];
        }
        return null;
    }

    public static x4a e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x4a) ipChange.ipc$dispatch("e0403ad1", new Object[]{str});
        }
        String[] a2 = a(str);
        return new x4a(d(a2, 0), d(a2, c), d(a2, d), d(a2, e));
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81002825", new Object[]{this});
        }
        return this.f31137a;
    }

    public x4a(String str) {
        this.f31137a = str;
    }

    public x4a(String str, String str2, String str3, String str4) {
        this.f31137a = b(str, str2, str3, str4);
    }
}
