package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dl6 extends o4r<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DXDXUPDATETEMPLATE_DXUPDATETEMPLATE = "-3230627156620387701";

    static {
        t2o.a(786432063);
    }

    public static /* synthetic */ Object ipc$super(dl6 dl6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/DXUpdateTemplateAbility");
    }

    public final boolean m(DXRuntimeContext dXRuntimeContext, JSONObject jSONObject) {
        av5 s;
        DinamicXEngine f;
        DXRootView L;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5606b81", new Object[]{this, dXRuntimeContext, jSONObject})).booleanValue();
        }
        if (dXRuntimeContext == null || (s = dXRuntimeContext.s()) == null || (f = s.f()) == null || (L = dXRuntimeContext.L()) == null) {
            return false;
        }
        L.setTag(R.id.update_view_data, jSONObject);
        DXRenderOptions q = new DXRenderOptions.b().t(dXRuntimeContext.K()).G(dXRuntimeContext.M()).E(dXRuntimeContext.S()).q();
        dXRuntimeContext.f0(jSONObject);
        f.i1(dXRuntimeContext.h(), L, L.getDxTemplateItem(), dXRuntimeContext.i(), 0, q);
        return false;
    }

    /* renamed from: l */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        DXRuntimeContext p = tk6Var.p();
        Object a2 = n8Var.a("actions");
        if (!(a2 instanceof JSONArray)) {
            return i("params.actions is not JSONArray", true);
        }
        if (p == null) {
            return i("runtimeContext is null", true);
        }
        JSONObject jSONObject = new JSONObject();
        if (p.i() == null) {
            return i(f4w.LOAD_DATA_NULL, true);
        }
        jSONObject.putAll(p.i());
        c8 j = j(jSONObject, (JSONArray) a2);
        if (j.b()) {
            return j;
        }
        m(p, ((f8) j).a());
        return j;
    }
}
