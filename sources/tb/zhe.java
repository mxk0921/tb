package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.text.Regex;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class zhe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final zhe INSTANCE = new zhe();

    static {
        t2o.a(490733621);
    }

    public final String c(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2992c8c7", new Object[]{this, str, str2});
        }
        String str4 = str2 + '=';
        if (!wsq.O(str, str4, false, 2, null)) {
            return str;
        }
        String d = d(wsq.Y(str, str4, 0, false, 6, null) + str4.length(), str.length(), str);
        if (wsq.O(d, "&", false, 2, null)) {
            str3 = d(wsq.Y(d, "&", 0, false, 6, null) + 1, d.length(), d);
        } else {
            str3 = "";
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, wsq.Y(str, str4, 0, false, 6, null));
        ckf.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb.append(substring);
        sb.append(str3);
        return sb.toString();
    }

    public final String d(int i, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8ba6083e", new Object[]{this, new Integer(i), new Integer(i2), str});
        }
        if (i2 <= i) {
            return "";
        }
        if (str != null) {
            String substring = str.substring(i, i2);
            ckf.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("119f0c80", new Object[]{this, str});
        }
        ckf.g(str, "url");
        List<String> b = b();
        if (b.isEmpty()) {
            return str;
        }
        int size = b.size();
        for (int i = 0; i < size; i++) {
            str = c(str, b.get(i));
        }
        return str;
    }

    public final List<String> b() {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d2664a9b", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        String d = mve.d("preRequestWhiteList", "spm,scm");
        if (!(d == null || d.length() == 0)) {
            List<String> split = new Regex(",").split(d, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        list = i04.v0(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = yz3.i();
            Object[] array = list.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                arrayList.addAll(yz3.l((String[]) Arrays.copyOf(strArr, strArr.length)));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return arrayList;
    }
}
