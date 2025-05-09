package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bqg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_LINK_COLD_START = "__link_cold_start__";
    public static final String EXTRA_LINK_HOT_START = "__link_hot_start__";
    public static final String EXTRA_LINK_MODULE_NAME = "__link_module_name__";

    public static String a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("277e97ef", new Object[]{intent});
        }
        if (intent == null) {
            return null;
        }
        return intent.getStringExtra("__link_module_name__");
    }

    public static boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7ce34ff", new Object[]{intent})).booleanValue();
        }
        return qg0.b(intent);
    }

    public static boolean c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a088c68", new Object[]{intent})).booleanValue();
        }
        if (intent == null) {
            return false;
        }
        return d(intent.getExtras());
    }

    public static boolean d(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8351d3d1", new Object[]{bundle})).booleanValue();
        }
        if (bundle == null) {
            return false;
        }
        try {
            if (!bundle.getBoolean("afc_nav_merge", false)) {
                if (!bundle.getBoolean("afc_nav_native", false)) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            whh.a("LinkContext", "error occurred when isAfcContextCallback: " + e.getMessage());
            return false;
        }
    }

    public static String e(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f83aab92", new Object[]{intent});
        }
        return f(intent, false);
    }

    public static String f(Intent intent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b258eb9a", new Object[]{intent, new Boolean(z)});
        }
        if (intent == null || intent.getData() == null) {
            return null;
        }
        if (!z) {
            if (!qg0.b(intent)) {
                return null;
            }
            if (!intent.getBooleanExtra("afc_nav_merge", false) && !intent.getBooleanExtra("afc_nav_native", false)) {
                return null;
            }
        }
        return g(intent.getData());
    }

    public static String g(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2914c0a", new Object[]{uri});
        }
        if (!qqg.b(uri) || uri.isOpaque()) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("h5Url");
        String queryParameter2 = uri.getQueryParameter("bc_fl_src");
        if (TextUtils.isEmpty(queryParameter2) || !queryParameter2.startsWith("tanx_df_")) {
            return queryParameter;
        }
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        Uri parse = Uri.parse(queryParameter);
        if (parse.isOpaque()) {
            return queryParameter;
        }
        String queryParameter3 = parse.getQueryParameter("u");
        return (!TextUtils.isEmpty(queryParameter3) && !Uri.parse(queryParameter3).isOpaque()) ? queryParameter3 : queryParameter;
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82307c65", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return g(Uri.parse(str));
    }
}
