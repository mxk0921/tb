package tb;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.nav.Nav;
import com.taobao.android.purchase.core.TBBuyDegradeWVService;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.net.URLEncoder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xt7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f31594a = sj4.TAB2_SOURCE_OUTSIDE;
    public static final String b = Constants.KEY_FULL_LINK;

    public static String a(Activity activity) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3ec97d2", new Object[]{activity});
        }
        Intent h = hh.h(activity);
        if (h == null) {
            q8r.a("EMPTY_INTENT_FORM_(buildOrderUrlParams)", "intent is empty");
            return null;
        }
        Map<String, String> j = lql.j(activity, h);
        if (j == null || j.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : j.keySet()) {
            if (!TextUtils.isEmpty(str2) && !str2.equals("hybrid") && (str = j.get(str2)) != null) {
                String encode = URLEncoder.encode(str);
                sb.append("&" + str2 + "=" + encode);
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static boolean b(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3e9c164", new Object[]{activity, str})).booleanValue();
        }
        return c(activity, str, null, null);
    }

    public static boolean c(Activity activity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("292fc678", new Object[]{activity, str, str2, str3})).booleanValue();
        }
        String a2 = a(activity);
        fsw.i(TBBuyDegradeWVService.BRIDGE_PLUGIN_NAME, TBBuyDegradeWVService.class, true);
        TBBuyDegradeWVService.setBuildOrderParams(a2);
        UnifyLog.e("DowngradeUtils", "downgradToH5", "params:", a2);
        q8r.c(a2, str, str2, str3);
        Nav.from(activity).withCategory("com.taobao.intent.category.HYBRID_UI").toUri("https://main.m.taobao.com/order/index.html?hybrid=true");
        activity.overridePendingTransition(0, 0);
        hh.d(activity);
        return true;
    }

    static {
        t2o.a(708837604);
    }
}
