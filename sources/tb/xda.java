package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xda implements nac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093257);
        t2o.a(806356111);
    }

    @Override // tb.nac
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d835ead6", new Object[]{this});
        }
        return up6.r(vx9.d());
    }

    @Override // tb.nac
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd7f76fc", new Object[]{this});
        }
        return up6.L(vx9.d());
    }

    @Override // tb.nac
    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7607beb", new Object[]{this});
        }
        return sj9.k();
    }

    @Override // tb.nac
    public void i(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5a4f54b", new Object[]{this, str, map});
        } else {
            vkr.c(vx9.d(), str, map);
        }
    }
}
