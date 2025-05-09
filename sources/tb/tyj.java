package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.utils.LocationHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tyj implements f0r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final s0r f29032a;

    public tyj(s0r s0rVar) {
        s0rVar.e();
        s0rVar.b();
        s0rVar.g();
        this.f29032a = s0rVar;
    }

    @Override // tb.f0r
    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        return LocationHelper.d(this.f29032a.getContext());
    }
}
