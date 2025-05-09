package tb;

import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class id3 extends ju {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199257);
    }

    public id3(kmb kmbVar) {
        super(kmbVar);
    }

    public static /* synthetic */ Object ipc$super(id3 id3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/ability/CartRequestAbility");
    }

    public final Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dcd1c6a2", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(RequestConfig.CUSTOM_EXPARAMS, JSON.toJSONString(jSONObject));
        return hashMap;
    }

    public void b(JSONObject jSONObject, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76bf987", new Object[]{this, jSONObject, uxVar});
        } else {
            this.f22215a.i0(true, a(jSONObject), uxVar);
        }
    }

    public void c(JSONObject jSONObject, ux uxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e642d2d4", new Object[]{this, jSONObject, uxVar});
        } else {
            this.f22215a.f0(true, a(jSONObject), uxVar);
        }
    }

    public void d(IDMComponent iDMComponent, JSONObject jSONObject, ux uxVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc2a6042", new Object[]{this, iDMComponent, jSONObject, uxVar});
            return;
        }
        if (jSONObject != null) {
            jSONObject2 = jSONObject.getJSONObject(RequestConfig.CUSTOM_EXPARAMS);
        } else {
            jSONObject2 = null;
        }
        if (!(iDMComponent == null || jSONObject2 == null)) {
            zr8.a(iDMComponent.getData(), jSONObject2);
        }
        c(jSONObject2, uxVar);
    }

    public void e(boolean z, JSONObject jSONObject, ux uxVar) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24715742", new Object[]{this, new Boolean(z), jSONObject, uxVar});
            return;
        }
        if (jSONObject != null) {
            hashMap = new HashMap();
            for (String str : jSONObject.keySet()) {
                Object obj = jSONObject.get(str);
                if (obj instanceof String) {
                    hashMap.put(str, (String) obj);
                } else if ((obj instanceof JSON) || (obj instanceof Map)) {
                    hashMap.put(str, JSON.toJSONString(obj));
                } else {
                    hashMap.put(str, String.valueOf(obj));
                }
            }
        } else {
            hashMap = null;
        }
        this.f22215a.f0(z, hashMap, uxVar);
    }
}
