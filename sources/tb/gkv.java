package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.ag0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gkv implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "update_sku_quantity";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f20065a;
    public final a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    static {
        t2o.a(912261968);
        t2o.a(912261826);
    }

    public gkv(Context context, ze7 ze7Var, a aVar) {
        this.f20065a = ze7Var;
        this.b = aVar;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null) {
            return false;
        }
        b(a2, runtimeAbilityParamArr);
        c(a2);
        return false;
    }

    public final void b(JSONObject jSONObject, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265c9e24", new Object[]{this, jSONObject, runtimeAbilityParamArr});
            return;
        }
        final JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putAll(jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(ag0.KEY_BE_REPLACED, (Object) "globalMultiBuyVO");
        jSONObject3.put(ag0.KEY_TO_REPLACE, (Object) "fields");
        jSONObject2.put(ag0.KEY_TARGET_REPLACEMENT, (Object) jSONObject3);
        JSONObject jSONObject4 = jSONObject.getJSONObject("extraData");
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        jSONObject2.put("payload", (Object) jSONObject4);
        this.f20065a.b().h(new ir(new JSONObject(jSONObject2) { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.UpdateSKUQuantityImplementor$1
            public final /* synthetic */ JSONObject val$adjustStateEventFields;

            {
                this.val$adjustStateEventFields = jSONObject2;
                put("type", ag0.EVENT_TYPE);
                put("fields", (Object) jSONObject2);
            }
        }), runtimeAbilityParamArr);
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8a526a", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("quantity");
        if (!TextUtils.isEmpty(string)) {
            ((TTDetailPageManager.i) this.b).a(string);
        }
    }
}
