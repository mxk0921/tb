package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.rule.AURALocalAdjustIO;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Component;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.rule.localAdjust.writeShareContext")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class bk extends ct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(81789207);
    }

    public static /* synthetic */ Object ipc$super(bk bkVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/sharecontext/AURALocalAdjustWriteShareContextExtension");
    }

    @Override // tb.qbb
    public String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff62591f", new Object[]{this});
        }
        return "writeShareContextHandler";
    }

    public final Object L(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("261909e5", new Object[]{this, map, str});
        }
        String B = B(str);
        if (TextUtils.isEmpty(B) || TextUtils.equals(B, "*")) {
            return map;
        }
        return gl.d(B.split("\\."), map);
    }

    public final void m0(JSONObject jSONObject, Map<String, Object> map, Map<String, Object> map2) {
        Object L;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d84d871d", new Object[]{this, jSONObject, map, map2});
            return;
        }
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if ((obj instanceof String) && (L = L(map2, (String) obj)) != null) {
                jSONObject.put(str, L);
            }
        }
    }

    @Override // tb.ct
    public Component x(AURALocalAdjustIO aURALocalAdjustIO) {
        JSONObject b;
        JSONObject jSONObject;
        JSONObject r;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Component) ipChange.ipc$dispatch("172f30d5", new Object[]{this, aURALocalAdjustIO});
        }
        ak localAdjustModel = aURALocalAdjustIO.getLocalAdjustModel();
        Map<String, Object> map = localAdjustModel.a().fields;
        if (bh.b(map) || (b = localAdjustModel.b()) == null || (jSONObject = b.getJSONObject("fields")) == null) {
            return null;
        }
        String string = b.getString("shareContextPath");
        if (TextUtils.isEmpty(string) || (r = r()) == null) {
            return null;
        }
        JSONObject jSONObject2 = r.getJSONObject(string);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            r.put(string, (Object) jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("fields", (Object) map);
        m0(jSONObject2, jSONObject, jSONObject3);
        Component component = new Component();
        component.setFields(map);
        return component;
    }

    public final String B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("837bdbd2", new Object[]{this, str});
        }
        if (str.startsWith("$.")) {
            str = str.substring(2);
        }
        if (str.startsWith("${")) {
            str = str.substring(2);
        }
        return str.endsWith("}") ? str.substring(0, str.length() - 1) : str;
    }
}
