package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355846);
    }

    public static String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cbd466a4", new Object[]{str, map});
        }
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return buildUpon.toString();
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff01bf0", new Object[]{str});
        }
        if (str.startsWith(itw.URL_SEPARATOR)) {
            return uyv.HTTPS_SCHEMA.concat(str);
        }
        return str;
    }

    public static String c(String str, String str2, String str3) {
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b47b0166", new Object[]{str, str2, str3});
        }
        try {
            String b = b(str);
            Uri parse = Uri.parse(b);
            if (parse.getQueryParameter(str2) != null) {
                return b.replace(str2 + "=" + Uri.encode(queryParameter), str2 + "=" + Uri.encode(str3));
            }
            Uri.Builder buildUpon = parse.buildUpon();
            String path = parse.getPath();
            if (path == null || path.length() == 0) {
                buildUpon.appendPath("");
            }
            return buildUpon.appendQueryParameter(str2, str3).toString();
        } catch (Exception e) {
            Log.e("replaceQueryParameter", "" + e.getMessage());
            return str;
        }
    }
}
