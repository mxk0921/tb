package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c5w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468714093);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ee48264", new Object[0])).booleanValue();
        }
        float c = qp0.c();
        int t = nwv.t(akt.G2("AB_fullscreenpage_video.appear_play_v2.minScore", String.valueOf(90)), 90);
        ir9.b("VideoCardPrePlayManager", "canAppearPlay deviceScore:" + c + "; ab minScore:" + t);
        if (c < t || !akt.p2("ShortVideo.enableVideoAppearPlay", true)) {
            return false;
        }
        return true;
    }

    public static boolean b(FluidContext fluidContext, atb atbVar, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b4a6969", new Object[]{fluidContext, atbVar, new Boolean(z)})).booleanValue();
        }
        if (!a() || atbVar == null) {
            return false;
        }
        if (!z && !mfj.u(fluidContext)) {
            z2 = false;
        }
        ir9.b("VideoCardPrePlayManager", "setMediaMute,设置播放器静音:" + z);
        atbVar.mute(z2);
        return z;
    }

    public static void c(FluidContext fluidContext, ici iciVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3738674f", new Object[]{fluidContext, iciVar, new Integer(i)});
        } else if (a() && iciVar != null) {
            ir9.b("VideoCardPrePlayManager", "videoAppearPlay,静音起播");
            iciVar.W0(false, true);
        }
    }
}
