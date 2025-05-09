package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, mw5> f24987a = new HashMap();

    static {
        t2o.a(444596836);
    }

    public mw5 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mw5) ipChange.ipc$dispatch("b9cd4fa5", new Object[]{this, str});
        }
        mw5 mw5Var = (mw5) ((HashMap) this.f24987a).get(str);
        if (mw5Var == null) {
            return mw5.M();
        }
        return mw5Var;
    }

    public void b(String str, mw5 mw5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa043e", new Object[]{this, str, mw5Var});
        } else if (str != null) {
            if (mw5Var == null) {
                ((HashMap) this.f24987a).remove(str);
            } else {
                ((HashMap) this.f24987a).put(str, mw5Var);
            }
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXScriptVarObject" + this.f24987a.toString();
    }
}
