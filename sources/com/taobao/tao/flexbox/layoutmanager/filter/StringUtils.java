package com.taobao.tao.flexbox.layoutmanager.filter;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import tb.hqq;
import tb.nov;
import tb.nwv;
import tb.pg1;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class StringUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(503317250);
    }

    @FilterHandler(name = "appendData")
    public static String appendData(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfc3ceaf", new Object[]{str, obj});
        }
        if (obj == null || TextUtils.isEmpty(str)) {
            return str;
        }
        if (obj instanceof String) {
            return appendString(str, obj.toString());
        }
        if (obj instanceof Map) {
            return nov.a(str, (Map) obj);
        }
        return str;
    }

    @FilterHandler(name = "appendString")
    public static String appendString(String str, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("841e227a", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return str;
        }
        String[] split2 = str2.split("&");
        HashMap hashMap = new HashMap();
        for (int i = 0; i < split2.length; i++) {
            if (!TextUtils.isEmpty(split2[i]) && (split = split2[i].split("=")) != null && split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                hashMap.put(split[0], split[1]);
            }
        }
        return nov.a(str, hashMap);
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5890c69", new Object[]{str});
        }
        if (str != null) {
            return str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("'", "&apos;").replace("\"", "&quot;");
        }
        return str;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1e24a30d", new Object[]{str});
        }
        if (str != null) {
            return str.replace("&amp;", "&").replace("&lt;", "<").replace("&gt;", ">").replace("&apos;", "'").replace("&quot;", "\"");
        }
        return str;
    }

    @FilterHandler(name = pg1.ATOM_EXT_charAt)
    public static char charAt(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Character) ipChange.ipc$dispatch("598e0943", new Object[]{str, obj})).charValue();
        }
        int t = nwv.t(obj, 0);
        if (TextUtils.isEmpty(str) || t < 0 || t >= str.length()) {
            return (char) 0;
        }
        return str.charAt(t);
    }

    @FilterHandler(name = "concat")
    public static String concat(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("69280351", new Object[]{str, str2});
        }
        if (str == null || str2 == null) {
            return str;
        }
        return str.concat(str2);
    }

    @FilterHandler(name = "escapeXMLCharactor")
    public static String escapeXMLCharactor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89582ce6", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return b(str);
        }
        return "";
    }

    @FilterHandler(name = pg1.ATOM_EXT_indexOf)
    public static int indexOf(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85c9cb57", new Object[]{str, str2})).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return str.indexOf(str2);
        }
        return -1;
    }

    @FilterHandler(name = "isEmpty")
    public static boolean isEmpty(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcaeceaa", new Object[]{obj})).booleanValue();
        }
        if (obj instanceof List) {
            return ((List) obj).isEmpty();
        }
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        if (obj instanceof String) {
            return TextUtils.isEmpty(String.valueOf(obj));
        }
        if (obj == null) {
            return true;
        }
        return false;
    }

    @FilterHandler(name = "isLetter")
    public static boolean isLetter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("faab3c85", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @FilterHandler(name = "isNotEmpty")
    public static boolean isNotEmpty(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a57a32b", new Object[]{obj})).booleanValue();
        }
        return !isEmpty(obj);
    }

    @FilterHandler(name = "isString")
    public static boolean isString(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98c7ac42", new Object[]{obj})).booleanValue();
        }
        return obj instanceof String;
    }

    @FilterHandler(name = pg1.ATOM_EXT_lastIndexOf)
    public static int lastIndexOf(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e11f09e1", new Object[]{str, str2})).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return str.lastIndexOf(str2);
        }
        return -1;
    }

    @FilterHandler(name = pg1.ATOM_length)
    public static int length(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bb1a4ea", new Object[]{str})).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return str.length();
        }
        return 0;
    }

    @FilterHandler(name = pg1.ATOM_EXT_match)
    public static boolean match(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("216932e4", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !str.matches(str2)) {
            return false;
        }
        return true;
    }

    @FilterHandler(name = "replace")
    public static String replace(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91d0bce7", new Object[]{str, str2, str3});
        }
        if (!TextUtils.isEmpty(str)) {
            return str.replaceAll(str2, str3);
        }
        return str;
    }

    @FilterHandler(name = pg1.ATOM_EXT_reverse)
    public static String reverse(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1e3210d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        hqq.b a2 = hqq.a();
        for (int length = str.length() - 1; length >= 0; length--) {
            a2.a(Character.valueOf(str.charAt(length)));
        }
        return a2.toString();
    }

    @FilterHandler(name = "search")
    public static int search(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d294dfb6", new Object[]{str, str2})).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            return Pattern.compile(str2).matcher(str).start();
        }
        return -1;
    }

    @FilterHandler(name = "split")
    public static List<String> split(String str, String str2) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("844da672", new Object[]{str, str2});
        }
        if (str == null || (split = str.split(str2)) == null) {
            return null;
        }
        return Arrays.asList(split);
    }

    @FilterHandler(name = pg1.ATOM_EXT_substring)
    public static CharSequence subString(CharSequence charSequence, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("74fa97be", new Object[]{charSequence, new Integer(i), new Integer(i2)});
        }
        if (charSequence != null) {
            return charSequence.subSequence(i, Math.min(charSequence.length(), i2));
        }
        return null;
    }

    @FilterHandler(name = pg1.ATOM_EXT_toLocaleLowerCase)
    public static String toLocaleLowerCase(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("95d8a13", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase();
        }
        return "";
    }

    @FilterHandler(name = pg1.ATOM_EXT_toLocaleUpperCase)
    public static String toLocaleUpperCase(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74b281d2", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return str.toUpperCase();
        }
        return "";
    }

    @FilterHandler(name = pg1.ATOM_EXT_toLowerCase)
    public static String toLowerCase(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cac5b3d9", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase();
        }
        return "";
    }

    @FilterHandler(name = "toURL")
    public static String toURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ee5bebb", new Object[]{str});
        }
        return Uri.parse(str).toString();
    }

    @FilterHandler(name = pg1.ATOM_EXT_toUpperCase)
    public static String toUpperCase(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("361aab98", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return str.toUpperCase();
        }
        return "";
    }

    @FilterHandler(name = "trim")
    public static String trim(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9c417cd", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return str.trim();
        }
        return "";
    }

    @FilterHandler(name = "trimAll")
    public static String trimAll(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72177730", new Object[]{str});
        }
        if (str != null) {
            return str.replaceAll("\\s*|\t|\r|\n", "");
        }
        return "";
    }

    @FilterHandler(name = "unescapeHTML")
    public static String unescapeHTML(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d736a78a", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return c(str);
        }
        return "";
    }

    @FilterHandler(name = ErrorCode.DATA_URL_DECODE_EXCEPTION)
    public static String urlDecode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2495bf52", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return Uri.decode(str);
        }
        return "";
    }

    @FilterHandler(name = "urlEncode")
    public static String urlEncode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9986362a", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return Uri.encode(str);
        }
        return "";
    }

    public static Object a(String str, List list) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a0cdb2ad", new Object[]{str, list});
        }
        try {
            switch (str.hashCode()) {
                case -2139875868:
                    if (str.equals("appendData")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -1464939364:
                    if (str.equals(pg1.ATOM_EXT_toLocaleLowerCase)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1361633751:
                    if (str.equals(pg1.ATOM_EXT_charAt)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1137582698:
                    if (str.equals(pg1.ATOM_EXT_toLowerCase)) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1106363674:
                    if (str.equals(pg1.ATOM_length)) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1059749345:
                    if (str.equals("trimAll")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -998714071:
                    if (str.equals("escapeXMLCharactor")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -797625283:
                    if (str.equals(ErrorCode.DATA_URL_DECODE_EXCEPTION)) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -760684443:
                    if (str.equals("urlEncode")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -726908483:
                    if (str.equals(pg1.ATOM_EXT_toLocaleUpperCase)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -467511597:
                    if (str.equals(pg1.ATOM_EXT_lastIndexOf)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -432138768:
                    if (str.equals("isLetter")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -399551817:
                    if (str.equals(pg1.ATOM_EXT_toUpperCase)) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -217951781:
                    if (str.equals("isString")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3568674:
                    if (str.equals("trim")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 103668165:
                    if (str.equals(pg1.ATOM_EXT_match)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 110519540:
                    if (str.equals("toURL")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 530542161:
                    if (str.equals(pg1.ATOM_EXT_substring)) {
                        c = JSONLexer.EOI;
                        break;
                    }
                    c = 65535;
                    break;
                case 759061892:
                    if (str.equals("isNotEmpty")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 1094496948:
                    if (str.equals("replace")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1099846370:
                    if (str.equals(pg1.ATOM_EXT_reverse)) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1315561419:
                    if (str.equals("appendString")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 1943291465:
                    if (str.equals(pg1.ATOM_EXT_indexOf)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1984805637:
                    if (str.equals("unescapeHTML")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 2058039875:
                    if (str.equals("isEmpty")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return Boolean.valueOf(isLetter((String) list.get(0)));
                case 1:
                    return Boolean.valueOf(isString(list.get(0)));
                case 2:
                    return Character.valueOf(charAt((String) list.get(0), list.get(1)));
                case 3:
                    return concat(String.valueOf(list.get(0)), String.valueOf(list.get(1)));
                case 4:
                    return Integer.valueOf(indexOf((String) list.get(0), (String) list.get(1)));
                case 5:
                    return Integer.valueOf(lastIndexOf((String) list.get(0), (String) list.get(1)));
                case 6:
                    return Boolean.valueOf(match((String) list.get(0), (String) list.get(1)));
                case 7:
                    return replace((String) list.get(0), (String) list.get(1), (String) list.get(2));
                case '\b':
                    return Integer.valueOf(search((String) list.get(0), (String) list.get(1)));
                case '\t':
                    return toLocaleLowerCase((String) list.get(0));
                case '\n':
                    return toLocaleUpperCase((String) list.get(0));
                case 11:
                    return toLowerCase((String) list.get(0));
                case '\f':
                    return toUpperCase((String) list.get(0));
                case '\r':
                    return Integer.valueOf(length((String) list.get(0)));
                case 14:
                    return reverse((String) list.get(0));
                case 15:
                    return trim((String) list.get(0));
                case 16:
                    return trimAll((String) list.get(0));
                case 17:
                    return Boolean.valueOf(isEmpty(list.get(0)));
                case 18:
                    return Boolean.valueOf(isNotEmpty(list.get(0)));
                case 19:
                    return toURL((String) list.get(0));
                case 20:
                    return urlEncode((String) list.get(0));
                case 21:
                    return urlDecode((String) list.get(0));
                case 22:
                    return appendString((String) list.get(0), (String) list.get(1));
                case 23:
                    return appendData((String) list.get(0), list.get(1));
                case 24:
                    return unescapeHTML((String) list.get(0));
                case 25:
                    return escapeXMLCharactor((String) list.get(0));
                case 26:
                    return subString((CharSequence) list.get(0), ((Integer) list.get(1)).intValue(), ((Integer) list.get(2)).intValue());
                case 27:
                    return split((String) list.get(0), (String) list.get(1));
                default:
                    return "";
            }
        } catch (Throwable th) {
            tfs.e("string.filter", "error:" + str + th.getMessage());
            return "";
        }
    }
}
