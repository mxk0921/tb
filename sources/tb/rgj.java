package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rgj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SHOW_SEC_SCREEN_LIVE_SWITCH = "showSecScreenLiveSwitch";
    public static final String KEY_SHOW_SEC_SCREEN_SHOP_SWITCH = "showSecScreenShopSwitch";
    public static final String SWITCH_SEC_LIVE = "switch_sec_live";
    public static final String SWITCH_SEC_SHOP = "switch_sec_shop";

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f27361a = new HashMap();

    static {
        t2o.a(745537777);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f38e2086", new Object[]{str, str2})).booleanValue();
        }
        Map<String, String> map = f27361a;
        String str3 = (String) ((HashMap) map).get(str);
        if (TextUtils.isEmpty(str3)) {
            str3 = pgj.c(str);
        }
        if (TextUtils.isEmpty(str3)) {
            ((HashMap) map).put(str, str2);
            pgj.a(str, str2);
        } else {
            str2 = str3;
        }
        return Boolean.parseBoolean(str2);
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b21852e", new Object[]{str})).booleanValue();
        }
        return Boolean.parseBoolean((String) ((HashMap) f27361a).get(str));
    }

    public static void c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b47fea22", new Object[]{str, new Boolean(z)});
        } else {
            ((HashMap) f27361a).put(str, String.valueOf(z));
        }
    }

    public static void d(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d7d7f28", new Object[]{str, new Boolean(z)});
            return;
        }
        ((HashMap) f27361a).put(str, String.valueOf(z));
        pgj.a(str, String.valueOf(z));
    }
}
