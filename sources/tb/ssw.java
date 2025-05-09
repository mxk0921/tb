package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ssw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f28255a = "^https?:\\/\\/(([^/\\?#]+\\.)*((mp\\.dfkhgj|mp\\.iuynfg|mp\\.edcdfg|mp\\.asczwa|taobao|tmall|juhuasuan|xiami|amap|taobaocdn|alipay|etao|alibaba|aliyun|alimama|weibo|tanx|laiwang|alicdn|mmstat|yunos|alibaba-inc|alitrip|aliloan|kanbox|wirlesshare|dingtalk|alimei|cnzz|kuaidadi|autonavi|m\\.yintai|polyinno|spdyidea|h5util|h5tool|5945i|miaostreet|1688|cainiao-inc|cainiao|taohua|m\\.jiaoyimao|m\\.dfkhgj|m\\.edcdfg|liangxinyao|taopiaopiao|fliggy|feizhu|mashangfangxin|youku|im\\.alisoft|100x100w|koubei|alibabausercontent|hemaos|alihive|(jishi|cdn)\\.rantu|ishuqi|jishi\\.aligames|aligames|h5\\.shyhhema|duanqu|y\\.xevddy|l\\.xevddy|portalpro\\.hemaos)\\.com|(tb|tbcdn|weibo|mashort|mybank|uc|feizhu|alihealth|alios|xixi\\.fullspeed|image\\.9game|pass\\.alios|damai|portal-h5\\.hemayx)\\.cn|(fastidea|juzone)\\.(me|cc)|(lemon\\.faas\\.ele|marketing-feast\\.faas\\.ele|lemon\\.ele|tb\\.ele|h5\\.ele|juhs|t-series-act\\.faas\\.ele|2018-bill\\.faas\\.ele)\\.me|lwurl\\.to|(taobao|alipay|cnzz|fliggy|feizhu|tmall)\\.net|tdd\\.la|yao\\.95095\\.com|(tmall|alipay|fliggy)\\.hk|ahd\\.so|atb\\.so|mshare\\.cc|xianyu\\.mobi|ynuf\\.aliapp\\.org|doctoryou\\.ai|m\\.10010\\.com\\/queen\\/alitrip\\/alipay\\.html|gseller\\.cn-shanghai\\.oss\\.aliyun-inc\\.com|gw\\.alipayobjects\\.com\\/as\\/g\\/memberAsset\\/zfb-tbcard|wegame-web-daily\\.uc\\.test)([\\?|#|/].*)?|go(/.*)?)$";
    public static Pattern b = null;
    public static String c = "";
    public static Pattern d = null;
    public static String e = "^((https?:)?\\/\\/([^/\\?#]+\\.)*((5317wan|guahao|wap\\.wandafilm|wrating|alipayobjects|(hft|\\w+app)\\.evergrande|jmt\\.wxcsgd|mpay\\.cx580|mt\\.locojoy|cpa1\\.locojoy|miiee|imaijia)\\.com|(h5\\.edaijia|beta\\.library\\.sh|web\\.chelaile\\.net|app3\\.shmzj\\.gov|bsfw\\.qingdao\\.gov|www\\.hzpolice\\.gov|www\\.sxgajj\\.gov|service\\.zjzwfw\\.gov|people\\.com|hbjg\\.premier-tech)\\.cn|(aliplay|ali\\.hk515)\\.net|tmall\\.pp\\.cc|ele\\.me)([\\?|#|/|:].*)?)$";
    public static Pattern f = null;
    public static String g = "";
    public static Pattern h = null;
    public static String i = "https?:\\/\\/(g|img|gw)\\.alicdn\\.com\\/.*";
    public static Pattern j = null;

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a7ae34f", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (vpw.commonConfig.B) {
            return ftw.f().m(str);
        }
        return d(str);
    }

    public static boolean c(String str, a7e a7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("728a51e6", new Object[]{str, a7eVar})).booleanValue();
        }
        if (!a7eVar.canUseUrlConfig()) {
            return b(str);
        }
        if (ftw.f().m(str)) {
            return true;
        }
        return false;
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("889053cf", new Object[]{str})).booleanValue();
        }
        return !TextUtils.isEmpty(str);
    }

    public static boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d70e43b", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (vpw.commonConfig.B) {
            return ftw.f().n(str);
        }
        return i(str);
    }

    public static boolean h(String str, a7e a7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18b3a0d2", new Object[]{str, a7eVar})).booleanValue();
        }
        if (!a7eVar.canUseUrlConfig()) {
            return g(str);
        }
        if (ftw.f().k(str)) {
            return true;
        }
        return false;
    }

    public static boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c579ad7", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (vpw.commonConfig.B) {
            return ftw.f().o(str);
        }
        return l(str);
    }

    public static boolean k(String str, a7e a7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad7dd6e", new Object[]{str, a7eVar})).booleanValue();
        }
        if (a7eVar.canUseUrlConfig()) {
            return true;
        }
        return j(str);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eadfacd8", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (j == null) {
            if (TextUtils.isEmpty(i)) {
                i = "";
            }
            try {
                j = Pattern.compile(i, 2);
                v7t.a("WVServerConfig", "compile pattern allowAccessDomain rule, " + i);
            } catch (PatternSyntaxException e2) {
                v7t.d("WVServerConfig", " PatternSyntaxException pattern:" + e2.getMessage());
            }
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return j.matcher(str).matches();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb7a6bb1", new Object[]{str})).booleanValue();
        }
        if (d == null) {
            if (TextUtils.isEmpty(c)) {
                c = "";
            }
            try {
                d = Pattern.compile(c, 2);
                v7t.a("WVServerConfig", "compile pattern black rule, " + c);
            } catch (PatternSyntaxException e2) {
                v7t.d("WVServerConfig", " PatternSyntaxException pattern:" + e2.getMessage());
            }
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return d.matcher(str).matches();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26ff79c2", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (h == null) {
            if (TextUtils.isEmpty(g)) {
                g = "";
            }
            try {
                h = Pattern.compile(g, 2);
                v7t.a("WVServerConfig", "compile pattern supportDownloadDomain rule, " + g);
            } catch (PatternSyntaxException e2) {
                v7t.d("WVServerConfig", " PatternSyntaxException pattern:" + e2.getMessage());
            }
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return h.matcher(str).matches();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e3a6a9d", new Object[]{str})).booleanValue();
        }
        if (f == null) {
            if (TextUtils.isEmpty(e)) {
                e = "^((https?:)?\\/\\/([^/\\?#]+\\.)*((5317wan|guahao|wap\\.wandafilm|wrating|alipayobjects|(hft|\\w+app)\\.evergrande|jmt\\.wxcsgd|mpay\\.cx580|mt\\.locojoy|cpa1\\.locojoy|miiee|imaijia)\\.com|(h5\\.edaijia|beta\\.library\\.sh|web\\.chelaile\\.net|app3\\.shmzj\\.gov|bsfw\\.qingdao\\.gov|www\\.hzpolice\\.gov|www\\.sxgajj\\.gov|service\\.zjzwfw\\.gov|people\\.com|hbjg\\.premier-tech)\\.cn|(aliplay|ali\\.hk515)\\.net|tmall\\.pp\\.cc|ele\\.me)([\\?|#|/|:].*)?)$";
            }
            try {
                f = Pattern.compile(e, 2);
                v7t.a("WVServerConfig", "compile pattern thirdPartyDomain rule, " + e);
            } catch (PatternSyntaxException e2) {
                v7t.d("WVServerConfig", " PatternSyntaxException pattern:" + e2.getMessage());
            }
        }
        try {
            Pattern pattern = f;
            if (pattern != null) {
                return pattern.matcher(str).matches();
            }
        } catch (Exception e3) {
            v7t.d("WVServerConfig", "error " + e3.toString());
            e3.printStackTrace();
        }
        return false;
    }

    public static boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52981739", new Object[]{str})).booleanValue();
        }
        if (b == null) {
            if (TextUtils.isEmpty(f28255a)) {
                f28255a = "^https?:\\/\\/(([^/\\?#]+\\.)*((mp\\.dfkhgj|mp\\.iuynfg|mp\\.edcdfg|mp\\.asczwa|taobao|tmall|juhuasuan|xiami|amap|taobaocdn|alipay|etao|alibaba|aliyun|alimama|weibo|tanx|laiwang|alicdn|mmstat|yunos|alibaba-inc|alitrip|aliloan|kanbox|wirlesshare|dingtalk|alimei|cnzz|kuaidadi|autonavi|m\\.yintai|polyinno|spdyidea|h5util|h5tool|5945i|miaostreet|1688|cainiao-inc|cainiao|taohua|m\\.jiaoyimao|m\\.dfkhgj|m\\.edcdfg|liangxinyao|taopiaopiao|fliggy|feizhu|mashangfangxin|youku|im\\.alisoft|100x100w|koubei|alibabausercontent|hemaos|alihive|(jishi|cdn)\\.rantu|ishuqi|jishi\\.aligames|aligames|h5\\.shyhhema|duanqu|y\\.xevddy|l\\.xevddy|portalpro\\.hemaos)\\.com|(tb|tbcdn|weibo|mashort|mybank|uc|feizhu|alihealth|alios|xixi\\.fullspeed|image\\.9game|pass\\.alios|damai|portal-h5\\.hemayx)\\.cn|(fastidea|juzone)\\.(me|cc)|(lemon\\.faas\\.ele|marketing-feast\\.faas\\.ele|lemon\\.ele|tb\\.ele|h5\\.ele|juhs|t-series-act\\.faas\\.ele|2018-bill\\.faas\\.ele)\\.me|lwurl\\.to|(taobao|alipay|cnzz|fliggy|feizhu|tmall)\\.net|tdd\\.la|yao\\.95095\\.com|(tmall|alipay|fliggy)\\.hk|ahd\\.so|atb\\.so|mshare\\.cc|xianyu\\.mobi|ynuf\\.aliapp\\.org|doctoryou\\.ai|m\\.10010\\.com\\/queen\\/alitrip\\/alipay\\.html|gseller\\.cn-shanghai\\.oss\\.aliyun-inc\\.com|gw\\.alipayobjects\\.com\\/as\\/g\\/memberAsset\\/zfb-tbcard|wegame-web-daily\\.uc\\.test)([\\?|#|/].*)?|go(/.*)?)$";
            }
            try {
                b = Pattern.compile(f28255a, 2);
                v7t.a("WVServerConfig", "compile pattern domainPat rule, " + f28255a);
            } catch (PatternSyntaxException e2) {
                v7t.d("WVServerConfig", " PatternSyntaxException pattern:" + e2.getMessage());
            }
        }
        try {
            Pattern pattern = b;
            if (pattern != null) {
                return pattern.matcher(str).matches();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    static {
        t2o.a(989855792);
    }
}
