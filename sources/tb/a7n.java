package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.io.File;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a7n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SWITCH = "switch_on";
    public static final String KEY_TEST_LOCAL_SWITCH = ".test_switch_on";
    public static final String PATH_LOCAL_SWITCH_FOLDER = "/data/local/tmp/.tbquality/";
    public static final String SP_NAMESPACE = "tb_quality_android";

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f15585a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (a7n.SP_NAMESPACE.equals(str)) {
                String config = OrangeConfig.getInstance().getConfig(a7n.SP_NAMESPACE, a7n.KEY_SWITCH, "false");
                a7n.a().edit().putString(a7n.KEY_SWITCH, config).apply();
                w6n.a("TBQualitySwitches", "orange config updated, orange update from network", ";namespace:", a7n.SP_NAMESPACE, "; KEY_SWITCH:", config, ";");
            }
        }
    }

    static {
        t2o.a(634388487);
        new File("/data/local/tmp/.tbquality/.test_switch_on").exists();
    }

    public static /* synthetic */ SharedPreferences a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("1f071a8b", new Object[0]);
        }
        return f15585a;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c904294", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = f15585a;
        if (sharedPreferences == null) {
            return false;
        }
        return Boolean.parseBoolean(sharedPreferences.getString(KEY_SWITCH, "true"));
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        f15585a = context.getSharedPreferences(SP_NAMESPACE, 0);
        OrangeConfig.getInstance().registerListener(new String[]{SP_NAMESPACE}, new a(), false);
    }
}
