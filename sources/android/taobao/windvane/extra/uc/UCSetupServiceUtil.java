package android.taobao.windvane.extra.uc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.r9u;
import tb.t2o;
import tb.vpw;
import tb.xsw;
import tb.ypw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class UCSetupServiceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856088);
    }

    public static void configUCSettingsBeforeInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa393aa9", new Object[0]);
        } else {
            UCSetupService.configUCSettingsBeforeInit();
        }
    }

    public static void preloadUCNecessaryConfigSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da4bd7dc", new Object[0]);
            return;
        }
        r9u.b("preloadUCNecessaryConfig");
        vpw.b().d();
        xsw.b().d();
        ypw.b().d();
        r9u.d();
    }
}
