package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.h6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class n0o implements h6c.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public n0o(o0o o0oVar) {
    }

    @Override // tb.h6c.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34aa13bd", new Object[]{this});
            return;
        }
        f0b.i().f(f0b.HOME_RENDER);
        f0b.i().f(f0b.HOME_VISIBLE_ONLY);
        f0b.i().f(f0b.HOME_VISIBLE);
    }

    @Override // tb.h6c.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d673366", new Object[]{this});
        }
    }
}
