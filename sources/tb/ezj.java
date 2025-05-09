package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ezj implements f0r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ezj(s0r s0rVar) {
        s0rVar.e();
        s0rVar.b();
        s0rVar.g();
    }

    @Override // tb.f0r
    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        return true;
    }
}
