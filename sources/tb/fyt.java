package tb;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fyt implements obk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ORANGE_KEY_FASTBUY_ENABLE = "fastbuy_enable";
    public static final String ORANGE_KEY_FASTBUY_PREFETCH_DISABLE = "fastbuy_prefetch_disable";
    public static final String ORANGE_KEY_FASTBUY_URL = "fastbuy_url";
    public static final String ORANGE_KEY_LIVE_NAME = "live_name";
    public static final String ORANGE_KEY_PS_POP_AB = "ps_pop_utab";
    public static final String ORANGE_KEY_PS_POP_ENABLE = "ps_pop_enable";
    public static final String ORANGE_KEY_PS_POP_REDIRECT_URL = "ps_pop_url";
    public static final String ORANGE_KEY_PS_POP_URLS = "ps_pop_urls";
    public static final String ORANGE_KEY_RM_MIDDLE_PAGES = "rm_middle_pages";
    public static final String ORANGE_KEY_WEEXCART_URL = "weexcart_url";
    public static final String TMCS_ORANGE_GROUP_NAME = "android_tcg_urlMiddleware";
    public static final String TMCS_ORANGE_PREFS = "tmcs_orange_preference";

    /* renamed from: a  reason: collision with root package name */
    public static volatile fyt f19637a;
    public static Handler b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f19638a;

        public a(Map map) {
            this.f19638a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SharedPreferences.Editor edit = Globals.getApplication().getSharedPreferences(fyt.TMCS_ORANGE_PREFS, 0).edit();
            edit.putBoolean(fyt.ORANGE_KEY_FASTBUY_ENABLE, Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", fyt.ORANGE_KEY_FASTBUY_ENABLE, "false")));
            edit.putString(fyt.ORANGE_KEY_FASTBUY_URL, OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", fyt.ORANGE_KEY_FASTBUY_URL, q6s.a()));
            edit.putBoolean(fyt.ORANGE_KEY_FASTBUY_PREFETCH_DISABLE, Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", fyt.ORANGE_KEY_FASTBUY_PREFETCH_DISABLE, "false")));
            edit.putString(fyt.ORANGE_KEY_WEEXCART_URL, OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", fyt.ORANGE_KEY_WEEXCART_URL, q6s.b()));
            edit.putBoolean(fyt.ORANGE_KEY_PS_POP_ENABLE, Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", fyt.ORANGE_KEY_PS_POP_ENABLE, "true")));
            edit.putString(fyt.ORANGE_KEY_PS_POP_URLS, OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", fyt.ORANGE_KEY_PS_POP_URLS, ""));
            edit.putString(fyt.ORANGE_KEY_PS_POP_REDIRECT_URL, OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", fyt.ORANGE_KEY_PS_POP_REDIRECT_URL, ""));
            edit.putString(fyt.ORANGE_KEY_RM_MIDDLE_PAGES, OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", fyt.ORANGE_KEY_RM_MIDDLE_PAGES, ""));
            edit.putString(fyt.ORANGE_KEY_LIVE_NAME, OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", fyt.ORANGE_KEY_LIVE_NAME, ""));
            edit.putString(fyt.ORANGE_KEY_PS_POP_AB, OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", fyt.ORANGE_KEY_PS_POP_AB, ""));
            edit.apply();
            String a2 = fyt.a();
            TLog.logi(gyt.TLOG_MODULE, a2, "onConfigUpdate: " + this.f19638a);
        }
    }

    public fyt() {
        e();
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return "fyt";
    }

    public static fyt c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fyt) ipChange.ipc$dispatch("c809576e", new Object[0]);
        }
        if (f19637a == null) {
            synchronized (fyt.class) {
                try {
                    if (f19637a == null) {
                        f19637a = new fyt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f19637a;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        b = new Handler(Looper.getMainLooper());
        OrangeConfig.getInstance().getConfig("android_tcg_urlMiddleware", ORANGE_KEY_FASTBUY_ENABLE, "false");
        OrangeConfig.getInstance().registerListener(new String[]{"android_tcg_urlMiddleware"}, this, true);
    }

    @Override // tb.obk
    public void onConfigUpdate(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
        } else if (b != null) {
            TLog.logi(gyt.TLOG_MODULE, "fyt", "onConfigUpdate, post message to main thread..");
            b.post(new a(map));
        } else {
            TLog.loge(gyt.TLOG_MODULE, "fyt", "mHandler is null..");
        }
    }

    public boolean b(String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aac105cc", new Object[]{this, str, bool})).booleanValue();
        }
        return Globals.getApplication().getSharedPreferences(TMCS_ORANGE_PREFS, 0).getBoolean(str, bool.booleanValue());
    }

    public String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31d4edc", new Object[]{this, str, str2});
        }
        return Globals.getApplication().getSharedPreferences(TMCS_ORANGE_PREFS, 0).getString(str, str2);
    }
}
