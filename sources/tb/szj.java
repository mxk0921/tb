package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.utils.LocationHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class szj implements f0r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bud f28373a;
    public final bud b;
    public final s0r c;

    public szj(s0r s0rVar) {
        this.f28373a = s0rVar.e();
        this.b = s0rVar.b();
        s0rVar.g();
        this.c = s0rVar;
    }

    @Override // tb.f0r
    public boolean isOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        if (!((ys7) this.f28373a).e(bud.KEY_NEW_FACE_ENABLE) || !((qal) this.b).c(bud.KEY_NEW_FACE_ENABLE)) {
            return false;
        }
        return LocationHelper.c(this.c.getContext()) || LocationHelper.b(this.c.getContext());
    }
}
