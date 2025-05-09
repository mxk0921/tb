package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mgj implements b2e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093262);
        t2o.a(806356118);
    }

    @Override // tb.b2e
    public void a(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a61958e", new Object[]{this, str, hashMap});
        } else {
            rbu.d0(vx9.d(), str, null, hashMap);
        }
    }

    @Override // tb.b2e
    public void b(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b360459a", new Object[]{this, str, hashMap});
        } else {
            rbu.c0(vx9.d(), str, hashMap);
        }
    }

    @Override // tb.b2e
    public void c(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20987608", new Object[]{this, str, hashMap});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (vx9.d() != null) {
            ux9 d = vx9.d();
            if (!(d.j() == null || d.j().k() == null)) {
                String t0 = d.j().k().t0();
                if (!TextUtils.isEmpty(t0)) {
                    hashMap.put("trackInfo", t0);
                }
            }
        }
        rbu.K(vx9.d(), str, hashMap);
    }
}
