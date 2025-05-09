package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.ImageStatistics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class v0a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f29712a = "bizReqStart";
    public static String b = "bizReqProcessStart";
    public static String c = "bizRspProcessStart";
    public static String d = "bizRspCbDispatch";
    public static String e = "bizRspCbStart";
    public static String f = "bizRspCbEnd";
    public static String g = "bizFinish";

    static {
        t2o.a(620756994);
    }

    public static String a(ImageStatistics imageStatistics) {
        dpe r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b813293", new Object[]{imageStatistics});
        }
        if (imageStatistics == null || (r = imageStatistics.r()) == null) {
            return "";
        }
        return r.l();
    }

    public static void b(ImageStatistics imageStatistics, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b370ae", new Object[]{imageStatistics, str});
        } else {
            c(imageStatistics, str, "");
        }
    }

    public static void c(ImageStatistics imageStatistics, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("724b0af8", new Object[]{imageStatistics, str, str2});
            return;
        }
        mle s = s0m.B().s();
        if (s != null) {
            s.j(imageStatistics, str, str2);
        }
    }

    public static void d(ImageStatistics imageStatistics, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13908fae", new Object[]{imageStatistics, str});
        } else {
            c(imageStatistics, g, str);
        }
    }

    public static void e(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87e1fd48", new Object[]{imageStatistics});
            return;
        }
        imageStatistics.u = System.currentTimeMillis();
        b(imageStatistics, b);
    }

    public static void f(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d244d33", new Object[]{imageStatistics});
            return;
        }
        imageStatistics.F(System.currentTimeMillis());
        String str = f29712a;
        c(imageStatistics, str, "url=" + a(imageStatistics));
    }

    public static void g(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4be339f1", new Object[]{imageStatistics});
            return;
        }
        imageStatistics.w = System.currentTimeMillis();
        b(imageStatistics, d);
    }

    public static void h(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ba198a", new Object[]{imageStatistics});
            return;
        }
        imageStatistics.y = System.currentTimeMillis();
        b(imageStatistics, f);
    }

    public static void i(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e047e3", new Object[]{imageStatistics});
            return;
        }
        imageStatistics.x = System.currentTimeMillis();
        b(imageStatistics, e);
    }

    public static void j(ImageStatistics imageStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b44cf8f7", new Object[]{imageStatistics});
            return;
        }
        imageStatistics.v = System.currentTimeMillis();
        b(imageStatistics, c);
    }
}
