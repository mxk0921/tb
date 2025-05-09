package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class d4s {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ABTEST_GROUP = "taolive";
    public static final String ORANGE_GROUP = "tblive";
    public static final String SWITCH_ENABLE_A_DAEMON = "enableADaemon1223";
    public static final String SWITCH_ENABLE_NEW_ALIVE = "enableNewAliveH5Container";
    public static final String SWITCH_ENABLE_PLAY_BACK_NEW_UI = "enablePlayBackNewUI";
    public static final String SWITCH_ENABLE_T_DX_CONFIG = "enableDxEngineConfigAdaptLargeScreen";
    public static final String SWITCH_ENABLE_T_LIVE_TRACE = "enableTLiveTrace";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Boolean> f17574a = new HashMap();
    public static final Map<String, Boolean> b = new HashMap();
    public static final Map<String, Boolean> c = new HashMap();

    static {
        t2o.a(806356495);
    }

    public static boolean a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71590f8a", new Object[]{str, str2, str3, new Boolean(z)})).booleanValue();
        }
        return b(str, str2, str3, z, true);
    }

    public static boolean b(String str, String str2, String str3, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9c99412", new Object[]{str, str2, str3, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        String str4 = str + "_" + str2 + "_" + str3;
        Map<String, Boolean> map = c;
        Boolean bool = (Boolean) ((HashMap) map).get(str4);
        if (bool != null) {
            return bool.booleanValue();
        }
        u9b c2 = v2s.o().c();
        if (c2 == null) {
            o3s.b("TLiveSwitch", "TLiveSwitch 获取 ABTest 开关, IABTestAdapter 为空，返回默认值" + str4);
            if (z2) {
                ((HashMap) map).put(str4, Boolean.valueOf(z));
            }
            return z;
        }
        boolean g = g(c2.b(str, str2, str3, String.valueOf(z)));
        o3s.b("TLiveSwitch", "TLiveSwitch 获取 ABTest 开关：" + str4 + ", 开关结果：" + g + ", 开关默认值：" + z);
        if (z2) {
            ((HashMap) map).put(str4, Boolean.valueOf(g));
        }
        return g;
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("410e5a8a", new Object[]{str})).booleanValue();
        }
        Map<String, Boolean> map = f17574a;
        Boolean bool = (Boolean) ((HashMap) map).get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(LauncherRuntime.h, str);
        ((HashMap) map).put(str, Boolean.valueOf(isFeatureOpened));
        o3s.b("TLiveSwitch", "TLiveSwitch 获取本地开关：" + str + ", 开关结果：" + isFeatureOpened);
        return isFeatureOpened;
    }

    public static boolean e(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79ed78c3", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return f(str, z, true);
    }

    public static boolean f(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3c251f9", new Object[]{str, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        Map<String, Boolean> map = b;
        Boolean bool = (Boolean) ((HashMap) map).get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        blc p = v2s.o().p();
        if (p == null) {
            o3s.b("TLiveSwitch", "TLiveSwitch 获取 Orange 开关，ILiveConfig 为空，返回默认值：" + z);
            if (z2) {
                ((HashMap) map).put(str, Boolean.valueOf(z));
            }
            return z;
        }
        String b2 = p.b("tblive", str, String.valueOf(z));
        o3s.b("TLiveSwitch", "TLiveSwitch 获取 Orange 开关：" + str + ", 开关结果：" + b2 + ", 开关默认值：" + z);
        boolean g = g(b2);
        if (z2) {
            ((HashMap) map).put(str, Boolean.valueOf(g));
        }
        return g;
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9b32eca", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception e) {
            o3s.b("TLiveSwitch", "TLiveSwitch 解析开关异常：" + e);
            return false;
        }
    }

    public static boolean c(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5bdb1714", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        return b("taolive", str, str2, z, true);
    }
}
