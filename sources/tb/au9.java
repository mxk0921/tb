package tb;

import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class au9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(759169065);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d095df1", new Object[0])).longValue();
        }
        return PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getLong("followsdk_readweitao_lasttime", 0L);
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f370381", new Object[0])).longValue();
        }
        return PreferenceManager.getDefaultSharedPreferences(Globals.getApplication()).getLong("followsdk_showguide_lasttime", 0L);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b39a578", new Object[0])).booleanValue();
        }
        return f(a(), "readWeitao");
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0b4713a", new Object[0])).booleanValue();
        }
        return f(b(), "showGuide");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a56cd2c", new Object[0])).booleanValue();
        }
        return TextUtils.equals(OrangeConfig.getInstance().getConfig("weitao_switch", "follow_query_degree", ""), "true");
    }

    public static boolean f(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39d2009", new Object[]{new Long(j), str})).booleanValue();
        }
        if (j == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(", no record");
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = (currentTimeMillis - j) / 86400000;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(", ct = ");
        sb2.append(currentTimeMillis);
        sb2.append(", rt = ");
        sb2.append(j);
        sb2.append(", day = ");
        sb2.append(j2);
        if (j2 >= 14) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df2f8a00", new Object[0])).booleanValue();
        }
        if (!d() || !c()) {
            return false;
        }
        return true;
    }
}
