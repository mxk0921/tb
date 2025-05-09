package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ir6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a extends wz<Boolean, IDMComponent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f21519a = true;
        public final /* synthetic */ boolean b;

        public a(boolean z) {
            this.b = z;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/data/DataParse$1");
        }

        /* renamed from: b */
        public Boolean a(IDMComponent iDMComponent) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("e4484dff", new Object[]{this, iDMComponent});
            }
            try {
                if (!this.b || !this.f21519a) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                this.f21519a = false;
                return valueOf;
            } catch (Throwable th) {
                this.f21519a = false;
                throw th;
            }
        }
    }

    static {
        t2o.a(479199274);
    }

    public static void a(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcdcf6e7", new Object[]{iDMComponent, list});
        } else {
            b(iDMComponent, list, null);
        }
    }

    public static void b(IDMComponent iDMComponent, List<IDMComponent> list, wz<Boolean, IDMComponent> wzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ed9b98", new Object[]{iDMComponent, list, wzVar});
        } else if (iDMComponent != null && list != null) {
            String string = iDMComponent.getFields().getString("cornerType");
            if (CredentialRpcData.ACTION_BOTH.equals(string) || "top".equals(string)) {
                if (wzVar == null || wzVar.a(iDMComponent) == null || !wzVar.a(iDMComponent).booleanValue()) {
                    list.add(new BundleLineComponent());
                }
                list.add(iDMComponent);
            } else if (!(iDMComponent instanceof BundleLineComponent)) {
                list.add(iDMComponent);
            }
        }
    }

    public static void c(zxb zxbVar, fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b87362f5", new Object[]{zxbVar, fsbVar});
            return;
        }
        Activity context = zxbVar.x().getContext();
        g((u55) fsbVar);
        h(fsbVar, context);
        cb4.e(zxbVar, fsbVar, context, false);
    }

    public static void d(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4cd676d", new Object[]{fsbVar});
            return;
        }
        u55 u55Var = (u55) fsbVar;
        JSONObject r = u55Var.r();
        Map<String, DMComponent> p = u55Var.p();
        for (String str : r.keySet()) {
            if (!TextUtils.isEmpty(str)) {
                Object obj = r.get(str);
                v55 v = u55Var.v();
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.isEmpty()) {
                        p.remove(str);
                        UnifyLog.e("DataParse", "componentMap remove key = " + str);
                    } else if (!f(u55Var, str) && "item".equals(jSONObject.getString("tag"))) {
                        p.put(str, v.d(u55Var, jSONObject, str));
                    }
                }
            }
        }
    }

    public static List<IDMComponent> e(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ad1c381c", new Object[]{list});
        }
        if (list == null) {
            return null;
        }
        Iterator<IDMComponent> it = list.iterator();
        while (it.hasNext()) {
            if (BundleLineComponent.COMPONENT_TAG.equals(it.next().getType())) {
                it.remove();
            }
        }
        return list;
    }

    public static boolean f(u55 u55Var, String str) {
        List<IDMComponent> components;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f727c6c", new Object[]{u55Var, str})).booleanValue();
        }
        if (u55Var == null || (components = u55Var.getComponents()) == null || components.isEmpty() || u55Var.p().get(str) == null) {
            return false;
        }
        return true;
    }

    public static void g(u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ec3f91", new Object[]{u55Var});
            return;
        }
        List<IDMComponent> e = e(u55Var.getComponents());
        u55Var.b(e);
        for (IDMComponent iDMComponent : e) {
            iDMComponent.getFields().remove("cornerType");
        }
        u55Var.v().m(e);
    }

    public static void h(fsb fsbVar, Context context) {
        List<IDMComponent> components;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc80a17c", new Object[]{fsbVar, context});
        } else if (fsbVar != null && context != null && (components = fsbVar.getComponents()) != null) {
            ArrayList arrayList = new ArrayList();
            a aVar = new a(m9v.d(c9x.CART_BIZ_NAME).h("isShot2024ItemV2Gray", false));
            for (IDMComponent iDMComponent : components) {
                if (!(iDMComponent == null || iDMComponent.getFields() == null)) {
                    b(iDMComponent, arrayList, aVar);
                }
            }
            fsbVar.b(arrayList);
        }
    }
}
