package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.asp.d;
import com.taobao.orange.OrangeConfig;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class hbl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final hbl INSTANCE = new hbl();

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20531a;
    public static boolean b;

    static {
        t2o.a(140509194);
    }

    @JvmStatic
    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3378568d", new Object[0])).booleanValue();
        }
        if (!c()) {
            return false;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "downgradeImagePreview", "false"));
    }

    @JvmStatic
    public static final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("214eea11", new Object[0])).booleanValue();
        }
        if (!c()) {
            return false;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "enableMtopPostQ", "true"));
    }

    @JvmStatic
    public static final boolean c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("497e2210", new Object[0])).booleanValue();
        }
        if (b) {
            return f20531a;
        }
        try {
            OrangeConfig.getInstance();
            z = true;
        } catch (ClassNotFoundException | NoClassDefFoundError | NoSuchMethodError | NoSuchMethodException unused) {
        }
        f20531a = z;
        b = true;
        return z;
    }

    @JvmStatic
    public static final boolean d() {
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ec3cb18", new Object[0])).booleanValue();
        }
        if (c()) {
            try {
                config = OrangeConfig.getInstance().getConfig("ability_kit", "imagePreviewUseNewVersion", null);
                if (config == null) {
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return Boolean.parseBoolean(config);
    }

    @JvmStatic
    public static final long e(String str) {
        String config;
        Long o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2a673ec3", new Object[]{str})).longValue();
        }
        ckf.g(str, "bizId");
        return (!c() || (config = OrangeConfig.getInstance().getConfig("mega_kv_storage_quota", str, null)) == null || (o = ssq.o(config)) == null) ? d.c.ALARM_SIZE : o.longValue();
    }

    @JvmStatic
    public static final String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0b08f30", new Object[]{str, str2});
        }
        ckf.g(str, "key");
        if (!c()) {
            return str2;
        }
        return OrangeConfig.getInstance().getConfig("ability_kit", str, str2);
    }

    @JvmStatic
    public static final boolean g() {
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a672ce7d", new Object[0])).booleanValue();
        }
        if (c()) {
            try {
                config = OrangeConfig.getInstance().getConfig("ability_kit", "enablePopMonitor", null);
                if (config == null) {
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return Boolean.parseBoolean(config);
    }

    @JvmStatic
    public static final Float h() {
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("c1981b39", new Object[0]);
        }
        if (c()) {
            try {
                config = OrangeConfig.getInstance().getConfig("ability_kit", "shakeIntensityDiffValue", null);
                if (config == null) {
                    return null;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return rsq.l(config);
    }

    @JvmStatic
    public static final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4685852c", new Object[0])).booleanValue();
        }
        if (c()) {
            try {
                String config = OrangeConfig.getInstance().getConfig("ability_kit", "isDisableSwipeToClose", null);
                if (config != null) {
                    return Boolean.parseBoolean(config);
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    public static final boolean j(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e505801", new Object[]{str})).booleanValue();
        }
        if (!c() || str == null) {
            return false;
        }
        try {
            obj = JSON.parse(OrangeConfig.getInstance().getConfig("ariver_common_config", "keepAliveWhiteList", ""));
        } catch (Exception unused) {
            obj = null;
        }
        if (obj instanceof JSONArray) {
            return ((JSONArray) obj).contains(str);
        }
        return false;
    }

    @JvmStatic
    public static final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f98bb60e", new Object[0])).booleanValue();
        }
        if (!c()) {
            return false;
        }
        return ckf.b("true", OrangeConfig.getInstance().getConfig("ability_kit", "showAudioFloat", "true"));
    }

    public final boolean l() {
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16552a89", new Object[]{this})).booleanValue();
        }
        if (c()) {
            try {
                config = OrangeConfig.getInstance().getConfig("ability_kit", "enableNanoComposeAlert", null);
                if (config == null) {
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return Boolean.parseBoolean(config);
    }
}
