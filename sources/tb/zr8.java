package tb;

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
public class zr8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Pattern f32966a;
        public final Object b;

        static {
            t2o.a(83886315);
        }

        public a(Pattern pattern, Object obj) {
            this.f32966a = pattern;
            this.b = obj;
        }

        public Object a(Object obj, String str) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("a76404ac", new Object[]{this, obj, str});
            }
            if (this.f32966a == null || obj == null || str == null) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            Matcher matcher = this.f32966a.matcher(sb);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                int length = sb.length();
                Object a2 = dq8.a(obj, matcher.group());
                if (start == 0 && end == length) {
                    return a2;
                }
                if (a2 == null) {
                    str2 = "";
                } else {
                    str2 = a2.toString();
                }
                sb.replace(start, end, str2);
                matcher = this.f32966a.matcher(sb);
            }
            return sb.toString();
        }
    }

    static {
        t2o.a(83886314);
    }

    public static Object a(JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a3944a39", new Object[]{jSONObject, obj});
        }
        return b(jSONObject, obj, null);
    }

    public static Object b(JSONObject jSONObject, Object obj, a... aVarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("57b8aef4", new Object[]{jSONObject, obj, aVarArr});
        }
        if ((jSONObject == null && aVarArr == null) || obj == null) {
            return obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            Object d = qq8.d(jSONObject, str);
            if (str.startsWith("$") && str.equals(d) && aVarArr != null) {
                for (a aVar : aVarArr) {
                    if (!(aVar == null || aVar.f32966a == null)) {
                        d = aVar.a(aVar.b, str);
                        if (!str.equals(d)) {
                            break;
                        }
                    }
                }
            }
            return d;
        } else if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                entry.setValue(b(jSONObject, entry.getValue(), aVarArr));
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
                    Object b = b(jSONObject, it.next(), aVarArr);
                    if (b != null) {
                        arrayList.add(b);
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
