package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ds6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f18038a;
    public final Map<String, String> b;
    public final Uri c;

    static {
        t2o.a(839909948);
    }

    public ds6(String str) {
        ckf.g(str, "url");
        this.f18038a = str;
        this.b = ies.f(str, true);
        Uri g = ies.g(str);
        ckf.f(g, "parseUrl(url)");
        this.c = g;
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68e7d20f", new Object[]{this, str});
        }
        ckf.g(str, "key");
        if (ckf.b(str, "url")) {
            return this.f18038a;
        }
        if (ckf.b(str, "queryParams")) {
            String query = this.c.getQuery();
            return query == null ? "" : query;
        } else if (!tsq.I(str, "queryParams.", false, 2, null)) {
            return "";
        } else {
            Map<String, String> map = this.b;
            String substring = str.substring(12);
            ckf.f(substring, "this as java.lang.String).substring(startIndex)");
            String str2 = map.get(substring);
            return str2 == null ? "" : str2;
        }
    }
}
