package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rse {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792577);
    }

    public static Map<String, String> a(Uri uri, Map<String, String> map) {
        String[] strArr;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("50873ad6", new Object[]{uri, map});
        }
        if (uri == null) {
            return map;
        }
        String encodedFragment = uri.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedFragment)) {
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("Type", "FRAGMENT_URL");
            arrayMap.put(MonitorItemConstants.KEY_URL, uri.toString());
            sen.f("InShopParamDetector", arrayMap);
        }
        String encodedQuery = uri.getEncodedQuery();
        String[] strArr2 = null;
        if (encodedFragment == null || !encodedFragment.contains("?")) {
            strArr = null;
        } else {
            strArr = encodedFragment.split("\\?");
        }
        if (strArr != null && strArr.length > 0) {
            encodedFragment = strArr[0];
            encodedQuery = !TextUtils.isEmpty(encodedQuery) ? encodedQuery + "&" + strArr[1] : strArr[1];
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
            strArr2 = encodedQuery.split("&");
        }
        if (strArr2 != null && strArr2.length > 0) {
            for (String str : strArr2) {
                String[] split = str.split("=");
                if (split.length == 2) {
                    map.put(split[0], split[1]);
                }
            }
        }
        return map;
    }

    public static Map<String, String> b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a29fbd6c", new Object[]{intent});
        }
        HashMap hashMap = new HashMap();
        String stringExtra = intent.getStringExtra("url");
        if (!TextUtils.isEmpty(stringExtra)) {
            hashMap.putAll(bql.e(Uri.parse(stringExtra)));
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("Type", "url");
            arrayMap.put(MonitorItemConstants.KEY_URL, stringExtra);
            sen.f("InShopParamDetector", arrayMap);
        }
        try {
            a(intent.getData(), hashMap);
        } catch (Exception unused) {
            TLog.logd("InShopParamsParser", "解析店内url锚点参数异常");
        }
        bql.d(intent, hashMap);
        if (TextUtils.equals((CharSequence) hashMap.remove("isSoldCount"), "true")) {
            hashMap.put("sort", "_sale");
        }
        if (TextUtils.equals((CharSequence) hashMap.remove("isNew"), "true")) {
            hashMap.put("sort", "first_new");
        }
        hashMap.remove(m7r.URL_REFERER_ORIGIN);
        hashMap.remove("referrer");
        return hashMap;
    }
}
