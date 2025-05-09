package anet.channel.util;

import android.text.TextUtils;
import anet.channel.request.Request;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class HttpHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(607125944);
    }

    public static Map<String, List<String>> cloneMap(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b07bfaf4", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
        }
        return hashMap;
    }

    public static List<String> getHeaderFieldByKey(Map<String, List<String>> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("677c03f0", new Object[]{map, str});
        }
        if (map != null && !map.isEmpty() && !TextUtils.isEmpty(str)) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                if (str.equalsIgnoreCase(entry.getKey())) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public static boolean parseCache(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c7bb33", new Object[]{map})).booleanValue();
        }
        try {
            List<String> list = map.get(HttpConstant.X_CACHE);
            if (list != null && !list.isEmpty()) {
                return list.get(0).toUpperCase().startsWith("HIT");
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String parseEagleId(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f844aa4e", new Object[]{map});
        }
        String singleHeaderFieldByKey = getSingleHeaderFieldByKey(map, "eagleeye-traceid");
        if (singleHeaderFieldByKey == null || singleHeaderFieldByKey.isEmpty()) {
            singleHeaderFieldByKey = getSingleHeaderFieldByKey(map, HttpConstant.EAGLE_EYE_ID_2);
        }
        return (singleHeaderFieldByKey == null || singleHeaderFieldByKey.isEmpty()) ? getSingleHeaderFieldByKey(map, "eagleid") : singleHeaderFieldByKey;
    }

    public static String parseVia(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6de81f1d", new Object[]{map});
        }
        try {
            List<String> list = map.get(HttpConstant.VIA);
            if (list == null || list.isEmpty()) {
                return "";
            }
            return list.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String parseXCache(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a99203f", new Object[]{map});
        }
        try {
            List<String> list = map.get(HttpConstant.X_CACHE);
            if (list == null || list.isEmpty()) {
                return "";
            }
            return list.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static void removeHeaderFiledByKey(Map<String, List<String>> map, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c138f7", new Object[]{map, str});
        } else if (str != null) {
            Iterator<String> it = map.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    break;
                }
                str2 = it.next();
                if (str.equalsIgnoreCase(str2)) {
                    break;
                }
            }
            if (str2 != null) {
                map.remove(str2);
            }
        }
    }

    @Deprecated
    public static String trySolveFileExtFromURL(URL url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e29fe16", new Object[]{url});
        }
        return trySolveFileExtFromUrlPath(url.getPath());
    }

    public static String trySolveFileExtFromUrlPath(String str) {
        int lastIndexOf;
        int lastIndexOf2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("423f74c6", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            int length = str.length();
            if (!(length <= 1 || (lastIndexOf = str.lastIndexOf(47)) == -1 || lastIndexOf == length - 1 || (lastIndexOf2 = str.lastIndexOf(46)) == -1 || lastIndexOf2 <= lastIndexOf)) {
                return str.substring(lastIndexOf2 + 1, length);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getSingleHeaderFieldByKey(Map<String, List<String>> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4eda9f1", new Object[]{map, str});
        }
        List<String> headerFieldByKey = getHeaderFieldByKey(map, str);
        if (headerFieldByKey == null || headerFieldByKey.isEmpty()) {
            return null;
        }
        return headerFieldByKey.get(0);
    }

    public static int parseContentLength(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0147fc5", new Object[]{map})).intValue();
        }
        try {
            return Integer.parseInt(getSingleHeaderFieldByKey(map, "Content-Length"));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int parseStatusCode(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee84ebf", new Object[]{map})).intValue();
        }
        try {
            List<String> list = map.get(HttpConstant.STATUS);
            if (list != null && !list.isEmpty()) {
                return Integer.parseInt(list.get(0));
            }
        } catch (NumberFormatException unused) {
        }
        return 0;
    }

    public static boolean checkRedirect(Request request, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd8019fd", new Object[]{request, new Integer(i)})).booleanValue();
        }
        return request.isRedirectEnable() && i >= 300 && i < 400 && i != 304 && request.getRedirectTimes() < 10;
    }

    public static long parseServerRT(Map<String, List<String>> map, int i) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbfaf331", new Object[]{map, new Integer(i)})).longValue();
        }
        try {
            if (i == 1) {
                list = map.get("s-rt");
            } else {
                list = i == 2 ? map.get("s-brt") : null;
            }
            if (list == null || list.isEmpty()) {
                return 0L;
            }
            return Long.parseLong(list.get(0));
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }
}
