package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pyu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(707788898);
    }

    public static Map<String, String> a(Uri uri) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3fcbbd9", new Object[]{uri});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.utils.URLUtils", "public static Map<String, String> getParams(Uri uri)", "20180112");
        if (uri == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        String encodedFragment = uri.getEncodedFragment();
        String encodedQuery = uri.getEncodedQuery();
        String[] strArr = null;
        String[] split = (encodedFragment == null || !encodedFragment.contains("?")) ? null : encodedFragment.split("\\?");
        if (split != null && split.length > 0) {
            encodedFragment = split[0];
            encodedQuery = !TextUtils.isEmpty(encodedQuery) ? encodedQuery + "&" + split[1] : split[1];
        }
        if (encodedFragment != null && encodedFragment.contains("&") && (indexOf = encodedFragment.indexOf("&")) > 0) {
            if (!TextUtils.isEmpty(encodedQuery)) {
                encodedQuery = encodedQuery + "&" + encodedFragment.substring(indexOf + 1);
            } else {
                encodedQuery = encodedFragment.substring(indexOf + 1);
            }
            encodedFragment.substring(0, indexOf);
        }
        if (!TextUtils.isEmpty(encodedQuery)) {
            strArr = encodedQuery.split("&");
        }
        if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                String[] split2 = str.split("=");
                if (split2.length == 2) {
                    hashMap.put(split2[0], split2[1]);
                }
            }
        }
        return hashMap;
    }
}
