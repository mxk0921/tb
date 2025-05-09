package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mtopsdk.mtop.global.SDKUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iio {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PRE = "majorVersion_";

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f21332a = Pattern.compile("^shop([0-9]+)(\\.m)*(\\.wapa)*(\\.waptest)*\\.(tmall|taobao)\\.com$");

    static {
        t2o.a(668991587);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc368247", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("shop_id".equals(str)) {
            return "shopId";
        }
        if ("uid".equals(str) || "seller_id".equals(str) || "user_id".equals(str) || "userId".equals(str)) {
            return "sellerId";
        }
        return "nick".equals(str) ? "sellerNick" : str;
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ad37cc7", new Object[0])).longValue();
        }
        long c = c(SDKUtils.getTimeOffset() * 1000);
        new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss").format(new Date(c));
        new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss").format(new Date());
        return c;
    }

    public static long c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("777fe0ac", new Object[]{new Long(j)})).longValue();
        }
        return d() + 28800000 + j;
    }

    public static long d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a318c5bd", new Object[0])).longValue();
        }
        return Calendar.getInstance().getTimeInMillis() - TimeZone.getDefault().getRawOffset();
    }

    public static String e(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5bdd2b47", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            String str3 = "";
            if (parse.getQuery() == null) {
                str2 = str3;
            } else {
                str2 = "?" + parse.getEncodedQuery();
            }
            if (parse.getEncodedFragment() != null) {
                str3 = "#" + parse.getEncodedFragment();
            }
            return "http://shop.m.taobao.com/shop/allweex_loft_index.htm" + str2 + str3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String f(String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b61cad6a", new Object[]{str, str2, new Boolean(z), str3});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                try {
                    Uri parse2 = Uri.parse(str);
                    StringBuilder sb = new StringBuilder();
                    if (TextUtils.isEmpty(parse.getScheme())) {
                        if (str2.startsWith(itw.URL_SEPARATOR)) {
                            sb.append(uyv.HTTPS_SCHEMA);
                        } else {
                            sb.append(h1p.HTTPS_PREFIX);
                        }
                    }
                    boolean contains = str2.contains("?");
                    int indexOf = str2.indexOf("?");
                    boolean contains2 = str2.contains("#");
                    int indexOf2 = str2.indexOf("#");
                    if (contains2 && contains) {
                        indexOf = Math.min(indexOf, indexOf2);
                    } else if (contains2) {
                        indexOf = indexOf2;
                    } else if (!contains) {
                        indexOf = str2.length();
                    }
                    String substring = str2.substring(0, indexOf);
                    if (!TextUtils.isEmpty(substring)) {
                        sb.append(substring);
                    }
                    String o = o(parse2, parse, z, str3);
                    if (!TextUtils.isEmpty(o)) {
                        sb.append("?");
                        sb.append(o);
                    }
                    String encodedFragment = parse.getEncodedFragment();
                    if (!TextUtils.isEmpty(encodedFragment)) {
                        sb.append("#");
                        sb.append(encodedFragment);
                    }
                    return sb.toString();
                } catch (Exception unused) {
                    return str;
                }
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public static Map<String, String> h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1dd58982", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return g(Uri.parse(str));
    }

    public static Map<String, String> i(Map<String, String> map, boolean z, String str) {
        String next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7a212380", new Object[]{map, new Boolean(z), str});
        }
        if (map == null || map.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            String str2 = map.get(next);
            if (str2 != null && (z || !l(next, str))) {
                if (!z) {
                    next = a(next);
                }
                hashMap.put(next, str2);
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String j(java.lang.String r6) {
        /*
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = tb.iio.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "e2da3d57"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r6
            java.lang.Object r6 = r1.ipc$dispatch(r2, r3)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L_0x0015:
            java.io.File r1 = new java.io.File
            android.app.Application r2 = tb.lvr.b
            java.io.File r2 = r2.getFilesDir()
            r1.<init>(r2, r6)
            boolean r6 = r1.exists()
            r2 = 0
            if (r6 != 0) goto L_0x0028
            return r2
        L_0x0028:
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: all -> 0x005a, Exception -> 0x005c
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: all -> 0x005a, Exception -> 0x005c
            r3.<init>(r1)     // Catch: all -> 0x005a, Exception -> 0x005c
            java.lang.String r1 = "UTF-8"
            r6.<init>(r3, r1)     // Catch: all -> 0x005a, Exception -> 0x005c
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: all -> 0x0048, Exception -> 0x004b
            r1.<init>()     // Catch: all -> 0x0048, Exception -> 0x004b
            r3 = 2096(0x830, float:2.937E-42)
            char[] r3 = new char[r3]     // Catch: all -> 0x0048, Exception -> 0x004b
        L_0x003d:
            int r4 = r6.read(r3)     // Catch: all -> 0x0048, Exception -> 0x004b
            r5 = -1
            if (r4 == r5) goto L_0x004d
            r1.append(r3, r0, r4)     // Catch: all -> 0x0048, Exception -> 0x004b
            goto L_0x003d
        L_0x0048:
            r0 = move-exception
            r2 = r6
            goto L_0x0080
        L_0x004b:
            r0 = move-exception
            goto L_0x005e
        L_0x004d:
            java.lang.String r0 = r1.toString()     // Catch: all -> 0x0048, Exception -> 0x004b
            r6.close()     // Catch: IOException -> 0x0055
            goto L_0x0059
        L_0x0055:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0059:
            return r0
        L_0x005a:
            r0 = move-exception
            goto L_0x0080
        L_0x005c:
            r0 = move-exception
            r6 = r2
        L_0x005e:
            java.lang.String r1 = "ShopRule"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: all -> 0x0048
            r3.<init>()     // Catch: all -> 0x0048
            java.lang.String r4 = "getRuleFromFile error,"
            r3.append(r4)     // Catch: all -> 0x0048
            r3.append(r0)     // Catch: all -> 0x0048
            java.lang.String r0 = r3.toString()     // Catch: all -> 0x0048
            android.util.Log.e(r1, r0)     // Catch: all -> 0x0048
            if (r6 == 0) goto L_0x007f
            r6.close()     // Catch: IOException -> 0x007b
            goto L_0x007f
        L_0x007b:
            r6 = move-exception
            r6.printStackTrace()
        L_0x007f:
            return r2
        L_0x0080:
            if (r2 == 0) goto L_0x008a
            r2.close()     // Catch: IOException -> 0x0086
            goto L_0x008a
        L_0x0086:
            r6 = move-exception
            r6.printStackTrace()
        L_0x008a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.iio.j(java.lang.String):java.lang.String");
    }

    public static String k(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f45ac0", new Object[]{map, str});
        }
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return map.get(str);
    }

    public static boolean l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("995398e1", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONArray parseArray = JSON.parseArray(str2);
                if (parseArray == null) {
                    return false;
                }
                int size = parseArray.size();
                for (int i = 0; i < size; i++) {
                    Object obj = parseArray.get(i);
                    if (obj != null && (obj instanceof String)) {
                        String str3 = (String) obj;
                        if (!TextUtils.isEmpty(str3) && str3.equals(str)) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Exception e) {
                Log.e("ShopRule", "getRuleFromFile error," + e);
            }
        }
        return false;
    }

    public static String n(Map<String, ? extends Serializable> map) {
        String str;
        String next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bafabaf2", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        if (map != null && map.size() > 0) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext() && (next = it.next()) != null) {
                if (map.get(next) != null) {
                    sb.append(next);
                    sb.append("=");
                    sb.append(map.get(next));
                    sb.append("&");
                }
            }
            int length = sb.length();
            if (length > 0) {
                str = sb.substring(0, length - 1);
                return str.toString();
            }
        }
        str = "";
        return str.toString();
    }

    public static String o(Uri uri, Uri uri2, boolean z, String str) {
        Map<String, String> i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2173e259", new Object[]{uri, uri2, new Boolean(z), str});
        }
        if (uri == null || uri2 == null) {
            return null;
        }
        Map<String, String> g = g(uri);
        Map<String, String> g2 = g(uri2);
        HashMap hashMap = new HashMap();
        if (g != null && g.size() > 0) {
            hashMap.putAll(g);
        }
        if (g2 != null && g2.size() > 0) {
            hashMap.putAll(g2);
        }
        if (hashMap.size() == 0 || (i = i(hashMap, z, str)) == null) {
            return null;
        }
        return n(i);
    }

    public static boolean p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e9897d2", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && Boolean.TRUE.toString().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean m(String str) {
        Map<String, String> h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d34bb88f", new Object[]{str})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (h = h(str)) != null && h.containsKey("wh_weex")) {
            return Boolean.TRUE.toString().equals(h.get("wh_weex"));
        }
        return false;
    }

    public static Map<String, String> g(Uri uri) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3fcbbd9", new Object[]{uri});
        }
        Matcher matcher = null;
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String encodedFragment = uri.getEncodedFragment();
        String encodedQuery = uri.getEncodedQuery();
        String[] split = (encodedFragment == null || !encodedFragment.contains("?")) ? null : encodedFragment.split("\\?");
        if (split != null && split.length > 0) {
            encodedFragment = split[0];
            if (split.length > 1) {
                encodedQuery = !TextUtils.isEmpty(encodedQuery) ? encodedQuery + "&" + split[1] : split[1];
            }
        }
        if (encodedFragment != null && encodedFragment.contains("&") && (indexOf = encodedFragment.indexOf("&")) > 0) {
            if (!TextUtils.isEmpty(encodedQuery)) {
                encodedQuery = encodedQuery + "&" + encodedFragment.substring(indexOf + 1);
            } else {
                encodedQuery = encodedFragment.substring(indexOf + 1);
            }
            encodedFragment.substring(0, indexOf);
        }
        String[] split2 = !TextUtils.isEmpty(encodedQuery) ? encodedQuery.split("&") : null;
        if (split2 != null && split2.length > 0) {
            for (String str : split2) {
                String[] split3 = str.split("=");
                if (split3.length == 2) {
                    hashMap.put(split3[0], split3[1]);
                }
            }
        }
        try {
            matcher = f21332a.matcher(uri.getHost());
        } catch (Exception unused) {
        }
        if (matcher != null && matcher.find()) {
            String group = matcher.group(1);
            if (!TextUtils.isEmpty(group)) {
                hashMap.put("shop_id", group);
            }
        }
        return hashMap;
    }

    public static boolean q(String str, String str2) {
        Throwable th;
        IOException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57fda454", new Object[]{str, str2})).booleanValue();
        }
        File file = new File(lvr.b.getFilesDir(), str2);
        if (file.exists()) {
            file.delete();
        }
        OutputStreamWriter outputStreamWriter = null;
        try {
            try {
                if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                    return false;
                }
                if (file.createNewFile()) {
                    OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
                    try {
                        outputStreamWriter2.write(str);
                        outputStreamWriter2.flush();
                        outputStreamWriter = outputStreamWriter2;
                    } catch (IOException e2) {
                        e = e2;
                        outputStreamWriter = outputStreamWriter2;
                        Log.e("ShopRule", "saveRuleFile error," + e + ",rule null? " + TextUtils.isEmpty(str));
                        if (outputStreamWriter != null) {
                            try {
                                outputStreamWriter.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        outputStreamWriter = outputStreamWriter2;
                        if (outputStreamWriter != null) {
                            try {
                                outputStreamWriter.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                if (outputStreamWriter != null) {
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                return true;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e6) {
            e = e6;
        }
    }
}
