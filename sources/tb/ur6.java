package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;
import java.util.StringTokenizer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ur6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(350224402);
    }

    public static IDMComponent a(String str, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("2ea21f28", new Object[]{str, iDMComponent});
        }
        if (iDMComponent == null) {
            return null;
        }
        if (str.equals(iDMComponent.getTag())) {
            return iDMComponent;
        }
        IDMComponent parent = iDMComponent.getParent();
        if (parent == null) {
            return null;
        }
        return a(str, parent);
    }

    public static IDMComponent b(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("b7169544", new Object[]{dXRuntimeContext});
        }
        if (dXRuntimeContext == null) {
            return null;
        }
        Object q = dXRuntimeContext.q();
        if (!(q instanceof Map)) {
            return null;
        }
        Object obj = ((Map) q).get(xo7.TAG_DINAMICX_VIEW_COMPONENT);
        if (obj instanceof IDMComponent) {
            return (IDMComponent) obj;
        }
        return null;
    }

    public static Object c(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f669ebca", new Object[]{obj, str});
        }
        if (!(obj == null || str == null)) {
            if (obj instanceof JSONObject) {
                return ((JSONObject) obj).get(str);
            }
            if (obj instanceof JSONArray) {
                try {
                    return ((JSONArray) obj).get(Integer.parseInt(str));
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public static boolean d(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42ff03f2", new Object[]{charSequence})).booleanValue();
        }
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    public static Object e(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2e634508", new Object[]{str, jSONObject});
        }
        if (d(str)) {
            return jSONObject;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, " .[]", false);
        Object obj = jSONObject;
        while (stringTokenizer.hasMoreTokens()) {
            obj = c(obj, stringTokenizer.nextToken());
        }
        return obj;
    }
}
