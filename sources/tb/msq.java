package tb;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class msq extends jsq {
    public static final g1a<String, String> d(final String str) {
        if (str.length() == 0) {
            return new g1a() { // from class: tb.ksq
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    String str2 = (String) obj;
                    msq.e(str2);
                    return str2;
                }
            };
        }
        return new g1a() { // from class: tb.lsq
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                String f;
                f = msq.f(str, (String) obj);
                return f;
            }
        };
    }

    public static final String e(String str) {
        ckf.g(str, "line");
        return str;
    }

    public static final String f(String str, String str2) {
        ckf.g(str2, "line");
        return str + str2;
    }

    public static final int g(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (!a.c(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return str.length();
        }
        return i;
    }

    public static final String h(String str, String str2) {
        int i;
        ckf.g(str, "<this>");
        ckf.g(str2, "newIndent");
        List<String> h0 = wsq.h0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : h0) {
            if (!wsq.a0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(zz3.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(g((String) it.next())));
        }
        Integer num = (Integer) i04.n0(arrayList2);
        int i2 = 0;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int length = str.length() + (str2.length() * h0.size());
        g1a<String, String> d = d(str2);
        int k = yz3.k(h0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : h0) {
            int i3 = i2 + 1;
            String str3 = null;
            if (i2 >= 0) {
                String str4 = (String) obj2;
                if ((!(i2 == 0 || i2 == k) || !wsq.a0(str4)) && (str3 = d.invoke(ysq.T0(str4, i))) == null) {
                    str3 = str4;
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
                i2 = i3;
            } else {
                yz3.p();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(length);
        i04.h0(arrayList3, sb, "\n", null, null, 0, null, null, 124, null);
        return sb.toString();
    }

    public static String i(String str) {
        ckf.g(str, "<this>");
        return h(str, "");
    }
}
