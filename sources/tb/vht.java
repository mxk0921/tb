package tb;

import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vht {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_KEY_CC_LIVE_NAME = "cc_live_name";
    public static final String ORANGE_KEY_CC_PS_POP_AB = "cc_ps_pop_utab";
    public static final String ORANGE_KEY_CC_PS_POP_ENABLE = "cc_ps_pop_enable";
    public static final String ORANGE_KEY_CC_PS_POP_REDIRECT_URL = "cc_ps_pop_url";
    public static final String ORANGE_KEY_CC_PS_POP_URLS = "cc_ps_pop_urls";
    public static final String ORANGE_KEY_CC_RM_MIDDLE_PAGES = "cc_rm_middle_pages";
    public static final String TCC_ORANGE_GROUP_NAME = "android_tcg_urlMiddleware";
    public static final String TCC_ORANGE_PREFS = "tcc_orange_preference";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            SharedPreferences.Editor edit = Globals.getApplication().getSharedPreferences(vht.TCC_ORANGE_PREFS, 0).edit();
            edit.putBoolean(vht.ORANGE_KEY_CC_PS_POP_ENABLE, Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", vht.ORANGE_KEY_CC_PS_POP_ENABLE, "true")));
            edit.putString(vht.ORANGE_KEY_CC_PS_POP_URLS, OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", vht.ORANGE_KEY_CC_PS_POP_URLS, ""));
            edit.putString(vht.ORANGE_KEY_CC_PS_POP_REDIRECT_URL, OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", vht.ORANGE_KEY_CC_PS_POP_REDIRECT_URL, ""));
            edit.putString(vht.ORANGE_KEY_CC_RM_MIDDLE_PAGES, OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", vht.ORANGE_KEY_CC_RM_MIDDLE_PAGES, ""));
            edit.putString(vht.ORANGE_KEY_CC_LIVE_NAME, OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", vht.ORANGE_KEY_CC_LIVE_NAME, ""));
            edit.putString(vht.ORANGE_KEY_CC_PS_POP_AB, OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", vht.ORANGE_KEY_CC_PS_POP_AB, ""));
            edit.apply();
            String a2 = vht.a();
            TLog.logi(sht.TLOG_MODULE, a2, "onConfigUpdate: " + map);
            OrangeConfig.getInstance().unregisterListener(new String[]{"android_tcg_urlMiddleware"});
        }
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return "vht";
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad88820c", new Object[0]);
        }
        return Globals.getApplication().getSharedPreferences(TCC_ORANGE_PREFS, 0).getString(ORANGE_KEY_CC_LIVE_NAME, "");
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99570ec0", new Object[0]);
        }
        return Globals.getApplication().getSharedPreferences(TCC_ORANGE_PREFS, 0).getString(ORANGE_KEY_CC_PS_POP_AB, "");
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a5ec0a2", new Object[0]);
        }
        return Globals.getApplication().getSharedPreferences(TCC_ORANGE_PREFS, 0).getString(ORANGE_KEY_CC_PS_POP_REDIRECT_URL, "");
    }

    public static List<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("12a630c4", new Object[0]);
        }
        String string = Globals.getApplication().getSharedPreferences(TCC_ORANGE_PREFS, 0).getString(ORANGE_KEY_CC_PS_POP_URLS, "");
        ArrayList arrayList = new ArrayList();
        for (String str : string.split(",")) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("284d937b", new Object[0]);
        }
        return Globals.getApplication().getSharedPreferences(TCC_ORANGE_PREFS, 0).getString(ORANGE_KEY_CC_RM_MIDDLE_PAGES, "");
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2386e668", new Object[0])).booleanValue();
        }
        return Globals.getApplication().getSharedPreferences(TCC_ORANGE_PREFS, 0).getBoolean(ORANGE_KEY_CC_PS_POP_ENABLE, true);
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4fa0472", new Object[0]);
            return;
        }
        OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", ORANGE_KEY_CC_PS_POP_ENABLE, "true");
        OrangeConfig.getInstance().registerListener(new String[]{"android_tcg_urlMiddleware"}, new a(), true);
    }
}
