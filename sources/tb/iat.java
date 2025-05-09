package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.TKNewCPSManager;
import com.taobao.alimama.tkcps.TaokeBaseUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class iat implements meb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1021313043);
        t2o.a(1021313041);
    }

    @Override // tb.meb
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6da3a0e0", new Object[]{this, str});
        }
        if (vm2.u()) {
            TaokeBaseUtil.f(str);
            TKNewCPSManager.e().g(str);
        } else {
            TaokeBaseUtil.g(str);
        }
        return str;
    }
}
