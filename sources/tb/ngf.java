package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ngf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f24714a;

    static {
        t2o.a(468713498);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a170cb9", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableAutoUpScrollWeexRemoveFirstFrameRender", true);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6565dca", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.disableInterceptForH5", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("148fe8ef", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableResetCardVideoView", true);
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfb56fd6", new Object[0])).booleanValue();
        }
        boolean orangeBooleanConfig = FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableOpenWeexDSLV2", true);
        ir9.b("InteractionServiceConfig", "isEnableWeexDSLV2 enable=" + orangeBooleanConfig);
        return orangeBooleanConfig;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4529a19", new Object[]{this})).booleanValue();
        }
        return this.f24714a;
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f82727", new Object[]{this, new Boolean(z)});
        } else {
            this.f24714a = z;
        }
    }
}
