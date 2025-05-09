package tb;

import android.app.Application;
import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.copy.ClipUrlWatcherControl;
import com.taobao.share.multiapp.ShareBizAdapter;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tn1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_PASSWORD_PROCESS = "1";
    public static final String DEFAULT_PLAN_B_PASSWORD_REGEX = "[\\ud83d\\udd11\\ud83d\\udddd\\ud83d\\ude3a\\ud83d\\ude38\\ud83c\\udf81\\ud83d\\udcf2\\ud83d\\udcb0\\ud83d\\udcb2\\u2714\\ud83c\\udfb5\\ud83d\\udd10]|[A-Za-z0-9]{7,15}|[的一是了我不人在他有这个上们来到时大地为子中你说生国年着就那和要她出也得里后自以会家可下而过天去能对小多然于心学么之都好看起]{7,15}";
    public static final String DEFAULT_PRE_CHECK_REGEX = ".*\\/.*";
    public static final String DEFAULT_REFLOW_LEVEL = "B";
    public static final String DETAULT_PASSWORD_DNS_REGEX = ".*http(s?)://(baron|share).laiwang.com.*tm=.*";
    public static final String DETAULT_PLAN_A_PASSWORD_REGEX = "[￥](.*?)[￥]|[嘻啊哈！，微信()/￥€£₴$₰¢₤¥₳₲₪₵《\\ud83d\\udd11\\ud83d\\udddd\\ud83d\\ude3a\\ud83d\\ude38\\ud83c\\udf81\\ud83d\\udcf2\\ud83d\\udcb0\\ud83d\\udcb2\\u2714\\ud83c\\udfb5\\ud83d\\udd10][A-Za-z0-9]{7,15}[嘻啊哈！，微信()/￥€£₴$₰¢₤¥₳₲₪₵《\\ud83d\\udd11\\ud83d\\udddd\\ud83d\\ude3a\\ud83d\\ude38\\ud83c\\udf81\\ud83d\\udcf2\\ud83d\\udcb0\\ud83d\\udcb2\\u2714\\ud83c\\udfb5\\ud83d\\udd10]|[你我谁这推]{1}((.){15,25})!\\.!";
    public static final String KEY_SHARE_CONFIG_ALIPAY = "alipay";
    public static final String KEY_SHARE_CONFIG_COPY = "copy";
    public static final String KEY_SHARE_CONFIG_DINGTALK = "dingtalk";
    public static final String KEY_SHARE_CONFIG_FEILIAO = "feiliao";
    public static final String KEY_SHARE_CONFIG_IPRESENT = "iPresent";
    public static final String KEY_SHARE_CONFIG_ISHOPPING = "ishopping";
    public static final String KEY_SHARE_CONFIG_MOMO = "momo";
    public static final String KEY_SHARE_CONFIG_QQ = "qq";
    public static final String KEY_SHARE_CONFIG_QRCODE = "qrcode";
    public static final String KEY_SHARE_CONFIG_SCREENSHOT = "screenshots";
    public static final String KEY_SHARE_CONFIG_SINAWEIBO = "sinaweibo";
    public static final String KEY_SHARE_CONFIG_SMS = "sms";
    public static final String KEY_SHARE_CONFIG_TAOPASSWORD = "taopassword";
    public static final String KEY_SHARE_CONFIG_TAOPASSWORDTIPS = "taopasswordtips";
    public static final String KEY_SHARE_CONFIG_WANGXIN = "wangxin";
    public static final String KEY_SHARE_CONFIG_WEIXIN = "weixin";
    public static final String KEY_SHARE_CONFIG_WEIXINTIMELINE = "weixintimeline";
    public static final String KEY_SHARE_SCREENSHOT_BIZ_ID = "Physical_Screenshots";
    public static final String LOCAL_PASSWORD_REGEX_KEY = "local_password_regex";
    public static Map<String, String> b;
    public static JSONObject d;

    /* renamed from: a  reason: collision with root package name */
    public static final String f28819a = "taopassword_show_exceptionview";
    public static String c = "";
    public static final AtomicBoolean e = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements y8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f28820a;

        public a(Context context) {
            this.f28820a = context;
        }

        @Override // tb.y8l
        public void onConfigUpdate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
                return;
            }
            tn1.b(OrangeConfig.getInstance().getConfigs("android_share"));
            if (tn1.a() != null) {
                tn1.c(this.f28820a, tn1.a());
            }
        }
    }

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ Map b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6d458921", new Object[]{map});
        }
        b = map;
        return map;
    }

    public static /* synthetic */ void c(Context context, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95427175", new Object[]{context, map});
        } else {
            p(context, map);
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f7f9842", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share", "checkSubProcess", "true"));
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2901e9", new Object[]{context});
            return;
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs("android_share");
        b = configs;
        if (configs != null) {
            p(context, configs);
        }
        OrangeConfig.getInstance().registerListener(new String[]{"android_share"}, new a(context));
        e.set(true);
    }

    public static JSONObject f(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6cd317c1", new Object[]{str, map});
        }
        if (map == null) {
            return null;
        }
        try {
            return JSON.parseObject(map.get(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70ac3c16", new Object[]{context});
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getString(LOCAL_PASSWORD_REGEX_KEY, DETAULT_PLAN_A_PASSWORD_REGEX);
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4d5582f", new Object[0]);
        }
        Application application = ShareBizAdapter.getInstance().getAppEnv().getApplication();
        String h = mip.h(b, "plan_a_regex", DETAULT_PLAN_A_PASSWORD_REGEX);
        if (TextUtils.isEmpty(h)) {
            h = g(application);
        } else {
            o(application, h);
        }
        return TextUtils.isEmpty(h) ? DETAULT_PLAN_A_PASSWORD_REGEX : h;
    }

    public static String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bae17f0", new Object[0]);
        }
        String h = mip.h(b, "plan_b_regex", DEFAULT_PLAN_B_PASSWORD_REGEX);
        return TextUtils.isEmpty(h) ? DEFAULT_PLAN_B_PASSWORD_REGEX : h;
    }

    public static String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88d8ff08", new Object[0]);
        }
        return mip.h(b, "plan_pre_regex", ".*\\/.*");
    }

    public static String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bf2e3c2c", new Object[0]);
        }
        String h = mip.h(b, "reflow_plan", "B");
        return TextUtils.isEmpty(h) ? "B" : h;
    }

    public static String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d350f54", new Object[0]);
        }
        if (TextUtils.isEmpty(c)) {
            return ".*http(s?)://(baron|share).laiwang.com.*tm=.*";
        }
        return c;
    }

    public static boolean m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b6894e5", new Object[]{str})).booleanValue();
        }
        return KEY_SHARE_SCREENSHOT_BIZ_ID.equals(str);
    }

    public static void o(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832ee46f", new Object[]{context, str});
        } else {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString(LOCAL_PASSWORD_REGEX_KEY, str).apply();
        }
    }

    public static void p(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdfeaa51", new Object[]{context, map});
            return;
        }
        q(context, map);
        r(map);
        s(map);
        t(map);
    }

    public static void r(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("879c037f", new Object[]{map});
            return;
        }
        JSONObject f = f("android_share_component_config", map);
        d = f;
        if (f != null) {
            f.getString(KEY_SHARE_CONFIG_TAOPASSWORDTIPS);
        }
    }

    public static void s(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8323b3cc", new Object[]{map});
            return;
        }
        String str = map.get("taopassword_character_blacklist");
        new StringBuilder("setTPCharacterBlackList 1 listStr=").append(str);
        if (TextUtils.isEmpty(str)) {
            str = "￥,¥";
        }
        new StringBuilder("setTPCharacterBlackList 2 listStr=").append(str);
        ftl.b(Arrays.asList(str.split(",")));
    }

    public static void t(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a57e1745", new Object[]{map});
            return;
        }
        try {
            JSONObject f = f("taopassword", map);
            if (f != null) {
                c = f.getString("taopassword_dns_regex");
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc3f716e", new Object[]{str})).booleanValue();
        }
        JSONObject jSONObject = d;
        if (jSONObject == null) {
            return !KEY_SHARE_CONFIG_IPRESENT.equals(str) && !KEY_SHARE_CONFIG_SCREENSHOT.equals(str);
        }
        String string = jSONObject.getString(str);
        return (KEY_SHARE_CONFIG_IPRESENT.equals(str) || KEY_SHARE_CONFIG_SCREENSHOT.equals(str)) ? "true".equals(string) : !"false".equals(string);
    }

    public static void q(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6d88d4", new Object[]{context, map});
            return;
        }
        JSONObject f = f("taopassword", map);
        if (f != null) {
            String string = f.getString(f28819a);
            if (TextUtils.isEmpty(string)) {
                string = "1";
            }
            if ("1".equals(string)) {
                ClipUrlWatcherControl.z().N(true);
            } else {
                ClipUrlWatcherControl.z().N(false);
            }
        }
    }

    static {
        t2o.a(664797217);
    }
}
