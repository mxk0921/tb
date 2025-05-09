package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s1d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(737149025);
    }

    public static void a(String str, h1d h1dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523929ce", new Object[]{str, h1dVar});
        } else {
            c(str, h1dVar, h1d.DEFAULT);
        }
    }

    public static void b(String str, l2d l2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe6c36e", new Object[]{str, l2dVar});
        } else {
            d(str, l2dVar, l2d.DEFAULT);
        }
    }

    public static void c(String str, h1d h1dVar, h1d h1dVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b28333", new Object[]{str, h1dVar, h1dVar2});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("io_monitor");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("io_monitor_io_info");
        uTHitBuilders$UTCustomHitBuilder.setProperty("scene", str);
        uTHitBuilders$UTCustomHitBuilder.setProperty(h1d.CONSTANT_READ_CHAR, (h1dVar.d() - h1dVar2.d()) + "");
        uTHitBuilders$UTCustomHitBuilder.setProperty(h1d.CONSTANT_WRITE_CHAR, (h1dVar.h() - h1dVar2.h()) + "");
        uTHitBuilders$UTCustomHitBuilder.setProperty(h1d.CONSTANT_READ_BYTES, (h1dVar.c() - h1dVar2.c()) + "");
        uTHitBuilders$UTCustomHitBuilder.setProperty(h1d.CONSTANT_WRITE_BYTES, (h1dVar.g() - h1dVar2.g()) + "");
        uTHitBuilders$UTCustomHitBuilder.setProperty(h1d.CONSTANT_SYS_CALL_READ, (h1dVar.e() - h1dVar2.e()) + "");
        uTHitBuilders$UTCustomHitBuilder.setProperty(h1d.CONSTANT_SYS_CALL_WRITE, (h1dVar.f() - h1dVar2.f()) + "");
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }

    public static void d(String str, l2d l2dVar, l2d l2dVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bf8b71e", new Object[]{str, l2dVar, l2dVar2});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("io_monitor");
        uTHitBuilders$UTCustomHitBuilder.setEventPage("io_monitor_io_wait_info");
        uTHitBuilders$UTCustomHitBuilder.setProperty("scene", str);
        long c = l2dVar.c() - l2dVar2.c();
        double b = l2dVar.b() - l2dVar2.b();
        uTHitBuilders$UTCustomHitBuilder.setProperty(l2d.CONSTANT_IO_WAIT_COUNT, (l2dVar.a() - l2dVar2.a()) + "");
        uTHitBuilders$UTCustomHitBuilder.setProperty(l2d.CONSTANT_IO_WAIT_SUM, b + "");
        uTHitBuilders$UTCustomHitBuilder.setProperty("io_wait_time_proportion", (b / ((double) c)) + "");
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }
}
