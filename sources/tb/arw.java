package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class arw implements qsw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708658);
        t2o.a(989856468);
    }

    @Override // tb.qsw
    public String dealUrlScheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("849ca447", new Object[]{this, str});
        }
        try {
            if (!TextUtils.isEmpty(str) && !str.startsWith("javascript:")) {
                return str.replaceAll("^((?i)https:)?//", h1p.HTTP_PREFIX);
            }
            return str;
        } catch (Exception unused) {
            v7t.d("WVSchemeProcessor", "Can not dealUrlScheme : " + str);
            return str;
        }
    }
}
