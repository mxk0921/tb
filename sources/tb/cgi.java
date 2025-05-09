package tb;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.MediaContext;
import com.taobao.mediaplay.MediaPlayScreenType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cgi implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ yfi f17045a;

    public cgi(yfi yfiVar) {
        this.f17045a = yfiVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        if (yfi.C(this.f17045a).getParent() != yfi.E(this.f17045a)) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            yfi.C(this.f17045a).requestLayout();
            if (yfi.C(this.f17045a).getParent() != null && (yfi.C(this.f17045a).getParent() instanceof ViewGroup)) {
                ((ViewGroup) yfi.C(this.f17045a).getParent()).removeView(yfi.C(this.f17045a));
                yfi.E(this.f17045a).addView(yfi.C(this.f17045a), layoutParams);
            }
            if (yfi.F(this.f17045a).getVideo().getVideoState() == 4) {
                yfi.G(this.f17045a).e0(this.f17045a.getDuration(), false);
            }
            yfi.C(this.f17045a).setTranslationX(yfi.H(this.f17045a));
            yfi.C(this.f17045a).setTranslationY(yfi.o(this.f17045a));
            yfi.C(this.f17045a).requestLayout();
            yfi.p(this.f17045a, false);
        }
        MediaContext F = yfi.F(this.f17045a);
        MediaPlayScreenType mediaPlayScreenType = MediaPlayScreenType.NORMAL;
        F.setVideoScreenType(mediaPlayScreenType);
        yfi.G(this.f17045a).S(mediaPlayScreenType);
        yfi.C(this.f17045a).setLayerType(0, null);
    }
}
