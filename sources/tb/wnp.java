package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.a;
import com.taobao.android.shop.application.ShopLauncher;
import com.taobao.android.shop.utils.ShopStat;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wnp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f30803a = false;

    static {
        t2o.a(764411948);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30f88c02", new Object[0]);
            return;
        }
        a.a("com.taobao.weappplus", null);
        a.a("com.taobao.search", null);
        if ("true".equals(OrangeConfig.getInstance().getConfig("shop_router", "shop_bundle_static_dependency", "false"))) {
            a.a("com.taobao.weapp", null);
            a.a("com.taobao.avplayer", null);
            a.a("com.taobao.relationship", null);
            a.a("com.taobao.trade.rate", null);
            a.a("com.taobao.android.capsule", null);
        }
    }

    public static synchronized void b() {
        synchronized (wnp.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[0]);
            } else if (!f30803a) {
                f30803a = true;
                a();
                d();
                c();
                new ShopLauncher().prepareJS(false);
                rdv.a(Globals.getApplication());
            }
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ec5930", new Object[0]);
        } else {
            ShopStat.INSTANCE.init();
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e25eb0", new Object[0]);
        }
    }
}
