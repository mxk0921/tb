package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x6u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(623902756);
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eec2bef3", new Object[]{str, new Long(j)})).longValue();
        }
        String config = OrangeConfig.getInstance().getConfig("taopai", str, null);
        if (config == null) {
            return j;
        }
        try {
            return Long.parseLong(config);
        } catch (Exception unused) {
            return j;
        }
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87eafed8", new Object[0])).longValue();
        }
        return a("remote_download_timeout", 60000L);
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31d4edc", new Object[]{str, str2});
        }
        return OrangeConfig.getInstance().getConfig("taopai", str, str2);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93c53f47", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(c("is_enable_pad_adapt", "true"));
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("536b8f6b", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(c("is_enable_record_config", "true"));
    }

    public static List<String> g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("481c556d", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Arrays.asList(str.split(str2));
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9ab1332", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return g(c("pad_not_full_white_list", "message"), ",").contains(str);
    }
}
