package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, gv5> f28980a = new HashMap();
    public final Map<String, fw5> b = new HashMap();

    static {
        t2o.a(444596686);
    }

    public fw5 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fw5) ipChange.ipc$dispatch("3da527ac", new Object[]{this, str});
        }
        return (fw5) ((HashMap) this.b).get(str);
    }

    public gv5 b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gv5) ipChange.ipc$dispatch("49c7fd03", new Object[]{this, str});
        }
        return (gv5) ((HashMap) this.f28980a).get(str);
    }

    public void c(Map<String, fw5> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d109d41", new Object[]{this, map});
        } else if (map != null) {
            ((HashMap) this.b).putAll(map);
        }
    }

    public boolean d(String str, gv5 gv5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("352dc36e", new Object[]{this, str, gv5Var})).booleanValue();
        }
        ((HashMap) this.f28980a).put(str, gv5Var);
        return true;
    }
}
