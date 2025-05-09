package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class y6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f31884a;
    public static final Map<String, Boolean> b;
    public static final Map<String, Boolean> c = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements wo0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.wo0
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else {
                y6v.a(sh4.f("newUltron_container"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static final String MODULE_KEY_EVENT_ASYNC_SOURCE = "asyncSource";
        public static final String[] MODULE_KEYS = {MODULE_KEY_EVENT_ASYNC_SOURCE};

        static {
            t2o.a(157286684);
        }
    }

    public static /* synthetic */ void a(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9b172e", new Object[]{map});
        } else {
            f(map);
        }
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("caa27d58", new Object[]{str, str2});
        }
        return "ultron_" + str2 + "_" + str;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("128ed63c", new Object[]{str});
        }
        return "ultron_" + str + "_";
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6811c3f9", new Object[0]);
        } else if (!f31884a) {
            Map<String, String> f = sh4.f("newUltron_container");
            sh4.i(new String[]{"newUltron_container"}, new a());
            f(f);
            f31884a = true;
        }
    }

    public static boolean e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46f934ce", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String b2 = b(str, str2);
        Boolean bool = (Boolean) ((HashMap) c).get(b2);
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = (Boolean) ((HashMap) b).get(b2);
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return false;
    }

    public static void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc37bce", new Object[]{map});
            return;
        }
        ((HashMap) c).clear();
        if (!(map == null || map.isEmpty())) {
            for (String str : map.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    String[] strArr = b.MODULE_KEYS;
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (str.startsWith(c(strArr[i]))) {
                            ((HashMap) c).put(str, Boolean.valueOf("true".equals(map.get(str))));
                            break;
                        }
                        i++;
                    }
                }
            }
        }
    }

    static {
        t2o.a(157286682);
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(b("taobao_wallet_charge_others", b.MODULE_KEY_EVENT_ASYNC_SOURCE), Boolean.TRUE);
    }
}
