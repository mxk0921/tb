package com.taobao.uikit.actionbar.util;

import android.app.Activity;
import android.os.Bundle;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import org.json.JSONException;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UrlUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(927989845);
    }

    public static JSONObject assembleUrlString(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b61b73ed", new Object[]{bundle});
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            try {
                if (bundle.get(str) instanceof Bundle) {
                    jSONObject.put(str, assembleUrlString((Bundle) bundle.get(str)));
                } else {
                    jSONObject.put(str, bundle.get(str));
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        return jSONObject;
    }

    public static String getReportUrl(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6029a322", new Object[]{activity});
        }
        int a2 = EnvironmentSwitcher.a();
        if (Localization.o()) {
            if (a2 == 1) {
                return activity.getString(R.string.uik_menu_report_url_pre_i18n);
            }
            return activity.getString(R.string.uik_menu_report_url_online_i18n);
        } else if (a2 == 1) {
            return activity.getString(R.string.uik_menu_report_url_pre_new);
        } else {
            if (a2 == 2) {
                return activity.getString(R.string.uik_menu_report_url_test);
            }
            return activity.getString(R.string.uik_menu_report_url_online_new);
        }
    }
}
