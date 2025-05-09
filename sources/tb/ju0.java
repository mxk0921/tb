package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import tb.vn8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ju0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f22216a = true;
    public boolean b = true;
    public vn8.b c;

    static {
        t2o.a(468713858);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("72007970", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.enableContainerAnalysis", true);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e2efaae", new Object[0])).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableVideoNetReport", true);
    }

    public vn8.b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vn8.b) ipChange.ipc$dispatch("4f094202", new Object[]{this});
        }
        return this.c;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11c48a72", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51f1d58c", new Object[]{this})).booleanValue();
        }
        return this.f22216a;
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13406fee", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c4ee14", new Object[]{this, new Boolean(z)});
        } else {
            this.f22216a = z;
        }
    }

    public void h(vn8.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df140fa6", new Object[]{this, bVar});
        } else {
            this.c = bVar;
        }
    }
}
