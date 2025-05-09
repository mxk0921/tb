package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class iov {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809166);
    }

    @Deprecated
    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86f381f9", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (!TextUtils.equals("poplayer", parse.getScheme()) || !TextUtils.equals("homepage_interest", parse.getHost())) {
            return str;
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.appendQueryParameter("sectionBizCode", str2).build();
        return buildUpon.toString();
    }
}
