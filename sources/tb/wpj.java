package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wpj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f30841a;
    public static SharedPreferences b;

    public static /* synthetic */ SharedPreferences a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("1f071a8b", new Object[0]);
        }
        return b;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebcd7691", new Object[0]);
        }
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences == null) {
            return "^(更新|回复).*$|^\\s*$";
        }
        return sharedPreferences.getString("key_common_mark_text_guardian_rule", "^(更新|回复).*$|^\\s*$");
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7734abb9", new Object[0]);
        } else if (!f30841a) {
            Context b2 = y9a.b();
            if (b2 == null) {
                TLog.loge(y9a.c(), "NavigationSwitch", "initOrangeSwitch error. context is null");
                return;
            }
            b = b2.getSharedPreferences("uikit_sp_group", 0);
            OrangeConfig.getInstance().registerListener(new String[]{"uikit_sp_group"}, new a(), true);
            f30841a = true;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f604a1d", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences == null) {
            return false;
        }
        return !sharedPreferences.getBoolean("key_cache_tab", true);
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88230187", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences == null) {
            return true;
        }
        return sharedPreferences.getBoolean("key_use_new_title_style", false);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dce18847", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences == null) {
            return true;
        }
        return sharedPreferences.getBoolean("key_hide_tab", true);
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da619728", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences == null) {
            return true;
        }
        return sharedPreferences.getBoolean("key_intercept_click_event", true);
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc23523", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.getBoolean("key_judge_fragment_added_at_attached_to_window", true);
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9eb536d", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences == null) {
            return true;
        }
        return sharedPreferences.getBoolean("key_navigation_guardian", true);
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c466fca5", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.getBoolean("key_offline_init_bundle_at_tab_change", false);
    }

    public static boolean m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("330030dd", new Object[]{context})).booleanValue();
        }
        return TBSpeed.isSpeedEdition(context, "key_pre_load_indicator_view");
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e18ffb24", new Object[0])).booleanValue();
        }
        SharedPreferences sharedPreferences = b;
        if (sharedPreferences == null) {
            return true;
        }
        return sharedPreferences.getBoolean("key_use_new_login", true);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (!"uikit_sp_group".equals(str)) {
            } else {
                if (wpj.a() == null) {
                    rpj.a("switch_error", "sp is null");
                    TLog.loge(y9a.c(), "NavigationSwitch", "update switch error. sp is null");
                    return;
                }
                SharedPreferences.Editor edit = wpj.a().edit();
                boolean parseBoolean = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_cache_tab", "true"));
                boolean parseBoolean2 = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_hide_tab", "true"));
                boolean parseBoolean3 = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_navigation_guardian", "true"));
                boolean parseBoolean4 = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_offline_init_bundle_at_tab_change", "false"));
                boolean parseBoolean5 = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_judge_fragment_added_at_attached_to_window", "true"));
                boolean parseBoolean6 = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_use_new_login", "true"));
                boolean parseBoolean7 = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_intercept_click_event", "true"));
                boolean parseBoolean8 = Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_use_new_title_style", "false"));
                String config = OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_common_mark_text_guardian_rule", "^(更新|回复).*$|^\\s*$");
                edit.putBoolean("key_cache_tab", parseBoolean).putBoolean("key_hide_tab", parseBoolean2).putBoolean("key_navigation_guardian", parseBoolean3).putBoolean("key_offline_init_bundle_at_tab_change", parseBoolean4).putBoolean("key_judge_fragment_added_at_attached_to_window", parseBoolean5).putString("key_common_mark_text_guardian_rule", config).putBoolean("key_use_new_title_style", parseBoolean8).putBoolean("key_use_new_login", parseBoolean6).putBoolean("key_intercept_click_event", parseBoolean7).commit();
                String c = y9a.c();
                TLog.loge(c, "NavigationSwitch", "KEY_CACHE_TAB is:" + parseBoolean + "; KEY_HIDE_TAB is :" + parseBoolean2 + "; KEY_NAVIGATION_GUARDIAN is :" + parseBoolean3 + "; KEY_COMMON_MARK_TEXT_GUARDIAN_RULE is :" + config + "; KEY_OFFLINE_INIT_BUNDLE_AT_TAB_CHANGE is :" + parseBoolean4 + "; KEY_USE_NEW_TITLE_STYLE is :" + parseBoolean8 + "; KEY_USE_NEW_LOGIN is :" + parseBoolean6 + "; KEY_INTERCEPT_CLICK_EVENT is :" + parseBoolean7 + "; KEY_JUDGE_FRAGMENT_ADDED_AT_ATTACHED_TO_WINDOW is :" + parseBoolean5);
            }
        }
    }
}
