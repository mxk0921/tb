package com.taobao.message.kit.util;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.util.BeanUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class URLUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PATTERN_ENCODED_EXP = "\\%24\\%7B[^\\%7D]*\\%7D";
    private static final String PATTERN_EXP = "\\$\\{[^\\}]*\\}";

    static {
        t2o.a(529531020);
    }

    public static String bindParam4EncodedStrWith$(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ef34b4", new Object[]{str, bundle});
        }
        if (bundle != null) {
            Matcher matcher = Pattern.compile(PATTERN_ENCODED_EXP).matcher(str);
            while (matcher.find()) {
                String group = matcher.group();
                String substring = group.substring(6, group.length() - 3);
                String str2 = "";
                if (bundle.containsKey(substring)) {
                    Object obj = bundle.get(substring);
                    if (obj != null) {
                        str2 = String.valueOf(obj);
                    }
                    try {
                        str = str.replace(group, URLEncoder.encode(str2, "UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        str = str.replace(group, str2);
                        e.printStackTrace();
                    }
                } else {
                    str = str.replace(group, str2);
                }
            }
        }
        return str;
    }

    public static String bindParamWith$(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98390a8b", new Object[]{str, bundle});
        }
        if (bundle != null) {
            Matcher matcher = Pattern.compile(PATTERN_EXP).matcher(str);
            while (matcher.find()) {
                String group = matcher.group();
                String substring = group.substring(2, group.length() - 1);
                String str2 = "";
                if (bundle.containsKey(substring)) {
                    Object obj = bundle.get(substring);
                    if (obj != null) {
                        str2 = String.valueOf(obj);
                    }
                    try {
                        str = str.replace(group, URLEncoder.encode(str2, "UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        str = str.replace(group, str2);
                        e.printStackTrace();
                    }
                } else {
                    str = str.replace(group, str2);
                }
            }
        }
        return str;
    }

    public static String decode(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7a3d9b7", new Object[]{str, str2});
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String encode(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1654a8f", new Object[]{str, str2});
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String getMidPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7c70502", new Object[0]);
        }
        if (ApplicationUtil.getEnvType() == 0) {
            return "m";
        }
        return "wapa";
    }

    public static String getScheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7b908d34", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return URI.create(str).getScheme();
        } catch (Exception unused) {
            return Uri.parse(str).getScheme();
        }
    }

    public static String getUrlHostAndPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5e4f5f4", new Object[]{str});
        }
        try {
            Uri parse = Uri.parse(str);
            return parse.getHost() + parse.getPath();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getUrlWithoutParameters(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9484fc76", new Object[]{str});
        }
        try {
            Uri parse = Uri.parse(str);
            return new URI(parse.getScheme(), parse.getAuthority(), parse.getPath(), null, parse.getFragment()).toString();
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return str.split("\\?")[0];
        }
    }

    public static boolean isNetUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95ea1f1", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http") || str.startsWith("https")) {
            return true;
        }
        return false;
    }

    public static Map<String, String> parseQueryString(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("577d6e4c", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str) && (indexOf = str.indexOf(63)) >= 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(str.substring(indexOf + 1), "&");
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                if (nextToken.contains("=")) {
                    StringTokenizer stringTokenizer2 = new StringTokenizer(nextToken, "=");
                    try {
                        if (stringTokenizer2.hasMoreTokens()) {
                            hashMap.put(stringTokenizer2.nextToken(), stringTokenizer2.nextToken());
                        }
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    } catch (NoSuchElementException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        return hashMap;
    }

    public static Uri replaceParams(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("501010f1", new Object[]{str, map});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (map == null || map.size() == 0) {
            return Uri.parse(str);
        }
        String urlWithoutParameters = getUrlWithoutParameters(str);
        Map<String, String> parseQueryString = parseQueryString(str);
        for (String str2 : map.keySet()) {
            parseQueryString.put(str2, map.get(str2));
        }
        Uri.Builder buildUpon = Uri.parse(urlWithoutParameters).buildUpon();
        for (String str3 : parseQueryString.keySet()) {
            buildUpon.appendQueryParameter(str3, parseQueryString.get(str3));
        }
        return buildUpon.build();
    }

    public static List<String> getUrlsInTextContent(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("88ff6c9", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        Matcher matcher = PatternsUtil.getWebUrlPattern().matcher(str);
        ArrayList arrayList = new ArrayList();
        while (matcher.find()) {
            String group = matcher.group();
            String[] split = group.split("http");
            if (split.length > 1) {
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str2.trim())) {
                        arrayList.add("http".concat(str2));
                    }
                }
            } else if (!TextUtils.isEmpty(group)) {
                arrayList.add(group);
            }
        }
        Matcher matcher2 = PatternsUtil.getEmailPattern().matcher(str);
        if (!"1".equals(ConfigUtil.getValue("mpm_data_switch", "fixUrlsInTextContent", "1"))) {
            try {
                int size = arrayList.size();
                while (matcher2.find()) {
                    String group2 = matcher2.group();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext() && !group2.endsWith((String) it.next())) {
                        i++;
                    }
                    if (i < size) {
                        arrayList.remove(i);
                    }
                }
                return arrayList;
            } catch (Exception unused) {
                return new ArrayList();
            }
        }
        while (matcher2.find()) {
            String group3 = matcher2.group();
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                if (group3.endsWith((String) arrayList.get(size2))) {
                    arrayList.remove(size2);
                }
            }
        }
        return arrayList;
    }

    public static String bindParamWith$(String str, Map<String, Object> map, boolean z, String str2) {
        String encode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1e633a8", new Object[]{str, map, new Boolean(z), str2});
        }
        if (map != null) {
            Matcher matcher = Pattern.compile(PATTERN_EXP).matcher(str);
            while (matcher.find()) {
                String group = matcher.group();
                Object obj = BeanUtil.get(map, group.substring(2, group.length() - 1));
                if (obj != null) {
                    String valueOf = String.valueOf(obj);
                    if (z) {
                        try {
                            encode = URLEncoder.encode(valueOf, "UTF-8");
                        } catch (UnsupportedEncodingException e) {
                            str = str.replace(group, valueOf);
                            e.printStackTrace();
                        }
                    } else {
                        encode = valueOf;
                    }
                    str = str.replace(group, encode);
                } else {
                    str = str.replace(group, TextUtils.isEmpty(str2) ? "" : str2);
                }
            }
        }
        return str;
    }
}
