package com.taobao.android.navigationextern;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.navigationextern.a;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ano;
import tb.bud;
import tb.cw6;
import tb.e98;
import tb.hzt;
import tb.ife;
import tb.jhj;
import tb.obk;
import tb.q1r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NavigationExternSwitch extends q1r {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if ("uikit_sp_group".equals(str) && map != null) {
                String e = NavigationExternSwitch.e();
                String str2 = map.get("configVersion");
                if (TextUtils.equals(str2, e)) {
                    jhj.b("NavigationExternSwitch", "configVersion not change for version equals. version: " + str2);
                    return;
                }
                ano.a().b().putString("key_cache_tab", OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_cache_tab", "true")).putString("key_change_message_view_color", OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_change_message_view_color", null)).putString("guardian_v2_switch_on", OrangeConfig.getInstance().getConfig("uikit_sp_group", "guardian_v2_switch_on", "false")).putString("key_enable_edlp", OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_enable_edlp", "true")).putString("guardian_v2_clear_by_setting_switch_on", OrangeConfig.getInstance().getConfig("uikit_sp_group", "guardian_v2_clear_by_setting_switch_on", "true")).putString("i18n_icon_without_title", OrangeConfig.getInstance().getConfig("uikit_sp_group", "i18n_icon_without_title", "false")).putString("key_cache_file_size_threshold", OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_cache_file_size_threshold", "500")).putString("key_cache_tab_with_version", OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_cache_tab_with_version", "true")).putString("navigation_external_key_init_async_v1", OrangeConfig.getInstance().getConfig("uikit_sp_group", "navigation_external_key_init_async_v1", "false")).putString("orange_config_version", str2).commit();
                String config = OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_clean_cache_tab", "-1");
                if (!TextUtils.equals("-1", config)) {
                    ife.s().y(config);
                    jhj.b("NavigationExternSwitch", "clean cache: index: " + config);
                }
                String config2 = OrangeConfig.getInstance().getConfig("uikit_sp_group", "key_clean_biz_cache_with_version", "-1");
                if (!TextUtils.equals("-1", config2)) {
                    ife.s().z(config2);
                    jhj.b("NavigationExternSwitch", "clean biz cache with version: " + config2);
                }
                jhj.b("NavigationExternSwitch", "orange config updated; isCacheTabSwitchOpen:" + NavigationExternSwitch.l() + " isCleanCacheSwitchOpen? " + config);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22967dd2", new Object[0])).booleanValue();
        }
        if (!cw6.b()) {
            return TBRevisionSwitchManager.c().m();
        }
        if (q1r.c(".newTBMain") || TBRevisionSwitchManager.c().m()) {
            return true;
        }
        return false;
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f1cc7ca", new Object[0])).booleanValue();
        }
        return TBRevisionSwitchManager.c().d(bud.KEY_NEW_DISCOVERY_ENABLE) && hzt.d();
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4675e1db", new Object[0])).booleanValue();
        }
        if ("false".equals(OrangeConfig.getInstance().getConfig("TBAppUISkeletonConfig", "elderAdaptation", "true")) || i() || !p()) {
            TLog.loge("NavigationExternSwitch", "isTabBarElderHomeStyle: false");
            return false;
        }
        TLog.loge("NavigationExternSwitch", "isTabBarElderHomeStyle: true");
        return true;
    }

    public static void D(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb6a212", new Object[]{bVar});
        } else {
            e98.e(bVar);
        }
    }

    public static void E(Context context, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("391f86d7", new Object[]{context, bVar});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("taobao.action.ACTION_REVISION_SWITCH_CHANGE");
        LocalBroadcastManager.getInstance(context).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.navigationextern.NavigationExternSwitch.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/navigationextern/NavigationExternSwitch$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else {
                    ((a.b) b.this).a(context2, intent, NavigationExternSwitch.d().get(), NavigationExternSwitch.y());
                }
            }
        }, intentFilter);
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71a61506", new Object[0])).booleanValue();
        }
        return u() && x("i18n_icon_without_title", "false");
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d2687fd", new Object[0])).booleanValue();
        }
        if (!Localization.o() || Localization.h() != Language.MALAY) {
            return false;
        }
        return true;
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f591a19", new Object[0])).booleanValue();
        }
        if (!Localization.o() || Localization.h() != Language.THAI) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ AtomicBoolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("baff37f7", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return h();
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c58d985c", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(ano.a().c("key_cache_file_size_threshold", "500"));
        } catch (Exception unused) {
            return 500;
        }
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4961bdcc", new Object[0]);
        }
        return ano.a().c("key_change_message_view_color", null);
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a95e4e4d", new Object[0]);
        }
        return ano.a().c("orange_config_version", "-1");
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f224bfb", new Object[0])).booleanValue();
        }
        if (!FestivalMgr.i().q() || !FestivalMgr.i().y()) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(NavigationExternSwitch navigationExternSwitch, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/navigationextern/NavigationExternSwitch");
    }

    public static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        e98.c();
        k();
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7734abb9", new Object[0]);
        } else if (!c) {
            OrangeConfig.getInstance().registerListener(new String[]{"uikit_sp_group"}, new a(), true);
            c = true;
        }
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecb522e7", new Object[0])).booleanValue();
        }
        return !Localization.o() && x("key_cache_tab", "true");
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("711fea47", new Object[0])).booleanValue();
        }
        return x("key_cache_tab_with_version", "true");
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa5935ed", new Object[0])).booleanValue();
        }
        return y();
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2958cb82", new Object[0])).booleanValue();
        }
        return e98.d();
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d64e2f4", new Object[0])).booleanValue();
        }
        return "1".equals(TBRevisionSwitchManager.c().e("elderHome"));
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f7be7db", new Object[0])).booleanValue();
        }
        return x("key_enable_edlp", "true");
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7b829a1", new Object[0])).booleanValue();
        }
        return x("guardian_v2_clear_by_setting_switch_on", "true");
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2029195", new Object[0])).booleanValue();
        }
        return x("guardian_v2_switch_on", "false");
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94022b98", new Object[0])).booleanValue();
        }
        if (!Localization.o() || Localization.h() != Language.RUSSIAN) {
            return false;
        }
        return true;
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a8de034", new Object[0])).booleanValue();
        }
        if (!Localization.o() || i()) {
            return false;
        }
        return true;
    }

    public static boolean v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88cca323", new Object[]{context})).booleanValue();
        }
        return x("navigation_external_key_init_async_v1", "false");
    }

    public static boolean w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a2c7f49", new Object[]{str})).booleanValue();
        }
        return new File("/data/local/tmp/.navigation_" + str).exists();
    }

    public static boolean x(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("252ee50", new Object[]{str, str2})).booleanValue();
        }
        if (!cw6.b() || !w("local_switch")) {
            return Boolean.parseBoolean(ano.a().c(str, str2));
        }
        jhj.b("NavigationExternSwitch", "use local switch: key " + str);
        return w(str);
    }

    public static boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e12b278", new Object[0])).booleanValue();
        }
        return TBRevisionSwitchManager.c().n();
    }

    public static boolean z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8f00001", new Object[]{context})).booleanValue();
        }
        return TBRevisionSwitchManager.c().d(bud.KEY_NEW_DISCOVERY_ENABLE);
    }
}
