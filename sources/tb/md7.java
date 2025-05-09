package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ActionModel;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ComponentModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class md7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f23968a;
    public int b;
    public String c;
    public String d;
    public final String f;
    public final String g;
    public final ComponentModel i;
    public boolean e = false;
    public final List<ux1> j = new ArrayList();
    public final ArrayList<md7> h = new ArrayList<>();

    static {
        t2o.a(912262505);
    }

    public md7(ComponentModel componentModel) {
        this.i = componentModel;
        if (componentModel != null) {
            this.c = componentModel.ruleId;
            this.d = componentModel.key;
            a();
            k();
            e();
            f();
            JSONObject jSONObject = componentModel.mapping;
            if (jSONObject != null) {
                this.f = jSONObject.getString("spm");
                this.g = componentModel.mapping.getString("scm");
                try {
                    j(componentModel.mapping);
                } catch (JSONException e) {
                    tgh.c("DescViewModel", this.c + ":onViewModelCreate", e);
                }
            }
        }
    }

    public void a() {
        List<ComponentModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ccdb094", new Object[]{this});
            return;
        }
        ComponentModel componentModel = this.i;
        if (!(componentModel == null || (list = componentModel.children) == null)) {
            for (ComponentModel componentModel2 : list) {
                md7 a2 = nd7.a(componentModel2);
                if (a2 != null && !a2.g()) {
                    this.h.add(a2);
                }
            }
        }
    }

    public ArrayList<md7> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("1036ab56", new Object[]{this});
        }
        return this.h;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.d;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        return this.b + "";
    }

    public void e() {
        List<ActionModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72395e50", new Object[]{this});
            return;
        }
        ComponentModel componentModel = this.i;
        if (!(componentModel == null || (list = componentModel.actionModelList) == null || list.isEmpty())) {
            ComponentModel componentModel2 = this.i;
            if (componentModel2.mapping == null) {
                componentModel2.mapping = new JSONObject();
            }
            this.i.mapping.put("componentId", (Object) this.c);
            for (ActionModel actionModel : this.i.actionModelList) {
                JSONObject jSONObject = actionModel.params;
                if (jSONObject != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        entry.setValue(yr8.a(this.i.mapping, entry.getValue()));
                    }
                }
                this.j.add(coi.a(actionModel, this.i.mapping));
            }
        }
    }

    public void f() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c821ce88", new Object[]{this});
            return;
        }
        ComponentModel componentModel = this.i;
        if (componentModel.mapping != null && (jSONObject = componentModel.otherMapping) != null && !jSONObject.isEmpty()) {
            ComponentModel componentModel2 = this.i;
            componentModel2.mapping.putAll(componentModel2.otherMapping);
        }
    }

    public abstract boolean g();

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public es7 i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (es7) ipChange.ipc$dispatch("9f63107b", new Object[]{this});
        }
        JSONObject jSONObject = this.i.mapping;
        if (jSONObject == null || !jSONObject.containsKey("componentTitle")) {
            return null;
        }
        JSONObject jSONObject2 = this.i.mapping.getJSONObject("componentTitle");
        if (TextUtils.isEmpty(jSONObject2.getString("text"))) {
            return null;
        }
        es7 es7Var = new es7(this.i);
        es7Var.c = es7Var.hashCode() + "";
        es7Var.d = "desc_division_title";
        es7Var.m = jSONObject2.getString("text");
        es7Var.o = jSONObject2.getString(MspFlybirdDefine.FLYBIRD_DIALOG_LOGO);
        es7Var.q = jSONObject2.getString("linkUrl");
        es7Var.p = jSONObject2.getString("linkText");
        es7Var.n = this.i.mapping.getString("backgroundColor");
        es7Var.k = this.i.mapping.getString("titleColor");
        es7Var.l = this.i.mapping.getString("lineColor");
        es7Var.r = this.i.mapping.getString("paddingBottom");
        es7Var.s = this.i.mapping.getBooleanValue("isHLine");
        return es7Var;
    }

    public abstract void j(JSONObject jSONObject);

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba075a2", new Object[]{this});
        }
    }
}
