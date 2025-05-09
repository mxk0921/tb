package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class tbl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1017118839);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("235381ac", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("alimama_ad", str, String.valueOf(i)));
        } catch (Throwable th) {
            th.printStackTrace();
            return i;
        }
    }

    public static Set<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("b4180bec", new Object[]{str});
        }
        HashSet hashSet = new HashSet();
        try {
            JSONArray parseArray = JSON.parseArray(OrangeConfig.getInstance().getConfig("alimama_ad", str, ""));
            if (parseArray != null) {
                Iterator<Object> it = parseArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        hashSet.add((String) next);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashSet;
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        try {
            return OrangeConfig.getInstance().getConfig("alimama_ad", str, str2);
        } catch (Throwable th) {
            th.printStackTrace();
            return str2;
        }
    }
}
