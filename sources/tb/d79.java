package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class d79 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Matcher f17636a = Pattern.compile("(\\|\\||[\t\r\n]|\u0001|\u0000)+").matcher("");

    static {
        t2o.a(962592886);
    }

    public static synchronized String a(String str) {
        synchronized (d79.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5b787743", new Object[]{str});
            } else if (str == null || str.isEmpty()) {
                return str;
            } else {
                return f17636a.reset(str).replaceAll("");
            }
        }
    }

    public static Map<String, String> b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("10f23466", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> it = map.keySet().iterator();
        if (it != null) {
            while (it.hasNext()) {
                try {
                    String next = it.next();
                    if (next != null) {
                        hashMap.put(next, a(map.get(next)));
                    }
                } catch (Throwable th) {
                    nhh.h("[_checkMapFields]", th, new Object[0]);
                }
            }
        }
        return hashMap;
    }
}
