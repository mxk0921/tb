package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.manager.FeatureManager;
import com.taobao.android.speed.TBSpeed;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m1s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f23724a;

        public a(Context context) {
            this.f23724a = context;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs("CrashReportSwitcher");
            if (configs != null && configs.size() > 0) {
                a(configs);
            }
        }

        public final void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c644b96", new Object[]{this, map});
                return;
            }
            boolean isSpeedEdition = TBSpeed.isSpeedEdition(this.f23724a, "UseNewTCrashAb");
            SharedPreferences.Editor edit = this.f23724a.getSharedPreferences(FeatureManager.FEATURE_KEY_CRASH, 0).edit();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                edit.putString(entry.getKey(), entry.getValue());
            }
            if (isSpeedEdition) {
                edit.putString("UseNewTCrashAb", "true").commit();
            } else {
                edit.putString("UseNewTCrashAb", "false").commit();
            }
        }
    }

    public static m1s a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m1s) ipChange.ipc$dispatch("c1a15cf8", new Object[0]);
        }
        return new m1s();
    }

    public void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{this, application});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"CrashReportSwitcher"}, new a(application), true);
        }
    }
}
