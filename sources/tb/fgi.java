package tb;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaContext;
import com.taobao.mediaplay.MediaPlayScreenType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fgi implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ yfi f19273a;

    public fgi(yfi yfiVar) {
        this.f19273a = yfiVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        if (yfi.C(this.f19273a).getParent() != yfi.E(this.f19273a)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            yfi.C(this.f19273a).requestLayout();
            if (yfi.C(this.f19273a).getParent() != null && (yfi.C(this.f19273a).getParent() instanceof ViewGroup)) {
                ((ViewGroup) yfi.C(this.f19273a).getParent()).removeView(yfi.C(this.f19273a));
                yfi.E(this.f19273a).addView(yfi.C(this.f19273a), layoutParams);
            }
            if (yfi.F(this.f19273a).getVideo().getVideoState() == 4) {
                yfi.G(this.f19273a).e0(this.f19273a.getDuration(), false);
            }
            yfi.C(this.f19273a).setTranslationX(yfi.H(this.f19273a));
            yfi.C(this.f19273a).setTranslationY(yfi.o(this.f19273a));
            yfi.C(this.f19273a).requestLayout();
            yfi.p(this.f19273a, false);
        }
        MediaContext F = yfi.F(this.f19273a);
        MediaPlayScreenType mediaPlayScreenType = MediaPlayScreenType.NORMAL;
        F.setVideoScreenType(mediaPlayScreenType);
        yfi.G(this.f19273a).S(mediaPlayScreenType);
        yfi.C(this.f19273a).setLayerType(0, null);
    }
}
