package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.xpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class w4i implements fsc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x4i f30448a;

    public w4i(x4i x4iVar) {
        this.f30448a = x4iVar;
    }

    @Override // tb.fsc
    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f38cbe1d", new Object[]{this});
            return;
        }
        xpd.c a2 = x4i.a(this.f30448a);
        if (a2 != null) {
            a2.p("onPause", null);
        }
    }
}
