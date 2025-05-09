package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class srq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f28237a = Logger.getLogger(srq.class.getName());

    static {
        t2o.a(297795635);
    }

    public static float[] a(int i, String str, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("7d6091d", new Object[]{new Integer(i), str, new Integer(i2)});
        }
        if (str == null || str.equals("")) {
            return null;
        }
        float[] fArr = new float[i];
        int length = str.length();
        char[] cArr = new char[length];
        str.getChars(0, str.length(), cArr, 0);
        while (i2 < length) {
            int g = g(i2, cArr, null);
            if (g >= length) {
                break;
            }
            i2 = g;
            while (i2 < length) {
                char c = cArr[i2];
                if (c == ' ' || c == '\n' || c == '\t') {
                    break;
                }
                i2++;
            }
            int i4 = i3 + 1;
            fArr[i3] = Float.parseFloat(new String(cArr, g, i2 - g));
            if (i4 >= i) {
                break;
            }
            i3 = i4;
        }
        return fArr;
    }

    public static String[] b(char c, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("3e140a1e", new Object[]{new Character(c), str});
        }
        if (str == null || str.equals("")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        char[] cArr = new char[length];
        str.getChars(0, str.length(), cArr, 0);
        int i2 = 0;
        while (i < length && i2 < length) {
            int i3 = i2;
            while (i3 < length && c != cArr[i3]) {
                i3++;
            }
            String str2 = new String(cArr, i2, i3 - i2);
            i2 = i3 + 1;
            arrayList.add(str2);
            i = i2;
        }
        return (String[]) arrayList.toArray(new String[1]);
    }

    public static int[] c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("96004f82", new Object[]{str, new Integer(i)});
        }
        if (str == null || str.equals("")) {
            return null;
        }
        String[] e = e(str);
        ArrayList arrayList = new ArrayList();
        Integer num = new Integer(Integer.MIN_VALUE);
        for (String str2 : e) {
            d(str2, arrayList, num, i);
        }
        int[] iArr = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr;
    }

    public static void d(String str, ArrayList<Integer> arrayList, Integer num, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca11824", new Object[]{str, arrayList, num, new Integer(i)});
            return;
        }
        String[] b = b(wh6.DIR, str);
        int i2 = 0;
        for (int i3 = 0; i3 < b.length; i3++) {
            if (b[i3].trim().equals("")) {
                arrayList.add(num);
            } else {
                arrayList.add(Integer.valueOf(Integer.parseInt(b[i3])));
            }
            i2++;
        }
        while (i2 < i) {
            arrayList.add(num);
            i2++;
        }
    }

    public static String[] e(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f1c1ac6e", new Object[]{str});
        }
        if (str == null || str.equals("")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        char[] cArr = new char[length];
        str.getChars(0, str.length(), cArr, 0);
        while (i < length) {
            int g = g(i, cArr, null);
            if (g >= length) {
                break;
            }
            for (int i2 = g; i2 < length; i2++) {
                char c = cArr[i2];
                if (!(c == ' ' || c == '\n' || c == '\t')) {
                }
                i = i2 + 1;
                arrayList.add(new String(cArr, g, i2 - g));
            }
            i = i2 + 1;
            arrayList.add(new String(cArr, g, i2 - g));
        }
        return (String[]) arrayList.toArray(new String[1]);
    }

    public static void f(String str, String str2, int i, char[] cArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b96ca47", new Object[]{str, str2, new Integer(i), cArr});
            return;
        }
        f28237a.log(Level.SEVERE, str + ": " + str2);
        String str3 = "ERROR: " + str + ": msg=\\";
        String str4 = "ERROR: " + str + ":      ";
        for (int i2 = 0; i2 < cArr.length; i2++) {
            str3 = str3 + cArr[i2];
            str4 = str4 + " ";
        }
        String str5 = str3 + "\\";
        Logger logger = f28237a;
        Level level = Level.SEVERE;
        logger.log(level, str5);
        logger.log(level, str5);
    }

    public static int g(int i, char[] cArr, String str) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c9004fe5", new Object[]{new Integer(i), cArr, str})).intValue();
        }
        while (i < cArr.length && ((c = cArr[i]) == ' ' || c == '\n' || c == '\t')) {
            i++;
        }
        if (str == null || i < cArr.length) {
            return i;
        }
        f("RString.skipWhiteSpace", str, i, cArr);
        return -1;
    }
}
