package tb;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.util.StringUtil;
import com.taobao.share.globalmodel.TBShareContent;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class blo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CHECK_PWD_URL_VALIDATE = "checkPwdUrlValidate";
    public static final String KEY_READ_PHOTO_ALBUM = "share_can_read_photo_album";
    public static final String SHARE_CONFIG_NAME_SPACE = "android_share";
    public static final String TAO_FLAG = "com.ut.share.copy.data";

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, String> f16469a;
    public static int b = 20;
    public static boolean c = false;
    public static final AtomicBoolean d = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements y8l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16470a;

        public a(Context context) {
            this.f16470a = context;
        }

        @Override // tb.y8l
        public void onConfigUpdate(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b193b", new Object[]{this, str});
                return;
            }
            blo.b(OrangeConfig.getInstance().getConfigs("android_share"));
            Log.e("SDKConfig", "android_share");
            if (blo.a() != null) {
                blo.c(this.f16470a, blo.a());
            }
        }
    }

    static {
        t2o.a(665845771);
    }

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
        }
        return f16469a;
    }

    public static /* synthetic */ Map b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6d458921", new Object[]{map});
        }
        f16469a = map;
        return map;
    }

    public static /* synthetic */ void c(Context context, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95427175", new Object[]{context, map});
        } else {
            r(context, map);
        }
    }

    public static boolean d(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3915235", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share", str, String.valueOf(z)));
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d2901e9", new Object[]{context});
            return;
        }
        Map<String, String> configs = OrangeConfig.getInstance().getConfigs("android_share");
        f16469a = configs;
        if (configs != null) {
            r(context, configs);
        }
        OrangeConfig.getInstance().registerListener(new String[]{"android_share"}, new a(context));
        d.set(true);
    }

    public static Map<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("da2ef722", new Object[0]);
        }
        return f16469a;
    }

    public static String g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be345290", new Object[]{new Boolean(z)});
        }
        if (z) {
            return OrangeConfig.getInstance().getConfig("android_share_bizconfig", "QRCodeBackgroundURL", "http://gw.alicdn.com/tfscom/TB1kkvgJpXXXXc1XXXXvye07pXX-124-124.jpg");
        }
        return OrangeConfig.getInstance().getConfig("android_share_bizconfig", "VisualCodeBackgroundURL", "http://gw.alicdn.com/tfscom/TB1kkvgJpXXXXc1XXXXvye07pXX-124-124.jpg");
    }

    public static int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7f2b1a0", new Object[0])).intValue();
        }
        return b;
    }

    public static int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13c39d2", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("android_share", "shareVideoLength", String.valueOf(12)));
        } catch (Throwable th) {
            th.printStackTrace();
            return 12;
        }
    }

    public static int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15ff051a", new Object[0])).intValue();
        }
        try {
            return Integer.parseInt(OrangeConfig.getInstance().getConfig("android_share", "videoLengthOffsetThreshold", String.valueOf(5000)));
        } catch (Throwable th) {
            th.printStackTrace();
            return 12;
        }
    }

    public static String k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e264abe", new Object[]{str, str2});
        }
        return OrangeConfig.getInstance().getConfig("android_share", str, str2);
    }

    public static void l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f2e474", new Object[]{context});
        } else if (!d.get()) {
            e(context);
        }
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9390612", new Object[0])).booleanValue();
        }
        return c;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1478d13d", new Object[0])).booleanValue();
        }
        return TextUtils.equals(OrangeConfig.getInstance().getConfig("android_share", "isPreCheckMode", "false"), "true");
    }

    public static boolean o(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63eba775", new Object[]{new Long(j)})).booleanValue();
        }
        if (Math.abs(j - (i() * 1000)) < j()) {
            return true;
        }
        return false;
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2874a53", new Object[0])).booleanValue();
        }
        List asList = Arrays.asList(OrangeConfig.getInstance().getConfig("shareui_theme", "share_disable_qrcode_bizs", "").split("&"));
        TBShareContent e = bwr.h().e();
        if (e == null || !asList.contains(e.businessId)) {
            return TextUtils.equals(OrangeConfig.getInstance().getConfig("shareui_theme", "share_disable_qrcode", "false"), "true");
        }
        return false;
    }

    public static boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc160864", new Object[0])).booleanValue();
        }
        return TextUtils.equals(OrangeConfig.getInstance().getConfig("android_share", "isWxAgainstMode", "true"), "true");
    }

    public static void r(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdfeaa51", new Object[]{context, map});
            return;
        }
        u(map);
        t(map);
        s(map);
    }

    public static void s(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e82b7f", new Object[]{map});
            return;
        }
        try {
            String str = map.get("share_disable_picPassword_new");
            if (!TextUtils.isEmpty(str)) {
                c = Boolean.parseBoolean(str);
            }
        } catch (Throwable unused) {
        }
    }

    public static void t(Map<String, String> map) {
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdc39cd9", new Object[]{map});
            return;
        }
        String str = map.get("share_qrTemplate_count");
        if (!TextUtils.isEmpty(str) && (parseInt = StringUtil.parseInt(str)) > 0) {
            b = parseInt;
        }
    }

    public static void u(Map<String, String> map) {
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
        ftl.b(Arrays.asList(str.split(",")));
    }

    public static boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7416def", new Object[0])).booleanValue();
        }
        return TextUtils.equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", KEY_READ_PHOTO_ALBUM, "false"), "true");
    }

    public static boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d2db864", new Object[0])).booleanValue();
        }
        if (!OrangeConfig.getInstance().getConfig("android_share", "videoBackBlackBrandList", "").contains(Build.BRAND) && !OrangeConfig.getInstance().getConfig("android_share", "videoBackBlackModelList", "").contains(Build.MODEL)) {
            return TextUtils.equals(OrangeConfig.getInstance().getConfig("android_share", "videoBackFlowAvailable", "false"), "true");
        }
        return false;
    }
}
