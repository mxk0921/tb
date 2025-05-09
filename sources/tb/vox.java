package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class vox {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLASS_2008 = 2008;
    public static final int CLASS_2009 = 2009;
    public static final int CLASS_2010 = 2010;
    public static final int CLASS_2011 = 2011;
    public static final int CLASS_2012 = 2012;
    public static final int CLASS_2013 = 2013;
    public static final int CLASS_2014 = 2014;
    public static final int CLASS_UNKNOWN = -1;

    /* renamed from: a  reason: collision with root package name */
    public static volatile Integer f30149a;

    static {
        t2o.a(989856312);
    }

    public static void b(ArrayList<Integer> arrayList, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd607f6e", new Object[]{arrayList, new Integer(i)});
        } else if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public static int c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b62ed57e", new Object[]{context})).intValue();
        }
        if (f30149a == null) {
            synchronized (vox.class) {
                try {
                    if (f30149a == null) {
                        f30149a = Integer.valueOf(a(context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f30149a.intValue();
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79601026", new Object[0])).intValue();
        }
        long b = fi7.b();
        if (b == -1) {
            return -1;
        }
        if (b <= 528000) {
            return CLASS_2008;
        }
        if (b <= 620000) {
            return CLASS_2009;
        }
        if (b <= 1020000) {
            return 2010;
        }
        if (b <= 1220000) {
            return CLASS_2011;
        }
        if (b <= 1520000) {
            return CLASS_2012;
        }
        if (b <= 2020000) {
            return 2013;
        }
        return 2014;
    }

    public static int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("851cb09b", new Object[0])).intValue();
        }
        int e = fi7.e();
        if (e < 1) {
            return -1;
        }
        if (e == 1) {
            return CLASS_2008;
        }
        if (e <= 3) {
            return CLASS_2011;
        }
        return CLASS_2012;
    }

    public static int f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("78c08def", new Object[]{context})).intValue();
        }
        long g = fi7.g(context);
        if (g <= 0) {
            return -1;
        }
        if (g <= 201326592) {
            return CLASS_2008;
        }
        if (g <= 304087040) {
            return CLASS_2009;
        }
        if (g <= 536870912) {
            return 2010;
        }
        if (g <= 1073741824) {
            return CLASS_2011;
        }
        if (g <= 1610612736) {
            return CLASS_2012;
        }
        if (g <= 2147483648L) {
            return 2013;
        }
        return 2014;
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efb3c507", new Object[]{context})).intValue();
        }
        ArrayList arrayList = new ArrayList();
        b(arrayList, e());
        b(arrayList, d());
        b(arrayList, f(context));
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        int size = arrayList.size() / 2;
        int i = size - 1;
        return ((Integer) arrayList.get(i)).intValue() + ((((Integer) arrayList.get(size)).intValue() - ((Integer) arrayList.get(i)).intValue()) / 2);
    }
}
