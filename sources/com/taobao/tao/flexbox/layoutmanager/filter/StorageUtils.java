package com.taobao.tao.flexbox.layoutmanager.filter;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.ggs;
import tb.nwv;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class StorageUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317249);
    }

    @FilterHandler(name = "int")
    public static int Int(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88beecef", new Object[]{str, obj})).intValue();
        }
        return nwv.t(get(str, obj), 0);
    }

    @FilterHandler(name = "bool")
    public static boolean bool(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d159911b", new Object[]{str, obj})).booleanValue();
        }
        return nwv.o(get(str, obj), false);
    }

    @FilterHandler(name = "get")
    public static Object get(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("bb95e40f", new Object[]{str, obj});
        }
        Object a2 = ggs.a(str);
        if (a2 == null) {
            return obj;
        }
        return a2;
    }

    @FilterHandler(name = "memoryget")
    public static Object memoryget(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2e4cc190", new Object[]{str, obj});
        }
        Object d = ggs.d(str);
        if (d == null) {
            return obj;
        }
        return d;
    }

    public static Object a(String str, List list) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a0cdb2ad", new Object[]{str, list});
        }
        try {
            switch (str.hashCode()) {
                case 102230:
                    if (str.equals("get")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 104431:
                    if (str.equals("int")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3029738:
                    if (str.equals("bool")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1726621365:
                    if (str.equals("memoryget")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                return get((String) list.get(0), list.get(1));
            }
            if (c == 1) {
                return memoryget((String) list.get(0), list.get(1));
            }
            if (c == 2) {
                return Boolean.valueOf(bool((String) list.get(0), list.get(1)));
            }
            if (c != 3) {
                return "";
            }
            return Integer.valueOf(Int((String) list.get(0), list.get(1)));
        } catch (Throwable th) {
            tfs.e("storage.filter", "error:" + str + th.getMessage());
            return "";
        }
    }
}
