package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ir0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886229);
    }

    public static Object a(DMComponent dMComponent, IDMComponent iDMComponent, JSONObject jSONObject, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a11b2bb5", new Object[]{dMComponent, iDMComponent, jSONObject, obj});
        }
        if (dMComponent == null) {
            return obj;
        }
        if (!dMComponent.getKey().equals(iDMComponent.getKey())) {
            return obj;
        }
        String triggerEvent = dMComponent.getTriggerEvent();
        if (TextUtils.isEmpty(triggerEvent)) {
            return obj;
        }
        String[] split = triggerEvent.split("\\.");
        if (split != null && split.length >= 1) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("events");
            if (jSONObject2 == null) {
                return obj;
            }
            String str = split[0];
            Object obj2 = jSONObject2.get(str);
            if (obj2 == null) {
                return obj;
            }
            if (obj == null) {
                obj = new JSONObject();
            }
            if (obj instanceof JSONObject) {
                ((JSONObject) obj).put(str, obj2);
            }
        }
        return obj;
    }

    public static Object b(JSONObject jSONObject, Map.Entry<String, Object> entry) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("633f7698", new Object[]{jSONObject, entry});
        }
        Object value = entry.getValue();
        if (!(value instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject3 = (JSONObject) value;
        if (!jSONObject3.getBooleanValue(jwi.MATCH_IGNORE) && (jSONObject2 = jSONObject3.getJSONObject("template")) != null) {
            return zr8.a(jSONObject, JSON.parseObject(jSONObject2.toJSONString()));
        }
        return null;
    }

    public static JSONObject c(DMComponent dMComponent, JSONObject jSONObject, IDMComponent iDMComponent, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7379d2b3", new Object[]{dMComponent, jSONObject, iDMComponent, jSONObject2});
        }
        if (iDMComponent == null) {
            return jSONObject2;
        }
        try {
            String key = iDMComponent.getKey();
            if (TextUtils.isEmpty(key)) {
                return jSONObject2;
            }
            int indexOf = key.indexOf("_" + iDMComponent.getId());
            if (indexOf <= 0) {
                return jSONObject2;
            }
            String substring = key.substring(0, indexOf);
            if (TextUtils.isEmpty(substring)) {
                return jSONObject2;
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject(substring);
            if (jSONObject3 == null) {
                return jSONObject2;
            }
            JSONObject jSONObject4 = new JSONObject();
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key2 = entry.getKey();
                if (jSONObject3.get(key2) == null) {
                    jSONObject4.put(key2, entry.getValue());
                }
            }
            for (Map.Entry<String, Object> entry2 : jSONObject3.entrySet()) {
                Object b = b(jSONObject2, entry2);
                String key3 = entry2.getKey();
                if ("events".equals(key3)) {
                    b = a(dMComponent, iDMComponent, jSONObject2, b);
                }
                if (b != null) {
                    jSONObject4.put(key3, b);
                }
            }
            return jSONObject4;
        } catch (Exception e) {
            UnifyLog.e("AliUltronDataProtocolCropper#exception", e.getMessage());
            return jSONObject2;
        }
    }
}
