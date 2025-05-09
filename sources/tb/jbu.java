package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jbu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_MOUDLE = "taolive";
    public static final String PAGE_TAOLIVE_WATCH = "Page_TaobaoLiveWatch";

    static {
        t2o.a(295699957);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6495106b", new Object[]{str, str2});
        } else if (v2s.o().A() != null) {
            cwd A = v2s.o().A();
            A.c("TaoliveInteractive_" + str, str2);
        }
    }

    @Deprecated
    public static void b(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bedf2974", new Object[]{str, strArr});
            return;
        }
        if (v2s.o().E() != null) {
            v2s.o().E().track4Click("Page_TaobaoLiveWatch", str, strArr);
        }
        a("trackBtnWithExtras", str);
    }

    public static void c(ukr ukrVar, String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62bda347", new Object[]{ukrVar, str, str2, hashMap});
            return;
        }
        if (!(ukrVar == null || ukrVar.e0() == null)) {
            ukrVar.e0().d(str, str2, hashMap);
        }
        a("trackBtnWithExtras", str2);
    }

    public static void d(ukr ukrVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea4b443d", new Object[]{ukrVar, str, strArr});
            return;
        }
        if (!(ukrVar == null || ukrVar.e0() == null)) {
            ukrVar.e0().c(str, strArr);
        }
        a("trackBtnWithExtras", str);
    }

    public static void e(ukr ukrVar, int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5509b12", new Object[]{ukrVar, new Integer(i), str, map});
            return;
        }
        if (!(ukrVar == null || ukrVar.e0() == null)) {
            ukrVar.e0().e(i, str, map);
        }
        a("trackCustom", str);
    }

    public static void f(ukr ukrVar, String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2537359", new Object[]{ukrVar, str, str2, hashMap});
            return;
        }
        if (!(ukrVar == null || ukrVar.e0() == null)) {
            ukrVar.e0().a(str, str2, hashMap);
        }
        a("trackShow", str2);
    }

    public static void g(ukr ukrVar, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51d2a163", new Object[]{ukrVar, str, hashMap});
            return;
        }
        if (!(ukrVar == null || ukrVar.e0() == null)) {
            ukrVar.e0().b(str, hashMap);
        }
        a("trackShow", str);
    }
}
