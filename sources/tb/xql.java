package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.nb4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xql<CD extends nb4> extends z4k<CD> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHILDREN = "children";
    public List<z4k> g;

    static {
        t2o.a(912261659);
    }

    public xql(JSONObject jSONObject, ob4 ob4Var) {
        super(jSONObject, ob4Var);
    }

    public static /* synthetic */ Object ipc$super(xql xqlVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -960664013) {
            return super.a((String) objArr[0], (oc4) objArr[1]);
        }
        if (hashCode == 1899492167) {
            return super.b((String) objArr[0]);
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/data/layout/ParentNode");
    }

    @Override // tb.z4k
    public <C extends oa4> C a(String str, oc4 oc4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("c6bd6e33", new Object[]{this, str, oc4Var}));
        }
        List<z4k> list = this.g;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C c = (C) ((z4k) it.next()).a(str, oc4Var);
                if (c != null) {
                    return c;
                }
            }
        }
        return (C) super.a(str, oc4Var);
    }

    @Override // tb.z4k
    public <C extends oa4> C b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((oa4) ipChange.ipc$dispatch("7137f347", new Object[]{this, str}));
        }
        List<z4k> list = this.g;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C c = (C) ((z4k) it.next()).b(str);
                if (c != null) {
                    return c;
                }
            }
        }
        return (C) super.b(str);
    }

    public void j(z4k z4kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3b994a", new Object[]{this, z4kVar});
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList();
        }
        z4kVar.getClass();
        this.g.add(z4kVar);
    }

    public <C extends z4k> C k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (C) ((z4k) ipChange.ipc$dispatch("5b0bff72", new Object[]{this, new Integer(i)}));
        }
        List<z4k> list = this.g;
        if (list == null || i < 0 || i >= ((ArrayList) list).size()) {
            return null;
        }
        return (C) ((z4k) ((ArrayList) this.g).get(i));
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue();
        }
        List<z4k> list = this.g;
        if (list != null) {
            return ((ArrayList) list).size();
        }
        return 0;
    }

    public <C extends z4k> List<C> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("faa24d4b", new Object[]{this});
        }
        List<C> list = (List<C>) this.g;
        if (list == null) {
            return null;
        }
        return list;
    }
}
