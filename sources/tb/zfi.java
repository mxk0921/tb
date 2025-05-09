package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zfi implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ yfi f32725a;

    public zfi(yfi yfiVar) {
        this.f32725a = yfiVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        yfi.w(this.f32725a);
        yfi.G(this.f32725a).s0(yfi.x(this.f32725a) * ((yfi.v(this.f32725a) * 0.2f) + 0.2f));
        if (yfi.v(this.f32725a) < 4) {
            yfi.A(this.f32725a).postDelayed(yfi.z(this.f32725a), 500L);
        }
    }
}
