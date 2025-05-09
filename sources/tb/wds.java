package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wds {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(849346580);
    }

    public static String a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd3a40a3", new Object[]{activity, str});
        }
        try {
            String queryParameter = ies.g(str).getQueryParameter("spm");
            return (!TextUtils.isEmpty(queryParameter) || activity == null) ? queryParameter : UTAnalytics.getInstance().getDefaultTracker().getPageSpmUrl(activity);
        } catch (Throwable th) {
            Log.e("UserTrackerUtils", th.getLocalizedMessage());
            return "";
        }
    }
}
