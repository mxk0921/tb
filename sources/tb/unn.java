package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class unn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int UN_INIT = -1;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Integer, Integer> f29514a = new ConcurrentHashMap();

    static {
        t2o.a(729809057);
    }

    public static void a(DinamicXEngine dinamicXEngine, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41892389", new Object[]{dinamicXEngine, new Integer(i)});
        } else {
            ((ConcurrentHashMap) f29514a).put(Integer.valueOf(dinamicXEngine.hashCode()), Integer.valueOf(i));
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[0]);
        } else {
            ((ConcurrentHashMap) f29514a).clear();
        }
    }

    public static int c(DinamicXEngine dinamicXEngine) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a86aa10b", new Object[]{dinamicXEngine})).intValue();
        }
        int hashCode = dinamicXEngine.hashCode();
        Map<Integer, Integer> map = f29514a;
        if (((ConcurrentHashMap) map).containsKey(Integer.valueOf(hashCode)) && (num = (Integer) ((ConcurrentHashMap) map).get(Integer.valueOf(hashCode))) != null) {
            return num.intValue();
        }
        return -1;
    }
}
