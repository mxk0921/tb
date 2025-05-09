package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vuq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f30270a = Pattern.compile("@subdata\\{(?!@subdata\\{[a-zA-Z()\\. \\_\\-\\[\\]0-9]*\\})[a-zA-Z()\\. \\_\\-\\[\\]0-9]*(?!@subdata\\{[a-zA-Z()\\. \\_\\-\\[\\]0-9]*\\})\\,(?!@subdata\\{[a-zA-Z()\\. \\_\\-\\[\\]0-9]*\\})[a-zA-Z()\\. \\_\\-\\[\\]0-9]*(?!@subdata\\{[a-zA-Z()\\. \\_\\-\\[\\]0-9]*\\})\\}");

    static {
        t2o.a(83886252);
    }

    public static Object a(JSONObject jSONObject, Object obj, String str) {
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3b40138e", new Object[]{jSONObject, obj, str});
        }
        if (jSONObject == null || obj == null) {
            return null;
        }
        if (obj instanceof String) {
            StringBuilder sb = new StringBuilder((String) obj);
            while (true) {
                Matcher matcher = f30270a.matcher(sb);
                if (!matcher.find()) {
                    return sb.toString();
                }
                int start = matcher.start();
                int end = matcher.end();
                sb.length();
                String group = matcher.group();
                if (group != null) {
                    String[] split = group.substring(9, group.length() - 1).split(",");
                    String str5 = "";
                    String trim = (split.length <= 0 || (str4 = split[0]) == null) ? str5 : str4.trim();
                    String trim2 = (split.length <= 1 || (str3 = split[1]) == null) ? str5 : str3.trim();
                    if (TextUtils.isEmpty(trim2)) {
                        str2 = trim + "[" + str + "]";
                    } else {
                        str2 = trim + "[" + str + "]." + trim2;
                    }
                    Object a2 = dq8.a(jSONObject, "${" + str2 + "}");
                    if (a2 != null) {
                        str5 = a2.toString();
                    }
                    sb.replace(start, end, str5);
                }
            }
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                entry.setValue(a(jSONObject, entry.getValue(), str));
            }
            return jSONObject2;
        } else {
            boolean z = obj instanceof JSONArray;
            JSONArray jSONArray = obj;
            if (z) {
                JSONArray jSONArray2 = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                Iterator<Object> it = jSONArray2.iterator();
                while (it.hasNext()) {
                    Object a3 = a(jSONObject, it.next(), str);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
                jSONArray2.clear();
                jSONArray2.addAll(arrayList);
                jSONArray = jSONArray2;
            }
            return jSONArray;
        }
    }
}
