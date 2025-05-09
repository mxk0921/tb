package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import tb.nb4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class z4k<CD extends nb4> {
    public static final String $_MODEL = "$model";
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_COMPONENT = "component";
    public static final String KEY_IF = "if";
    public static final String KEY_PROPS = "props";
    public static final String KEY_TYPE = "type";
    public static final String TYPE_NORMAL = "normal";

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f32532a;
    public final ob4 b;
    public String c;
    public CD d;
    public oa4 e;
    public View f;

    static {
        t2o.a(912261658);
    }

    public z4k(JSONObject jSONObject, ob4 ob4Var) {
        g(jSONObject);
        this.b = ob4Var;
    }

    public <C extends oa4> C a(String str, oc4 oc4Var) {
        CD e;
        oa4 b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("c6bd6e33", new Object[]{this, str, oc4Var}));
        }
        if (this.e != null) {
            if (h(str)) {
                return (C) this.e;
            }
            return null;
        } else if (oc4Var == null || (e = e()) == null || (b = oc4Var.b(e, new DataEntry[0])) == null) {
            return null;
        } else {
            this.e = b;
            if (h(str)) {
                return (C) this.e;
            }
            return null;
        }
    }

    public <C extends oa4> C b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("7137f347", new Object[]{this, str}));
        }
        oa4 oa4Var = this.e;
        if (oa4Var != null && TextUtils.equals(str, oa4Var.getComponentData().g())) {
            return (C) this.e;
        }
        return null;
    }

    public oa4 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("6bcb4eb5", new Object[]{this});
        }
        return this.e;
    }

    public View d(oc4 oc4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("516adf2a", new Object[]{this, oc4Var});
        }
        oa4 f = f(oc4Var);
        if (f == null) {
            return null;
        }
        View componentView = f.getComponentView(this.f);
        if (componentView == null) {
            tgh.b("Node", "getNodeView return null for single componentData: " + e());
        }
        this.f = componentView;
        return componentView;
    }

    public CD e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CD) ((nb4) ipChange.ipc$dispatch("139d64fd", new Object[]{this}));
        }
        if (this.d == null) {
            this.d = i(this.c);
        }
        return this.d;
    }

    public synchronized <C extends oa4> C f(oc4 oc4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("8d6cff90", new Object[]{this, oc4Var}));
        }
        C c = (C) this.e;
        if (c != null) {
            return c;
        }
        if (oc4Var == null) {
            return null;
        }
        CD e = e();
        if (e == null) {
            return null;
        }
        C c2 = (C) oc4Var.b(e, new DataEntry[0]);
        if (c2 == null) {
            return null;
        }
        this.e = c2;
        return c2;
    }

    public final void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97d2839", new Object[]{this, jSONObject});
            return;
        }
        this.f32532a = jSONObject;
        jSONObject.getString("component");
        TextUtils.isEmpty(jSONObject.getString("type"));
        jSONObject.getString("if");
        this.c = jSONObject.getString("props");
    }

    public final boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9a7b4f7", new Object[]{this, str})).booleanValue();
        }
        nb4 componentData = this.e.getComponentData();
        if (componentData == null || !TextUtils.equals(str, componentData.k())) {
            return false;
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Node{mData=" + this.f32532a + '}';
    }

    public CD i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CD) ((nb4) ipChange.ipc$dispatch("dba2c5ce", new Object[]{this, str}));
        }
        if (this.b == null || str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if (split == null) {
            tgh.b("Node", "parsePrototypeProps() split return null, the prototypeProps：" + str + " does not container . symbol");
        } else if (split.length < 2) {
            tgh.b("Node", "parsePrototypeProps() split result < 2, the prototypeProps：".concat(str));
        } else if (TextUtils.equals($_MODEL, split[0])) {
            return (CD) ((c1i) this.b).a((String[]) xb1.a(split, 1, split.length));
        } else {
            tgh.b("Node", "parsePrototypeProps() failure, the prototypeProps：" + str + " does not container $model");
        }
        return null;
    }
}
