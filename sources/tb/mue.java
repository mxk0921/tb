package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mue {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f24315a = -1;
    public static final Map<String, Integer> b = new ConcurrentHashMap();

    static {
        t2o.a(486539391);
    }

    public static String a(DinamicXEngine dinamicXEngine, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("347a0606", new Object[]{dinamicXEngine, new Integer(i)});
        }
        return dinamicXEngine.hashCode() + "_" + i;
    }

    public static void b(DinamicXEngine dinamicXEngine, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e568efcc", new Object[]{dinamicXEngine, new Integer(i), new Integer(i2)});
        } else {
            ((ConcurrentHashMap) b).put(a(dinamicXEngine, i), Integer.valueOf(i2));
        }
    }

    public static int c(DinamicXEngine dinamicXEngine, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64e9f4de", new Object[]{dinamicXEngine, new Integer(i)})).intValue();
        }
        String a2 = a(dinamicXEngine, i);
        Map<String, Integer> map = b;
        if (!((ConcurrentHashMap) map).containsKey(a2)) {
            return f24315a;
        }
        Integer num = (Integer) ((ConcurrentHashMap) map).get(a2);
        if (num == null) {
            return f24315a;
        }
        return num.intValue();
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[0]);
        } else {
            ((ConcurrentHashMap) b).clear();
        }
    }
}
