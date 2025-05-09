package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class z7j extends h24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public b8v j;

    static {
        t2o.a(156237862);
    }

    public static /* synthetic */ Object ipc$super(z7j z7jVar, String str, Object... objArr) {
        if (str.hashCode() == 1983309323) {
            return new Boolean(super.I((b8v) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/event/combine/MtopWithAlipayV2Subscriber");
    }

    @Override // tb.h24
    public JSONObject H(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3d13c9e0", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "mtopV3");
        jSONObject2.put("fields", (Object) twf.b(jSONObject));
        J(jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        twf.c(jSONObject3, twf.b(jSONObject));
        jSONObject3.remove("mtopConfig");
        G(jSONObject2, "success", "alipayV3", jSONObject3);
        return jSONObject2;
    }

    @Override // tb.h24
    public boolean I(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7636e60b", new Object[]{this, b8vVar})).booleanValue();
        }
        this.j = b8vVar;
        return super.I(b8vVar);
    }

    public final void J(JSONObject jSONObject) {
        IDMComponent d;
        JSONObject data;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e78e22ee", new Object[]{this, jSONObject});
            return;
        }
        b8v b8vVar = this.j;
        if (b8vVar != null && (d = b8vVar.d()) != null && (data = d.getData()) != null && (jSONObject2 = data.getJSONObject("fields")) != null && (jSONObject3 = jSONObject.getJSONObject("fields")) != null && (jSONObject4 = jSONObject3.getJSONObject("mtopConfig")) != null) {
            twf.f(jSONObject4, jSONObject2, "native$next");
        }
    }
}
