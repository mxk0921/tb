package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class la6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static mwb f23206a;

    static {
        t2o.a(444596870);
    }

    public static String a(String str, String str2, DXTemplateItem dXTemplateItem, Map<String, String> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c13eefe", new Object[]{str, str2, dXTemplateItem, map, str3});
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(str);
        sb.append("]:");
        sb.append(str2);
        sb.append("|");
        JSONObject jSONObject = new JSONObject();
        if (dXTemplateItem != null) {
            jSONObject.put("template", (Object) dXTemplateItem.f7343a);
            jSONObject.put("version", (Object) Long.valueOf(dXTemplateItem.b));
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), (Object) entry.getValue());
            }
        }
        if (str3 != null) {
            jSONObject.put("error", (Object) str3);
        }
        sb.append(jSONObject.toJSONString());
        return sb.toString();
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b2ca58", new Object[]{str});
        } else {
            d(h36.TAG, h36.TAG, str);
        }
    }

    public static void c(String str, String str2, DXTemplateItem dXTemplateItem, Map<String, String> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ab02524", new Object[]{str, str2, dXTemplateItem, map, str3});
        } else {
            d(h36.TAG, h36.TAG, a(str, str2, dXTemplateItem, map, str3));
        }
    }

    public static void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0a9b36c", new Object[]{str, str2, str3});
            return;
        }
        mwb mwbVar = f23206a;
        if (mwbVar != null) {
            try {
                mwbVar.a(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b792f5c", new Object[]{str});
        } else {
            f(h36.TAG, h36.TAG, str);
        }
    }

    public static void f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("380e670", new Object[]{str, str2, str3});
            return;
        }
        mwb mwbVar = f23206a;
        if (mwbVar != null) {
            try {
                mwbVar.b(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    public static void g(mwb mwbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900811c0", new Object[]{mwbVar});
        } else {
            f23206a = mwbVar;
        }
    }
}
