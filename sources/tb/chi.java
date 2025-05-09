package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class chi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int VALUE_LOOP_CLOSE = 0;
    public static final int VALUE_LOOP_OPEN = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f17061a = false;
    public boolean b = false;
    public boolean c;

    static {
        t2o.a(468714503);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a88f8eb", new Object[0])).booleanValue();
        }
        return akt.p2("ShortVideo.degradeToNoUsePrepareToFirstFrame", false);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c283eed6", new Object[0])).booleanValue();
        }
        boolean orangeBooleanConfig = FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableRemoveCoverView", true);
        tfs.d("未起播视频移除封面图开关：orange开关打开：" + orangeBooleanConfig);
        return orangeBooleanConfig;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e3cef7f", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("318d216c", new Object[]{this})).booleanValue();
        }
        return this.f17061a;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ff834f", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("802b95f1", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50857a4", new Object[]{this, new Boolean(z)});
        } else {
            this.f17061a = z;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bb7c21", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }
}
