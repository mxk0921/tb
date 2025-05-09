package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.manager.FeatureManager;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import com.taobao.android.launcher.common.LauncherRuntime;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x0r implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f31056a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final x0r f31057a = new x0r();

        public static /* synthetic */ x0r a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x0r) ipChange.ipc$dispatch("c0bfaf02", new Object[0]);
            }
            return f31057a;
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba59409", new Object[]{context, str});
        } else {
            a.a().b(context, str);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac13492", new Object[]{this, sharedPreferences, str});
            return;
        }
        whh.a("SwitchMonitor", "switcher value changed, key=" + str + ", proc=" + this.f31056a);
        if (TextUtils.equals("OptAppExitAnr", str)) {
            String string = sharedPreferences.getString(str, null);
            whh.a("SwitchMonitor", "switcher value changed, val=" + string + ", proc=" + this.f31056a);
            boolean a2 = t.a(LauncherRuntime.g, "OptAppExitAnrOff");
            if (Boolean.parseBoolean(string) && a2) {
                whh.a("SwitchMonitor", "change switcher value to false in changed callback");
                sharedPreferences.edit().putString("OptAppExitAnr", "false").apply();
            }
        }
    }

    public void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aecd9f17", new Object[]{this, context, str});
            return;
        }
        this.f31056a = str;
        SharedPreferences sharedPreferences = context.getSharedPreferences(FeatureManager.FEATURE_KEY_CRASH, 0);
        String string = sharedPreferences.getString("OptAppExitAnr", null);
        boolean a2 = t.a(context, "OptAppExitAnrOff");
        boolean z = true ^ a2;
        Dispatchers.a("SwitcherOrangeStatus", String.valueOf(string));
        Dispatchers.a("SwitcherABStatus", String.valueOf(z));
        if (Boolean.parseBoolean(string) && a2) {
            whh.a("SwitchMonitor", "change switcher value to false");
            sharedPreferences.edit().putString("OptAppExitAnr", "false").apply();
        }
        AppMonitor.Counter.commit(erj.MODULE, "SwitchMonitor", "OptAppExitAnr=" + string + ",proc=" + str, 1.0d);
        whh.a("SwitchMonitor", "switcher value obtained val=" + string + ", abVal=" + z + ", proc=" + str);
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }
}
