package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.ut.device.UTDevice;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class k5v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UBF_ORANGE_CONFIG = "ut_extend_configs";
    public static final String[] UBF_ORANGE_CONFIGS = {UBF_ORANGE_CONFIG};

    /* renamed from: a  reason: collision with root package name */
    public static String f22422a = "";
    public static int b = 10000;
    public static int c = 10000;
    public static final String d = "UbfOrangeConfMgr";

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return d;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return f22422a;
    }

    public static /* synthetic */ String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de613c1c", new Object[]{str});
        }
        f22422a = str;
        return str;
    }

    public static /* synthetic */ int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26a27dec", new Object[0])).intValue();
        }
        return b;
    }

    public static /* synthetic */ int e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b117655b", new Object[]{new Integer(i)})).intValue();
        }
        b = i;
        return i;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("728ed0e3", new Object[0])).booleanValue();
        }
        return !g();
    }

    public static boolean g() {
        Context g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab79fadc", new Object[0])).booleanValue();
        }
        if (c == 10000 && (g = vyp.i().g()) != null) {
            c = Math.abs(l5v.a(UTDevice.getUtdid(g))) % 10000;
        }
        if (c < b) {
            return true;
        }
        return false;
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        try {
            OrangeConfig.getInstance().registerListener(UBF_ORANGE_CONFIGS, new a(), true);
        } catch (Throwable unused) {
            b = 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            String str2 = map.get("configVersion");
            j5v.c(k5v.a(), "orange config ready.namespace", str, "newVersion", str2);
            if (!str2.equals(k5v.b())) {
                k5v.c(str2);
                if (k5v.UBF_ORANGE_CONFIG.equals(str)) {
                    try {
                        k5v.e(Integer.valueOf(OrangeConfig.getInstance().getConfig(str, "ubf_sample", "0")).intValue());
                        j5v.c(k5v.a(), "samplingSeed from orange", Integer.valueOf(k5v.d()));
                    } catch (Throwable unused) {
                        k5v.e(0);
                    }
                }
            }
        }
    }

    static {
        t2o.a(964689933);
    }
}
