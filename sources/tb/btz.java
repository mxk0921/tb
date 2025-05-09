package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class btz implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "update_item_select";

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f16629a;
    public final a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
    }

    static {
        t2o.a(912261966);
        t2o.a(912261826);
    }

    public btz(Context context, ze7 ze7Var, a aVar) {
        this.f16629a = ze7Var;
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
        String string = a2.getString("itemId");
        if (TextUtils.isEmpty(string)) {
            tgh.b("UpdateItemSelectImplementor", "UpdateItemSelect itemId is null");
            return false;
        }
        if (b(string, Boolean.parseBoolean(a2.getString("isSelected")))) {
            a aVar = this.b;
            if (aVar != null) {
                ((TTDetailPageManager.j) aVar).a();
            }
        } else {
            tgh.b("UpdateItemSelectImplementor", "changeItemCheckState not changed");
        }
        return true;
    }

    public final boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8780d3b", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Resource resource = (Resource) this.f16629a.e().f(Resource.class);
        if (resource == null) {
            tgh.b("UpdateItemSelectImplementor", "changeItemCheckState resource is null");
            return false;
        }
        JSONObject resident = resource.getResident();
        if (resident == null) {
            tgh.b("UpdateItemSelectImplementor", "changeItemCheckState resident is null");
            return false;
        }
        JSONObject jSONObject = resident.getJSONObject("bundle");
        if (jSONObject == null) {
            tgh.b("UpdateItemSelectImplementor", "changeItemCheckState bundle is null");
            return false;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        if (jSONObject2 == null) {
            tgh.b("UpdateItemSelectImplementor", "changeItemCheckState itemInfo is null");
            return false;
        } else if (Boolean.parseBoolean(jSONObject2.getString("canSelect"))) {
            boolean parseBoolean = Boolean.parseBoolean(jSONObject2.getString(mf6.TYPE_SELECTED));
            jSONObject2.put(mf6.TYPE_SELECTED, (Object) String.valueOf(z));
            return parseBoolean != z;
        } else {
            tgh.b("UpdateItemSelectImplementor", "changeItemCheckState itemInfo canSelect is false");
            return false;
        }
    }
}
