package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class i6n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(665845892);
    }

    public static boolean a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f4ef277", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Map<String, String> c = okp.c(str);
        if (c == null || c.size() <= 0) {
            AppMonitor.Alarm.commitFail("share", "PwdUrlCheckUtils", "", "queryParams=isNull&checkUrl=" + str);
            return false;
        }
        String queryParameter = Uri.parse(str).getQueryParameter("sm");
        if (TextUtils.isEmpty(queryParameter)) {
            AppMonitor.Alarm.commitFail("share", "PwdUrlCheckUtils", "", "paramsSign=" + queryParameter + "&checkUrl=" + str);
            return false;
        }
        if (str.contains("&sm=")) {
            str2 = str.replace("&sm=".concat(queryParameter), "");
        } else {
            str2 = str.replace("?sm=".concat(queryParameter), "");
        }
        l87 l87Var = new l87();
        l87Var.a(str2);
        String b = l87Var.b();
        boolean equals = TextUtils.equals(b, queryParameter);
        if (!equals) {
            AppMonitor.Alarm.commitFail("share", "PwdUrlCheckUtils", "", "generateSign=" + b + "&paramsSign=" + queryParameter + "&checkUrl=" + str);
        }
        return equals;
    }
}
