package tb;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ei4 extends l12 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(155189309);
    }

    public ei4() {
        b();
    }

    public static /* synthetic */ Object ipc$super(ei4 ei4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/event/ConfirmPopupWindowSubscriber");
    }

    public static boolean r(IDMComponent iDMComponent) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("867242ea", new Object[]{iDMComponent})).booleanValue();
        }
        JSONObject stashData = iDMComponent.getStashData();
        JSONObject data = iDMComponent.getData();
        if (stashData == null || data == null) {
            return false;
        }
        try {
            z = t(data, stashData);
        } catch (Exception unused) {
        }
        return !z;
    }

    public static boolean t(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5a4906d", new Object[]{jSONObject, jSONObject2})).booleanValue();
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        for (String str : jSONObject.keySet()) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Object obj = jSONObject.get(str);
            Object obj2 = jSONObject2.get(str);
            if (obj instanceof JSONObject) {
                if (!t((JSONObject) obj, (JSONObject) obj2)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        gsb q = q();
        if (q != null) {
            List<IDMComponent> components = q.getComponents();
            if (s(components)) {
                lcuVar.p(new v8j(components));
                u();
                this.c.d().h(p(), lcuVar);
            }
            this.c.e().k(true);
        }
    }

    public final IDMComponent p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("fc809e8d", new Object[]{this});
        }
        Pair<IDMComponent, gsb> s = this.c.e().s();
        if (s == null) {
            return null;
        }
        return (IDMComponent) s.first;
    }

    public final gsb q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gsb) ipChange.ipc$dispatch("d7c05dc6", new Object[]{this});
        }
        Pair<IDMComponent, gsb> s = this.c.e().s();
        if (s == null) {
            return null;
        }
        return (gsb) s.second;
    }

    public final boolean s(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8734f68", new Object[]{this, list})).booleanValue();
        }
        if (list != null && !list.isEmpty()) {
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent != null && r(iDMComponent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void u() {
        List<IDMComponent> components;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fcece42", new Object[]{this});
        } else if (this.c.e().y()) {
            IDMComponent p = p();
            gsb q = q();
            if (!(p == null || q == null || (components = q.getComponents()) == null)) {
                int size = components.size();
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < size; i++) {
                    IDMComponent iDMComponent = components.get(i);
                    jSONObject.put(iDMComponent.getKey(), (Object) iDMComponent.getData().toJSONString());
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("params", (Object) jSONObject);
                n(q, jSONObject2);
            }
        }
    }
}
