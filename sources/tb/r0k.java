package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import anetwork.channel.config.NetworkConfigCenter;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.task.Coordinator;
import com.taobao.message.notification.constans.SettingContants;
import com.taobao.mytaobao.newsetting.GeneralSetting;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.utils.Global;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class r0k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ASSISTANT = "VoiceOver";
    public static final String KEY_CART_SHAKE = "cartShake";
    public static final String KEY_CLEAN_CACHE = "cleancache";
    public static final String KEY_FONT_SIZE = "font_size";
    public static final String KEY_HOMEPAGE_SHAKE = "shake";
    public static final String KEY_INLINE_VOLUME = "inlineVolume";
    public static final String KEY_LIVE_BACKGROUND_PLAY = "showLiveBgPlay";
    public static final String KEY_LIVE_MUTE = "liveMute";
    public static final String KEY_LOCATION_SERVICE = "location_service";
    public static final String KEY_MUTE = "mute";
    public static final String KEY_NETWORK_DIAGNOSE = "network_diagnose";
    public static final String KEY_NETWORK_SPEEDUP = "network_speed_up";
    public static final String KEY_OCR = "ocr";
    public static final String KEY_REGION = "region";
    public static final String KEY_SHOW_SHARE_DIALOG_AFTER_CUT = "share";
    public static final String KEY_TAOBAO_HELPER = "tb_helper";
    public static final String KEY_TMALL_NOTIFY = "tmall_notify";
    public static final String KEY_VIDEO_AUTOPLAY_TYPE = "video";
    public static final String KEY_VISIT_OFTEN_LIVE = "secScreenLive";
    public static final String KEY_VISIT_OFTEN_SHOP = "secScreenShop";
    public static final String KEY_VOICE_ASSISTANT = "audioAssistant";
    public static final String KEY_WIFI_AUTO_DOWNLOAD = "wifiAutoDownload";

    /* renamed from: a  reason: collision with root package name */
    public static final String f27035a = "mytaobao";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            r0k.a();
            if (r0k.b()) {
                TLog.loge(mba.BIZ_NAME, "doMoved");
            }
        }
    }

    public static boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f569c51", new Object[0])).booleanValue();
        }
        return q9k.h(0);
    }

    public static boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4d9a9c1", new Object[0])).booleanValue();
        }
        return rgj.b(rgj.KEY_SHOW_SEC_SCREEN_LIVE_SWITCH);
    }

    public static boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5708b577", new Object[0])).booleanValue();
        }
        return rgj.b(rgj.KEY_SHOW_SEC_SCREEN_SHOP_SWITCH);
    }

    public static boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c54a3848", new Object[0])).booleanValue();
        }
        return com.taobao.cus.a.q().s();
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfa62af4", new Object[0])).booleanValue();
        }
        return ((Boolean) L(KEY_INLINE_VOLUME, Boolean.valueOf(yjp.a(SettingContants.SETTINGS_SYSTEM_SOUND, true)))).booleanValue();
    }

    public static boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2248e1c", new Object[0])).booleanValue();
        }
        return ((Boolean) L(KEY_TAOBAO_HELPER, Boolean.valueOf(qd1.j(Global.getApplication())))).booleanValue();
    }

    public static boolean G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44e6f13b", new Object[0])).booleanValue();
        }
        return ((Boolean) L(KEY_TMALL_NOTIFY, Boolean.valueOf(q9k.f(0)))).booleanValue();
    }

    public static boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8551a31", new Object[0])).booleanValue();
        }
        return ((Boolean) L(KEY_VISIT_OFTEN_LIVE, Boolean.valueOf(rgj.a(rgj.SWITCH_SEC_LIVE, "true")))).booleanValue();
    }

    public static boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a097a67", new Object[0])).booleanValue();
        }
        return ((Boolean) L(KEY_VISIT_OFTEN_SHOP, Boolean.valueOf(rgj.a(rgj.SWITCH_SEC_SHOP, "true")))).booleanValue();
    }

    public static boolean J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76f8e96c", new Object[0])).booleanValue();
        }
        return ((Boolean) L(KEY_VOICE_ASSISTANT, Boolean.valueOf(GeneralSetting.getGeneralSetting(GeneralSetting.VIRTUAL_ASSISTANT_KEY, true)))).booleanValue();
    }

    public static boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86a9a43a", new Object[0])).booleanValue();
        }
        SharedPreferences c = tfp.c();
        if (c.getBoolean("hasMoveLogicFinishV2", false)) {
            return false;
        }
        P("region", f());
        P(KEY_LIVE_BACKGROUND_PLAY, Boolean.valueOf(k()));
        P("video", Integer.valueOf(h()));
        P(KEY_INLINE_VOLUME, Boolean.valueOf(E()));
        P(KEY_VISIT_OFTEN_SHOP, Boolean.valueOf(I()));
        P(KEY_VISIT_OFTEN_LIVE, Boolean.valueOf(H()));
        P(KEY_HOMEPAGE_SHAKE, Boolean.valueOf(n()));
        P(KEY_CART_SHAKE, Boolean.valueOf(l()));
        P(KEY_LOCATION_SERVICE, Boolean.valueOf(o()));
        P("ocr", Boolean.valueOf(q()));
        P(KEY_ASSISTANT, Boolean.valueOf(i()));
        P(KEY_TAOBAO_HELPER, Boolean.valueOf(F()));
        P(KEY_TMALL_NOTIFY, Boolean.valueOf(G()));
        P(KEY_VOICE_ASSISTANT, Boolean.valueOf(J()));
        SharedPreferences.Editor edit = c.edit();
        edit.putBoolean("hasMoveLogicFinishV2", true);
        edit.apply();
        return true;
    }

    public static <T> T L(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("fd3fe50b", new Object[]{str, t});
        }
        Application application = Globals.getApplication();
        String str2 = f27035a;
        dhb b = j9t.e(application, str2).b();
        if (b == null) {
            return t;
        }
        try {
            return (T) b.d(str2, str, t, null);
        } catch (Throwable unused) {
            return t;
        }
    }

    public static void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1334c7b", new Object[0]);
        } else {
            TBS.Ext.commitEvent(quv.PAGE_NAME, 19999, "general_setting_options_statistics", null, null, c());
        }
    }

    public static String N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d02237ce", new Object[]{new Boolean(z)});
        }
        if (z) {
            return "open";
        }
        return "close";
    }

    public static String O(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b34ecb82", new Object[]{new Boolean(z)});
        }
        if (z) {
            return "show";
        }
        return "gone";
    }

    public static <T> void P(String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b066dade", new Object[]{str, t});
            return;
        }
        Application application = Globals.getApplication();
        String str2 = f27035a;
        ehb c = j9t.e(application, str2).c();
        if (c != null) {
            c.c(str2, str, t, null);
        }
    }

    public static /* synthetic */ void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            M();
        }
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue();
        }
        return K();
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b4b5aa1", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(d(KEY_FONT_SIZE), (Object) O(t()));
        jSONObject.put(d("region"), (Object) f());
        jSONObject.put(d(KEY_NETWORK_DIAGNOSE), (Object) O(v()));
        jSONObject.put(d(KEY_NETWORK_SPEEDUP), (Object) O(w()));
        jSONObject.put(d("video"), (Object) g());
        if (s()) {
            jSONObject.put(d(KEY_LIVE_BACKGROUND_PLAY), (Object) N(k()));
        }
        jSONObject.put(d(KEY_INLINE_VOLUME), (Object) N(E()));
        jSONObject.put(d(KEY_VISIT_OFTEN_SHOP), (Object) N(I()));
        jSONObject.put(d(KEY_VISIT_OFTEN_LIVE), (Object) N(H()));
        jSONObject.put(d(KEY_HOMEPAGE_SHAKE), (Object) N(n()));
        jSONObject.put(d(KEY_CART_SHAKE), (Object) N(l()));
        jSONObject.put(d(KEY_LOCATION_SERVICE), (Object) N(o()));
        if (x()) {
            jSONObject.put(d("ocr"), (Object) N(q()));
        }
        if (r()) {
            jSONObject.put(d(KEY_ASSISTANT), (Object) N(i()));
        }
        if (z()) {
            jSONObject.put(d(KEY_TAOBAO_HELPER), (Object) N(F()));
        }
        if (A()) {
            jSONObject.put(d(KEY_TMALL_NOTIFY), (Object) N(G()));
        }
        if (m()) {
            jSONObject.put(d(KEY_VOICE_ASSISTANT), (Object) N(J()));
        }
        if (D()) {
            jSONObject.put(d(KEY_WIFI_AUTO_DOWNLOAD), (Object) N(j()));
        }
        jSONObject.put(d(KEY_CLEAN_CACHE), (Object) "show");
        jSONObject.put(d("mute"), (Object) N(p()));
        return suv.i(jSONObject);
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd2f1c5d", new Object[]{str});
        }
        return "general_settings_".concat(str);
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed17eb3d", new Object[0]);
        } else {
            Coordinator.execute(new a());
        }
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("503338ad", new Object[0]);
        }
        return o78.i(Global.getApplication()).countryName;
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("197622c8", new Object[0]);
        }
        int h = h();
        if (h == 0) {
            return "仅Wi-Fi开启";
        }
        if (h != 2) {
            return "移动网络和Wi-Fi下都开启";
        }
        return "关闭";
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5efe716d", new Object[0])).intValue();
        }
        return ((Integer) L("video", Integer.valueOf(j9t.e(Global.getApplication(), f27035a).b().e(0)))).intValue();
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d986b8ee", new Object[0])).booleanValue();
        }
        return ((Boolean) L(KEY_ASSISTANT, Boolean.valueOf("true".equals(pgj.c(pgj.ASSISTANT_SWITCH_ENABLE))))).booleanValue();
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5eea355", new Object[0])).booleanValue();
        }
        return ((Boolean) L(KEY_WIFI_AUTO_DOWNLOAD, Boolean.TRUE)).booleanValue();
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8395376", new Object[0])).booleanValue();
        }
        return ((Boolean) L(KEY_LIVE_BACKGROUND_PLAY, Boolean.valueOf(bus.a()))).booleanValue();
    }

    public static boolean l() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b13f506", new Object[0])).booleanValue();
        }
        String c = pgj.c(pgj.CART_SWITCH_NAME);
        if (c == null || "true".equals(c)) {
            z = true;
        }
        return ((Boolean) L(KEY_CART_SHAKE, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5178e50a", new Object[0])).booleanValue();
        }
        return TextUtils.equals("1", TBRevisionSwitchManager.c().e("elderHome"));
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3de95b74", new Object[0])).booleanValue();
        }
        return ((Boolean) L(KEY_HOMEPAGE_SHAKE, Boolean.valueOf(ugp.c()))).booleanValue();
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("343d444c", new Object[0])).booleanValue();
        }
        return ((Boolean) L(KEY_LOCATION_SERVICE, Boolean.valueOf(j9t.e(Global.getApplication(), f27035a).b().f(false)))).booleanValue();
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bc2f558", new Object[0])).booleanValue();
        }
        return ((Boolean) L("mute", Boolean.FALSE)).booleanValue();
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a252862e", new Object[0])).booleanValue();
        }
        return ((Boolean) L("ocr", Boolean.valueOf("true".equals(pgj.c(pgj.OCR_SWITCH_NAME))))).booleanValue();
    }

    public static boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b83fcb04", new Object[0])).booleanValue();
        }
        return sgj.c(Global.getApplication());
    }

    public static boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b15f672", new Object[0])).booleanValue();
        }
        return bus.b();
    }

    public static boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c6ab8c5", new Object[0])).booleanValue();
        }
        return zu9.a() && "true".equals(OrangeConfig.getInstance().getConfig("fontSizeSetting", "open", "true"));
    }

    public static boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5046d0bb", new Object[0])).booleanValue();
        }
        return true;
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e7c0dd6", new Object[0])).booleanValue();
        }
        return NetworkConfigCenter.isNetworkDiagnosisOpened();
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db41bd80", new Object[0])).booleanValue();
        }
        return NetworkConfigCenter.isMultiPathSupport();
    }

    public static boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31bde204", new Object[0])).booleanValue();
        }
        return sgj.c(Global.getApplication());
    }

    public static boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7c486d8", new Object[0])).booleanValue();
        }
        return qd1.q(Global.getApplication());
    }

    static {
        t2o.a(745538207);
    }
}
