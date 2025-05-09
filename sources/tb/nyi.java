package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.ABTestModule;
import com.taobao.android.layoutmanager.module.AppMonitorModule;
import com.taobao.android.layoutmanager.module.BusinessModule;
import com.taobao.android.layoutmanager.module.FestivalModule;
import com.taobao.android.layoutmanager.module.GuangGuangModule;
import com.taobao.android.layoutmanager.module.ImagePreloadModule;
import com.taobao.android.layoutmanager.module.LBSModule;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.android.layoutmanager.module.NavigationTabModule;
import com.taobao.android.layoutmanager.module.OrangeModule;
import com.taobao.android.layoutmanager.module.PreloadModule;
import com.taobao.android.layoutmanager.module.RouteListenerModule;
import com.taobao.android.layoutmanager.module.ShareModule;
import com.taobao.android.layoutmanager.module.UserModule;
import com.taobao.android.layoutmanager.module.WindvaneModule;
import com.taobao.android.tab2liveroom.liveroom.preload.TBLivePreloadModule;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nyi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(502268163);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        o.T0("$user", UserModule.class);
        o.T0("$mtop", MtopModule.class);
        o.T0("$festival", FestivalModule.class);
        o.T0("$appMonitor", AppMonitorModule.class);
        o.T0("$share", ShareModule.class);
        o.T0("$windvane", WindvaneModule.class);
        o.T0("$orange", OrangeModule.class);
        o.T0("$tab", NavigationTabModule.class);
        o.T0("$preload", PreloadModule.class);
        o.T0("$ab", ABTestModule.class);
        o.T0("$business", BusinessModule.class);
        o.T0("$imagepreload", ImagePreloadModule.class);
        o.T0("$location", LBSModule.class);
        o.T0("$routeListener", RouteListenerModule.class);
        o.T0("$guangguang", GuangGuangModule.class);
        try {
            IpChange ipChange2 = TBLivePreloadModule.$ipChange;
            o.T0("$LivePreloadModule", TBLivePreloadModule.class);
            TLog.loge("LivePreloadModule", "初始化成功");
        } catch (Throwable th) {
            TLog.loge("LivePreloadModule", th.getMessage() + th.getStackTrace());
        }
    }
}
