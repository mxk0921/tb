package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class okp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MOMO_PKG = "com.immomo.momo";
    public static final String QQ_LITE_PKG = "com.tencent.qqlite";
    public static final String QQ_PKG = "com.tencent.mobileqq";
    public static final String QZONE_PKG = "com.qzone";
    public static final String WEIXIN_PKG = "com.tencent.mm";

    static {
        t2o.a(665845893);
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d87e588", new Object[]{context, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Map<String, String> b(Uri uri) {
        String[] strArr;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("de19b76b", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String fragment = uri.getFragment();
        String query = uri.getQuery();
        if (fragment == null || !fragment.contains("?")) {
            strArr = null;
        } else {
            strArr = fragment.split("\\?");
        }
        if (strArr != null && strArr.length > 0) {
            fragment = strArr[0];
            query = !TextUtils.isEmpty(query) ? query + "&" + strArr[1] : strArr[1];
        }
        if (fragment != null && fragment.contains("&") && (indexOf = fragment.indexOf("&")) > 0) {
            if (!TextUtils.isEmpty(query)) {
                fragment.substring(indexOf + 1);
            } else {
                fragment.substring(indexOf + 1);
            }
            fragment.substring(0, indexOf);
        }
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            String[] strArr2 = (String[]) queryParameterNames.toArray(new String[queryParameterNames.size()]);
            if (strArr2 != null && strArr2.length > 0) {
                for (String str : strArr2) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
            }
            return hashMap;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public static Map<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("371c4c73", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        return b(Uri.parse(str));
    }
}
