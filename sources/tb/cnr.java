package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cnr implements fmc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092393);
        t2o.a(806355947);
    }

    @Override // tb.fmc
    public void a(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fbba85", new Object[]{this, str, hashMap});
        } else {
            rbu.c0(vx9.d(), str, hashMap);
        }
    }

    @Override // tb.fmc
    public void f(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3320ca22", new Object[]{this, str, map});
        } else {
            rbu.K(vx9.d(), str, map);
        }
    }

    @Override // tb.fmc
    public void g(int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0c6f88", new Object[]{this, new Integer(i), str, map});
        } else {
            rbu.Q(i, str, map);
        }
    }
}
