package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ava extends xql<wua> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public tua h;

    static {
        t2o.a(912261656);
    }

    public ava(JSONObject jSONObject, ob4 ob4Var) {
        super(jSONObject, ob4Var);
    }

    public static /* synthetic */ Object ipc$super(ava avaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1922236528) {
            return super.f((oc4) objArr[0]);
        }
        if (hashCode == -960664013) {
            return super.a((String) objArr[0], (oc4) objArr[1]);
        }
        if (hashCode == 1899492167) {
            return super.b((String) objArr[0]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/data/layout/HeaderPicLayoutNode");
    }

    @Override // tb.xql, tb.z4k
    public <C extends oa4> C a(String str, oc4 oc4Var) {
        C c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("c6bd6e33", new Object[]{this, str, oc4Var}));
        }
        tua tuaVar = this.h;
        if (tuaVar != null) {
            c = (C) tuaVar.findComponentByUltronName(str);
        } else {
            c = null;
        }
        return c != null ? c : (C) super.a(str, oc4Var);
    }

    @Override // tb.xql, tb.z4k
    public <C extends oa4> C b(String str) {
        tua tuaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("7137f347", new Object[]{this, str}));
        }
        C c = (C) super.b(str);
        if (c != null || (tuaVar = this.h) == null) {
            return c;
        }
        return (C) tuaVar.findComponent(str);
    }

    @Override // tb.z4k
    public synchronized <C extends oa4> C f(oc4 oc4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("8d6cff90", new Object[]{this, oc4Var}));
        }
        C c = (C) super.f(oc4Var);
        if (c != null) {
            this.h = (tua) c;
        }
        return c;
    }
}
