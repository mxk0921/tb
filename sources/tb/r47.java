package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class r47 implements ecd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855862);
        t2o.a(989855864);
    }

    @Override // tb.ecd
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("216932e4", new Object[]{this, str, str2})).booleanValue();
        }
        if (str == null || !str.contains("ignore_prefetch_query_match=true")) {
            return str != null && str.equals(str2);
        }
        try {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(str2);
            if (parse.getScheme().equals(parse2.getScheme()) && parse.getHost().equals(parse2.getHost())) {
                if (parse.getPath().equals(parse2.getPath())) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
