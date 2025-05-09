package tb;

import android.os.Bundle;
import com.alibaba.evo.EVOExperiment;
import com.alibaba.ut.abtest.VariationSet;
import com.alibaba.ut.abtest.internal.debug.Debug;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class dzu implements czu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544411);
        t2o.a(961544410);
    }

    @Override // tb.czu
    public VariationSet a(String str, String str2, Map<String, Object> map, boolean z, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("9fffdb2d", new Object[]{this, str, str2, map, new Boolean(z), obj});
        }
        return n.j().e().a(str, str2, map, z, obj);
    }

    @Override // tb.czu
    public VariationSet b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("5502730f", new Object[]{this, str});
        }
        return n.j().e().b(str);
    }

    @Override // tb.czu
    public List<EVOExperiment> c(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8a6e6a6e", new Object[]{this, str, map});
        }
        return n.j().e().c(str, map);
    }

    @Override // tb.czu
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2948a711", new Object[]{this});
        }
        return n.j().n().d();
    }

    @Override // tb.czu
    public boolean e(String str, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("286e2d8d", new Object[]{this, str, map, obj})).booleanValue();
        }
        return n.j().n().e(str, map, obj);
    }

    @Override // tb.czu
    public boolean f(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36a5e39c", new Object[]{this, str, obj})).booleanValue();
        }
        return n.j().n().f(str, obj);
    }

    @Override // tb.czu
    public VariationSet g(String str, String str2, Map<String, Object> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VariationSet) ipChange.ipc$dispatch("d6ea12f5", new Object[]{this, str, str2, map, obj});
        }
        return n.j().e().g(str, str2, map, obj);
    }

    @Override // tb.czu
    public void h(Debug debug) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0bc9ca", new Object[]{this, debug});
        } else {
            n.j().d().h(debug);
        }
    }

    @Override // tb.czu
    public void i(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e6f71f", new Object[]{this, str, str2, str3, str4});
        } else {
            n.j().d().i(0, str, str2, str3, str4);
        }
    }

    @Override // tb.czu
    public void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[]{this});
        }
    }

    @Override // tb.czu
    public void j(int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828685b4", new Object[]{this, new Integer(i), bundle});
        }
    }
}
