package com.taobao.tao.flexbox.layoutmanager.filter;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.hqq;
import tb.iuo;
import tb.nwv;
import tb.pg1;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ArrayUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317242);
    }

    @FilterHandler(name = "at")
    public static Object at(List list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d3d42dfa", new Object[]{list, new Integer(i)});
        }
        if (list == null || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    @FilterHandler(name = "concat")
    public static Object concat(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d59a76bf", new Object[]{obj, obj2});
        }
        if (!(obj instanceof String[]) || !(obj2 instanceof String[])) {
            if (obj instanceof List) {
                if (obj2 instanceof List) {
                    ((List) obj).addAll((List) obj2);
                    return obj;
                } else if (obj2 instanceof Map) {
                    ((List) obj).add(obj2);
                    return obj;
                }
            } else if (obj instanceof Map) {
                if (obj2 instanceof List) {
                    ((List) obj2).add(0, obj);
                    return obj2;
                } else if (obj2 instanceof Map) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.add(obj);
                    jSONArray.add(obj2);
                    return jSONArray;
                }
            }
            return obj;
        }
        String[] strArr = (String[]) obj;
        String[] strArr2 = (String[]) obj2;
        int length = strArr.length;
        int length2 = strArr2.length + length;
        String[] strArr3 = new String[length2];
        for (int i = 0; i < length2; i++) {
            if (i < length) {
                strArr3[i] = strArr[i];
            } else if (i < length2) {
                strArr3[i] = strArr2[i - length];
            }
        }
        return strArr3;
    }

    @FilterHandler(name = "contains")
    public static boolean contains(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17fed8e2", new Object[]{obj, obj2})).booleanValue();
        }
        if (obj instanceof List) {
            return ((List) obj).contains(obj2);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a A[SYNTHETIC] */
    @com.taobao.tao.flexbox.layoutmanager.filter.FilterHandler(name = "filterSimilarOne")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object filterSimilarOne(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tao.flexbox.layoutmanager.filter.ArrayUtils.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "c575f4c4"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r7
            r4[r0] = r8
            r7 = 2
            r4[r7] = r9
            java.lang.Object r7 = r2.ipc$dispatch(r3, r4)
            return r7
        L_0x0019:
            r2 = 0
            if (r7 == 0) goto L_0x0089
            boolean r3 = r7 instanceof java.util.List
            if (r3 == 0) goto L_0x0089
            boolean r3 = r8 instanceof java.lang.String
            if (r3 == 0) goto L_0x0089
            java.util.List r7 = (java.util.List) r7
            r8.toString()
            if (r9 == 0) goto L_0x0038
            java.lang.String r9 = r9.toString()
            java.lang.Float r9 = java.lang.Float.valueOf(r9)
            float r9 = r9.floatValue()
            goto L_0x0039
        L_0x0038:
            r9 = 0
        L_0x0039:
            r3 = -1
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x003d:
            int r5 = r7.size()
            if (r1 >= r5) goto L_0x007c
            java.lang.Object r5 = r7.get(r1)     // Catch: Exception -> 0x005a
            if (r5 == 0) goto L_0x005b
            if (r8 == 0) goto L_0x005b
            boolean r6 = r5 instanceof java.util.Map     // Catch: Exception -> 0x005a
            if (r6 == 0) goto L_0x005b
            java.util.Map r5 = (java.util.Map) r5     // Catch: Exception -> 0x005a
            java.lang.String r6 = r8.toString()     // Catch: Exception -> 0x005a
            java.lang.Object r5 = r5.get(r6)     // Catch: Exception -> 0x005a
            goto L_0x005c
        L_0x005a:
        L_0x005b:
            r5 = r2
        L_0x005c:
            if (r5 != 0) goto L_0x005f
            goto L_0x007a
        L_0x005f:
            java.lang.String r5 = r5.toString()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            float r5 = r5.floatValue()
            float r5 = r5 - r9
            float r6 = java.lang.Math.abs(r5)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x007a
            float r3 = java.lang.Math.abs(r5)
            r4 = r3
            r3 = r1
        L_0x007a:
            int r1 = r1 + r0
            goto L_0x003d
        L_0x007c:
            if (r3 < 0) goto L_0x0089
            int r8 = r7.size()
            if (r3 >= r8) goto L_0x0089
            java.lang.Object r7 = r7.get(r3)
            return r7
        L_0x0089:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.flexbox.layoutmanager.filter.ArrayUtils.filterSimilarOne(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @FilterHandler(name = "first")
    public static Object first(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("37de983f", new Object[]{obj});
        }
        if (obj != null && (obj instanceof List)) {
            List list = (List) obj;
            if (list.size() > 0) {
                return list.get(0);
            }
        }
        return null;
    }

    @FilterHandler(name = pg1.ATOM_EXT_indexOf)
    public static Object indexOf(Object obj, Object obj2) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d24e512a", new Object[]{obj, obj2});
        }
        if (obj instanceof List) {
            list = (List) obj;
        } else {
            if (obj instanceof String) {
                try {
                    list = JSON.parseArray((String) obj);
                } catch (Exception e) {
                    tfs.e("ArrayUtils", e.getMessage());
                }
            }
            list = null;
        }
        if (list != null) {
            return Integer.valueOf(list.indexOf(obj2));
        }
        return -1;
    }

    @FilterHandler(name = "indexOfKey")
    public static int indexOfKey(List list, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b3e3d79", new Object[]{list, obj, obj2})).intValue();
        }
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                Object obj3 = list.get(i);
                if ((obj3 instanceof Map) && nwv.i(((Map) obj3).get(obj2), obj)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @FilterHandler(name = pg1.ATOM_join)
    public static String join(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7dd2dd34", new Object[]{list, str});
        }
        if (list == null) {
            return "";
        }
        if (TextUtils.isEmpty(str)) {
            str = ",";
        }
        hqq.b a2 = hqq.a();
        for (String str2 : list) {
            a2.b(str2).b(str);
        }
        if (a2.c() > 1) {
            return a2.f(0, a2.c() - 1);
        }
        return "";
    }

    @FilterHandler(name = "last")
    public static Object last(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bfb86199", new Object[]{obj});
        }
        if (!(obj instanceof List)) {
            return null;
        }
        List list = (List) obj;
        if (list.size() > 0) {
            return list.get(list.size() - 1);
        }
        return null;
    }

    @FilterHandler(name = pg1.ATOM_length)
    public static int length(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e306afc", new Object[]{obj})).intValue();
        }
        if (obj instanceof List) {
            return ((List) obj).size();
        }
        if (obj instanceof Map) {
            return ((Map) obj).size();
        }
        if (obj instanceof String) {
            return ((String) obj).length();
        }
        return 0;
    }

    @FilterHandler(name = "pop")
    public static Object pop(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("865c6f09", new Object[]{list});
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.remove(list.size() - 1);
    }

    @FilterHandler(name = "push")
    public static List push(List list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("eaa6799", new Object[]{list, obj});
        }
        if (list == null) {
            list = new ArrayList();
        }
        if (obj != null) {
            list.add(obj);
        }
        return list;
    }

    @FilterHandler(name = pg1.ATOM_EXT_reverse)
    public static Object reverse(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4f8823cd", new Object[]{obj});
        }
        if (!(obj instanceof List)) {
            return null;
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayList.add(list.get(size));
        }
        return arrayList;
    }

    @FilterHandler(name = pg1.ATOM_EXT_shift)
    public static Object shift(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d1ed762d", new Object[]{obj});
        }
        if (!(obj instanceof List)) {
            return null;
        }
        List list = (List) obj;
        if (list.size() > 0) {
            return list.remove(0);
        }
        return null;
    }

    @FilterHandler(name = pg1.ATOM_EXT_slice)
    public static Object slice(List list, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8260bb0", new Object[]{list, obj, obj2});
        }
        if (list == null) {
            return null;
        }
        int t = nwv.t(obj, 0);
        int t2 = nwv.t(obj2, 0);
        if (list.size() <= 0) {
            return null;
        }
        if (t2 < 0) {
            return list.subList((list.size() - 1) - t, list.size() - 1);
        }
        return list.subList(t, Math.min(Math.min(t2, list.size() + t), list.size()));
    }

    @FilterHandler(name = "sort")
    public static Object sort(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("df6b2591", new Object[]{obj});
        }
        if (obj != null && (obj instanceof List)) {
            Arrays.sort(((List) obj).toArray());
        }
        return null;
    }

    @FilterHandler(name = "splice")
    public static Object splice(List list, int i, int i2, Object obj) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("39faf302", new Object[]{list, new Integer(i), new Integer(i2), obj});
        }
        if (list != null && list.size() > 0 && i < list.size() && i > 0) {
            if (i2 == 0) {
                if (obj != null) {
                    list.add(i, obj);
                }
                return list;
            } else if (i2 > 0) {
                if (obj != null) {
                    while (i3 < i2) {
                        list.remove(i);
                        i3++;
                    }
                    list.add(i, obj);
                    return list;
                }
                while (i3 < i2) {
                    list.remove(i);
                    i3++;
                }
                return list;
            }
        }
        return null;
    }

    @FilterHandler(name = pg1.ATOM_EXT_unshift)
    public static int unshift(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8acbc63b", new Object[]{obj, obj2})).intValue();
        }
        if (!(obj instanceof List)) {
            return 0;
        }
        List list = (List) obj;
        list.add(0, obj2);
        return list.size();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Object a(String str, List list) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a0cdb2ad", new Object[]{str, list});
        }
        try {
            switch (str.hashCode()) {
                case -1354795244:
                    if (str.equals("concat")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1106363674:
                    if (str.equals(pg1.ATOM_length)) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -895859076:
                    if (str.equals("splice")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -567445985:
                    if (str.equals("contains")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -277637751:
                    if (str.equals(pg1.ATOM_EXT_unshift)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3123:
                    if (str.equals("at")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 111185:
                    if (str.equals("pop")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3267882:
                    if (str.equals(pg1.ATOM_join)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3314326:
                    if (str.equals("last")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3452698:
                    if (str.equals("push")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3536286:
                    if (str.equals("sort")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 97440432:
                    if (str.equals("first")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 109407362:
                    if (str.equals(pg1.ATOM_EXT_shift)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109526418:
                    if (str.equals(pg1.ATOM_EXT_slice)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 503432723:
                    if (str.equals("filterSimilarOne")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 731926358:
                    if (str.equals("indexOfKey")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 1099846370:
                    if (str.equals(pg1.ATOM_EXT_reverse)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1943291465:
                    if (str.equals(pg1.ATOM_EXT_indexOf)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return concat(list.get(0), list.get(1));
                case 1:
                    return join((List) list.get(0), (String) list.get(1));
                case 2:
                    return pop((List) list.get(0));
                case 3:
                    return shift(list.get(0));
                case 4:
                    return Integer.valueOf(unshift(list.get(0), list.get(1)));
                case 5:
                    return push((List) list.get(0), list.get(1));
                case 6:
                    return first(list.get(0));
                case 7:
                    return last(list.get(0));
                case '\b':
                    return reverse(list.get(0));
                case '\t':
                    if (list.size() > 0) {
                        Object obj = list.get(list.size() - 1);
                        if (obj instanceof iuo) {
                            list.remove(obj);
                        }
                    }
                    if (list.size() == 2) {
                        return slice((List) list.get(0), list.get(1));
                    }
                    if (list.size() > 2) {
                        return slice((List) list.get(0), list.get(1), list.get(2));
                    }
                    break;
                case '\n':
                    break;
                case 11:
                    return splice((List) list.get(0), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue(), list.get(3));
                case '\f':
                    return at((List) list.get(0), ((Integer) list.get(1)).intValue());
                case '\r':
                    return indexOf(list.get(0), list.get(1));
                case 14:
                    return Integer.valueOf(length(list.get(0)));
                case 15:
                    return filterSimilarOne(list.get(0), list.get(1), list.get(2));
                case 16:
                    return Boolean.valueOf(contains(list.get(0), list.get(1)));
                case 17:
                    return Integer.valueOf(indexOfKey((List) list.get(0), list.get(1), list.get(2)));
                default:
                    return "";
            }
            return sort(list.get(0));
        } catch (Throwable th) {
            tfs.e("array.filter", "error:" + str + th.getMessage());
            return "";
        }
    }

    @FilterHandler(name = pg1.ATOM_EXT_slice)
    public static Object slice(List list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a6a82a8c", new Object[]{list, obj});
        }
        if (list == null) {
            return null;
        }
        int t = nwv.t(obj, 0);
        if (list.size() > 0) {
            return list.subList(t, list.size() - 1);
        }
        return null;
    }
}
