package com.taobao.tao.flexbox.layoutmanager.filter;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.nwv;
import tb.pg1;
import tb.t2o;
import tb.tfs;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MathUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317247);
    }

    @FilterHandler(name = pg1.ATOM_EXT_ceil)
    public static long ceil(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1103c7dc", new Object[]{obj})).longValue();
        }
        if (obj instanceof Number) {
            return (long) Math.ceil(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return (long) Math.ceil(Double.parseDouble((String) obj));
        } catch (Exception unused) {
            return 0L;
        }
    }

    @FilterHandler(name = "divide")
    public static Float divide(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("8fe6c181", new Object[]{obj, obj2});
        }
        return Float.valueOf(nwv.r(obj, 0) / nwv.r(obj2, 0));
    }

    @FilterHandler(name = pg1.ATOM_EXT_floor)
    public static long floor(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c70a53a3", new Object[]{obj})).longValue();
        }
        if (obj instanceof Number) {
            return (long) Math.floor(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return (long) Math.floor(Double.parseDouble((String) obj));
        } catch (Exception unused) {
            return 0L;
        }
    }

    @FilterHandler(name = "isNumber")
    public static boolean isNumber(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb866d7a", new Object[]{obj})).booleanValue();
        }
        if (obj instanceof Number) {
            return true;
        }
        if (obj instanceof String) {
            CharSequence charSequence = (CharSequence) obj;
            if (!TextUtils.isEmpty(charSequence) && TextUtils.isDigitsOnly(charSequence)) {
                return true;
            }
        }
        return false;
    }

    @FilterHandler(name = "max")
    public static Object max(Object obj, Object obj2) {
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("af57426f", new Object[]{obj, obj2});
        }
        boolean z = obj instanceof Number;
        double d2 = vu3.b.GEO_NOT_SUPPORT;
        if (z) {
            d = ((Number) obj).doubleValue();
        } else {
            if (obj instanceof String) {
                try {
                    d = Double.parseDouble((String) obj);
                } catch (Exception unused) {
                }
            }
            d = 0.0d;
        }
        if (obj2 instanceof Number) {
            d2 = ((Number) obj2).doubleValue();
        } else if (obj2 instanceof String) {
            try {
                d2 = Double.parseDouble((String) obj2);
            } catch (Exception unused2) {
            }
        }
        if (d > d2) {
            return obj;
        }
        return obj2;
    }

    @FilterHandler(name = "min")
    public static Object min(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b3c2c141", new Object[]{obj, obj2});
        }
        if (max(obj, obj2) == obj) {
            return obj2;
        }
        return obj;
    }

    @FilterHandler(name = "minus")
    public static Float minus(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("8c5c78", new Object[]{obj, obj2});
        }
        return Float.valueOf(nwv.r(obj, 0) - nwv.r(obj2, 0));
    }

    @FilterHandler(name = "plus")
    public static Float plus(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("a525fba2", new Object[]{obj, obj2});
        }
        return Float.valueOf(nwv.r(obj, 0) + nwv.r(obj2, 0));
    }

    @FilterHandler(name = pg1.ATOM_EXT_round)
    public static long round(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8accf3a5", new Object[]{obj})).longValue();
        }
        if (obj instanceof Number) {
            return Math.round(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Math.round(Double.parseDouble((String) obj));
        } catch (Exception unused) {
            return 0L;
        }
    }

    @FilterHandler(name = "time")
    public static Float time(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("15928bd5", new Object[]{obj, obj2});
        }
        return Float.valueOf(nwv.r(obj, 0) * nwv.r(obj2, 0));
    }

    public static Object a(String str, List list) {
        char c = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a0cdb2ad", new Object[]{str, list});
        }
        try {
            switch (str.hashCode()) {
                case -1331463047:
                    if (str.equals("divide")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -360329965:
                    if (str.equals("isNumber")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 107876:
                    if (str.equals("max")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 108114:
                    if (str.equals("min")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3049733:
                    if (str.equals(pg1.ATOM_EXT_ceil)) {
                        break;
                    }
                    c = 65535;
                    break;
                case 3444122:
                    if (str.equals("plus")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3560141:
                    if (str.equals("time")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 97526796:
                    if (str.equals(pg1.ATOM_EXT_floor)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 103901296:
                    if (str.equals("minus")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 108704142:
                    if (str.equals(pg1.ATOM_EXT_round)) {
                        c = 1;
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
                    return Boolean.valueOf(isNumber(list.get(0)));
                case 1:
                    return Long.valueOf(round(list.get(0)));
                case 2:
                    return Long.valueOf(ceil(list.get(0)));
                case 3:
                    return Long.valueOf(floor(list.get(0)));
                case 4:
                    return max(list.get(0), list.get(1));
                case 5:
                    return min(list.get(0), list.get(1));
                case 6:
                    return minus(list.get(0), list.get(1));
                case 7:
                    return plus(list.get(0), list.get(1));
                case '\b':
                    return time(list.get(0), list.get(1));
                case '\t':
                    return divide(list.get(0), list.get(1));
                default:
                    return "";
            }
        } catch (Throwable th) {
            tfs.e("math.filter", "error:" + str + th.getMessage());
            return "";
        }
    }
}
