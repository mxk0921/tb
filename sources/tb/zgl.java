package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zgl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_TAG = "tmghklocal";

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b60f5419", new Object[0]);
            return;
        }
        TLog.logd(MODULE_TAG, zgl.class.getSimpleName(), "launchTmgBundleRendered");
        d();
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe61a81", new Object[0]);
            return;
        }
        try {
            PositionInfo i = o78.i(Globals.getApplication());
            IpChange ipChange2 = yox.$ipChange;
            yox.n(bzt.b(i.countryCode));
        } catch (Exception unused) {
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa37bc9d", new Object[0]);
            return;
        }
        try {
            TLog.logd(MODULE_TAG, zgl.class.getSimpleName(), "editionChanged");
            dhg.b().d(Globals.getApplication());
            d();
        } catch (Exception e) {
            ohh.a("OverseaManager", "editionChanged ex", e.toString());
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb80ed9", new Object[0]);
            return;
        }
        try {
            TLog.logd(MODULE_TAG, zgl.class.getSimpleName(), "launchTmgBundleBeforeRender");
            dhg.b().c(Globals.getApplication());
        } catch (Exception e) {
            ohh.a("OverseaManager", "launchTmgBundleBeforeRender ex", e.toString());
        }
    }
}
