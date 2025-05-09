package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class pje implements kcd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321808);
    }

    @Override // tb.kcd
    public String a(String str) {
        Uri parse;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39a47d30", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return "";
        }
        if ("content".equals(parse.getQueryParameter("materialType"))) {
            str2 = parse.getQueryParameter("contentId");
        } else {
            str2 = parse.getQueryParameter("id");
        }
        return ynm.a(str2, ynm.e(str));
    }
}
