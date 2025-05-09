package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class dr0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(438304812);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80f42702", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(h1p.HTTP_PREFIX) || str.startsWith(h1p.HTTPS_PREFIX)) {
            return str;
        }
        if (str.startsWith(itw.URL_SEPARATOR)) {
            return uyv.HTTPS_SCHEMA.concat(str);
        }
        return h1p.HTTPS_PREFIX.concat(str);
    }
}
