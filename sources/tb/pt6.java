package tb;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.ct6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pt6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMPONENT = "MediaPlayer_";
    public static final String CONDITION_KEY_NONCE_100 = "nonce_100";
    public static final String CONDITION_KEY_PROXY_AVAILABLE = "proxyAvailable";
    public static final String CONDITION_KEY_URL = "url";
    public static final String MODULE_HLS_FMP4 = "hls_fmp4_20240620";
    public static final String VARIATION_KEY_FORMAT_OPTIONS = "formatOptions";
    public static final String VARIATION_KEY_REWRITE = "rewrite";

    static {
        t2o.a(774897842);
    }

    public static ct6 a(String str) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ct6) ipChange.ipc$dispatch("c97b47ee", new Object[]{str});
        }
        ct6.a aVar = new ct6.a(str);
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(CONDITION_KEY_NONCE_100, Integer.valueOf(new Random().nextInt(100)));
        arrayMap.put("url", str);
        VariationSet activate = UTABTest.activate(COMPONENT, MODULE_HLS_FMP4, arrayMap, null);
        String[][] strArr = (String[][]) s0.a(activate, VARIATION_KEY_REWRITE, String[][].class);
        Map map = (Map) s0.a(activate, VARIATION_KEY_FORMAT_OPTIONS, Map.class);
        if (activate.size() <= 0) {
            return null;
        }
        aVar.b(activate);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof String) && (value instanceof String)) {
                    aVar.d((String) key, (String) value);
                }
            }
        }
        aVar.b = c(str, strArr);
        return aVar.c();
    }

    public static String b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b16a33e", new Object[]{str, str2, str3});
        }
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        if (!matcher.find()) {
            return null;
        }
        return matcher.replaceFirst(str3);
    }

    public static String c(String str, String[][] strArr) {
        String b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee9bea8", new Object[]{str, strArr});
        }
        if (strArr == null) {
            return str;
        }
        for (String[] strArr2 : strArr) {
            if (!(strArr2 == null || strArr2.length != 2 || (b = b(str, strArr2[0], strArr2[1])) == null)) {
                return b;
            }
        }
        return str;
    }
}
