package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.favorite.FavoriteConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class o8n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321711);
    }

    public static Map<String, String> a(Uri uri) {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("826f3430", new Object[]{uri});
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(uri.getQuery()) && (queryParameterNames = uri.getQueryParameterNames()) != null && !queryParameterNames.isEmpty()) {
            for (String str : queryParameterNames) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static String b(Intent intent) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("721581aa", new Object[]{intent});
        }
        if (intent == null || (data = intent.getData()) == null) {
            return "";
        }
        String queryParameter = data.getQueryParameter("entryNDNid");
        if (!TextUtils.isEmpty(queryParameter)) {
            return queryParameter;
        }
        return g(intent);
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c48b9db6", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String queryParameter = Uri.parse(str).getQueryParameter("entryNDNid");
        if (!TextUtils.isEmpty(queryParameter)) {
            return queryParameter;
        }
        return h(str);
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae5b790d", new Object[]{str});
        }
        String[] strArr = {"[?|&]item_id=(\\d+)", "[?|&]itemId=(\\d+)", "[?|&]item_num_id=(\\d+)", "[?|&]itemNumId=(\\d+)", "[?|&]id=(\\d+)"};
        for (int i = 0; i < 5; i++) {
            Matcher matcher = Pattern.compile(strArr[i]).matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("762cbdb1", new Object[]{str});
        }
        Matcher matcher = Pattern.compile("//a\\.(?:m|wapa|waptest)\\.(?:taobao|tmall)\\.com/i(\\d+)\\.htm").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        Matcher matcher2 = Pattern.compile("//a\\.(?:m|wapa|waptest)\\.(?:taobao|tmall)\\.com.*[?|&](?:id|item_id)=(\\d+)").matcher(str);
        if (matcher2.find()) {
            return matcher2.group(1);
        }
        return null;
    }

    public static String f(Intent intent) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16056cd", new Object[]{intent});
        }
        String str2 = "";
        String str3 = null;
        if (TextUtils.isEmpty(str2)) {
            try {
                str = kff.a(intent, FavoriteConstants.DetailConstants_DETAIL_URL);
            } catch (Exception unused) {
                str = null;
            }
            if (str != null) {
                str2 = h(str);
            }
        }
        if (TextUtils.isEmpty(str2)) {
            try {
                str3 = intent.getDataString();
            } catch (Exception unused2) {
            }
            if (str3 != null) {
                str2 = h(str3);
            }
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("item_id", str2);
            }
        } catch (Exception unused3) {
        }
        return str2;
    }

    public static String g(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4ae2047", new Object[]{intent});
        }
        String a2 = kff.a(intent, "id");
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        String a3 = kff.a(intent, "item_id");
        if (!TextUtils.isEmpty(a3)) {
            return a3;
        }
        return f(intent);
    }

    public static String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9f1aa79", new Object[]{str});
        }
        String e = e(str);
        if (e != null) {
            return e;
        }
        return d(str);
    }
}
