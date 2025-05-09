package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class w54 implements z1e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092841);
        t2o.a(1027604494);
    }

    @Override // tb.z1e
    public void a(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10db17d0", new Object[]{this, str, str2, hashMap});
        } else {
            rbu.b0(vx9.d(), str, str2, hashMap);
        }
    }

    @Override // tb.z1e
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686d1575", new Object[]{this, str, str2, str3});
        } else {
            v2s.o().A().c(str2, str3);
        }
    }

    @Override // tb.z1e
    public void c(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f19d48be", new Object[]{this, str, str2, hashMap});
        } else {
            rbu.K(vx9.d(), str2, hashMap);
        }
    }
}
