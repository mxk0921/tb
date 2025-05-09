package tb;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y78 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(404750419);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7176de84", new Object[0]);
        }
        if (f82.d() == null) {
            return "";
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(f82.d());
        String string = defaultSharedPreferences.getString("PREF_KEY_SELECTED_EDITION_CODE", null);
        if (TextUtils.isEmpty(string)) {
            return defaultSharedPreferences.getString("PREF_KEY_CHECKED_COUNTRY_CODE", o78.CHINA_MAINLAND);
        }
        return string;
    }
}
