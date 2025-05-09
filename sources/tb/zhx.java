package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.ut.mini.core.WVUserTrack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zhx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593293);
    }

    public static void registerWindvane(boolean z) {
        Class<? extends kpw> cls;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942ed1e0", new Object[]{new Boolean(z)});
        } else if (!b1v.bWindvaneExtend) {
            nhh.v("UTAnalytics", "user disable WVTBUserTrack ");
        } else if (z) {
            nhh.v("UTAnalytics", "Has registered WVTBUserTrack plugin,not need to register again! ");
        } else {
            try {
                gw multiProcessAdapter = haj.getMultiProcessAdapter();
                Class<? extends kpw> cls2 = WVUserTrack.class;
                if (multiProcessAdapter != null) {
                    cls = multiProcessAdapter.isUiSubProcess() ? multiProcessAdapter.getSubProcessWVApiPluginClass() : cls2;
                } else {
                    cls = null;
                }
                if (cls != null) {
                    cls2 = cls;
                }
                fsw.i("WVTBUserTrack", cls2, true);
                nhh.f("UTAnalytics", "register WVTBUserTrack Success");
            } catch (Throwable th) {
                nhh.i("UTAnalytics", TLogTracker.SCENE_EXCEPTION, th.toString());
            }
        }
    }
}
