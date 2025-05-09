package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yd2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEF_BIZ_TAG = "_default";
    public static final String DEF_CHANNEL = "_default";
    public static final int MODE_CACHE = 10001;
    public static final int MODE_NOTIFY = 10000;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<Integer, HashMap<String, WeakReference<kbd>>> f31996a = new HashMap<>();
    public static final Map<String, kbd> b = new ConcurrentHashMap();
    public static final Map<String, a> c = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f31997a;

        static {
            t2o.a(628097260);
        }
    }

    static {
        t2o.a(628097259);
    }

    public static a a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("dc5d0c", new Object[]{str, str2});
        }
        a b2 = b(str, str2);
        if (b2 != null) {
            return b2;
        }
        a aVar = new a();
        Map<String, a> map = c;
        ((HashMap) map).put(str + f7l.PLUS + str2, aVar);
        return aVar;
    }

    public static a b(String str, String str2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("b1f44b5c", new Object[]{str, str2});
        } else {
            Map<String, a> map = c;
            obj = ((HashMap) map).get(str + f7l.PLUS + str2);
        }
        return (a) obj;
    }

    public static HashMap<String, WeakReference<kbd>> c(int i) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("841da282", new Object[]{new Integer(i)});
        } else {
            obj = f31996a.get(Integer.valueOf(i));
        }
        return (HashMap) obj;
    }

    public static int d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b3781b80", new Object[]{str, str2})).intValue();
        }
        Map<String, a> map = c;
        a aVar = (a) ((HashMap) map).get(str + f7l.PLUS + str2);
        if (aVar == null) {
            return 3;
        }
        return aVar.f31997a;
    }

    public static int e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1139049c", new Object[]{str, str2})).intValue();
        }
        Map<String, a> map = c;
        if (((a) ((HashMap) map).get(str + f7l.PLUS + str2)) == null) {
            return 10000;
        }
        return 0;
    }

    public static kbd f(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            obj = ipChange.ipc$dispatch("3eb6cee1", new Object[]{str});
        } else {
            obj = ((ConcurrentHashMap) b).get(str);
        }
        return (kbd) obj;
    }

    public static int g(int i, String str, kbd kbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a29c1063", new Object[]{new Integer(i), str, kbdVar})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            str = "_default";
        }
        HashMap<Integer, HashMap<String, WeakReference<kbd>>> hashMap = f31996a;
        HashMap<String, WeakReference<kbd>> hashMap2 = hashMap.get(Integer.valueOf(i));
        if (hashMap2 == null) {
            Integer valueOf = Integer.valueOf(i);
            hashMap2 = new HashMap<>();
            hashMap.put(valueOf, hashMap2);
        }
        if (hashMap2.put(str, new WeakReference<>(kbdVar)) != null) {
            return -1;
        }
        return 1;
    }

    public static void h(String str, kbd kbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5dc3c0a", new Object[]{str, kbdVar});
        } else {
            ((ConcurrentHashMap) b).put(str, kbdVar);
        }
    }

    public static void i(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca17ab8a", new Object[]{str, str2, new Integer(i)});
        } else {
            a(str, str2).f31997a = i;
        }
    }

    public static void j(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f29bdd", new Object[]{str, str2, new Integer(i)});
        } else {
            a(str, str2).getClass();
        }
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("104cf0cf", new Object[]{str});
        } else {
            ((ConcurrentHashMap) b).remove(str);
        }
    }
}
