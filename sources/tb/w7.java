package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class w7<TabInfo> extends wx1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Map<String, TabInfo> b = new LinkedHashMap();
    public final jmi c;
    public final vv1 d;
    public final yps e;

    static {
        t2o.a(689963239);
    }

    public w7(jmi jmiVar, vv1 vv1Var, yps ypsVar) {
        ckf.g(jmiVar, "messageCenter");
        ckf.g(vv1Var, "baseInfoManager");
        ckf.g(ypsVar, "tabBaseInfoManager");
        this.c = jmiVar;
        this.d = vv1Var;
        this.e = ypsVar;
    }

    public static /* synthetic */ Object ipc$super(w7 w7Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1544323859) {
            super.A((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 79699924) {
            super.B((String) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tab2interact/tabadapter/AInteractTabAdapter");
        }
    }

    @Override // tb.wx1
    public void A(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f37ced", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "tabType");
        super.A(str, str2);
        if (L(str)) {
            this.b.put(str, F());
        }
    }

    @Override // tb.wx1
    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c01fd4", new Object[]{this, str});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        super.B(str);
        if (L(str)) {
            this.b.remove(str);
        }
    }

    public abstract TabInfo F();

    public final vv1 G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vv1) ipChange.ipc$dispatch("fd25c38a", new Object[]{this});
        }
        return this.d;
    }

    public final TabInfo H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabInfo) ipChange.ipc$dispatch("765a826b", new Object[]{this});
        }
        String c = this.d.c();
        if (c == null) {
            return null;
        }
        return (TabInfo) ((LinkedHashMap) this.b).get(c);
    }

    public final jmi I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jmi) ipChange.ipc$dispatch("736529cb", new Object[]{this});
        }
        return this.c;
    }

    public final yps J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yps) ipChange.ipc$dispatch("8d181ec2", new Object[]{this});
        }
        return this.e;
    }

    public final TabInfo K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabInfo) ipChange.ipc$dispatch("5916d674", new Object[]{this, str});
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        return (TabInfo) ((LinkedHashMap) this.b).get(str);
    }

    public abstract boolean L(String str);
}
