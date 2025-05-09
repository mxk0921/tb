package tb;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class e6p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792252);
    }

    public static boolean a(String str, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e505ae5", new Object[]{str, activity})).booleanValue();
        }
        if (str.startsWith(h1p.HTTP_PREFIX) || str.startsWith(h1p.HTTPS_PREFIX)) {
            try {
                String host = Uri.parse(str).getHost();
                if (TextUtils.isEmpty(host)) {
                    b4p.o("SearchUrlNavUtil", "host为空");
                    return false;
                } else if (!host.endsWith(".taobao.com") && !host.endsWith(h1p.TMALL_HOST) && !host.endsWith(h1p.ALIBABA_INC_HOST)) {
                    return false;
                } else {
                    Nav.from(activity).toUri(str);
                    return true;
                }
            } catch (Exception e) {
                b4p.p("SearchUrlNavUtil", "获取host失败：".concat(str), e);
                return false;
            }
        } else {
            b4p.g("SearchUrlNavUtil", "搜索内容非URL，进行关键词搜索");
            return false;
        }
    }
}
