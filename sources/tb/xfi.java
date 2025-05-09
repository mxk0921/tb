package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaContext;
import com.taobao.mediaplay.MediaPlayScreenType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xfi implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ yfi f31352a;

    public xfi(yfi yfiVar) {
        this.f31352a = yfiVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        yfi.C(this.f31352a).requestLayout();
        MediaContext F = yfi.F(this.f31352a);
        MediaPlayScreenType mediaPlayScreenType = MediaPlayScreenType.PORTRAIT_FULL_SCREEN;
        F.setVideoScreenType(mediaPlayScreenType);
        yfi.G(this.f31352a).S(mediaPlayScreenType);
        if (yfi.F(this.f31352a) != null && !yfi.F(this.f31352a).mHookKeyBackToggleEvent) {
            yfi.F(this.f31352a).registerKeyBackEventListener(this.f31352a);
        }
        yfi.C(this.f31352a).setLayerType(0, null);
        yfi.p(this.f31352a, false);
    }
}
