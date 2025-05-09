package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cau {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_INTERNAL_AUTOSEND = "_autosend";
    public static final String PARAM_INTERNAL_MARK = "_";
    public static final String PARAM_INTERNAL_PARAM_DYNAMIC_LEFT = "{";
    public static final String PARAM_INTERNAL_PARAM_DYNAMIC_RIGHT = "}";
    public static final String PARAM_INTERNAL_PARAM_REFER_LEFT = "[";
    public static final String PARAM_INTERNAL_PARAM_REFER_RIGHT = "]";
    public static final String PARAM_INTERNAL_SPMA = "_spma";
    public static final String PARAM_INTERNAL_SPMB = "_spmb";
    public static final String PARAM_INTERNAL_SPMC = "_spmc";
    public static final String PARAM_INTERNAL_SPMD = "_spmd";
    public static final String PARAM_INTERNAL_SPM_NONE = "0";
    public static final String PARAM_INTERNAL_SPM_SPLIT = ".";
    public static final String PARAM_OUTER_AUTOSEND = "autosend";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Map<String, String>> f16951a = new ConcurrentHashMap();

    public cau(Context context, String str) {
        h(context, str);
    }

    public Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3001078b", new Object[]{this, str});
        }
        Map<String, Map<String, String>> map = this.f16951a;
        if (map != null && ((ConcurrentHashMap) map).containsKey(str)) {
            return (Map) ((ConcurrentHashMap) this.f16951a).get(str);
        }
        Map<String, Map<String, String>> map2 = this.f16951a;
        if (map2 == null) {
            return null;
        }
        for (Map.Entry entry : ((ConcurrentHashMap) map2).entrySet()) {
            if (entry != null) {
                String str2 = (String) entry.getKey();
                Map<String, String> map3 = (Map) entry.getValue();
                if (str != null && str2 != null && str2.contains("|") && str.matches(str2)) {
                    return map3;
                }
            }
        }
        return null;
    }

    public String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a0ecec4b", new Object[]{this, str, str2});
        }
        return c(str, str2, null);
    }

    public String c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d5badb01", new Object[]{this, str, str2, str3});
        }
        Map<String, String> a2 = a(str);
        if (a2 == null || !a2.containsKey(str2)) {
            return str3;
        }
        return a2.get(str2);
    }

    public String d(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dcbc4f88", new Object[]{this, map, str, str2});
        }
        if (map == null || !map.containsKey(str)) {
            return str2;
        }
        return map.get(str);
    }

    public String e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b71d5bc", new Object[]{this, map});
        }
        return f(map) + "." + g(map);
    }

    public String f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da87aadd", new Object[]{this, map});
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (map != null) {
            stringBuffer.append(d(map, PARAM_INTERNAL_SPMA, "0"));
            stringBuffer.append(".");
            stringBuffer.append(d(map, PARAM_INTERNAL_SPMB, "0"));
        }
        if (stringBuffer.length() > 0) {
            return stringBuffer.toString();
        }
        return "0.0";
    }

    public String g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c47c8b1d", new Object[]{this, map});
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (map != null) {
            stringBuffer.append(d(map, PARAM_INTERNAL_SPMC, "0"));
            stringBuffer.append(".");
            stringBuffer.append(d(map, PARAM_INTERNAL_SPMD, "0"));
        }
        if (stringBuffer.length() > 0) {
            return stringBuffer.toString();
        }
        return "0.0";
    }

    public final void h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e4d11f", new Object[]{this, context, str});
        } else {
            new df1(this.f16951a).execute(context, str);
        }
    }
}
