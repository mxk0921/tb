package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class i1i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f21039a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements bvk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.bvk
        public void a(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f8705021", new Object[]{this, obj, obj2});
            } else {
                i1i.a(i1i.this, obj2);
            }
        }
    }

    static {
        t2o.a(912262651);
    }

    public i1i(Context context, ze7 ze7Var) {
        this.f21039a = ze7Var;
        ze7Var.i().e("propPath", new a());
    }

    public static /* synthetic */ void a(i1i i1iVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e32e97", new Object[]{i1iVar, obj});
        } else {
            i1iVar.d(obj);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
        } else {
            d(this.f21039a.i().c("propPath"));
        }
    }

    public final void d(Object obj) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c234595b", new Object[]{this, obj});
            return;
        }
        oa4 b = b();
        if (obj != null) {
            list = uug.a(obj.toString().split(";"));
        } else {
            list = null;
        }
        e(b, list);
    }

    public final oa4 b() {
        yns s;
        e1i q;
        oa4 f;
        String j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("3a4656eb", new Object[]{this});
        }
        jns jnsVar = (jns) this.f21039a.e().e(kns.PARSER_ID);
        if (!(jnsVar == null || (s = jnsVar.s()) == null || (q = s.q()) == null || q.l() <= 0)) {
            int l = q.l();
            for (int i = 0; i < l; i++) {
                z4k k = q.k(i);
                if (!(k == null || (f = k.f(this.f21039a.d())) == null || (j = f.getComponentData().j()) == null || (!j.contains("detail_v3_headersku") && !j.contains("tbovs_pdp_header_sku_i18n") && !j.contains("detail_v3_sku_picker")))) {
                    return f;
                }
            }
        }
        return null;
    }

    public final void e(oa4 oa4Var, List<String> list) {
        JSONObject f;
        JSONArray jSONArray;
        Boolean bool;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c61ed4cd", new Object[]{this, oa4Var, list});
        } else if (oa4Var != null && (f = oa4Var.getComponentData().f()) != null && (jSONArray = f.getJSONArray("skuContents")) != null) {
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < jSONArray.size(); i3++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                if (jSONObject != null) {
                    if (Boolean.parseBoolean(jSONObject.getString("isSelected")) && i2 == -1) {
                        i2 = i3;
                    }
                    if (bo4.a(jSONObject.getString("propPath"), list)) {
                        jSONObject.put("isSelected", (Object) Boolean.TRUE.toString());
                        i = i3;
                    } else {
                        jSONObject.put("isSelected", (Object) Boolean.FALSE.toString());
                    }
                }
            }
            f.put(mop.KEY_SELECTED_INDEX, (Object) String.valueOf(Math.max(i, 0)));
            boolean z2 = i != i2;
            JSONObject jSONObject2 = f.getJSONObject("mainImage");
            if (jSONObject2 != null) {
                boolean parseBoolean = Boolean.parseBoolean(jSONObject2.getString("isSelected"));
                if (i != -1) {
                    bool = Boolean.FALSE;
                } else {
                    bool = Boolean.TRUE;
                }
                jSONObject2.put("isSelected", (Object) bool.toString());
                if (parseBoolean != Boolean.parseBoolean(jSONObject2.getString("isSelected"))) {
                    z = true;
                }
                z2 |= z;
            }
            if (z2) {
                oa4Var.updateComponent();
            }
        }
    }
}
