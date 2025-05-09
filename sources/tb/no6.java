package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class no6 extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DAMREMOVECOMPONENT = "-3524620025611868571";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(350224423);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public no6 build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (no6) ipChange.ipc$dispatch("e4d25395", new Object[]{this, obj});
            }
            return new no6();
        }
    }

    static {
        t2o.a(350224422);
    }

    public static void i(JSONArray jSONArray, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b168900", new Object[]{jSONArray, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("opType", (Object) "delete");
        jSONObject.put("target", (Object) str);
        jSONArray.add(jSONObject);
    }

    public static /* synthetic */ Object ipc$super(no6 no6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/adam/ultronExt/ability/DamRemoveComponentAbility");
    }

    /* renamed from: j */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        DXRuntimeContext p;
        ViewEngine k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        f8 f8Var = new f8();
        if (tk6Var == null || n8Var == null || (k = Util.k((p = tk6Var.p()))) == null) {
            return f8Var;
        }
        Object q = p.q();
        if (q instanceof Map) {
            IDMComponent iDMComponent = (IDMComponent) ((Map) q).get(xo7.TAG_DINAMICX_VIEW_COMPONENT);
            String i = n8Var.i("componentKey");
            if (!TextUtils.isEmpty(i)) {
                iDMComponent = k.N().d().getComponentByName(i);
            }
            if (iDMComponent == null || "true".equals(n8Var.i("noNeedReload"))) {
                return f8Var;
            }
            try {
                i(JSON.parseObject("{\n    \"container\": {\n        \"data\": []\n    },\n    \"endpoint\": {},\n    \"reload\": \"true\",\n    \"data\": {},\n    \"hierarchy\": {\n        \"structure\": {},\n        \"delta\": [\n        ]\n    },\n    \"global\": {},\n    \"linkage\": {}\n}").getJSONObject("hierarchy").getJSONArray("delta"), iDMComponent.getKey());
                k.z0(127);
            } catch (Exception unused) {
            }
        }
        return f8Var;
    }
}
