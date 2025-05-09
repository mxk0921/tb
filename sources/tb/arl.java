package tb;

import com.alibaba.android.aura.taobao.adapter.extension.linkage.event.AURASubmitEvent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class arl extends cx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a6l f15951a = new a6l();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends ly<IDMComponent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u55 f15952a;

        public a(arl arlVar, u55 u55Var) {
            this.f15952a = u55Var;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/ParseDeltaModule$1");
        }

        /* renamed from: b */
        public void a(IDMComponent iDMComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f36b902", new Object[]{this, iDMComponent});
            } else if (iDMComponent instanceof DMComponent) {
                ((DMComponent) iDMComponent).setDeltaOpType(this.f15952a.D(iDMComponent.getKey()));
            }
        }
    }

    static {
        t2o.a(83886191);
    }

    public static /* synthetic */ Object ipc$super(arl arlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/datamodel/imp/ParseDeltaModule");
    }

    public final List<IDMComponent> b(u55 u55Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b6cf13bc", new Object[]{this, u55Var, jSONObject});
        }
        if (!(jSONObject == null || u55Var == null)) {
            if (u55Var.S()) {
                n1n.a(u55Var, jSONObject);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            JSONObject jSONObject3 = jSONObject.getJSONObject("hierarchy");
            JSONObject jSONObject4 = jSONObject.getJSONObject("linkage");
            JSONObject jSONObject5 = jSONObject.getJSONObject("global");
            JSONObject jSONObject6 = jSONObject.getJSONObject(AURASubmitEvent.RPC_ENDPOINT);
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                d(u55Var, jSONObject2);
            }
            JSONObject jSONObject7 = jSONObject3 != null ? jSONObject3.getJSONObject("structure") : null;
            u55Var.t().clear();
            if (jSONObject3.containsKey("delta") && jSONObject3.get("delta") != null) {
                u55Var.s0(jSONObject2);
                u55Var.X(jSONObject7);
                u55Var.b0(jSONObject3);
                u55Var.a0(jSONObject5);
                u55Var.c0(jSONObject4);
                u55Var.Y(jSONObject6);
                a(u55Var, jSONObject);
                if (jSONObject6 != null) {
                    u55Var.B0(jSONObject6.getString("protocolVersion"));
                }
                List<IDMComponent> e = e(u55Var);
                if (e != null) {
                    f6l.h(e, new a(this, u55Var));
                }
                return e;
            }
        }
        return null;
    }

    public final void d(u55 u55Var, JSONObject jSONObject) {
        v55 v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461b1ffb", new Object[]{this, u55Var, jSONObject});
        } else if (u55Var != null && (v = u55Var.v()) != null) {
            v.f().b(jSONObject);
        }
    }

    public final List<IDMComponent> e(u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7c57e03d", new Object[]{this, u55Var});
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = u55Var.A().getJSONArray("delta").iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) next;
                String string = jSONObject.getString("opType");
                String string2 = jSONObject.getString("target");
                a6l a6lVar = this.f15951a;
                if (a6lVar != null) {
                    a6lVar.a(string, u55Var, jSONObject, arrayList);
                }
                if (!(string2 == null || string == null)) {
                    u55Var.f0(string2, string);
                }
            }
        }
        u55Var.t().addAll(arrayList);
        return u55Var.getComponents();
    }

    public boolean c(u55 u55Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88a493a2", new Object[]{this, u55Var, jSONObject})).booleanValue();
        }
        if (u55Var == null) {
            return false;
        }
        List<IDMComponent> b = b(u55Var, jSONObject);
        if (b == null) {
            hav.b(u55Var.getBizName(), "ParseDeltaModuleError", "新奥创差量协议解析为空");
            return false;
        }
        u55Var.p0(b);
        return true;
    }
}
