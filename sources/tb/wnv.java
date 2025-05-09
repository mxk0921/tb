package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(329252972);
    }

    public static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22dabe2d", new Object[]{str, str2})).booleanValue();
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        if (!b(parse, parse2) || !a(parse, parse2)) {
            return false;
        }
        return true;
    }

    public static boolean b(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbeb3d0a", new Object[]{uri, uri2})).booleanValue();
        }
        String host = uri.getHost();
        String host2 = uri2.getHost();
        if (!TextUtils.equals(host, host2)) {
            zdh.a("UrlChecker", "host equal=[false],require=[" + host + "],real=[" + host2 + "]");
            return false;
        }
        String path = uri.getPath();
        String path2 = uri2.getPath();
        if (TextUtils.equals(path, path2)) {
            return true;
        }
        zdh.a("UrlChecker", "path equal=[false],require=[" + path + "],real=[" + path2 + "]");
        return false;
    }

    public static boolean a(Uri uri, Uri uri2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0bab9a3", new Object[]{uri, uri2})).booleanValue();
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames == null || queryParameterNames.isEmpty()) {
            return true;
        }
        Set<String> queryParameterNames2 = uri2.getQueryParameterNames();
        if (queryParameterNames2 == null || queryParameterNames2.isEmpty()) {
            zdh.a("UrlChecker", "real url miss query");
            return false;
        }
        for (String str : queryParameterNames) {
            String queryParameter = uri.getQueryParameter(str);
            String queryParameter2 = uri2.getQueryParameter(str);
            if (!TextUtils.equals(queryParameter, queryParameter2)) {
                try {
                    JSONObject parseObject = JSON.parseObject(queryParameter);
                    JSONObject parseObject2 = JSON.parseObject(queryParameter2);
                    if (!(parseObject2 == null || parseObject == null)) {
                        for (String str2 : parseObject.keySet()) {
                            if (!TextUtils.equals(parseObject.getString(str2), parseObject2.getString(str2))) {
                                zdh.a("UrlChecker", "query value is not equal, queryKey=" + str + ", originalVal=" + queryParameter + ", comparedVal=" + queryParameter2);
                                return false;
                            }
                        }
                    }
                } catch (Throwable th) {
                    zdh.b("UrlChecker", "query value is not equal, queryKey=" + str + ", originalVal=" + queryParameter + ", comparedVal=" + queryParameter2, th);
                    return false;
                }
            }
        }
        return true;
    }
}
