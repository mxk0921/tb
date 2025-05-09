package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sal {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_GROUP_NAME = "tb_revision_homepage_switch";
    public static final String ORANGE_KEY_LAUNCHER_SWITCH = "launcherSwitch";
    public static final String ORANGE_NEW_DISCOVERY_GROUP_NAME = "tb_revision_new_discovery_switch";
    public static final String ORANGE_SIMPLE_GROUP_NAME = "tb_revision_simple_switch";

    /* renamed from: a  reason: collision with root package name */
    public b f27909a;
    public final wnq b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            try {
                if (sal.ORANGE_GROUP_NAME.equals(str)) {
                    TLog.loge("OrangeSwitchManager", "into update orange tb_revision_homepage_switch config");
                    String customConfig = OrangeConfig.getInstance().getCustomConfig(str, null);
                    if (!TextUtils.equals(customConfig, sal.a(sal.this).d("orange"))) {
                        sal.a(sal.this).l("orange", customConfig);
                        sal.b(sal.this).a("orange", customConfig);
                    }
                } else if (sal.ORANGE_SIMPLE_GROUP_NAME.equals(str)) {
                    TLog.loge("OrangeSwitchManager", "into update orange tb_revision_simple_switch config");
                    String customConfig2 = OrangeConfig.getInstance().getCustomConfig(str, null);
                    if (!TextUtils.equals(customConfig2, sal.a(sal.this).d(bmp.KEY_SIMPLE_SWITCH_ORANGE))) {
                        sal.a(sal.this).l(bmp.KEY_SIMPLE_SWITCH_ORANGE, customConfig2);
                    }
                } else if (sal.ORANGE_NEW_DISCOVERY_GROUP_NAME.equals(str)) {
                    TLog.loge("OrangeSwitchManager", "into update orange tb_revision_new_discovery_switch config");
                    String config = OrangeConfig.getInstance().getConfig(str, "open", null);
                    if (!TextUtils.equals(config, sal.a(sal.this).d(bmp.KEY_NEW_DISCOVERY_ORANGE))) {
                        sal.a(sal.this).l(bmp.KEY_NEW_DISCOVERY_ORANGE, config);
                    }
                }
            } catch (Throwable th) {
                TLog.loge("OrangeSwitchManager", "init Exception " + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a(String str, String str2);
    }

    public sal(wnq wnqVar) {
        this.b = wnqVar;
    }

    public static /* synthetic */ wnq a(sal salVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wnq) ipChange.ipc$dispatch("9a008cc6", new Object[]{salVar});
        }
        return salVar.b;
    }

    public static /* synthetic */ b b(sal salVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("dff6f269", new Object[]{salVar});
        }
        return salVar.f27909a;
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("138974c", new Object[]{this, str});
        }
        return this.b.d(str);
    }

    public zzq d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zzq) ipChange.ipc$dispatch("d948faee", new Object[]{this, str});
        }
        return this.b.g(str);
    }

    public void f(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d256d9fd", new Object[]{this, bVar});
        } else {
            this.f27909a = bVar;
        }
    }

    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{ORANGE_GROUP_NAME, ORANGE_SIMPLE_GROUP_NAME, ORANGE_NEW_DISCOVERY_GROUP_NAME}, new a(), true);
        }
    }
}
