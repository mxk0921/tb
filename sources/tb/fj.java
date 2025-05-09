package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, String> f19325a = new ConcurrentHashMap<>();

    static {
        t2o.a(79691958);
    }

    public static String a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65abb269", new Object[]{str, str2, str3, new Boolean(z)});
        }
        if (z) {
            String str4 = f19325a.get(str2);
            if (!TextUtils.isEmpty(str4)) {
                return str4;
            }
        }
        String config = OrangeConfig.getInstance().getConfig(str, str2, null);
        if (config == null) {
            f19325a.put(str2, str3);
            return str3;
        }
        f19325a.put(str2, config);
        return config;
    }

    public static String b(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a395c5df", new Object[]{str, str2, new Boolean(z)});
        }
        return a("aura_framework", str, str2, z);
    }

    public static boolean c(String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b928ec", new Object[]{str, str2, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (z2) {
            String str3 = f19325a.get(str2);
            if (!TextUtils.isEmpty(str3)) {
                return Boolean.parseBoolean(str3);
            }
        }
        String config = OrangeConfig.getInstance().getConfig(str, str2, null);
        if (config == null) {
            f19325a.put(str2, String.valueOf(z));
            return z;
        }
        f19325a.put(str2, config);
        return Boolean.parseBoolean(config);
    }

    public static boolean d(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fd8cc7a", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return e(str, z, false);
    }

    public static boolean e(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db417522", new Object[]{str, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        return c("aura_framework", str, z, z2);
    }
}
