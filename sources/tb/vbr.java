package tb;

import android.app.Application;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vbr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GROUP_NAME = "TBElder";
    public static final String KEY_AB_SWITCH_NAME = "TBElderABSwitch";
    public static final String KEY_SWITCH_NAME = "TBElderSwitch";
    public static final String TAG = "TBElderSwitcher";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            vbr.f(vbr.KEY_SWITCH_NAME);
            vbr.f(vbr.KEY_AB_SWITCH_NAME);
        }
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1146d80", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        if (Globals.getApplication() == null) {
            return z;
        }
        return Globals.getApplication().getSharedPreferences("TBElder", 0).getBoolean(str, z);
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0c82900", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return Boolean.TRUE.toString().equals(OrangeConfig.getInstance().getConfig("TBElder", str, String.valueOf(z)));
    }

    public static boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b59f1b9d", new Object[]{new Boolean(z)})).booleanValue();
        }
        if (!z) {
            return b(KEY_AB_SWITCH_NAME, true);
        }
        return a(KEY_AB_SWITCH_NAME, true);
    }

    public static boolean d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20b87e1e", new Object[]{new Boolean(z)})).booleanValue();
        }
        if (!z) {
            return b(KEY_SWITCH_NAME, true);
        }
        return a(KEY_SWITCH_NAME, true);
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c111c8c", new Object[0]);
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"TBElder"}, new a(), true);
        }
    }

    public static void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6dc7b97", new Object[]{str});
            return;
        }
        boolean b = b(str, true);
        Application application = Globals.getApplication();
        if (application != null) {
            SharedPreferences.Editor edit = application.getSharedPreferences("TBElder", 0).edit();
            edit.putBoolean(str, b);
            edit.apply();
        }
    }
}
