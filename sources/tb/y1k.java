package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.utils.LocationHelper;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class y1k implements f0r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bud f31788a;
    public final bud b;
    public final Context c;

    public y1k(s0r s0rVar) {
        this.f31788a = s0rVar.e();
        this.b = s0rVar.b();
        s0rVar.g();
        this.c = s0rVar.getContext();
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return bud.KEY_MAIN_ARCH_UPGRADE;
    }

    @Override // tb.f0r
    public boolean isOpen() {
        xs7 d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        if (LocationHelper.a(this.c) != 1) {
            return ((ys7) this.f31788a).e(bud.KEY_NEW_FACE_ENABLE) && ((ys7) this.f31788a).e(a()) && ((qal) this.b).c(bud.KEY_NEW_FACE_ENABLE) && ((qal) this.b).c(a());
        }
        bud budVar = this.f31788a;
        return (budVar instanceof ys7) && (d = ((ys7) budVar).d()) != null && d.b(a()) && ((qal) this.b).c(a());
    }
}
