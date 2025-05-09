package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.xbs.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ksr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(744489066);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab825b21", new Object[0]);
            return;
        }
        ((a) pg0.i().g).h();
        vp9.a("linkx", "TBPluginCompoment === hideTips :隐藏");
    }

    public static void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee27d82e", new Object[]{activity});
        } else if (activity != null) {
            ((a) pg0.i().g).l(activity);
            vp9.a("linkx", "TBPluginCompoment === showTips :展示");
        }
    }
}
