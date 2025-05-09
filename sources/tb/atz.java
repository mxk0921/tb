package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class atz implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "update_all_items";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f16003a;
    public final a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    static {
        t2o.a(912261958);
        t2o.a(912261826);
    }

    public atz(Context context, ze7 ze7Var, a aVar) {
        this.f16003a = ze7Var;
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
        if (b(Boolean.parseBoolean(a2.getString("isSelectedAll")))) {
            a aVar = this.b;
            if (aVar != null) {
                ((TTDetailPageManager.l) aVar).a();
            }
        } else {
            tgh.b("UpdateAllItemSelectImplementor", "changeAllItemCheckState not changed");
        }
        return true;
    }

    public final boolean b(boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5690f544", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        Resource resource = (Resource) this.f16003a.e().f(Resource.class);
        if (resource == null) {
            tgh.b("UpdateAllItemSelectImplementor", "changeAllItemCheckState resource is null");
            return false;
        }
        JSONObject resident = resource.getResident();
        if (resident == null) {
            tgh.b("UpdateAllItemSelectImplementor", "changeAllItemCheckState resident is null");
            return false;
        }
        JSONObject jSONObject = resident.getJSONObject("bundle");
        if (jSONObject == null) {
            tgh.b("UpdateAllItemSelectImplementor", "changeAllItemCheckState bundle is null");
            return false;
        }
        for (String str : jSONObject.keySet()) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            if (jSONObject2 != null && Boolean.parseBoolean(jSONObject2.getString("canSelect"))) {
                boolean parseBoolean = Boolean.parseBoolean(jSONObject2.getString(mf6.TYPE_SELECTED));
                jSONObject2.put(mf6.TYPE_SELECTED, (Object) String.valueOf(z));
                if (parseBoolean != z) {
                    z2 = true;
                }
            }
        }
        return z2;
    }
}
