package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vw5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, uw5> f30293a = new HashMap();

    static {
        t2o.a(444597987);
    }

    public uw5 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uw5) ipChange.ipc$dispatch("56486309", new Object[]{this, str});
        }
        uw5 uw5Var = (uw5) ((HashMap) this.f30293a).get(str);
        if (uw5Var == null) {
            return uw5.V();
        }
        return uw5Var;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXScriptVarObject" + this.f30293a.toString();
    }
}
