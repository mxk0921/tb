package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i0r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f21022a = 15000;
    public static int b = 30;

    static {
        t2o.a(301990100);
    }

    public i0r() {
        l();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69c78871", new Object[0])).booleanValue();
        }
        return e("disablePrefetchCompare", true);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1c725b8", new Object[0])).booleanValue();
        }
        return e("enableAsyncViewPreLoaderDestroyContext", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aed6458c", new Object[0])).booleanValue();
        }
        return e("enableCCRCService", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d22c7af", new Object[0])).booleanValue();
        }
        return e("enableLogicPerf", true);
    }

    public static boolean e(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("221a66e8", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return Boolean.parseBoolean(j(str, String.valueOf(z)));
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67cdd088", new Object[0])).intValue();
        }
        return b;
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("590769d8", new Object[0])).intValue();
        }
        return f21022a;
    }

    public static int h(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d64674d", new Object[]{str, new Integer(i)})).intValue();
        }
        return pn.c(j(str, String.valueOf(i)), i);
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a08c41d", new Object[0]);
        }
        return j("prefetchSampling", "100");
    }

    public static String j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d8d7c7b", new Object[]{str, str2});
        }
        return OrangeConfig.getInstance().getConfig("new_purchase", str, str2);
    }

    public static String k(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3149bf31", new Object[]{str, str2, str3});
        }
        return OrangeConfig.getInstance().getConfig("new_purchase", str2, str3);
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646251b5", new Object[]{this});
            return;
        }
        f21022a = h("defaultSocketTimeoutMillisecond", 15000);
        b = h("defaultNextRPCAllTimeoutSeconds", 30);
    }
}
