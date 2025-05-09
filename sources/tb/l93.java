package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l93 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k93 f23189a;

    public l93(k93 k93Var) {
        this.f23189a = k93Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (k93.z(this.f23189a)) {
            k93.E(this.f23189a);
            ir9.b("CardWeeXV2MessageHandler", "onGestureState runnable clearpending:");
        }
    }
}
