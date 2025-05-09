package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t9l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(782237711);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1086f4ad", new Object[]{str, str2});
        }
        return OrangeConfig.getInstance().getConfig("taopai_data_core", str, str2);
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f7290ac", new Object[0])).intValue();
        }
        return vrq.b(a("material_min_file_size", String.valueOf(10)), 10);
    }

    public static int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97522bc2", new Object[]{new Integer(i)})).intValue();
        }
        return vrq.b(a("billing_upload_count", ""), i);
    }

    public static long d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfeb0f17", new Object[]{new Long(j)})).longValue();
        }
        return vrq.c(a(gaq.KEY_RESOURCE_CHECK_TIME, ""), j);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6cef252", new Object[0])).booleanValue();
        }
        return TextUtils.equals(a("open_billing", "true"), "true");
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f17d986", new Object[0])).booleanValue();
        }
        return TextUtils.equals(a("open_billing_cache", "true"), "true");
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70a919a", new Object[0])).booleanValue();
        }
        return TextUtils.equals(a("material_fail_retry", "true"), "true");
    }
}
