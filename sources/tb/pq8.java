package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pq8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f26235a = Pattern.compile("\\$dxArgs\\[\\d+\\]\\{[a-zA-Z()\\. _\\-\\[\\]0-9]*(?!\\$\\{[a-zA-Z()\\. \\_\\-\\[\\]0-9]*\\})[a-zA-Z()\\. \\_\\-\\[\\]0-9]*\\}");
    public static final Pattern b = Pattern.compile("\\$\\{\\s*\\}");

    static {
        t2o.a(442499263);
    }

    public static Object a(Object obj, Object obj2, String str) {
        Object obj3;
        String str2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9b112e50", new Object[]{obj, obj2, str});
        }
        if ((obj == null && obj2 == null) || str == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        Matcher matcher = f26235a.matcher(sb);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            int length = sb.length();
            String group = matcher.group();
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int b2 = b(group);
                if (b2 >= list.size() || b2 < 0) {
                    obj3 = str;
                } else {
                    obj3 = list.get(b2);
                    String replaceAll = group.replaceAll("\\$dxArgs\\[\\d+\\]", "\\$");
                    if (!b.matcher(replaceAll).matches()) {
                        obj3 = dq8.a(obj3, replaceAll);
                    }
                }
            } else {
                String replaceAll2 = group.replaceAll("\\$dxArgs\\[0\\]", "\\$");
                if (b.matcher(replaceAll2).matches()) {
                    obj3 = obj2;
                } else {
                    obj3 = dq8.a(obj2, replaceAll2);
                }
            }
            if (start == 0 && end == length) {
                return obj3;
            }
            if (obj3 == null) {
                str2 = "";
            } else {
                str2 = obj3.toString();
            }
            sb.replace(start, end, str2);
            matcher = f26235a.matcher(sb);
            z = true;
        }
        if (z) {
            return sb.toString();
        }
        return qq8.d(obj, str);
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81cb8ca0", new Object[]{str})).intValue();
        }
        Matcher matcher = Pattern.compile("\\$dxArgs\\[(.*?)\\]").matcher(str);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return -1;
    }
}
