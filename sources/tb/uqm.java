package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.yfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uqm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GUANGGUANG_DSL_KEY = "https://g.alicdn.com/tnode/guangguang/";

    static {
        t2o.a(502268014);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42617ff1", new Object[]{str});
        }
        if (str != null) {
            try {
                return str.substring(0, str.substring(0, str.lastIndexOf("/")).lastIndexOf("/") + 1);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Uri b(Uri uri, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("5f78b0c9", new Object[]{uri, str, map});
        }
        String a2 = a(str);
        return !TextUtils.isEmpty(a2) ? ((uri == null || !"true".equals(uri.getQueryParameter(pl4.KEY_PREFETCH_ALREADY))) && d(a2, map) && uri != null) ? uri.buildUpon().appendQueryParameter(pl4.KEY_PREFETCH_ALREADY, "true").build() : uri : uri;
    }

    public static void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("526b493d", new Object[]{str, map});
        } else {
            d(str, map);
        }
    }

    public static boolean d(String str, Map<String, String> map) {
        boolean z;
        bcd u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17ea1b84", new Object[]{str, map})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            if (GUANGGUANG_DSL_KEY.equals(str)) {
                z = akt.C1();
            } else {
                z = akt.D1();
            }
            if (z && (u = od0.D().u()) != null) {
                return u.b(str, new yfs.b(map));
            }
        }
        return false;
    }
}
