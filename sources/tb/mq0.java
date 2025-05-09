package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.AliMUShareModule;
import com.taobao.android.weex_ability.WXBroadcastModule;
import com.taobao.android.weex_ability.WXUserTrackModule;
import com.taobao.android.weex_ability.connection.MUSConnectionModule;
import com.taobao.android.weex_ability.modules.WXAPMModule;
import com.taobao.android.weex_ability.modules.WeexMegaBridgeModule;
import com.taobao.android.weex_ability.modules.WeexZipModule;
import com.taobao.android.weex_ability.mtop.MUSMtopModule;
import com.taobao.android.weex_ability.page.AliMSNavigationBarModule;
import com.taobao.android.weex_ability.page.AliMUSPageModule;
import com.taobao.android.weex_ability.page.MUSEventModule;
import com.taobao.android.weex_ability.page.MUSLiteAppModule;
import com.taobao.android.weex_ability.windvane.WXWindVaneModule;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mq0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f24227a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements e4d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("767dd743", new Object[]{this})).booleanValue();
            }
            try {
                return "true".equals(OrangeConfig.getInstance().getConfig("open_ability_common", "open_ability_monitor", "true"));
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    static {
        t2o.a(980418561);
    }

    public static synchronized void a() {
        synchronized (mq0.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fede197", new Object[0]);
            } else if (!f24227a) {
                f24227a = true;
                MUSMonitor.l(new a());
                f7x.a("apm", WXAPMModule.class);
                f7x.a("windvane", WXWindVaneModule.class);
                f7x.a("userTrack", WXUserTrackModule.class);
                f7x.a("broadcast", WXBroadcastModule.class);
                MUSEngine.registerModule("mtop", MUSMtopModule.class);
                MUSEngine.registerModule("connection", MUSConnectionModule.class);
                MUSEngine.registerModule(AliMSNavigationBarModule.NAME, AliMSNavigationBarModule.class);
                MUSEngine.registerModule(AliMUSPageModule.NAME, AliMUSPageModule.class);
                MUSEngine.registerModule("share", AliMUShareModule.class);
                MUSEngine.registerModule("event", MUSEventModule.class);
                MUSEngine.registerModule(MUSLiteAppModule.NAME, MUSLiteAppModule.class);
                MUSEngine.registerModule(WeexZipModule.NAME, WeexZipModule.class);
                f7x.a(WeexMegaBridgeModule.NAME, WeexMegaBridgeModule.class);
            }
        }
    }
}
