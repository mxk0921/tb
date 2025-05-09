package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.bridge.WeexPlatformCommonBridge;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.jni.MUSCommonNativeBridge;
import com.taobao.android.weex_framework.ui.INode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ivu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, jpc> f21604a = new ConcurrentHashMap();
    public static final Set<String> b = new ConcurrentSkipListSet();
    public static final Map<String, exp> c = new ConcurrentHashMap();

    static {
        t2o.a(982516240);
        new AtomicInteger(1);
        new HashMap();
    }

    public static Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("2b8d652c", new Object[0]);
        }
        return ((ConcurrentHashMap) c).keySet();
    }

    public static cvu b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cvu) ipChange.ipc$dispatch("231b73e7", new Object[]{str});
        }
        return (cvu) ((ConcurrentHashMap) f21604a).get(str);
    }

    public static exp c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (exp) ipChange.ipc$dispatch("be67c3", new Object[]{str});
        }
        return (exp) ((ConcurrentHashMap) c).get(str);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f9d9e77", new Object[0])).booleanValue();
        }
        Iterator it = ((ConcurrentSkipListSet) b).iterator();
        while (it.hasNext()) {
            if (!MUSCommonNativeBridge.f(MUSValue.ofString((String) it.next()))) {
                return false;
            }
        }
        return true;
    }

    public static void e(String str, exp expVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc369e4", new Object[]{str, expVar});
        } else {
            ((ConcurrentHashMap) c).put(str, expVar);
        }
    }

    public static void f(String str, Class<? extends INode> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d16b93", new Object[]{str, cls});
        } else {
            g(str, cls, false);
        }
    }

    public static void g(String str, Class<? extends INode> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("675cb9a1", new Object[]{str, cls, new Boolean(z)});
        } else {
            i(str, new gyp(cls), z);
        }
    }

    public static void h(String str, jpc jpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b21dfae8", new Object[]{str, jpcVar});
        } else {
            i(str, jpcVar, false);
        }
    }

    public static void i(String str, jpc jpcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a214ec", new Object[]{str, jpcVar, new Boolean(z)});
            return;
        }
        ((ConcurrentHashMap) f21604a).put(str, jpcVar);
        if (z) {
            if (!w6x.r(WeexInstanceMode.SCRIPT)) {
                MUSEngine.resetDelayedNativeRegisterState();
            } else if (!MUSCommonNativeBridge.f(MUSValue.ofString(str))) {
                MUSEngine.resetDelayedNativeRegisterState();
            }
            ((ConcurrentSkipListSet) b).add(str);
        }
    }

    public static void j(String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cef18ac", new Object[]{str});
            return;
        }
        jpc jpcVar = (jpc) ((ConcurrentHashMap) f21604a).get(str);
        String str4 = null;
        if (jpcVar != null) {
            str2 = null;
            str4 = jpcVar.getMethods();
            str3 = null;
        } else {
            exp expVar = (exp) ((ConcurrentHashMap) c).get(str.toLowerCase());
            if (expVar != null) {
                str4 = expVar.b();
                str2 = expVar.c();
                str3 = expVar.f();
            } else {
                str3 = null;
                str2 = null;
            }
        }
        if (str4 != null || str2 != null || str3 != null) {
            WeexPlatformCommonBridge.registerUINode(str, str4, str2, str3);
        }
    }
}
