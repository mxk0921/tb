package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class apv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1019215910);
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8c1b3c0", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        if (!parse.isHierarchical()) {
            return str;
        }
        String queryParameter = parse.getQueryParameter(str2);
        if (TextUtils.isEmpty(str)) {
            Uri.Builder buildUpon = parse.buildUpon();
            String path = parse.getPath();
            if (path == null || path.length() == 0) {
                buildUpon.appendPath("");
            }
            return buildUpon.appendQueryParameter(str2, str3).build().toString();
        }
        return str.replace(str2 + "=" + queryParameter, str2 + "=" + str3);
    }

    public static Map<String, String> b(String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9af8a982", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split2 = str.split("\\?");
        if (split2.length <= 1) {
            return null;
        }
        String str2 = split2[1];
        HashMap hashMap = new HashMap();
        for (String str3 : str2.split("&")) {
            if (!TextUtils.isEmpty(str3)) {
                String[] split3 = str3.split("=", 2);
                if (split3.length > 1) {
                    hashMap.put(split3[0], split3[1]);
                }
            }
        }
        return hashMap;
    }
}
